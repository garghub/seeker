/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeker;


public class Data {

    static String strAnalyzeData = "ANALYZEDATA";
    static Boolean boolScalability = false; //true
    static String dirDatasetOrig = "C:/seeker/dataset";
    static String dirDataset = boolScalability ? dirDatasetOrig + "/scalability_dataset" : dirDatasetOrig;
    static String dirSpecfuzzerResults = dirDataset + "/" + "specfuzzer-results";
    static String dirSubjects = dirDataset + "/" + "subjects";
    static String strOutputDirName = "output";
    static String strCsvFileExt = ".csv";
    static String strSpecFuzzerCsvCheck = ".*\\-specfuzzer\\" + strCsvFileExt + "$";
    static String strSpecFuzzerPhraseInLogFileName = "-specfuzzer-";
    static String strLogFileExt = ".log";
    static String strFuzzedSpecSentenceInLogs = "Fuzzed spec: ";
    static String strFuzzedSpecSentenceInLogsCheck = "Fuzzed\\ spec\\:\\ .*";
    static String strDaikonStyleExitSentenceInLogsCheck = ".*\\:\\:\\:EXIT$";
    static String[] arrSourceDirGenericPath = new String[]{
        "/gson/src/main/java/", "/src/main/java/", "/src/java/", "/src/"
    };
    static String strClassFileExt = ".java";
    static String strMutationIsSentenceInLogs = "- Mutation is: ";
    static String strMutationIsSentenceInLogsCheck = "\\-\\ Mutation\\ is\\:\\ .*";
    static String strPreservingSentenceInLogs = "Preserving ";
    static String strNewVariantsToFileSentenceInLogs = " new invariants to file ";
    static String strVectorSentenceInLogsCheck = "Vector\\:\\ \\[.*";
    static String strDtranceGzSentenceInLogsCheck = ".*\\.dtrace\\.gz$";
    static String strMSentenceInLogs = "-m";
    static String strDtranceGzSentenceInLogs = ".dtrace.gz";
    static String strFuzzedInvariantSentenceInLogs = "FuzzedInvariant ( ";
    static String strHoldsForSentenceInLogs = " ) holds for: ";
    static String strFailsSentenceInLogs = " Fails:  ";
    static String strQualitySentenceInLogs = " Quality:  ";

    static String dirSpecfuzzerExtracted = dirDataset + "/" + "specfuzzer-extracted";
    static String strClassFileName = "class" + strClassFileExt;
    static String strBucketsFileName = "buckets" + strCsvFileExt;
    static String strMutants = "mutants";
    static String strMutantsFileName = strMutants + strCsvFileExt;
    static String strSpecsFileName = "specs" + strCsvFileExt;
    static String strSpecsFailedTestsFileName = "specs_failed_tests" + strCsvFileExt;
    static String strSpecsKilledmutantsFileName = "specs_killed_mutants" + strCsvFileExt;

    static String strPrepareDataset = "PREPAREDATASET";
    static Boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows") ? true : false;
    static String strCommandExecutionInitial01 = isWindows ? "cmd.exe" : "bash";
    static String strCommandExecutionInitial02 = isWindows ? "/c" : "-c";
    static String strOperatorToReplace = "OPERATOR2REPLACE";
    static String strMutOperatorPrefix = "MST";
    static String strMutOperatorSuffix = "MSP";
    static String strIdiomFileName = "idiom.txt";
    static String strCommandForCd = "cd ";
    static String strCommandForSrc2abs = " && java -jar D:/ag/github/src2abs/src2abs-master/target/src2abs-0.1-jar-with-dependencies.jar single class "; //method
    static String strAbs = "_abs";
    static String strNxtLineSeparator = "\\r\\n";
    static String strImportSentenceInSequence = " ; import ";
    static String strSemicolonSentenceInSequence = " ; ";
    static String strJsonFileExt = ".json";
    static String strDatasetFileName = "dataset" + strJsonFileExt;
    static String strTxtFileExt = ".txt";
    static String strMaxSeqLenFileName = "max_seq_len" + strTxtFileExt;
    static Integer intAllowedSeqLen = 500;

