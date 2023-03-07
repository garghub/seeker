/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeker;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Pattern;


public class Controller {

    Util objUtil;
    String dirSpecfuzzerOutput, dirSubject, dirSpecfuzzerRepetitionExtracted;
    //This is to store proposed specs according to the sequence of proposing them
    HashMap<String, Integer> mapProposedSpecs;
    //This is to store mutants according to the sequence of creating them
    HashMap<Integer, String> mapMutants;
    //This is to store all the proposed specs nums and which mutants were killed by them
    HashMap<Integer, LinkedList<Integer>> mapSpecsWithKilledMutants;
    //This is to store all the proposed specs nums and how many tests were failed by them
    HashMap<Integer, Integer> mapSpecsWithFailedTests;
    //This is to store all the buckets with Invariants nums
    HashMap<Integer, LinkedList<Integer>> mapBucketWithInvariants;
    //This is to store the class file
    LinkedList<String> lstClassFileOrig;
    //This is to store the list of positive mutants (if required)
    LinkedList<Integer> lstPosMut;
    //This is to store the maximum sequence length reached
    Integer intMaxSeqLen, intMaxTrimmedSeqLen;
    //This is to store the original class file path for the subject
    String strPathClassFile, strPathClassFileToRestore;
    //This is to store the predicted assertion relevant mutants with key as subject_iteration# and values as list of predicted relevant mutants
    HashMap<String, LinkedList<String>> mapPredictedRelevant;
    //This is to store the ground truth with key as the subject and values as list of human generated specs
    HashMap<String, LinkedList<String>> mapGroundTruthSubjSpecs;
    //This list is to store the sentences in format "classname_functionname classpathdotseperated functionname" required for running specfuzzer
    LinkedList<String> lstSentencesForSubjectsFile;
    //This list is to store the mapping of subjects with original subjects in format "classname_functionname originalsubjectname" for logging purpose
    LinkedList<String> lstSubjectsMap;
    //This map is to contain mapping of list of all mutants generated for subjects
    HashMap<String, LinkedList<String>> mapSubjectWithAllMutants;

    public Controller() {
        objUtil = new Util();

    }