    static String strRunEvosuite = "RUNEVOSUITE";
    static String dirSubjectsWithTests = dirDataset + "/" + "subjects_with_tests";
    static String strEvosuiteTests = "evosuite-tests";
    static String strCommandForGradleCleanAndBuild = " && gradle clean && gradle build";
    static String strPathBuildLibs = "build/libs";
    static String strJarFileExt = ".jar";
    static String strJarFileCheck = ".*\\" + strJarFileExt + "$";
    static String strPathEvosuiteJar = "D:/ag/github/evosuite/v1_0_6/evosuite-1.0.6.jar";
    static String strCommandForEvosuitePart01 = " && java -jar " + strPathEvosuiteJar + " -projectCP ";
    static String strCommandForEvosuitePart02 = " -class ";
    static String strCommandForEvosuitePart03 = " -criterion ";
    static String[] arrEvosuiteAvailableCriterion = new String[]{""}; //new String[]{"LINE", "BRANCH", "EXCEPTION", "WEAKMUTATION", "OUTPUT", "METHOD", "METHODNOEXCEPTION", "CBRANCH"};
    static String strPackageSentenceCheck = "package\\ .*";
    static String strESTestFileCheck = ".*\\_ESTest\\" + strClassFileExt + "$";
    static String strESTestScaffoldingFileCheck = ".*\\_ESTest\\_scaffolding\\" + strClassFileExt + "$";
    static String strPathSrcTestJava = "src/test/java";
    static String strCommandForCopying = "copy ";
    static String strCommandForCopyingEvosuiteJar = strCommandForCopying + strPathEvosuiteJar + " ";
    static String strPathLibs = "/libs";

    static String strSimutate = "SIMUTATE";
    static String strSimutateForGT = "SIMUTATEFORGT";
    static String strCommandForDeletingForcefuly = "del /f ";
    static String strToLookForInFailedTestsLog01 = " > ";
    static String strToLookForInFailedTestsLog02 = " FAILED";
    static String strMutantsWithFailedTestsFileName = "mutants_with_failed_tests" + strCsvFileExt;
    static String strSubsuming = "SUBSUMING";
    static String strSubsumingInfoFileName = "subsuming_info" + strCsvFileExt;
    static String strSubsumingCoveredSpecsFileName = "subsuming_covered_specs" + strCsvFileExt;
    static String strSubsumingInfoSummaryFileName = "subsuming_info_summary" + strCsvFileExt;
    static String strRelevant = "RELEVANT";
    static String strMissedAssertionsIfOnlySpecificSelected = "MISSED_ASSERTIONS_PERCENTAGE";
    static String strSubject = "SUBJECT";
    static String strIteration = "ITERATION";
    static String dirSummary = dirDataset + "/" + "summary";
    static String strColon = " : ";
    static String strNoMutantKilled = "Either No Proposed Spec OR No Mutant Killed By Proposed Specs!";
    static String strNoGroundTruth = "No Proposed Spec matches the Ground Truth!";
    static String strNoMutantInfo = "No Mutant Info Available!";
    static String strMutantNoOp = "<NO-OP>";
    static Integer intProcessThresholdTimeInMinutes = 2;
    static String strJavaExe = "java.exe";
    static String strCmdTaskKiller = "TASKKILL /F /IM " + strJavaExe;
    static String strCmdWindowsProcessKiller = "TASKKILL /F /PID "; // TASKKILL /F /PID x
    static String strGradleCleanFailed = ":clean FAILED";