    void Perform(String[] args) {
        try {
            String strTask = String.valueOf(args[0]);
            switch (strTask) {
                case "ANALYZEDATA":
                    AnalyzeSpecFuzzerData();
                    break;
                case "PREPAREDATASET":
                case "PREPAREGROUNDTRUTHDATASET":
                    PrepareDataset(strTask);
                    break;
                case "RUNEVOSUITE":
                case "RUNRANDOOP":
                    GenerateTests(strTask);
                    break;
                case "SIMUTATE":
                case "SIMUTATEWITHPREDICTIONS":
                case "SIMUTATEWITHRANDOM":
                case "SIMUTATEFORGT":
                case "SIMUTATEWITHPREDICTIONSFORGT":
                case "SIMUTATEWITHRANDOMFORGT":
                    Simutate(strTask);
                    break;
                case "CLEANUP":
                    CleanUpPreviousSimulation();
                    break;
                case "PREPARESCALABILITYDATASET":
                    PrepareScalabilityDataset();
                    break;
                case "ANALYZESPECLOGS":
                    AnalyzeSpecLogs();
                    break;
                default:
                    System.out.println("Please verify the argument passed, and try again. If you are not sure, please do not pass any argument for help menu to appear.");
                    break;
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.perform()");
            ex.printStackTrace();
        }
    }

    private void AnalyzeSpecFuzzerData() {
        try {
            File fileSpecfuzzerResults = new File(Data.dirSpecfuzzerResults);
            String strSubjectName;
            for (File fileSubjectResults : fileSpecfuzzerResults.listFiles()) {
                if (fileSubjectResults.isDirectory() == false) {
                    continue;
                }
                lstClassFileOrig = new LinkedList();
                strSubjectName = fileSubjectResults.getName();
                if (objUtil.FileExists(Data.dirSpecfuzzerExtracted + "/" + strSubjectName)) {
                    System.out.println("Skipping already processed subject " + strSubjectName);
                    continue;
                }
                ArrayList<ArrayList<String>> lstRepetitions = GetRepetitionsInfo(strSubjectName);
                if (lstRepetitions == null) {
                    continue;
                }
                for (int i = 1; i < lstRepetitions.size(); i++) {
                    mapProposedSpecs = new HashMap();
                    mapSpecsWithKilledMutants = new HashMap();
                    mapMutants = new HashMap();
                    mapSpecsWithFailedTests = new HashMap();
                    mapBucketWithInvariants = new HashMap();
                    AnalyzeThisRepetition(lstRepetitions.get(i));
                    ProcessGatheredInfoFromThisRepetition(strSubjectName, i);
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.AnalyzeSpecFuzzerData()");
            ex.printStackTrace();
        }
    }

    private ArrayList<ArrayList<String>> GetRepetitionsInfo(String strSubjectName) {
        try {
            ArrayList<ArrayList<String>> lstRepetitions = null;
            System.out.println("Processing " + strSubjectName + " for repetitions info !");
            dirSpecfuzzerOutput = Data.dirSpecfuzzerResults + "/" + strSubjectName + "/" + Data.strOutputDirName;
            dirSubject = Data.dirSubjects + "/" + strSubjectName;
            String strSpecFuzzerCsvPath = null;
            if (objUtil.FileExists(dirSpecfuzzerOutput) == false) {
                System.out.println("\n!!!Skipping to analyze subject " + strSubjectName + " due to unavailable output directory inside " + Data.dirSpecfuzzerResults + "/" + strSubjectName + "!!!");
                return lstRepetitions;
            }
            File fileSpecfuzzerOutput = new File(dirSpecfuzzerOutput);
            for (File fileSpecFuzzerCsv : fileSpecfuzzerOutput.listFiles()) {
                if (fileSpecFuzzerCsv.isFile() && fileSpecFuzzerCsv.getName().matches(Data.strSpecFuzzerCsvCheck)) {
                    strSpecFuzzerCsvPath = fileSpecFuzzerCsv.getPath();
                    break;
                }
            }
            if (strSpecFuzzerCsvPath == null) {
                System.out.println("\n!!!Skipping to analyze subject " + strSubjectName + " due to unavailable SpecFuzzer CSV inside directory" + dirSpecfuzzerOutput + "!!!");
                return lstRepetitions;
            }
            lstRepetitions = objUtil.ReadCsvToArrayList(strSpecFuzzerCsvPath);
            return lstRepetitions;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetRepetitionsInfo()");
            ex.printStackTrace();
            return null;
        }
    }

    private void AnalyzeThisRepetition(ArrayList<String> lstRepetitionData) {
        try {
            //"class"
            String strClassFileName = lstRepetitionData.get(0);
            //"method"
            String strMethodName = lstRepetitionData.get(1);
            String strClassMethodComboCheck = "." + strClassFileName + "." + strMethodName;
            //"exec_nr"
            Integer intRepetitionCount = Integer.parseInt(lstRepetitionData.get(2));
            String strLogFilePath = dirSpecfuzzerOutput + "/" + strClassFileName + "-" + strMethodName + Data.strSpecFuzzerPhraseInLogFileName + intRepetitionCount + Data.strLogFileExt;
            LinkedList<String> lstLog = objUtil.ReadFileToList(strLogFilePath);
            for (int i = 0; i < lstLog.size(); i++) {
                String strSentence = lstLog.get(i);
                if (strSentence.matches(Data.strFuzzedSpecSentenceInLogsCheck)) {
                    String strSpec = strSentence.replace(Data.strFuzzedSpecSentenceInLogs, "");
                    if (mapProposedSpecs.containsKey(strSpec)) {
                        continue;
                    }
                    Integer intSpecNum = mapProposedSpecs.size() + 1;
                    mapProposedSpecs.put(strSpec, intSpecNum);
                    System.out.println("Added proposed spec: " + strSpec);
                } else if (strSentence.matches(Data.strDaikonStyleExitSentenceInLogsCheck) && strSentence.contains(strClassMethodComboCheck)) {
                    LoadClassFile(strClassFileName, strMethodName, strSentence);
                } else if (strSentence.matches(Data.strMutationIsSentenceInLogsCheck)) {
                    String strMutationInfo = strSentence.replace(Data.strMutationIsSentenceInLogs, "");
                    String[] arrMutationInfo = strMutationInfo.split(Pattern.quote(":"));
                    Boolean boolContinue = true;
                    while (boolContinue) {
                        i++;
                        if (lstLog.size() <= i) {
                            break;
                        }
                        strSentence = lstLog.get(i);
                        if (strSentence.matches(Data.strMutationIsSentenceInLogsCheck) || strSentence.matches(Data.strVectorSentenceInLogsCheck)) {
                            mapMutants.put(Integer.parseInt(arrMutationInfo[0]), strMutationInfo + ":-1");
                            i = i - 1;
                            boolContinue = false;
                        } else if (strSentence.contains(Data.strPreservingSentenceInLogs) && strSentence.contains(Data.strNewVariantsToFileSentenceInLogs)) {
                            if (strSentence.contains(Data.strPreservingSentenceInLogs + "0" + Data.strNewVariantsToFileSentenceInLogs)) {
                                mapMutants.put(Integer.parseInt(arrMutationInfo[0]), strMutationInfo + ":0");
                            } else {
                                Integer intTNSpecs = Integer.parseInt(strSentence.substring(0, strSentence.indexOf(Data.strNewVariantsToFileSentenceInLogs)).replace(Data.strPreservingSentenceInLogs, ""));
                                mapMutants.put(Integer.parseInt(arrMutationInfo[0]), strMutationInfo + ":" + intTNSpecs);
                            }
                            boolContinue = false;
                        }
                    }
                } else if (strSentence.matches(Data.strVectorSentenceInLogsCheck)) {
                    //This is to store the mutants killed in this bucket
                    LinkedList<Integer> lstMutantNums = new LinkedList();
                    //This is to store all the invariants in this bucket
                    LinkedList<Integer> lstInvariantsInThisBucket = new LinkedList();
                    Boolean boolContinue = true;
                    while (boolContinue) {
                        i++;
                        if (lstLog.size() <= i) {
                            if (lstInvariantsInThisBucket.isEmpty() == false) {
                                Integer intBucket = mapBucketWithInvariants.size() + 1;
                                mapBucketWithInvariants.put(intBucket, lstInvariantsInThisBucket);
                                lstInvariantsInThisBucket = new LinkedList();
                            }
                            break;
                        }
                        strSentence = lstLog.get(i);
                        if (strSentence.matches(Data.strVectorSentenceInLogsCheck)) {
                            if (lstInvariantsInThisBucket.isEmpty() == false) {
                                Integer intBucket = mapBucketWithInvariants.size() + 1;
                                mapBucketWithInvariants.put(intBucket, lstInvariantsInThisBucket);
                                lstInvariantsInThisBucket = new LinkedList();
                            }
                            i = i - 1;
                            boolContinue = false;
                        } else if (strSentence.matches(Data.strDtranceGzSentenceInLogsCheck)) {
                            strSentence = strSentence.trim();
                            String[] arrSentence = strSentence.split(Pattern.quote("/"));
                            Integer intMutantNum = Integer.parseInt(arrSentence[arrSentence.length - 1].substring(arrSentence[arrSentence.length - 1].indexOf(Data.strMSentenceInLogs) + 2).replace(Data.strDtranceGzSentenceInLogs, ""));
                            lstMutantNums.add(intMutantNum);
                        } else if (strSentence.contains(Data.strFuzzedInvariantSentenceInLogs) && strSentence.contains(Data.strHoldsForSentenceInLogs)
                                && strSentence.contains(Data.strFailsSentenceInLogs) && strSentence.contains(Data.strQualitySentenceInLogs)) {
                            String strInvariant = strSentence.substring(0, strSentence.indexOf(Data.strHoldsForSentenceInLogs)).replace(Data.strFuzzedInvariantSentenceInLogs, "").trim();
                            String strFailedTests = strSentence.substring(strSentence.indexOf(Data.strFailsSentenceInLogs) + Data.strFailsSentenceInLogs.length(),
                                    strSentence.indexOf(Data.strQualitySentenceInLogs)).trim();
                            Integer intFailedTests = Integer.parseInt(strFailedTests);
                            if (mapProposedSpecs.containsKey(strInvariant) == false) {
                                System.out.println("\n!!!Skipping further processing due to unavailable Invariant " + strInvariant + " in the list of proposed specs!!!");
                                return;
                            }
                            Integer intSpecNum = mapProposedSpecs.get(strInvariant);
                            lstInvariantsInThisBucket.add(intSpecNum);
                            if (mapSpecsWithFailedTests.containsKey(intSpecNum) == false) {
                                mapSpecsWithFailedTests.put(intSpecNum, intFailedTests);
                            }
                            if (mapSpecsWithKilledMutants.containsKey(intSpecNum) == false) {
                                LinkedList<Integer> lstMutantNumsStored = new LinkedList();
                                for (Integer intMutantNum : lstMutantNums) {
                                    lstMutantNumsStored.add(intMutantNum);
                                    System.out.println("Added killed mutant# " + intMutantNum + " by invariant# " + intSpecNum);
                                }
                                mapSpecsWithKilledMutants.put(intSpecNum, lstMutantNumsStored);
                            } else {
                                LinkedList<Integer> lstMutantNumsStored = mapSpecsWithKilledMutants.get(intSpecNum);
                                for (Integer intMutantNum : lstMutantNums) {
                                    if (lstMutantNumsStored.contains(intMutantNum) == false) {
                                        lstMutantNumsStored.add(intMutantNum);
                                        System.out.println("Added additionally killed mutant# " + intMutantNum + " by invariant " + strInvariant);
                                    }
                                }
                                mapSpecsWithKilledMutants.replace(intSpecNum, lstMutantNumsStored);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.AnalyzeThisRepetition()");
            ex.printStackTrace();
        }
    }

    void LoadClassFile(String strClassFileName, String strMethodName, String strSentence) {
        try {
            if (lstClassFileOrig != null && lstClassFileOrig.isEmpty() == false) {
                return;
            }
            String strClassMethodComboCheck = "." + strClassFileName + "." + strMethodName;
            //This is to store the partial path of the original class file
            String strClassFilePathPartial = strSentence.substring(0, strSentence.indexOf(strClassMethodComboCheck)).replace(".", "/");
            for (String strSourceDirGenericPath : Data.arrSourceDirGenericPath) {
                //This is to store the entire path of the original class file
                String strClassFilePath = dirSubject + strSourceDirGenericPath + strClassFilePathPartial + "/" + strClassFileName + Data.strClassFileExt;
                if (objUtil.FileExists(strClassFilePath)) {
                    lstClassFileOrig = objUtil.ReadFileToList(strClassFilePath);
                    System.out.println("Loaded class file from " + strClassFilePath);
                    break;
                } else {
                    strClassFilePath = null;
                }
            }
            if (lstClassFileOrig == null) {
                System.out.println("\n!!!Skipping further analysis due to unavailable class file for class " + strClassFileName + "!!!");
                return;
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.LoadClassFile()");
            ex.printStackTrace();
        }
    }

    private void ProcessGatheredInfoFromThisRepetition(String strSubjectName, Integer intRepetition) {
        try {
            dirSpecfuzzerRepetitionExtracted = Data.dirSpecfuzzerExtracted + "/" + strSubjectName + "/" + intRepetition;
            SaveGatheredInfoFromThisRepetition();

        } catch (Exception ex) {
            System.out.println("error at Controller.ProcessGatheredInfoFromThisRepetition()");
            ex.printStackTrace();
        }
    }

    private void SaveGatheredInfoFromThisRepetition() {
        try {
            System.out.println("saving extracted information for this repetition at : " + dirSpecfuzzerRepetitionExtracted);

            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strClassFileName, lstClassFileOrig);

            LinkedList<String> lstBucketWithInvariants = new LinkedList();
            for (Integer intBucketNum : mapBucketWithInvariants.keySet()) {
                String strValue = mapBucketWithInvariants.get(intBucketNum).toString();
                lstBucketWithInvariants.add(intBucketNum + ",\"" + strValue + "\"");
            }
            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strBucketsFileName, lstBucketWithInvariants);

            LinkedList<String> lstMutants = new LinkedList();
            for (Integer intMutantNum : mapMutants.keySet()) {
                String strValue = mapMutants.get(intMutantNum);
                lstMutants.add(intMutantNum + ",\"" + strValue + "\"");
            }
            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strMutantsFileName, lstMutants);

            LinkedList<String> lstProposedSpecs = new LinkedList();
            for (String strProposedSpec : mapProposedSpecs.keySet()) {
                Integer intValue = mapProposedSpecs.get(strProposedSpec);
                lstProposedSpecs.add("\"" + strProposedSpec + "\"," + intValue);
            }
            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strSpecsFileName, lstProposedSpecs);

            LinkedList<String> lstSpecsWithFailedTests = new LinkedList();
            for (Integer intSpecNum : mapSpecsWithFailedTests.keySet()) {
                Integer intValue = mapSpecsWithFailedTests.get(intSpecNum);
                lstSpecsWithFailedTests.add(intSpecNum + "," + intValue);
            }
            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strSpecsFailedTestsFileName, lstSpecsWithFailedTests);

            LinkedList<String> lstSpecsWithKilledMutants = new LinkedList();
            for (Integer intSpecWithKilledMutants : mapSpecsWithKilledMutants.keySet()) {
                String strValue = mapSpecsWithKilledMutants.get(intSpecWithKilledMutants).toString();
                lstSpecsWithKilledMutants.add(intSpecWithKilledMutants + ",\"" + strValue + "\"");
            }
            objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, Data.strSpecsKilledmutantsFileName, lstSpecsWithKilledMutants);

        } catch (Exception ex) {
            System.out.println("error at Controller.SaveGatheredInfoFromThisRepetition()");
            ex.printStackTrace();
        }
    }

    private void PrepareDataset(String strTask) {
        try {
            File fileSpecfuzzerExtracted = new File(Data.dirSpecfuzzerExtracted);
            String strSubjectName;
            LinkedList<String> lstDataset = new LinkedList();
            intMaxSeqLen = 0;
            intMaxTrimmedSeqLen = 0;
            for (File fileSubjectExtracted : fileSpecfuzzerExtracted.listFiles()) {
                if (fileSubjectExtracted.isDirectory() == false) {
                    continue;
                }
                strSubjectName = fileSubjectExtracted.getName();
                //Debugger
                //if (strSubjectName.equals("QueueAr_dequeue") == false) {
                //    continue;
                //}
                System.out.println("\nProcessing subject " + strSubjectName);
                for (File fileRepetitionExtracted : fileSubjectExtracted.listFiles()) {
                    if (fileRepetitionExtracted.isDirectory() == false) {
                        continue;
                    }
                    Integer intRepetition = Integer.parseInt(fileRepetitionExtracted.getName());
                    System.out.println("\nProcessing repetition " + intRepetition);
                    dirSpecfuzzerRepetitionExtracted = fileRepetitionExtracted.getPath();
                    lstClassFileOrig = objUtil.ReadFileToList(dirSpecfuzzerRepetitionExtracted + "/" + Data.strClassFileName);
                    GetPosMutList(strTask);
                    if (lstPosMut == null || lstPosMut.isEmpty()) {
                        System.out.println("\nNo specs killing mutants available for: " + strSubjectName + ", " + intRepetition + "!");
                        continue;
                    }
                    ArrayList<ArrayList<String>> lstMutants = objUtil.ReadCsvToArrayList(dirSpecfuzzerRepetitionExtracted + "/" + Data.strMutantsFileName);
                    for (ArrayList<String> lstMutant : lstMutants) {
                        String strSeqWithInfoForThisMutant = ProcessSequenceForThisMutant(strTask, lstMutant);
                        if (strSeqWithInfoForThisMutant == null) {
                            continue;
                        }
                        strSeqWithInfoForThisMutant = "{ \"subject_name\": \"" + strSubjectName + "\", \"repetition_num\": " + intRepetition
                                + ", " + strSeqWithInfoForThisMutant + " }";
                        //System.out.println(strSeqWithInfoForThisMutant);
                        if (lstDataset.isEmpty()) {
                            lstDataset.add("[");
                            lstDataset.add(strSeqWithInfoForThisMutant);
                        } else {
                            lstDataset.add(", " + strSeqWithInfoForThisMutant);
                        }
                    }
                }
            }
            lstDataset.add("]");
            String strToLog = "\nMaximum Sequence Length: " + intMaxSeqLen.toString() + "\nMaximum Trimmed Sequence Length: " + intMaxTrimmedSeqLen.toString();
            switch (strTask) {
                case "PREPAREGROUNDTRUTHDATASET":
                    objUtil.WriteListToFile(Data.dirGroundTruth, Data.strDatasetFileName, lstDataset);
                    objUtil.WriteStringToFile(Data.dirGroundTruth, Data.strMaxSeqLenFileName, strToLog);
                    break;
                case "PREPAREDATASET":
                    objUtil.WriteListToFile(Data.dirSpecfuzzerExtracted, Data.strDatasetFileName, lstDataset);
                    objUtil.WriteStringToFile(Data.dirSpecfuzzerExtracted, Data.strMaxSeqLenFileName, strToLog);
                    break;
            }
            System.out.println(strToLog);
        } catch (Exception ex) {
            System.out.println("error at Controller.AnalyzeSpecFuzzerData()");
            ex.printStackTrace();
        }
    }

    private void GetPosMutList(String strTask) {
        lstPosMut = new LinkedList();
        String strSpecId = null;
        try {
            String strPosMutFilePath = dirSpecfuzzerRepetitionExtracted + "/" + Data.strSpecsKilledmutantsFileName;
            if (objUtil.FileExists(strPosMutFilePath) == false) {
                System.out.println("\nUnable to get specs killed mutants information due to unavailable file: " + strPosMutFilePath + "!");
                return;
            }
            ArrayList<ArrayList<String>> lstKilledMutants = objUtil.ReadCsvToArrayList(strPosMutFilePath);
            switch (strTask) {
                case "PREPAREDATASET":
                    for (ArrayList<String> lstKilledMutantsByThisSpec : lstKilledMutants) {
                        String[] arrKilledMutantsByThisSpec = lstKilledMutantsByThisSpec.get(1).replace("[", "").replace("]", "").split(Pattern.quote(", "));
                        for (String strKilledMutantByThisSpec : arrKilledMutantsByThisSpec) {
                            Integer intMutantNum = Integer.parseInt(strKilledMutantByThisSpec);
                            if (lstPosMut.contains(intMutantNum)) {
                                continue;
                            }
                            lstPosMut.add(intMutantNum);
                        }
                    }
                    break;
                case "PREPAREGROUNDTRUTHDATASET":
                    File dirSubIteration = new File(dirSpecfuzzerRepetitionExtracted);
                    String strSubject = dirSubIteration.getParentFile().getName();
                    ArrayList<ArrayList<String>> lstSpecs = objUtil.ReadCsvToArrayList(dirSpecfuzzerRepetitionExtracted + "/" + Data.strSpecsFileName);
                    HashMap<String, String> mapSpecs = new HashMap();
                    for (ArrayList<String> lstSpec : lstSpecs) {
                        mapSpecs.put(lstSpec.get(0), lstSpec.get(1));
                    }
                    if (mapGroundTruthSubjSpecs == null || mapGroundTruthSubjSpecs.isEmpty()) {
                        LoadGroundTruth();
                    }
                    LinkedList<String> lstGTSpecsForThisSubj = mapGroundTruthSubjSpecs.get(strSubject);
                    if (lstGTSpecsForThisSubj == null || lstGTSpecsForThisSubj.isEmpty()) {
                        return;
                    }
                    for (String strGTSpec : lstGTSpecsForThisSubj) {
                        strSpecId = mapSpecs.get(strGTSpec);
                        if (strSpecId == null || strSpecId.isEmpty()) {
                            continue;
                        }

                    }
                    for (ArrayList<String> lstKilledMutantsByThisSpec : lstKilledMutants) {
                        if (lstKilledMutantsByThisSpec.get(0).equals(strSpecId) == false) {
                            continue;
                        }
                        String[] arrKilledMutantsByThisSpec = lstKilledMutantsByThisSpec.get(1).replace("[", "").replace("]", "").split(Pattern.quote(", "));
                        for (String strKilledMutantByThisSpec : arrKilledMutantsByThisSpec) {
                            Integer intMutantNum = Integer.parseInt(strKilledMutantByThisSpec);
                            if (lstPosMut.contains(intMutantNum)) {
                                continue;
                            }
                            lstPosMut.add(intMutantNum);
                        }
                    }
                    break;
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.GetPosMutList()");
            ex.printStackTrace();
        }
    }

    private String ProcessSequenceForThisMutant(String strTask, ArrayList<String> lstMutant) {
        String strRet = null;
        try {
            Integer intMutantNum = Integer.parseInt(lstMutant.get(0));
            System.out.println("\nProcessing mutant " + intMutantNum);
            String[] arrMutantInfo = lstMutant.get(1).split(Pattern.quote(":"));
            Integer intLabel = 0;
            if (strTask.equals("PREPAREDATASET")) {
                intLabel = Integer.parseInt(arrMutantInfo[arrMutantInfo.length - 1]) > 0 ? 1 : 0;
            }
            intLabel = intLabel == 0 ? (lstPosMut.contains(intMutantNum) ? 1 : intLabel) : intLabel;
            String strMutOperator = arrMutantInfo[1] + ":" + arrMutantInfo[2] + ":" + arrMutantInfo[3];
            String strSeq;
            String strMutantFileName = Data.strClassFileName.replace(Data.strClassFileExt, "_" + intMutantNum + Data.strClassFileExt);
            String strSeqFilePath = dirSpecfuzzerRepetitionExtracted + "/" + strMutantFileName.replace(Data.strClassFileExt, Data.strAbs + Data.strClassFileExt);
            if (objUtil.FileExists(strSeqFilePath)) {
                LinkedList<String> listSeq = objUtil.ReadFileToList(strSeqFilePath);
                if (listSeq == null && listSeq.isEmpty()) {
                    return null;
                }
                strSeq = objUtil.ConvertListToString(listSeq);
            } else {
                Integer intLineNum = Integer.parseInt(arrMutantInfo[arrMutantInfo.length - 3]);
                LinkedList<String> lstMut = new LinkedList();
                for (Integer i = 0; i < lstClassFileOrig.size(); i++) {
                    String str = lstClassFileOrig.get(i);
                    if (str.contains("//")) {
                        String[] arrStr = str.split("//");
                        if (arrStr.length == 0) {
                            str = "";
                        } else {
                            str = arrStr[0];
                        }
                    }
                    if (i == intLineNum - 1) {
                        lstMut.add(Data.strMutOperatorPrefix + " " + str + " " + Data.strMutOperatorSuffix + " " + Data.strOperatorToReplace);
                    } else {
                        lstMut.add(str);
                    }
                }
                objUtil.WriteListToFile(dirSpecfuzzerRepetitionExtracted, strMutantFileName, lstMut);
                strSeq = objUtil.GetSequence(dirSpecfuzzerRepetitionExtracted, strMutantFileName);
            }
            strSeq = strSeq.substring(strSeq.lastIndexOf(Data.strImportSentenceInSequence) + Data.strImportSentenceInSequence.length());
            strSeq = strSeq.substring(strSeq.indexOf(Data.strSemicolonSentenceInSequence) + Data.strSemicolonSentenceInSequence.length());
            Integer intSeqLen = strSeq.split(" ").length;
            intMaxSeqLen = intSeqLen > intMaxSeqLen ? intSeqLen : intMaxSeqLen;
            strSeq = objUtil.GetTrimmedSequence(strSeq);
            if (strSeq == null) {
                return strSeq;
            }
            strSeq = strSeq.replace(Data.strOperatorToReplace, strMutOperator);
            strRet = "\"mutant_num\": " + intMutantNum + ", \"seq\": \"" + strSeq + "\", \"label\": " + intLabel;
            //System.out.println(strRet);
            intSeqLen = strSeq.split(" ").length;
            intMaxTrimmedSeqLen = intSeqLen > intMaxTrimmedSeqLen ? intSeqLen : intMaxTrimmedSeqLen;
            return strRet;
        } catch (Exception ex) {
            System.out.println("error at Controller.ProcessSequenceForThisMutant()");
            ex.printStackTrace();
            return strRet;
        }
    }

    private void GenerateTests(String strToolChoice) {
        try {
            File fileSubjectsWithTests = new File(Data.dirSubjectsWithTests);
            String strSubjectName;
            for (File fileSubjectWithTests : fileSubjectsWithTests.listFiles()) {
                if (fileSubjectWithTests.isDirectory() == false) {
                    continue;
                }
                strSubjectName = fileSubjectWithTests.getName();
                //For debugging
                //if (strSubjectName.equals("ArithmeticUtils_subAndCheck") == false) {
                //    continue;
                //}
                System.out.println("\nProcessing to " + strToolChoice + " for subject " + strSubjectName);
                GenerateTestsForThisSubject(strToolChoice, strSubjectName);
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.GenerateTests()");
            ex.printStackTrace();
        }
    }

    private void GenerateTestsForThisSubject(String strToolChoice, String strSubjectName) {
        try {
            String strPathTests, strQueryToRunTool;
            switch (strToolChoice) {
                case "RUNEVOSUITE":
                    strPathTests = Data.dirSubjectsWithTests + "/" + strSubjectName + "/" + Data.strEvosuiteTests;
                    break;
                case "RUNRANDOOP":
                    strPathTests = Data.dirSubjectsWithTests + "/" + strSubjectName + "/" + Data.strPathSrcTestJava + "/" + Data.strRandoopTests;
                    break;
                default:
                    System.out.println("Unavailable choice of tool opted, please try again!");
                    return;
            }
            if (objUtil.FileExists(strPathTests)) {
                System.out.println("Skipping to " + strToolChoice + " for subject: " + strSubjectName + " as " + strPathTests + " already exists!");
                return;
            }
            String strGradleQuery = Data.strCommandForCd + Data.dirSubjectsWithTests + "/" + strSubjectName + Data.strCommandForGradleCleanAndBuild;
            Integer exitCode = objUtil.ExecuteProcessAndGetIntErrorCode(strGradleQuery);
            if (exitCode != 0) {
                RestoreOriginalFile(strSubjectName);
                exitCode = objUtil.ExecuteProcessAndGetIntErrorCode(strGradleQuery);
                if (exitCode != 0) {
                    System.out.println("Even after restoring original code file, received exit code: " + exitCode + " for below query execution:");
                    System.out.println(strGradleQuery);
                    return;
                }
            }
            String strPathContainingJar = Data.dirSubjectsWithTests + "/" + strSubjectName + "/" + Data.strPathBuildLibs;
            if (objUtil.FileExists(strPathContainingJar) == false) {
                System.out.println("Cannot proceed further as running Gradle didnt create jar at location: " + strPathContainingJar);
                return;
            }
            File dirContainingJar = new File(strPathContainingJar);
            String strJarFileName = null;
            for (File fileJar : dirContainingJar.listFiles()) {
                if (fileJar.getName().matches(Data.strJarFileCheck)) {
                    strJarFileName = fileJar.getName();
                    break;
                }
            }
            String strClassFilePath = Data.dirSpecfuzzerExtracted + "/" + strSubjectName + "/1/" + Data.strClassFileName;
            String strPackageInfo = objUtil.GetPackageInfoFromClassFile(strClassFilePath);
            if (strPackageInfo == null) {
                System.out.println("Cannot proceed further due to unavailable package info for subject " + strSubjectName);
                return;
            }
            ArrayList<ArrayList<String>> lstRepetitions = GetRepetitionsInfo(strSubjectName);
            if (lstRepetitions == null) {
                return;
            }
            if (lstRepetitions.isEmpty()) {
                System.out.println("Cannot proceed further due to unavailable class name for subject " + strSubjectName);
                return;
            }
            String strClassFileName = lstRepetitions.get(1).get(0);
            switch (strToolChoice) {
                case "RUNEVOSUITE":
                    //strQueryToRunTool = Data.strCommandForCd + Data.dirSubjectsWithTests + "/" + strSubjectName + Data.strCommandForEvosuitePart01 + Data.strPathBuildLibs + "/" + strJarFileName + Data.strCommandForEvosuitePart02 + strPackageInfo + "." + strClassFileName;
                    strQueryToRunTool = Data.strCommandForCd + Data.dirSubjectsWithTests + "/" + strSubjectName;
                    for (String strCriteria : Data.arrEvosuiteAvailableCriterion) {
                        strQueryToRunTool += Data.strCommandForEvosuitePart01 + Data.strPathBuildLibs + "/" + strJarFileName + Data.strCommandForEvosuitePart02 + strPackageInfo + "." + strClassFileName
                                + (strCriteria.isEmpty() == true ? "" : Data.strCommandForEvosuitePart03 + strCriteria);
                    }
                    break;
                case "RUNRANDOOP":
                    objUtil.CreateDirectory(strPathTests);
                    strQueryToRunTool = Data.strCommandForCd + strPathTests + Data.strCommandForRandoopPart01 + Data.dirSubjectsWithTests + "/" + strSubjectName + "/" + Data.strPathBuildLibs + "/" + strJarFileName + Data.strCommandForRandoopPart02 + strPackageInfo + "." + strClassFileName;
                    break;
                default:
                    System.out.println("Unavailable choice of tool opted, please try again!");
                    return;
            }
            objUtil.ExecuteProcessAndGetIntErrorCode(strQueryToRunTool);
            if (strToolChoice.equals("RUNEVOSUITE")) {
                if (objUtil.FileExists(strPathTests) == false) {
                    System.out.println("Cannot proceed further as runing Evosuite for subject: " + strSubjectName + " didnot create testcases under location: " + strPathTests + " !");
                    return;
                }
                File dirToParse = new File(strPathTests);
                CopyPasteEvosuiteGeneratedTests(dirToParse);
                String strPathToContainEvosuiteJar = Data.dirSubjectsWithTests + "/" + strSubjectName + Data.strPathLibs;
                String strCopyEvosuiteJarQuery = Data.strCommandForCopyingEvosuiteJar + strPathToContainEvosuiteJar + "/";
                strCopyEvosuiteJarQuery = strCopyEvosuiteJarQuery.replace("/", "\\");
                objUtil.ExecuteProcessAndGetIntErrorCode(strCopyEvosuiteJarQuery);
            }
            System.out.println("sleeping for 5 seconds...");
            Thread.sleep(1000 * 5);
            exitCode = objUtil.ExecuteProcessAndGetIntErrorCode(strGradleQuery);
            if (exitCode != 0) {
                System.out.println("Received exit code: " + exitCode + " for below query execution:");
                System.out.println(strGradleQuery);
                return;
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.RunEvosuiteForThisSubject()");
            ex.printStackTrace();
        }
    }

    private void CopyPasteEvosuiteGeneratedTests(File dirToParse) {
        try {
            if (dirToParse.isDirectory()) {
                for (File fileInside : dirToParse.listFiles()) {
                    CopyPasteEvosuiteGeneratedTests(fileInside);
                }
            } else if (dirToParse.getName().matches(Data.strESTestFileCheck)
                    || dirToParse.getName().matches(Data.strESTestScaffoldingFileCheck)) {
                LinkedList<String> lstFileContents = objUtil.ReadFileToList(dirToParse.getPath());
                objUtil.WriteListToFile(dirToParse.getParentFile().getPath().replace(Data.strEvosuiteTests, Data.strPathSrcTestJava),
                        dirToParse.getName(), lstFileContents);
            }

        } catch (Exception ex) {
            System.out.println("error at Controller.CopyPasteEvosuiteGeneratedTests()");
            ex.printStackTrace();
        }
    }

    private void Simutate(String strTask) {
        try {
            String strInfoSummaryFileName, strColumnNameInSummaryFile, strInfoFileName;
            String strDirSummary = "";
            switch (strTask) {
                case "SIMUTATE":
                case "SIMUTATEFORGT":
                    strInfoSummaryFileName = Data.strSubsumingInfoSummaryFileName;
                    strColumnNameInSummaryFile = Data.strSubsuming;
                    strInfoFileName = Data.strSubsumingInfoFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONS":
                    strInfoSummaryFileName = Data.strPredictionInfoSummaryFileName;
                    strColumnNameInSummaryFile = Data.strPredicted;
                    strInfoFileName = Data.strPredictionInfoFileName;
                    break;
                case "SIMUTATEWITHRANDOM":
                    strInfoSummaryFileName = Data.strRandomInfoSummaryFileName;
                    strColumnNameInSummaryFile = Data.strRandom;
                    strInfoFileName = Data.strRandomInfoFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONSFORGT":
                    strInfoSummaryFileName = Data.strPredictionInfoSummaryFileName;
                    strColumnNameInSummaryFile = Data.strPredicted;
                    strInfoFileName = Data.strPredictionInfoGroundTruthFileName;
                    break;
                case "SIMUTATEWITHRANDOMFORGT":
                    strInfoSummaryFileName = Data.strRandomInfoSummaryFileName;
                    strColumnNameInSummaryFile = Data.strRandom;
                    strInfoFileName = Data.strRandomInfoGroundTruthFileName;
                    break;
                default:
                    System.out.println("Unavailable choice of task opted, please try again!");
                    return;
            }

            if (strTask == Data.strSimutate
                    || strTask == Data.strSimutateWithPredictions
                    || strTask == Data.strSimutateWithRandom) {
                strDirSummary = Data.dirSummary;
            }
            if (strTask == Data.strSimutateForGT
                    || strTask == Data.strSimutateWithPredictionsForGT
                    || strTask == Data.strSimutateWithRandomForGT) {
                strDirSummary = Data.dirGroundTruth;
            }
            if (objUtil.FileExists(strDirSummary + "/" + strInfoSummaryFileName)) {
                System.out.println("Skippping due to summary already available at " + Data.dirGroundTruth + "/" + strInfoSummaryFileName);
                return;
            }
            if (strTask == Data.strSimutateForGT
                    || strTask == Data.strSimutateWithPredictionsForGT
                    || strTask == Data.strSimutateWithRandomForGT) {
                if (mapGroundTruthSubjSpecs == null || mapGroundTruthSubjSpecs.isEmpty()) {
                    LoadGroundTruth();
                }
            }
            LinkedList<String> lstInfoSummary = new LinkedList();
            lstInfoSummary.add("\"" + Data.strSubject
                    + "\",\"" + Data.strIteration
                    + "\",\"" + strColumnNameInSummaryFile
                    + "\",\"" + Data.strRelevant
                    + "\",\"" + Data.strMissedAssertionsIfOnlySpecificSelected
                    + "\",\"" + Data.strAllMutants
                    + "\",\"" + Data.strAllMutantsCount
                    + "\",\"" + Data.strSelectedMutantsCount
                    + "\",\"" + Data.strRelevantMutantsCount
                    + "\",\"" + Data.strIntersectionMutantsCount
                    + "\",\"" + Data.strAssertionsCount
                    + "\",\"" + Data.strOriginalTime
                    + "\",\"" + Data.strNewTime
                    + "\"");
            File dirSpecfuzzerExtracted = new File(Data.dirSpecfuzzerExtracted);
            for (File dirSubject : dirSpecfuzzerExtracted.listFiles()) {
                if (dirSubject.isDirectory() == false) {
                    continue;
                }
                String strSubject = dirSubject.getName();
                //For debugging
                //if (strSubject.equals("Ascii_equalsIgnoreCase")) {
                //continue;
                //}

                if (strTask == Data.strSimutateForGT
                        || strTask == Data.strSimutateWithPredictionsForGT
                        || strTask == Data.strSimutateWithRandomForGT) {
                    //Ground Truth Spec check
                    LinkedList<String> lstGTSpecsForThisSubj = mapGroundTruthSubjSpecs.get(strSubject);
                    if (lstGTSpecsForThisSubj == null || lstGTSpecsForThisSubj.isEmpty()) {
                        continue;
                    }
                }

                strPathClassFile = null;
                strPathClassFileToRestore = null;
                for (File dirIteration : dirSubject.listFiles()) {
                    if (dirIteration.isDirectory() == false) {
                        continue;
                    }
                    String strIteration = dirIteration.getName();
                    String strPathDirIterations = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration;
                    if (objUtil.FileExists(strPathDirIterations + "/" + Data.strMutantsWithFailedTestsFileName)
                            && objUtil.FileExists(strPathDirIterations + "/" + strInfoFileName)) {
                        System.out.println("Skipping, files already exist!");
                    } else {
                        ProcessThisIterationForSimutation(strTask, strSubject, dirIteration.getName(), dirIteration.getPath(), strPathDirIterations);
                    }
                    String strInfoForThisIteration = GetSummaryInfoForThisIteration(strTask, strSubject, strIteration);
                    lstInfoSummary.add(strInfoForThisIteration);
                }
            }
            objUtil.WriteListToFile(strDirSummary, strInfoSummaryFileName, lstInfoSummary);
        } catch (Exception ex) {
            System.out.println("error at Controller.Simutate()");
            ex.printStackTrace();
        }
    }

    private void ProcessThisIterationForSimutation(String strTask, String strSubject, String strIteration, String strPathDirIteration, String strPathDirIterations) {
        try {
            HashMap<String, LinkedList<String>> mapMutantsWithFailedTests = GetMapMutantsWithFailedTests(strSubject, strIteration, strPathDirIteration, strPathDirIterations);
            if (mapMutantsWithFailedTests == null || mapMutantsWithFailedTests.isEmpty()) {
                return;
            }
            HashMap<String, LinkedList<String>> mapInfo;
            String strInfoFileName;
            switch (strTask) {
                case "SIMUTATE":
                case "SIMUTATEFORGT":
                    mapInfo = ReturnSubsumingInfo(mapMutantsWithFailedTests);
                    strInfoFileName = Data.strSubsumingInfoFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONS":
                    mapInfo = ReturnPredictionInfo(strTask, strSubject, strIteration);
                    strInfoFileName = Data.strPredictionInfoFileName;
                    break;
                case "SIMUTATEWITHRANDOM":
                    HashMap<String, LinkedList<String>> mapPredictionInfo = ReturnPredictionInfo(strTask, strSubject, strIteration);
                    Integer intRandomMutantsToSelect = mapPredictionInfo.get(Data.strPredicted).size();
                    mapInfo = ReturnRandomInfo(strSubject, strIteration, intRandomMutantsToSelect);
                    strInfoFileName = Data.strRandomInfoFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONSFORGT":
                    mapInfo = ReturnPredictionInfo(strTask, strSubject, strIteration);
                    strInfoFileName = Data.strPredictionInfoGroundTruthFileName;
                    break;
                case "SIMUTATEWITHRANDOMFORGT":
                    HashMap<String, LinkedList<String>> mapPredictionInfoForGT = ReturnPredictionInfo(strTask, strSubject, strIteration);
                    Integer intRandomMutantsToSelectForGT = mapPredictionInfoForGT.get(Data.strPredicted).size();
                    mapInfo = ReturnRandomInfo(strSubject, strIteration, intRandomMutantsToSelectForGT);
                    strInfoFileName = Data.strRandomInfoGroundTruthFileName;
                    break;
                default:
                    System.out.println("Unavailable choice of task opted, please try again!");
                    return;
            }
            //objUtil.DeleteFile(strPathDirIterations, strInfoFileName);
            objUtil.WriteMapToCsv(strPathDirIterations, strInfoFileName, mapInfo);
        } catch (Exception ex) {
            System.out.println("error at Controller.ProcessThisIterationForSimutation()");
            ex.printStackTrace();
        }
    }

    private HashMap<String, LinkedList<String>> GetMapMutantsWithFailedTests(String strSubject, String strIteration, String strPathDirIteration, String strPathDirIterations) {
        try {
            String strPathMutantCsv = strPathDirIteration + "/" + Data.strMutantsFileName;
            if (objUtil.FileExists(strPathMutantCsv) == false) {
                System.out.println("Cannot proceed to simutate for subject: " + strSubject
                        + " due to unavailable file: " + strPathMutantCsv + "!");
                return null;
            }
            HashMap<String, LinkedList<String>> mapMutantsWithFailedTests;
            if (objUtil.FileExists(strPathDirIterations + "/" + Data.strMutantsWithFailedTestsFileName)) {
                ArrayList<ArrayList<String>> lstRecords = objUtil.ReadCsvToArrayList(strPathDirIterations + "/" + Data.strMutantsWithFailedTestsFileName);
                mapMutantsWithFailedTests = objUtil.ConvertArrayListToHashMap(lstRecords);
            } else {
                ArrayList<ArrayList<String>> lstMutantsInfos = objUtil.ReadCsvToArrayList(strPathMutantCsv);
                mapMutantsWithFailedTests = new HashMap();
                for (ArrayList<String> lstMutantInfo : lstMutantsInfos) {
                    String strMutantId = lstMutantInfo.get(1).split(Pattern.quote(":"))[0];
                    System.out.println("\nSubject: " + strSubject + ", Iteration: " + strIteration + ", Mutant: " + strMutantId);
                    String strPathMutantFile = CreateThisMutant(strSubject, strIteration, lstMutantInfo);
                    if (strPathMutantFile == null) {
                        System.out.println("Cannot proceed to simutate for subject: " + strSubject
                                + " due to unavailable mutant file path for class file at: " + strPathClassFile + "!");
                        continue;
                    }
                    LinkedList<String> lstLog = objUtil.SimutateThisMutant(strSubject, strPathClassFile, strPathMutantFile, strPathClassFileToRestore);
                    LinkedList<String> lstFailedTests = ReturnFailedTests(lstLog);
                    if (lstFailedTests == null || lstFailedTests.isEmpty()) {
                        continue;
                    }
                    mapMutantsWithFailedTests.put(strMutantId, lstFailedTests);
                }
                //objUtil.DeleteFile(strPathDirIterations, Data.strMutantsWithFailedTestsFileName);
                objUtil.WriteMapToCsv(strPathDirIterations, Data.strMutantsWithFailedTestsFileName, mapMutantsWithFailedTests);
            }
            return mapMutantsWithFailedTests;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetMapMutantsWithFailedTests()");
            ex.printStackTrace();
            return null;
        }
    }

    private String CreateThisMutant(String strSubject, String strIteration, ArrayList<String> lstMutantInfo) {
        try {
            String strPathMutantsIteration = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration;
            String[] arrMutantInfo = lstMutantInfo.get(1).split(Pattern.quote(":"));
            String strMutantId = arrMutantInfo[0];
            String[] arrClassInfo = arrMutantInfo[4].split(Pattern.quote("@"))[0].split(Pattern.quote("."));
            String strClass = arrClassInfo[arrClassInfo.length - 1];
            String strMutantFileName = strClass + "_" + strMutantId + Data.strClassFileExt;
            if (strPathClassFile == null) {
                strPathClassFile = GetPathOriginalClassFile(strSubject, arrClassInfo);
                if (strPathClassFile == null) {
                    System.out.println("Cannot proceed to simutate for mutant: " + strMutantId
                            + " of iteration: " + strIteration + " of subject: " + strSubject
                            + " due to unavailable class file: " + strClass + Data.strClassFileExt + "!");
                    return null;
                }
            }
            if (objUtil.FileExists(strPathMutantsIteration + "/" + strMutantFileName)) {
                return strPathMutantsIteration + "/" + strMutantFileName;
            }
            String[] arrPhrases = arrMutantInfo[6].split(Pattern.quote(" |==> "));
            String strPathMutant = Data.dirSpecfuzzerExtracted + "/" + strSubject + "/" + strIteration + "/"
                    + Data.strClassFileName.replace(Data.strClassFileExt, "_" + strMutantId + Data.strClassFileExt);
            if (objUtil.FileExists(strPathMutant) == false) {
                System.out.println("Cannot proceed to simutate for mutant: " + strMutantId
                        + " of iteration: " + strIteration + " of subject: " + strSubject
                        + " due to unavailable mutant file: " + strPathMutant + "!");
                return null;
            }
            LinkedList<String> lstMutatedCodeWithOperator2Replace = objUtil.ReadFileToList(strPathMutant);
            LinkedList<String> lstMutatedCode = GetMutatedCode(lstMutatedCodeWithOperator2Replace, arrPhrases[0], arrPhrases[1]);
            if (lstMutatedCode == null) {
                System.out.println("Cannot proceed to simutate for mutant: " + strMutantId
                        + " of iteration: " + strIteration + " of subject: " + strSubject
                        + " due to above error in creating mutant!");
                return null;
            }

            objUtil.WriteListToFile(strPathMutantsIteration, strMutantFileName, lstMutatedCode);
            return strPathMutantsIteration + "/" + strMutantFileName;
        } catch (Exception ex) {
            System.out.println("error at Controller.CreateThisMutant()");
            ex.printStackTrace();
            return null;
        }
    }

    private String GetPathOriginalClassFile(String strSubject, String[] arrClassInfo) {
        try {
            String strPathClassFile = "";
            String strClass = arrClassInfo[arrClassInfo.length - 1];
            for (String strClassInfo : arrClassInfo) {
                if (strPathClassFile.isEmpty()) {
                    strPathClassFile = strClassInfo;
                } else {
                    strPathClassFile += "/" + strClassInfo;
                }
            }
            strPathClassFile = strPathClassFile + Data.strClassFileExt;
            Boolean boolPathClassFileFound = false;
            for (String strSourceDirGenericPath : Data.arrSourceDirGenericPath) {
                String strProbablePathClassFile = Data.dirSubjectsWithTests + "/" + strSubject + strSourceDirGenericPath + strPathClassFile;
                if (objUtil.FileExists(strProbablePathClassFile)) {
                    strPathClassFile = strProbablePathClassFile;
                    boolPathClassFileFound = true;
                    break;
                }
            }
            if (boolPathClassFileFound == false) {
                System.out.println("Unable to find class file using all available options at: " + strPathClassFile);
                return null;
            }
            strPathClassFileToRestore = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants
                    + "/" + strClass + Data.strClassFileExt;
            if (objUtil.FileExists(strPathClassFileToRestore) == false) {
                String strCommandForCopyingClassFileToMutantsDir = Data.strCommandForCopying + strPathClassFile + " " + strPathClassFileToRestore;
                strCommandForCopyingClassFileToMutantsDir = strCommandForCopyingClassFileToMutantsDir.replace("/", "\\");
                objUtil.ExecuteProcessAndGetIntErrorCode(strCommandForCopyingClassFileToMutantsDir);
            }
            return strPathClassFile;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetPathOriginalClassFile()");
            ex.printStackTrace();
            return null;
        }
    }

    private LinkedList<String> GetMutatedCode(LinkedList<String> lstMutatedCodeWithOperator2Replace, String strPhaseToLookFor, String strPhaseToReplaceWith) {
        try {
            if (strPhaseToReplaceWith.split(" ").length > 10) {
                System.out.println("Unable to proceed the suggested mutation: \"" + strPhaseToLookFor + "\" mutated to \"" + strPhaseToReplaceWith + "\"");
                return null;
            }
            LinkedList<String> lstMutatedCode = new LinkedList();
            for (String strSentence : lstMutatedCodeWithOperator2Replace) {
                if (strSentence.contains(Data.strMutOperatorPrefix + " ")
                        && strSentence.contains(" " + Data.strMutOperatorSuffix + " " + Data.strOperatorToReplace)) {
                    strSentence = strSentence.replace(Data.strMutOperatorPrefix + " ", "");
                    strSentence = strSentence.replace(" " + Data.strMutOperatorSuffix + " " + Data.strOperatorToReplace, "");
                    if (strSentence.contains(strPhaseToLookFor) == false) {
                        System.out.println("Unable to find phrase: \"" + strPhaseToLookFor + "\" in sentence \"" + strSentence + "\"");
                        if (strPhaseToLookFor.contains("[") || strPhaseToLookFor.contains("]")) {
                            strPhaseToLookFor = strPhaseToLookFor.replace("[", "[ ").replace("]", " ]");
                        } else if (strPhaseToLookFor.contains(" - ")) {
                            strPhaseToLookFor = strPhaseToLookFor.replace(" - ", "-");
                        }
                        if (strSentence.contains(strPhaseToLookFor) == false) {
                            System.out.println("Unable to again find phrase: \"" + strPhaseToLookFor + "\" in sentence \"" + strSentence + "\"");
                            return null;
                        }
                    }
                    if (strPhaseToReplaceWith.equals(Data.strMutantNoOp)) {
                        strSentence = " ";
                    } else {
                        strSentence = strSentence.replace(strPhaseToLookFor, strPhaseToReplaceWith);
                        if (strSentence.contains(strPhaseToReplaceWith) == false) {
                            System.out.println("Unable to replace phrase: \"" + strPhaseToLookFor + "\" with phrase: \""
                                    + strPhaseToReplaceWith + "\" in sentence \"" + strSentence + "\"");
                            return null;
                        }
                    }
                }
                lstMutatedCode.add(strSentence);
            }
            return lstMutatedCode;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetMutatedCode()");
            ex.printStackTrace();
            return null;
        }
    }

    private LinkedList<String> ReturnFailedTests(LinkedList<String> lstLog) {
        try {
            LinkedList<String> lstFailedTests = new LinkedList();
            for (String strSentence : lstLog) {
                if (strSentence.contains(Data.strToLookForInFailedTestsLog01) && strSentence.contains(Data.strToLookForInFailedTestsLog02)) {
                    lstFailedTests.add(strSentence.replace(Data.strToLookForInFailedTestsLog01, ".").replace(Data.strToLookForInFailedTestsLog02, ""));
                }
            }
            return lstFailedTests;
        } catch (Exception ex) {
            System.out.println("error at Controller.ReturnFailedTests()");
            ex.printStackTrace();
            return null;
        }
    }

    private HashMap<String, LinkedList<String>> ReturnSubsumingInfo(HashMap<String, LinkedList<String>> mapMutantsWithFailedTests) {
        try {
            HashMap<String, LinkedList<String>> mapSubsumingInfo = new HashMap();
            for (String strMutantId : mapMutantsWithFailedTests.keySet()) {
                LinkedList<String> lstSubsumedMutants = new LinkedList();
                LinkedList<String> lstFailedTests = mapMutantsWithFailedTests.get(strMutantId);
                for (String strAnotherMutantId : mapMutantsWithFailedTests.keySet()) {
                    if (strAnotherMutantId.equals(strMutantId)) {
                        continue;
                    }
                    LinkedList<String> lstAnotherFailedTests = mapMutantsWithFailedTests.get(strAnotherMutantId);
                    if (lstAnotherFailedTests.containsAll(lstFailedTests)) {
                        lstSubsumedMutants.add(strAnotherMutantId);
                    }
                }
                mapSubsumingInfo.put(strMutantId, lstSubsumedMutants);
            }
            LinkedList<String> lstSubsumingMutants = GetSubsumingMutants(mapSubsumingInfo, mapMutantsWithFailedTests);
            mapSubsumingInfo.put(Data.strSubsuming, lstSubsumingMutants);
            return mapSubsumingInfo;
        } catch (Exception ex) {
            System.out.println("error at Controller.ReturnSubsumingInfo()");
            ex.printStackTrace();
            return null;
        }
    }

    private LinkedList<String> GetSubsumingMutants(HashMap<String, LinkedList<String>> mapSubsumingInfo, HashMap<String, LinkedList<String>> mapMutantsWithFailedTests) {
        try {
            LinkedList<String> lstSubsumingMutants = new LinkedList();
            for (String strMutantId : mapSubsumingInfo.keySet()) {
                Boolean boolIsSubsumed = false;
                for (String strAnotherMutantId : mapSubsumingInfo.keySet()) {
                    if (strAnotherMutantId.equals(strMutantId)) {
                        continue;
                    }
                    LinkedList<String> lstAnotherSubsumedMutants = mapSubsumingInfo.get(strAnotherMutantId);
                    if (lstAnotherSubsumedMutants.contains(strMutantId)) {
                        LinkedList<String> lstFailedTests = mapMutantsWithFailedTests.get(strMutantId);
                        LinkedList<String> lstAnotherFailedTests = mapMutantsWithFailedTests.get(strAnotherMutantId);
                        if (!(lstFailedTests.containsAll(lstAnotherFailedTests) && lstAnotherFailedTests.containsAll(lstFailedTests))) {
                            boolIsSubsumed = true;
                        }
                    }
                }
                if (!boolIsSubsumed) {
                    lstSubsumingMutants.add(strMutantId);
                }
            }
            return lstSubsumingMutants;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetSubsumingMutants()");
            ex.printStackTrace();
            return null;
        }
    }

    private String GetSummaryInfoForThisIteration(String strTask, String strSubject, String strIteration) {
        try {
            String strColumnNameInSummaryFile, strInfoFileName, strCoveredSpecsFileName;
            if (mapSubjectWithAllMutants == null) {
                mapSubjectWithAllMutants = new HashMap();
            }
            switch (strTask) {
                case "SIMUTATE":
                case "SIMUTATEFORGT":
                    strColumnNameInSummaryFile = Data.strSubsuming;
                    strInfoFileName = Data.strSubsumingInfoFileName;
                    strCoveredSpecsFileName = Data.strSubsumingCoveredSpecsFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONS":
                    strColumnNameInSummaryFile = Data.strPredicted;
                    strInfoFileName = Data.strPredictionInfoFileName;
                    strCoveredSpecsFileName = Data.strPredictionCoveredSpecsFileName;
                    break;
                case "SIMUTATEWITHRANDOM":
                    strColumnNameInSummaryFile = Data.strRandom;
                    strInfoFileName = Data.strRandomInfoFileName;
                    strCoveredSpecsFileName = Data.strRandomCoveredSpecsFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONSFORGT":
                    strColumnNameInSummaryFile = Data.strPredicted;
                    strInfoFileName = Data.strPredictionInfoGroundTruthFileName;
                    strCoveredSpecsFileName = Data.strPredictionGroundTruthCoveredSpecsGroundTruthFileName;
                    break;
                case "SIMUTATEWITHRANDOMFORGT":
                    strColumnNameInSummaryFile = Data.strRandom;
                    strInfoFileName = Data.strRandomInfoGroundTruthFileName;
                    strCoveredSpecsFileName = Data.strRandomGroundTruthCoveredSpecsFileName;
                    break;
                default:
                    System.out.println("Unavailable choice of task opted, please try again!");
                    return null;
            }
            String strRet = "\"" + strSubject + "\"," + strIteration;
            String strPathInfoFile = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration + "/" + strInfoFileName;
            String strPathSpecsKilledmutantsFile = Data.dirSpecfuzzerExtracted + "/" + strSubject + "/" + strIteration + "/" + Data.strSpecsKilledmutantsFileName;
            String strPathSpecsFile = Data.dirSpecfuzzerExtracted + "/" + strSubject + "/" + strIteration + "/" + Data.strSpecsFileName;
            if (objUtil.FileExists(strPathSpecsKilledmutantsFile) == false) {
                strRet += ",\"" + Data.strNoMutantKilled + "\"";
                return strRet;
            }
            ArrayList<ArrayList<String>> lstInfo = objUtil.ReadCsvToArrayList(strPathInfoFile);
            LinkedList<String> lstSelectedMutants = new LinkedList();
            for (ArrayList<String> lstRow : lstInfo) {
                if (lstRow.get(0).equals(strColumnNameInSummaryFile)) {
                    if (lstRow.size() < 2) {
                        //strRet += ",\"" + Data.strNoMutantInfo + "\"";
                        //return strRet;
                        strRet += ",\"[]\"";
                    } else {
                        for (int i = 1; i < lstRow.size(); i++) {
                            lstSelectedMutants.add(lstRow.get(i));
                        }
                        strRet += ",\"" + lstSelectedMutants.toString() + "\"";
                    }
                    break;
                }
            }
            //saving setup-files dir for time measurement
            if (lstSelectedMutants.isEmpty() == false) {
                String strPathSetupFiles = Data.dirSpecfuzzerResults + "/" + strSubject + "/" + Data.strSetupFiles;
                String strDirSummary = Data.dirSummary;
                if (strTask == Data.strSimutateForGT
                        || strTask == Data.strSimutateWithPredictionsForGT
                        || strTask == Data.strSimutateWithRandomForGT) {
                    strDirSummary = Data.dirGroundTruth;
                }
                String strPathExperiments = strDirSummary + "/" + strColumnNameInSummaryFile + "/" + strSubject + "/" + Data.strSetupFiles;
                if (objUtil.FileExists(strPathExperiments) == false) {
                    strPathSetupFiles = strPathSetupFiles.replace("/", "\\");
                    strPathExperiments = strPathExperiments.replace("/", "\\");
                    String strCmdToCopy = Data.strCommandForCopyingDirectory
                            .replace(Data.strOriginalDirPath, strPathSetupFiles).replace(Data.strNewDirPath, strPathExperiments);
                    objUtil.ExecuteProcessAndGetIntErrorCode(strCmdToCopy);
                    if (objUtil.FileExists(strPathExperiments)) {
                        String strPathMutants = strPathExperiments + "/" + Data.strMutants;
                        LinkedList<String> lstAllMutants = DeleteUnselectedMutantFilesAndReturnAllMutantsList(strPathMutants, lstSelectedMutants);
                        if (mapSubjectWithAllMutants.containsKey(strSubject) == false) {
                            mapSubjectWithAllMutants.put(strSubject, lstAllMutants);
                        }
                    }
                }
            }

            ArrayList<ArrayList<String>> lstSpecsKilledmutants = objUtil.ReadCsvToArrayList(strPathSpecsKilledmutantsFile);
            ArrayList<ArrayList<String>> lstSpecs = objUtil.ReadCsvToArrayList(strPathSpecsFile);
            HashMap<String, String> mapSpecs = new HashMap();
            for (ArrayList<String> lstSpec : lstSpecs) {
                mapSpecs.put(lstSpec.get(1), lstSpec.get(0));
            }

            LinkedList<String> lstGTSpecIDs = new LinkedList();
            if (strTask == Data.strSimutateForGT
                    || strTask == Data.strSimutateWithPredictionsForGT
                    || strTask == Data.strSimutateWithRandomForGT) {
                HashMap<String, String> mapSpecsForGT = new HashMap();
                for (ArrayList<String> lstSpec : lstSpecs) {
                    mapSpecsForGT.put(lstSpec.get(0), lstSpec.get(1));
                }
                LinkedList<String> lstGTSpecsForThisSubj = mapGroundTruthSubjSpecs.get(strSubject);
                if (lstGTSpecsForThisSubj == null || lstGTSpecsForThisSubj.isEmpty()) {
                    strRet += ",\"" + Data.strNoGroundTruth + "\"";
                    return strRet;
                }
                for (String strGTSpec : lstGTSpecsForThisSubj) {
                    String strSpecId = mapSpecsForGT.get(strGTSpec);
                    if (strSpecId == null || strSpecId.isEmpty()) {
                        continue;
                    }
                    lstGTSpecIDs.add(strSpecId);
                }
                if (lstGTSpecIDs.isEmpty()) {
                    strRet += ",\"" + Data.strNoGroundTruth + "\"";
                    return strRet;
                }
            }

            //LinkedList<String> lstMutantBuckets = new LinkedList();
            LinkedList<String> lstRelevantMutants = new LinkedList();
            Integer intMissedAssertionsIfOnlySubsumingSelected = 0;
            LinkedList<String> lstSpecsCovered = new LinkedList();
            for (ArrayList<String> lstSpecKilledmutants : lstSpecsKilledmutants) {
                String strSpecId = lstSpecKilledmutants.get(0);
                if (strTask == Data.strSimutateForGT
                        || strTask == Data.strSimutateWithPredictionsForGT
                        || strTask == Data.strSimutateWithRandomForGT) {
                    if (lstGTSpecIDs.contains(strSpecId) == false) {
                        continue;
                    }
                }
                String strKilledMutants = lstSpecKilledmutants.get(1);
                //if (lstMutantBuckets.contains(strKilledMutants) == false) {
                //    lstMutantBuckets.add(strKilledMutants);
                //}
                String[] arrKilledMutants = strKilledMutants.replace("[", "").replace("]", "").split(Pattern.quote(", "));
                for (String strKilledMutant : arrKilledMutants) {
                    if (lstRelevantMutants.contains(strKilledMutant) == false) {
                        lstRelevantMutants.add(strKilledMutant);
                    }
                }

                LinkedList<String> lstKilledMutants = new LinkedList<String>(Arrays.asList(arrKilledMutants));
                Boolean boolCouldHaveCreated = false;
                for (String strSelectedMutant : lstSelectedMutants) {
                    if (lstKilledMutants.contains(strSelectedMutant)) {
                        lstSpecsCovered.add("\"" + mapSpecs.get(strSpecId) + "\"," + strSpecId);
                        boolCouldHaveCreated = true;
                        break;
                    }
                }
                if (boolCouldHaveCreated == false) {
                    intMissedAssertionsIfOnlySubsumingSelected++;
                }
            }
            strRet += ",\"" + lstRelevantMutants.toString() + "\"";
            int intTotalSpecs = 0;
            switch (strTask) {
                case "SIMUTATE":
                case "SIMUTATEWITHPREDICTIONS":
                case "SIMUTATEWITHRANDOM":
                    intTotalSpecs = lstSpecsKilledmutants.size();
                    break;
                case "SIMUTATEFORGT":
                case "SIMUTATEWITHPREDICTIONSFORGT":
                case "SIMUTATEWITHRANDOMFORGT":
                    intTotalSpecs = lstGTSpecIDs.size();
                    break;
            }

            double doubleMissedAssertionsPercentage = Math.round(((intMissedAssertionsIfOnlySubsumingSelected * 100.0) / intTotalSpecs) * 100.0) / 100.0;
            strRet += "," + doubleMissedAssertionsPercentage;
            objUtil.WriteListToFile(Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration,
                    strCoveredSpecsFileName, lstSpecsCovered);

            //adding additional information
            //"ALLMUTANTS"
            LinkedList<String> lstAllMutantsForThisSubject = mapSubjectWithAllMutants.get(strSubject);
            if (lstAllMutantsForThisSubject == null) {
                lstAllMutantsForThisSubject = new LinkedList();
            }
            strRet += ",\"" + lstAllMutantsForThisSubject.toString() + "\"";
            //"ALLMUTANTSCOUNT"
            strRet += "," + lstAllMutantsForThisSubject.size();
            //"SELECTEDMUTANTSCOUNT"
            strRet += "," + lstSelectedMutants.size();
            //"RELEVANTMUTANTSCOUNT"
            strRet += "," + lstRelevantMutants.size();
            //"INTERSECTIONMUTANTSCOUNT"
            LinkedList<String> lstIntersectionMutants = new LinkedList();
            for (String strMutId : lstSelectedMutants) {
                if (lstRelevantMutants.contains(strMutId)) {
                    lstIntersectionMutants.add(strMutId);
                }
            }
            strRet += "," + lstIntersectionMutants.size();
            //"ASSERTIONSCOUNT"
            strRet += "," + lstSpecsCovered.size();
            //"ORIGINALTIME"
            String strDirPathLog = Data.dirSpecfuzzerResultsNoSelection + "/" + strSubject + "/" + Data.strOutputDirName;
            String strTime = GetTimeTakenFromLogs(strTask, strDirPathLog);
            strRet += "," + strTime;
            //"NEWTIME"
            strDirPathLog = Data.dirSpecfuzzerResultsSelected + "/" + strSubject + "/" + Data.strOutputDirName;
            strTime = GetTimeTakenFromLogs(strTask, strDirPathLog);
            strRet += "," + strTime;
            return strRet;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetSummaryInfoForThisIteration()");
            ex.printStackTrace();
            return null;
        }
    }

    private void RestoreOriginalFile(String strSubject) {
        try {
            if (strPathClassFile == null) {
                String strPathDirIteration = Data.dirSpecfuzzerExtracted + "/" + strSubject + "/1";
                String strPathMutantCsv = strPathDirIteration + "/" + Data.strMutantsFileName;
                ArrayList<ArrayList<String>> lstMutantsInfos = objUtil.ReadCsvToArrayList(strPathMutantCsv);
                String[] arrMutantInfo = lstMutantsInfos.get(0).get(1).split(Pattern.quote(":"));
                String strMutantId = arrMutantInfo[0];
                String[] arrClassInfo = arrMutantInfo[4].split(Pattern.quote("@"))[0].split(Pattern.quote("."));
                String strClass = arrClassInfo[arrClassInfo.length - 1];
                strPathClassFile = GetPathOriginalClassFile(strSubject, arrClassInfo);
                if (strPathClassFile == null) {
                    System.out.println("Cannot proceed for subject: " + strSubject
                            + " due to unavailable class file: " + strClass + Data.strClassFileExt + "!");
                    return;
                }
            }
            String strCmdToDelMutantAndRestoreClassFile = strPathClassFile + " && " + Data.strCommandForCopying + strPathClassFileToRestore + " " + strPathClassFile;
            strCmdToDelMutantAndRestoreClassFile = strCmdToDelMutantAndRestoreClassFile.replace("/", "\\");
            strCmdToDelMutantAndRestoreClassFile = Data.strCommandForDeletingForcefuly + strCmdToDelMutantAndRestoreClassFile;
            objUtil.ExecuteProcessAndGetIntErrorCode(strCmdToDelMutantAndRestoreClassFile);
        } catch (Exception ex) {
            System.out.println("error at Controller.RestoreOriginalFile()");
            ex.printStackTrace();
        }
    }

    private void CleanUpPreviousSimulation() {
        try {
            objUtil.DeleteFile(Data.dirSummary, Data.strSubsumingInfoSummaryFileName);
            File dirSpecfuzzerExtracted = new File(Data.dirSpecfuzzerExtracted);
            for (File dirSubject : dirSpecfuzzerExtracted.listFiles()) {
                if (dirSubject.isDirectory() == false) {
                    continue;
                }
                String strSubject = dirSubject.getName();
                //For debugging
                //if (strSubject.equals("ArithmeticUtils_subAndCheck") == false) {
                //    continue;
                //}
                for (File dirIteration : dirSubject.listFiles()) {
                    if (dirIteration.isDirectory() == false) {
                        continue;
                    }
                    String strIteration = dirIteration.getName();
                    String strPathDirIteration = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration;
                    objUtil.DeleteFile(strPathDirIteration, Data.strMutantsWithFailedTestsFileName);
                    objUtil.DeleteFile(strPathDirIteration, Data.strSubsumingInfoFileName);
                    File dirSubjectsWithTestsIteration = new File(strPathDirIteration);
                    for (File fileLog : dirSubjectsWithTestsIteration.listFiles()) {
                        if (fileLog.getName().matches(Data.strLogFileCheck)) {
                            objUtil.DeleteFile(strPathDirIteration, fileLog.getName());
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.CleanUpPreviousSimulation()");
            ex.printStackTrace();
        }
    }

    private HashMap<String, LinkedList<String>> ReturnPredictionInfo(String strTask, String strSubject, String strIteration) {
        try {
            HashMap<String, LinkedList<String>> mapPredictionInfo = new HashMap();
            String strPredictionInfoFileName = "";
            switch (strTask) {
                case "SIMUTATEWITHPREDICTIONS":
                case "SIMUTATEWITHRANDOM":
                    strPredictionInfoFileName = Data.strPredictionInfoFileName;
                    break;
                case "SIMUTATEWITHPREDICTIONSFORGT":
                case "SIMUTATEWITHRANDOMFORGT":
                    strPredictionInfoFileName = Data.strPredictionInfoGroundTruthFileName;
                    break;
            }
            String strPathInfoFile = Data.dirSubjectsWithTests + "/" + strSubject + "/" + Data.strMutants + "/" + strIteration + "/" + strPredictionInfoFileName;
            if (objUtil.FileExists(strPathInfoFile)) {
                ArrayList<ArrayList<String>> lstPredictionInfo = objUtil.ReadCsvToArrayList(strPathInfoFile);
                mapPredictionInfo = objUtil.ConvertArrayListToHashMap(lstPredictionInfo);
            } else {
                if (mapPredictedRelevant == null || mapPredictedRelevant.isEmpty()) {
                    LoadMapPredictedRelevant(strTask);
                }
                LinkedList<String> lstPredictedRelevant = mapPredictedRelevant.get(strSubject + "_" + strIteration);
                if (lstPredictedRelevant == null || lstPredictedRelevant.isEmpty()) {
                    lstPredictedRelevant = new LinkedList();
                }
                mapPredictionInfo.put(Data.strPredicted, lstPredictedRelevant);
            }
            return mapPredictionInfo;
        } catch (Exception ex) {
            System.out.println("error at Controller.ReturnPredictionInfo()");
            ex.printStackTrace();
            return null;
        }
    }

    private void LoadMapPredictedRelevant(String strTask) {
        try {
            mapPredictedRelevant = new HashMap();
            String strPathTest = "";
            String strPathPredictions = "";
            switch (strTask) {
                case "SIMUTATEWITHPREDICTIONS":
                case "SIMUTATEWITHRANDOM":
                    strPathTest = Data.strPathTestSetCsvWithFoldToBeReplaced;
                    strPathPredictions = Data.strPathPredictionsCsvWithFoldToBeReplaced;
                    break;
                case "SIMUTATEWITHPREDICTIONSFORGT":
                case "SIMUTATEWITHRANDOMFORGT":
                    strPathTest = Data.strPathTestSetCsvForGTWithFoldToBeReplaced;
                    strPathPredictions = Data.strPathPredictionsCsvForGTWithFoldToBeReplaced;
                    break;
            }
            for (String strFold : Data.arrFolds) {
                String strPathTestSetCsvWithFoldToBeReplaced = strPathTest.replace(Data.strFoldToBeReplaced, strFold);
                String strPathPredictionsCsvWithFoldToBeReplaced = strPathPredictions.replace(Data.strFoldToBeReplaced, strFold);
                ArrayList<ArrayList<String>> lstTestSet = objUtil.ReadCsvToArrayList(strPathTestSetCsvWithFoldToBeReplaced);
                ArrayList<ArrayList<String>> lstPredictions = objUtil.ReadCsvToArrayList(strPathPredictionsCsvWithFoldToBeReplaced);
                for (int i = 1; i < lstTestSet.size(); i++) {
                    ArrayList<String> lstRecord = lstTestSet.get(i);
                    String strKey = lstRecord.get(4) + "_" + Double.valueOf(lstRecord.get(2)).intValue();
                    if (mapPredictedRelevant.containsKey(strKey) == false) {
                        LinkedList<String> lstRelevant = new LinkedList();
                        mapPredictedRelevant.put(strKey, lstRelevant);
                    }
                    Double dblPrediction = Double.valueOf(lstPredictions.get(i).get(0));
                    if (dblPrediction > Data.dblPredictionThreshold) {
                        String strMutantId = String.valueOf(Double.valueOf(lstRecord.get(1)).intValue());
                        LinkedList<String> lstRelevant = mapPredictedRelevant.get(strKey);
                        if (lstRelevant.contains(strMutantId) == false) {
                            lstRelevant.add(strMutantId);
                            mapPredictedRelevant.replace(strKey, lstRelevant);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Controller.LoadMapPredictedRelevant()");
            ex.printStackTrace();
        }
    }

    private HashMap<String, LinkedList<String>> ReturnRandomInfo(String strSubject, String strIteration, Integer intRandomMutantsToSelect) {
        try {
            HashMap<String, LinkedList<String>> mapRandomInfo = new HashMap();
            LinkedList<String> lstPredictedRelevant = new LinkedList();
            String strPathAllMutantsForThisIteration = Data.dirSpecfuzzerExtracted + "/" + strSubject + "/" + strIteration + "/" + Data.strMutantsFileName;
            if (objUtil.FileExists(strPathAllMutantsForThisIteration)) {
                ArrayList<ArrayList<String>> lstMutants = objUtil.ReadCsvToArrayList(strPathAllMutantsForThisIteration);
                HashMap<String, LinkedList<String>> mapAllMutants = objUtil.ConvertArrayListToHashMap(lstMutants);
                for (int i = 1; i <= intRandomMutantsToSelect; i++) {
                    int intNth = new Random().nextInt(mapAllMutants.keySet().size());
                    int intCount = 0;
                    for (String strMutantID : mapAllMutants.keySet()) {
                        if (intCount == intNth) {
                            lstPredictedRelevant.add(strMutantID);
                            mapAllMutants.remove(strMutantID);
                            break;
                        }
                        intCount++;
                    }
                }
                mapRandomInfo.put(Data.strRandom, lstPredictedRelevant);
            }
            return mapRandomInfo;
        } catch (Exception ex) {
            System.out.println("error at Controller.ReturnRandomInfo()");
            ex.printStackTrace();
            return null;
        }
    }

    private void LoadGroundTruth() throws Exception {
        try {
            ArrayList<ArrayList<String>> lstGT = objUtil.ReadCsvToArrayList(Data.dirGroundTruth + "/" + Data.strGroundTruthFileName);
            mapGroundTruthSubjSpecs = new HashMap();
            for (ArrayList<String> lstThisSubjSpec : lstGT) {
                String strSubj = lstThisSubjSpec.get(0);
                String strSpec = lstThisSubjSpec.get(1);
                if (strSpec.isEmpty() || strSpec.contains(Data.strHoldsForSentenceInLogs) == false) {
                    continue;
                }
                strSpec = strSpec.substring(0, strSpec.indexOf(Data.strHoldsForSentenceInLogs)).replace(Data.strFuzzedInvariantSentenceInLogs, "").trim();
                if (mapGroundTruthSubjSpecs.containsKey(strSubj)) {
                    LinkedList<String> lstSpec = mapGroundTruthSubjSpecs.get(strSubj);
                    lstSpec.add(strSpec);
                    mapGroundTruthSubjSpecs.replace(strSubj, lstSpec);
                } else {
                    LinkedList lstSpec = new LinkedList();
                    lstSpec.add(strSpec);
                    mapGroundTruthSubjSpecs.put(strSubj, lstSpec);
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.LoadGroundTruth()");
            ex.printStackTrace();
            throw ex;
        }
    }

    private void PrepareScalabilityDataset() {
        try {
            lstSentencesForSubjectsFile = new LinkedList();
            lstSubjectsMap = new LinkedList();
            File filePathGassertGenout = new File(Data.strPathGassertGenout);
            for (File fileSubject : filePathGassertGenout.listFiles()) {
                if (!fileSubject.isDirectory()) {
                    continue;
                }
                String strSubject = fileSubject.getName();
                System.out.println("processing subject: " + strSubject);
                String strPathSubject = fileSubject.getPath();
                TraverseInsideSubjectForScalability(strPathSubject, fileSubject);
            }
            objUtil.WriteListToFile(Data.dirDockerSpecExperiments, Data.strScalabilitySubjectsFileName, lstSentencesForSubjectsFile);
            objUtil.WriteListToFile(Data.dirDockerSpecExperiments, Data.strScalabilitySubjectsMapFileName, lstSubjectsMap);
        } catch (Exception ex) {
            System.out.println("error at Controller.PrepareScalabilityDataset()");
            ex.printStackTrace();
        }
    }

    private void TraverseInsideSubjectForScalability(String strPathSubject, File dirToTraverse) {
        try {
            for (File fileInsideSubject : dirToTraverse.listFiles()) {
                if (fileInsideSubject.isFile() && fileInsideSubject.getName().equals(Data.strAssertedFn + Data.strTxtFileExt)) {
                    String strFnName = objUtil.GetFunctionNameFromTextFile(fileInsideSubject);
                    if (strFnName == null || strFnName.isEmpty()) {
                        continue;
                    }

                    String strPathGrandParent = fileInsideSubject.getParentFile().getParent();
                    String strClassPathDotSeparated = strPathGrandParent.replace(strPathSubject, "").replace("/", " ").replace("\\", " ").trim().replace(" ", ".");
                    String[] arrClassPathDotSeparated = strClassPathDotSeparated.split(Pattern.quote("."));
                    String strClassName = arrClassPathDotSeparated[arrClassPathDotSeparated.length - 1];
                    String strClassNameUnderScoreFnName = strClassName + "_" + strFnName;
                    String strSentenceForSubjectsFile = strClassNameUnderScoreFnName + " " + strClassPathDotSeparated + " " + strFnName;
                    if (lstSentencesForSubjectsFile.contains(strSentenceForSubjectsFile)) {
                        continue;
                    }
                    String strSubject = new File(strPathSubject).getName();
                    String strOriginalPath = Data.dirGassertSubjects + "/" + strSubject;
                    strOriginalPath = strOriginalPath.replace("/", "\\");
                    String strNewPath = Data.dirDockerSpecGassertSubjects + "/" + strClassNameUnderScoreFnName;
                    strNewPath = strNewPath.replace("/", "\\");
                    String strCommandForCopyingDirectory = Data.strCommandForCopyingDirectory
                            .replace(Data.strOriginalDirPath, strOriginalPath)
                            .replace(Data.strNewDirPath, strNewPath);
                    //strCommandForCopyingDirectory = strCommandForCopyingDirectory.replace("/", "\\");
                    objUtil.ExecuteProcessAndGetIntErrorCode(strCommandForCopyingDirectory);
                    if (!objUtil.FileExists(strNewPath)) {
                        continue;
                    }
                    lstSentencesForSubjectsFile.add(strSentenceForSubjectsFile);
                    lstSubjectsMap.add(strClassNameUnderScoreFnName + "," + strSubject);
                    System.out.println("resulted in: " + strSentenceForSubjectsFile);
                    Thread.sleep(1000 * 1);
                } else if (fileInsideSubject.isDirectory()) {
                    TraverseInsideSubjectForScalability(strPathSubject, fileInsideSubject);
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Controller.TraverseInsideSubjectForScalability()");
            ex.printStackTrace();
        }
    }

    private void AnalyzeSpecLogs() {

    }

    private LinkedList<String> DeleteUnselectedMutantFilesAndReturnAllMutantsList(String strPathMutants, LinkedList<String> lstSelectedMutants) {
        try {
            LinkedList<String> lstAllMutants = new LinkedList();
            File dirMutants = new File(strPathMutants);
            String strMutantsLogFileName = "";
            LinkedList<String> lstMutantsLogNew = new LinkedList();
            LinkedList<String> lstMutantFilesForDeletion = new LinkedList();
            for (File fileInsideMutantsDir : dirMutants.listFiles()) {
                String strMutantId = "";
                if (fileInsideMutantsDir.getName().matches(Data.strDtranceGzSentenceInLogsCheck)) {
                    strMutantId = fileInsideMutantsDir.getName().split(Pattern.quote(Data.strTesterDriverWithM))[1]
                            .replace(Data.strDtranceGzSentenceInLogs, "");
                } else if (fileInsideMutantsDir.getName().matches(Data.strObjectsXmlCheck)) {
                    strMutantId = fileInsideMutantsDir.getName().split(Pattern.quote(Data.strTesterDriverWithM))[1]
                            .replace(Data.strObjectsXml, "");
                }
                if (strMutantId.isEmpty()) {
                    if (fileInsideMutantsDir.getName().matches(Data.strTestDriverMutantsLogFileNameCheck)) {
                        strMutantsLogFileName = fileInsideMutantsDir.getName();
                        LinkedList<String> lstMutantsLog = objUtil.ReadFileToList(fileInsideMutantsDir.getPath());
                        for (String strMutantsLog : lstMutantsLog) {
                            String[] arrMutantsLog = strMutantsLog.split(Pattern.quote(":"));
                            String strMutantIdToDecide = arrMutantsLog[0];
                            if (lstSelectedMutants.contains(strMutantIdToDecide)) {
                                lstMutantsLogNew.add(strMutantsLog);
                            }
                        }
                    }
                } else {
                    if (lstAllMutants.contains(strMutantId) == false) {
                        lstAllMutants.add(strMutantId);
                    }
                    if (lstSelectedMutants.contains(strMutantId) == false) {
                        lstMutantFilesForDeletion.add(fileInsideMutantsDir.getName());
                    }
                }
            }
            if (lstMutantFilesForDeletion.isEmpty() == false && lstMutantsLogNew.isEmpty() == false) {
                objUtil.DeleteFile(strPathMutants, strMutantsLogFileName);
                objUtil.WriteListToFile(strPathMutants, strMutantsLogFileName, lstMutantsLogNew);
                for (String strFileNameForDeletion : lstMutantFilesForDeletion) {
                    objUtil.DeleteFile(strPathMutants, strFileNameForDeletion);
                }
            }
            return lstAllMutants;
        } catch (Exception ex) {
            System.out.println("error at Controller.ReturnUnselectedMutantFilesListForDeletion()");
            ex.printStackTrace();
            return null;
        }
    }

    private String GetTimeTakenFromLogs(String strTask, String strDirPathLog) {
        String strTime = "-1";
        try {
            if (strTask.equals(Data.strSimutateWithPredictions)) { //|| strTask.equals(Data.strSimutate)
                String strPathLog = null;
                File fileDirPathLog = new File(strDirPathLog);
                for (File fileInside : fileDirPathLog.listFiles()) {
                    if (fileInside.getName().matches(Data.strLogFileCheck)) {
                        strPathLog = fileInside.getPath();
                        break;
                    }
                }
                if (objUtil.FileExists(strPathLog)) {
                    LinkedList<String> lstLog = objUtil.ReadFileToList(strPathLog);
                    for (String strToAnalyze : lstLog) {
                        if (strToAnalyze.contains(Data.strTimeSentenceInLogs)) {
                            strTime = strToAnalyze.replace(Data.strTimeSentenceInLogs, "");
                            break;
                        }
                    }
                }
            }
            strTime = strTime.equals("0") ? "0.5" : strTime;
            return strTime;
        } catch (Exception ex) {
            System.out.println("error at Controller.GetTimeTakenFromLogs()");
            ex.printStackTrace();
            return strTime;
        }
    }
}