    static String strRunRandoop = "RUNRANDOOP";
    static String strRandoopTests = "randoop-tests";
    static String strPathRandoopJar = "D:/ag/github/randoop/randoop-4.3.0/randoop-all-4.3.0.jar";
    static String strCommandForRandoopPart01 = " && java -cp " + strPathRandoopJar + ";";
    static String strCommandForRandoopPart02 = " randoop.main.Main gentests --testclass=";
    static String strLogFileCheck = ".*\\" + strLogFileExt + "$";
    static Integer intCountGradleProcessesInParallel = 10;
    static String strCommandLinePhraseForGradleProcess = "gradle";

    static String strCleanup = "CLEANUP";

    static String strSimutateWithPredictions = "SIMUTATEWITHPREDICTIONS";
    static String strSimutateWithPredictionsForGT = "SIMUTATEWITHPREDICTIONSFORGT";
    static String[] arrFoldsOrig = new String[]{"fold_01", "fold_02", "fold_03", "fold_04", "fold_05"};
    static String[] arrFolds = boolScalability ? new String[]{"fold"} : arrFoldsOrig;
    static String strFoldToBeReplaced = "fold_to_be_replaced";
    static String strPathMLDir = "D:/ag/github/machine_learning_project/assertion_relevant/specfuzzer";
    static String strPathTestSetCsvWithFoldToBeReplacedOrig = strPathMLDir + "/mutants_killed_by_specfuzzer_specs/" + strFoldToBeReplaced + "/raw/" + strFoldToBeReplaced + "_test.csv";
    static String strPathPredictionsCsvWithFoldToBeReplacedOrig = strPathMLDir + "/mutants_killed_by_specfuzzer_specs/fold_all/metrics_all_folds/predictions_concat_rf_" + strFoldToBeReplaced + ".csv";
    static String strPathTestSetCsvWithFoldToBeReplaced = boolScalability ? strPathMLDir + "/all_possible_filtered_mutants_specfuzzer_with_scalability_testset/" + strFoldToBeReplaced + "/raw/" + strFoldToBeReplaced + "_test.csv" : strPathTestSetCsvWithFoldToBeReplacedOrig;
    static String strPathPredictionsCsvWithFoldToBeReplaced = boolScalability ? strPathMLDir + "/all_possible_filtered_mutants_specfuzzer_with_scalability_testset/fold_all/metrics_all_folds/predictions_concat_rf_" + strFoldToBeReplaced + ".csv" : strPathPredictionsCsvWithFoldToBeReplacedOrig;
    static String strPathTestSetCsvForGTWithFoldToBeReplaced = strPathMLDir + "/ground_truth_specfuzzer/" + strFoldToBeReplaced + "/raw/" + strFoldToBeReplaced + "_test.csv";
    static String strPathPredictionsCsvForGTWithFoldToBeReplaced = strPathMLDir + "/ground_truth_specfuzzer/fold_all/metrics_all_folds/predictions_concat_rf_" + strFoldToBeReplaced + ".csv";
    static String strPredicted = "PREDICTED";
    static String strPredictionInfoFileName = "prediction_info" + strCsvFileExt;
    static String strPredictionInfoGroundTruthFileName = "prediction_info_ground_truth" + strCsvFileExt;
    static String strPredictionInfoSummaryFileName = "prediction_info_summary" + strCsvFileExt;
    static String strPredictionCoveredSpecsFileName = "prediction_covered_specs" + strCsvFileExt;
    static String strPredictionGroundTruthCoveredSpecsGroundTruthFileName = "prediction_ground_truth_covered_specs" + strCsvFileExt;
    static Double dblPredictionThreshold = 0.5;

    static String strSimutateWithRandom = "SIMUTATEWITHRANDOM";
    static String strSimutateWithRandomForGT = "SIMUTATEWITHRANDOMFORGT";
    static Integer[] arrThresholdsForRandom = new Integer[]{0, 10, 20, 30};
    static String strRandomInfoSummaryFileName = "random_info_summary" + strCsvFileExt;
    static String strRandom = "RANDOM";
    static String strRandomInfoFileName = "random_info" + strCsvFileExt;
    static String strRandomInfoGroundTruthFileName = "random_info_ground_truth" + strCsvFileExt;
    static String strRandomCoveredSpecsFileName = "random_covered_specs" + strCsvFileExt;
    static String strRandomGroundTruthCoveredSpecsFileName = "random_ground_truth_covered_specs" + strCsvFileExt;

    static String strPrepareGroundTruthDataset = "PREPAREGROUNDTRUTHDATASET";
    static String dirGroundTruth = dirDataset + "/" + "ground_truth";
    static String strGroundTruthFileName = "ground_truth" + strCsvFileExt;

    static String strPrepareScalabilityDataset = "PREPARESCALABILITYDATASET";
    static String dirGassert = "D:/ag/github/GAssert";
    static String strPathGassertGenout = dirGassert + "/misc-untouched/genout";
    static String strAssertedFn = "assertedfn";
    static String strXmlFileExt = ".xml";
    static String strSrcml = "srcml";
    static String strCodeFilePath = "code_file_path";
    static String strXmlFilePath = "xml_file_path";
    static String strCommandSrcmlToGenerateXml = strSrcml + " " + strCodeFilePath + " > " + strXmlFilePath;
    static String strXmlWithOnlyNameFilePath = "xml_with_only_name_file_path";
    static String strCommandSrcmlToGenerateOnlyNameInXml = strSrcml + " --xpath \"//src:function/src:name\" " + strXmlFilePath + " > " + strXmlWithOnlyNameFilePath;
    static String strAssertedFnWithOnlyName = "assertedfnwithonlyname";
    static String strXmlTagStartName = "<name>";
    static String strXmlTagEndName = "</name>";
    static String dirDockerSpec = dirDatasetOrig + "/docker_spec";
    static String dirDockerSpecExperiments = dirDockerSpec + "/specfuzzer/experiments";
    static String strScalabilitySubjectsFileName = "subjects";
    static String strScalabilitySubjectsMapFileName = "subjects_map.csv";
    static String dirGassertSubjects = dirGassert + "/GAssert/subjects-new-new";
    static String dirDockerSpecGassertSubjects = dirDockerSpec + "/tools/GAssert/subjects";
    static String strOriginalDirPath = "original_dir_path";
    static String strNewDirPath = "new_dir_path";
    static String strCommandForCopyingDirectory = "Xcopy " + strOriginalDirPath + " " + strNewDirPath + " /E /I";
    
    static String strAnalyzeSpecLogs = "ANALYZESPECLOGS";
    static String strSetupFiles = "setup-files";
    static String strTesterDriver = "TesterDriver";
    static String strTesterDriverWithM = strTesterDriver + strMSentenceInLogs;
    static String strObjectsXmlCheck = ".*\\-objects\\.xml$";
    static String strObjectsXml = "-objects.xml";
    static String strTestDriverMutantsLogFileNameCheck = ".*" + strTesterDriver + "\\-" + strMutants + "\\" + strLogFileExt + "$";
    static String strAllMutants = "ALLMUTANTS";
    static String strAllMutantsCount = "ALLMUTANTSCOUNT";
    static String strSelectedMutantsCount = "SELECTEDMUTANTSCOUNT";
    static String strRelevantMutantsCount = "RELEVANTMUTANTSCOUNT";
    static String strIntersectionMutantsCount = "INTERSECTIONMUTANTSCOUNT";
    static String strAssertionsCount = "ASSERTIONSCOUNT";
    static String strOriginalTime = "ORIGINALTIME";
    static String strNewTime = "NEWTIME";
    static String strNoSelection = "NOSELECTION";
    static String dirSpecfuzzerResultsNoSelection = dirSpecfuzzerResults + "_" + strNoSelection;
    static String dirSpecfuzzerResultsSelected = dirSpecfuzzerResults + "_" + strPredicted;
    static String strTimeSentenceInLogs = "# Filtering step took minutes: ";
}
