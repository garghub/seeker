/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeker;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Util {

    Integer intCountGradleProcessesInParallel;

    Util() {
        intCountGradleProcessesInParallel = 0;
    }

    public ArrayList<ArrayList<String>> ReadCsvToArrayList(String csvPath) throws Exception {
        try {
            System.out.println("Reading " + csvPath);
            ArrayList<ArrayList<String>> records = new ArrayList<>();
            try (CSVReader csvReader = new CSVReader(new FileReader(csvPath));) {
                String[] values = null;
                while ((values = csvReader.readNext()) != null) {
                    records.add(new ArrayList<String>(Arrays.asList(values)));
                }
            }
            return records;
        } catch (Exception ex) {
            System.out.println("error at Util.ReadCsvToArrayList()");
            ex.printStackTrace();
            throw ex;
        }
    }

    public Boolean FileExists(String filepath) throws Exception {
        try {
            File file = new File(filepath);
            if (file.exists()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("error at Util.FileExists()");
            throw ex;
        }
    }

    public LinkedList<String> ReadFileToList(String filepath) throws Exception {
        try {
            if (!(FileExists(filepath))) {
                System.out.println(filepath + " does not exist!");
                return null;
            } else {
                //System.out.println("Reading " + filepath);
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                LinkedList list = new LinkedList();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
                if (list.isEmpty()) {
                    list = null;
                }
                reader.close();
                return list;
            }
        } catch (Exception ex) {
            System.out.println("error at Util.ReadFileToList()");
            throw ex;
        }
    }

    public void WriteStringToFile(String filePath, String fileName, String string) throws Exception {
        try {
            LinkedList<String> listString = new LinkedList();
            listString.add(string);
            WriteListToFile(filePath, fileName, listString);
        } catch (Exception ex) {
            System.out.println("error at Util.WriteStringToFile()");
            throw ex;
        }
    }

    public void WriteListToFile(String filePath, String fileName, LinkedList fileContent) throws Exception {
        try {
            if (fileContent == null) {
                System.out.println("util.WriteListToFile() | List found null | Aborting writing " + filePath + "/" + fileName + "!");
                return;
            }
            if (fileContent.isEmpty()) {
                System.out.println("util.WriteListToFile() | List found empty | Aborting writing " + filePath + "/" + fileName + "!");
                return;
            }
            if (FileExists(filePath + "/" + fileName)) {
                System.out.println(filePath + "/" + fileName + " already exists.");
            } else {
                if (CreateDirectory(filePath)) {
                    PrintWriter writer = new PrintWriter(filePath + "/" + fileName, "UTF-8");
                    Iterator it = fileContent.iterator();
                    while (it.hasNext()) {
                        writer.println(it.next());
                    }
                    writer.close();
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Util.WriteListToFile()");
            throw ex;
        }
    }

    public Boolean CreateDirectory(String dirPath) throws Exception {
        try {
            File file = new File(dirPath);
            if (FileExists(dirPath)) {
                return true;
            } else {
                if (file.mkdirs()) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Util.CreateDirectory()");
            throw ex;
        }
    }

    public String GetSequence(String dirFile, String strFileName) {
        try {
            LinkedList<String> lstIdioms = new LinkedList();
            lstIdioms.add(Data.strOperatorToReplace);
            lstIdioms.add(Data.strMutOperatorPrefix);
            lstIdioms.add(Data.strMutOperatorSuffix);
            WriteListToFile(dirFile, Data.strIdiomFileName, lstIdioms);

            String strClassFilePath = dirFile + "/" + strFileName;
            String strSeqFilePath = dirFile + "/" + strFileName.replace(Data.strClassFileExt, Data.strAbs + Data.strClassFileExt);
            String strIdiomFilePath = dirFile + "/" + Data.strIdiomFileName;
            String strsrc2absquery = Data.strCommandForCd + dirFile + Data.strCommandForSrc2abs + strClassFilePath
                    + " " + strSeqFilePath
                    + " " + strIdiomFilePath;
            ExecuteProcessAndGetIntErrorCode(strsrc2absquery);
            LinkedList<String> listSeq = ReadFileToList(strSeqFilePath);
            if (listSeq == null && listSeq.isEmpty()) {
                return null;
            }
            String strAbsFn = ConvertListToString(listSeq);
            return strAbsFn;
        } catch (Exception ex) {
            System.out.println("error at Util.GetSequence()");
            ex.printStackTrace();
            return null;
        }
    }

    public Integer ExecuteProcessAndGetIntErrorCode(String commandToExec) throws Exception {
        try {
            Integer exitCode = null;
            HashMap<Integer, LinkedList<String>> mapRet = ExecuteProcessAndGetEntireOutput(commandToExec);
            for (Integer key : mapRet.keySet()) {
                exitCode = key;
                break;
            }
            return exitCode;
        } catch (Exception ex) {
            System.out.println("error at Util.ExecuteProcessAndGetIntErrorCode()");
            throw ex;
        }
    }

    public HashMap<Integer, LinkedList<String>> ExecuteProcessAndGetEntireOutput(String commandToExec) throws Exception {
        try {
            LinkedList<String> lstOut = new LinkedList();
            ProcessBuilder builder = new ProcessBuilder(Data.strCommandExecutionInitial01, Data.strCommandExecutionInitial02, commandToExec);
            System.out.println("running command: " + Data.strCommandExecutionInitial01 + " " + Data.strCommandExecutionInitial02 + " " + commandToExec);
            //ProcessBuilder builder = new ProcessBuilder("bash", "-c", commandToExec);
            Process p = builder.start();

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                //required, do not delete below print statement
                System.out.println(line);
                lstOut.add(line);
            }

            Integer exitCode = p.waitFor();
            System.out.println("exit code: " + exitCode);
            return new HashMap<Integer, LinkedList<String>>() {
                {
                    put(exitCode, lstOut);
                }
            };
        } catch (Exception ex) {
            System.out.println("error at Util.ExecuteProcessAndGetEntireOutput()");
            throw ex;
        }
    }

    String ConvertListToString(LinkedList<String> list) throws Exception {
        try {
            String returnString = "";
            for (String str : list) {
                if (returnString.isEmpty()) {
                    returnString = str;
                } else {
                    returnString += Data.strNxtLineSeparator + str;
                }
            }
            return returnString;
        } catch (Exception ex) {
            System.out.println("error at Util.ConvertListToString()");
            throw ex;
        }
    }

    String GetTrimmedSequence(String strBiggerSeqWithOperatorToReplace) {
        try {
            String strAbsCodeWithGenOperatorTrimmed = "";
            String[] arrAbsCodeWithGenOperator = strBiggerSeqWithOperatorToReplace.split(Pattern.quote(" "));
            int intIndexOperator = -1;
            for (int i = 0; i < arrAbsCodeWithGenOperator.length - 1; i++) {
                if (arrAbsCodeWithGenOperator[i].equals(Data.strOperatorToReplace)) {
                    intIndexOperator = i;
                    break;
                }
            }
            if (intIndexOperator == -1) {
                System.out.println("Could not process, unable to find " + Data.strOperatorToReplace + " in " + strBiggerSeqWithOperatorToReplace);
                return null;
            }
            Boolean boolLimitReached = false;
            strAbsCodeWithGenOperatorTrimmed = Data.strOperatorToReplace;
            int i = 1;
            while (boolLimitReached == false) {
                if (intIndexOperator - i >= 0) {
                    strAbsCodeWithGenOperatorTrimmed = arrAbsCodeWithGenOperator[intIndexOperator - i] + " " + strAbsCodeWithGenOperatorTrimmed;
                }
                if (intIndexOperator + i < arrAbsCodeWithGenOperator.length) {
                    strAbsCodeWithGenOperatorTrimmed += " " + arrAbsCodeWithGenOperator[intIndexOperator + i];
                }
                int intLenAbsCodeWithGenOperatorTrimmed = strAbsCodeWithGenOperatorTrimmed.split(Pattern.quote(" ")).length;
                if (intLenAbsCodeWithGenOperatorTrimmed >= Data.intAllowedSeqLen || ((intIndexOperator - i < 0) && (intIndexOperator + i > arrAbsCodeWithGenOperator.length))) {
                    boolLimitReached = true;
                }
                i++;
            }
            if (strAbsCodeWithGenOperatorTrimmed.length() <= 1) {
                System.out.println("Could not process, resultant of trimming is" + strAbsCodeWithGenOperatorTrimmed + " while processing " + strBiggerSeqWithOperatorToReplace);
                return null;
            }
            return strAbsCodeWithGenOperatorTrimmed;
        } catch (Exception ex) {
            System.out.println("error at Util.GetTrimmedSequence()");
            ex.printStackTrace();
            return null;
        }
    }

    String GetPackageInfoFromClassFile(String strClassFilePath) {
        try {
            String strPackageInfo = null;
            if (FileExists(strClassFilePath) == false) {
                System.out.println("Returning no package info as class file path: " + strClassFilePath + " doesnot exist!");
                return strPackageInfo;
            }
            LinkedList<String> lstClassContent = ReadFileToList(strClassFilePath);
            for (String strSentence : lstClassContent) {
                strSentence = strSentence.trim();
                if (strSentence.matches(Data.strPackageSentenceCheck) && strSentence.contains(";")) {
                    strPackageInfo = strSentence.replace("package ", "").replace(";", "");
                    break;
                }
            }
            if (strPackageInfo == null) {
                System.out.println("Couldnot find package info in the class file available at path: " + strClassFilePath + " !");
            }
            return strPackageInfo;
        } catch (Exception ex) {
            System.out.println("error at Util.GetPackageInfoFromClassFile()");
            ex.printStackTrace();
            return null;
        }
    }

    LinkedList<String> SimutateThisMutant(String strSubject, String strPathClassFile, String strPathMutantFile, String strPathClassFileToRestore) {
        try {
            LinkedList<String> lstLog = new LinkedList();
            File fileMutant = new File(strPathMutantFile);
            String strLogFileName = fileMutant.getName().replace(Data.strClassFileExt, Data.strLogFileExt);
            if (FileExists(fileMutant.getParent() + "/" + strLogFileName)) {
                System.out.println("Skipping processing as file exists: " + fileMutant.getParent() + "/" + strLogFileName);
                lstLog = ReadFileToList(fileMutant.getParent() + "/" + strLogFileName);
                Boolean boolRerunSimutation = ShouldReSimutateThisMutant(lstLog);
                if (boolRerunSimutation) {
                    DeleteFile(fileMutant.getParent(), strLogFileName);
                } else {
                    return lstLog;
                }
            }

            String strCmdToDelClassFileAndCopyMutant = strPathClassFile + " && " + Data.strCommandForCopying + strPathMutantFile + " " + strPathClassFile;
            strCmdToDelClassFileAndCopyMutant = strCmdToDelClassFileAndCopyMutant.replace("/", "\\");
            strCmdToDelClassFileAndCopyMutant = Data.strCommandForDeletingForcefuly + strCmdToDelClassFileAndCopyMutant;
            ExecuteProcessAndGetIntErrorCode(strCmdToDelClassFileAndCopyMutant);

            //Below works but there no way to kill a task
            //String strGradleQuery = Data.strCommandForCd + Data.dirSubjectsWithTests + "/" + strSubject + Data.strCommandForGradleCleanAndBuild;
            //HashMap<Integer, LinkedList<String>> mapRet = ExecuteProcessAndGetEntireOutput(strGradleQuery);
            //for (LinkedList<String> lstValue : mapRet.values()) {
            //    lstLog = lstValue;
            //    break;
            //}
            //WriteListToFile(fileMutant.getParent(), strLogFileName, lstLog);
            String strGradleQuery = "(" + Data.strCommandForCd + Data.dirSubjectsWithTests + "/" + strSubject + Data.strCommandForGradleCleanAndBuild + ") > " + fileMutant.getParent() + "/" + strLogFileName;
            ExecuteProcessOnly(strGradleQuery);
            lstLog = ReadFileToList(fileMutant.getParent() + "/" + strLogFileName);

            String strCmdToDelMutantAndRestoreClassFile = strPathClassFile + " && " + Data.strCommandForCopying + strPathClassFileToRestore + " " + strPathClassFile;
            strCmdToDelMutantAndRestoreClassFile = strCmdToDelMutantAndRestoreClassFile.replace("/", "\\");
            strCmdToDelMutantAndRestoreClassFile = Data.strCommandForDeletingForcefuly + strCmdToDelMutantAndRestoreClassFile;
            ExecuteProcessAndGetIntErrorCode(strCmdToDelMutantAndRestoreClassFile);

            return lstLog;
        } catch (Exception ex) {
            System.out.println("error at Util.SimutateThisMutant()");
            ex.printStackTrace();
            return null;
        }
    }

    public void WriteMapToCsv(String filePath, String fileName, HashMap<String, LinkedList<String>> fileContent) throws Exception {
        try {
            LinkedList<String> lstContent = new LinkedList();
            for (String key : fileContent.keySet()) {
                String strCommaSeperatedValues = "";
                for (String value : fileContent.get(key)) {
                    strCommaSeperatedValues += ",\"" + value + "\"";
                }
                lstContent.add("\"" + key + "\"" + strCommaSeperatedValues);
            }
            WriteListToFile(filePath, fileName, lstContent);
        } catch (Exception ex) {
            System.out.println("error at Util.WriteListToFile()");
            throw ex;
        }
    }

    public void ExecuteProcessOnly(String commandToExec) throws Exception {
        try {
            System.out.println("running command: " + Data.strCommandExecutionInitial01 + " " + Data.strCommandExecutionInitial02 + " " + commandToExec);
            ProcessBuilder builder = new ProcessBuilder(Data.strCommandExecutionInitial01, Data.strCommandExecutionInitial02, commandToExec);
            Process p = builder.start();

            //BufferedReader reader
            //        = new BufferedReader(new InputStreamReader(p.getInputStream()));
            //String line;
            //while ((line = reader.readLine()) != null) {
            //    System.out.println(line);
            //}
            Boolean sucess = p.waitFor(Data.intProcessThresholdTimeInMinutes, TimeUnit.MINUTES);
            Integer exitCode = 1;
            if (sucess) {
                exitCode = p.exitValue();
            } else if (p.isAlive()) {
                ArrayList<Long> lstWindowsPIDs = GetWindowsPIDs(Data.strJavaExe, Data.strCommandLinePhraseForGradleProcess);
                if (lstWindowsPIDs == null) {
                    System.out.println("Killing all processes...");
                    ExecuteProcessOnly(Data.strCmdTaskKiller);
                } else {
                    System.out.println("Killing all gradle processes...");
                    for (Long lngPID : lstWindowsPIDs) {
                        ExecuteProcessAndGetEntireOutput(Data.strCmdWindowsProcessKiller + lngPID);
                    }
                }
                //intCountGradleProcessesInParallel++;
                //System.out.println("Current gradle parallel process count: " + intCountGradleProcessesInParallel);
                //if (intCountGradleProcessesInParallel >= Data.intCountGradleProcessesInParallel) {
                //ExecuteProcessOnly(Data.strCmdTaskKiller);
                //}
                //Somehow the gradle still kept hung and failed to clean every next build with below code
                /*
                p.destroyForcibly();
                Thread.sleep(1000 * 5);
                if (p.isAlive()) {
                    ArrayList<Long> lstWindowsPIDs = GetWindowsPIDs(Data.strJavaExe);
                    Long lngMaxPID = Collections.max(lstWindowsPIDs​​);
                    ExecuteProcessOnly(Data.strCmdWindowsProcessKiller + lngMaxPID);
                }
                 */
            }
            System.out.println("exit code: " + exitCode);
        } catch (Exception ex) {
            System.out.println("error at codeassertiongenerator.util.ExecuteProcessOnly()");
            throw ex;
        }
    }

    private Boolean ShouldReSimutateThisMutant(LinkedList<String> lstLog) {
        try {
            Boolean boolGradleCleanFailed = false;
            //Boolean boolAnyTestFailed = false;
            for (String strInLogs : lstLog) {
                if (strInLogs.contains(Data.strGradleCleanFailed)) {
                    boolGradleCleanFailed = true;
                    break;
                }
                //if (strInLogs.contains(Data.strToLookForInFailedTestsLog01) && strInLogs.contains(Data.strToLookForInFailedTestsLog02)) {
                //    boolAnyTestFailed = true;
                //    break;
                //}
            }
            if (boolGradleCleanFailed == true) {// || boolAnyTestFailed == false) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("error at codeassertiongenerator.util.ShouldReSimutateThisMutant()");
            ex.printStackTrace();
            return true;
        }
    }

// returns an ArrayList of the Pids given a processname (the executable name), empty if none
    public static ArrayList<Long> GetWindowsPIDs(String processName, String strCommandLinePhraseToSearch) throws IOException {
        try {
            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;

            ArrayList<Long> pids = new ArrayList<Long>();

            List<String> commands = new ArrayList<String>();
            commands.add("WMIC");
            commands.add("process");
            commands.add("where");
            if (strCommandLinePhraseToSearch != null) {
                commands.add("\"name='" + processName + "' and commandline like '%" + strCommandLinePhraseToSearch + "%'\"");
            } else {
                commands.add("name='" + processName + "'");
            }
            commands.add("get");
            commands.add("processid");

            String line;
            try {
                ProcessBuilder builder = new ProcessBuilder(commands);
                Process process = builder.start();
                is = process.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);

                // first line is a header if we have a result
                line = br.readLine();
                if ("processid".equalsIgnoreCase(line.trim())) {
                    System.out.println("*** " + line);
                    // next line are the  PIDs
                    while ((line = br.readLine()) != null) {
                        if (line.trim().length() > 0) {
                            pids.add(Long.parseLong(line.trim()));
                        }
                    }
                } else {
                    System.out.println(line);
                }
                return pids;
            } finally {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (is != null) {
                    is.close();
                }
            }
        } catch (Exception ex) {
            System.out.println("error at Util.GetWindowsPIDs()");
            ex.printStackTrace();
            return null;
        }
    }

    public void DeleteFile(String strDirPath, String strFileName) throws Exception {
        try {
            if (FileExists(strDirPath + "/" + strFileName)) {
                String strEntireCmd = (strDirPath + "/" + strFileName).replace("/", "\\");
                strEntireCmd = Data.strCommandForDeletingForcefuly + strEntireCmd;
                ExecuteProcessAndGetIntErrorCode(strEntireCmd);
            }
        } catch (Exception ex) {
            System.out.println("error at Util.DeleteFile()");
            throw ex;
        }
    }

    public HashMap<String, LinkedList<String>> ConvertArrayListToHashMap(ArrayList<ArrayList<String>> lstRecords) throws Exception {
        try {
            HashMap<String, LinkedList<String>> mapRecords = new HashMap();
            for (ArrayList<String> lstString : lstRecords) {
                String strKey = "";
                LinkedList<String> lstValues = new LinkedList();
                for (String str : lstString) {
                    if (strKey.isEmpty()) {
                        strKey = str;
                    } else {
                        lstValues.add(str);
                    }
                }
                mapRecords.put(strKey, lstValues);
            }
            return mapRecords;
        } catch (Exception ex) {
            System.out.println("error at Util.ConvertArrayListToHashMap()");
            ex.printStackTrace();
            throw ex;
        }
    }

    public String GetFunctionNameFromTextFile(File fileInsideSubject) {
        try {
            String strFnNameToReturn = null;
            String strParentName = fileInsideSubject.getParentFile().getName();
            try {
                Integer.parseInt(strParentName);
            } catch (Exception exc) {
                return null;
            }
            String strPathFnCode = fileInsideSubject.getPath().replace(Data.strTxtFileExt, Data.strClassFileExt);
            String strCmdToCopyTxtFileToCodeFileInSameDir = Data.strCommandForCopying
                    + fileInsideSubject.getPath() + " " + strPathFnCode;
            ExecuteProcessAndGetIntErrorCode(strCmdToCopyTxtFileToCodeFileInSameDir);
            if (!FileExists(strPathFnCode)) {
                return null;
            }
            String strPathXml = strPathFnCode.replace(Data.strClassFileExt, Data.strXmlFileExt);
            String strCommandSrcmlToGenerateXml = Data.strCommandSrcmlToGenerateXml
                    .replace(Data.strCodeFilePath, strPathFnCode).replace(Data.strXmlFilePath, strPathXml);
            ExecuteProcessAndGetIntErrorCode(strCommandSrcmlToGenerateXml);
            if (!FileExists(strPathXml)) {
                return null;
            }
            String strPathXmlWithOnlyName = strPathXml.replace(Data.strAssertedFn + Data.strXmlFileExt,
                    Data.strAssertedFnWithOnlyName + Data.strXmlFileExt);
            String strCommandSrcmlToGenerateOnlyNameInXml = Data.strCommandSrcmlToGenerateOnlyNameInXml
                    .replace(Data.strXmlFilePath, strPathXml).replace(Data.strXmlWithOnlyNameFilePath, strPathXmlWithOnlyName);
            ExecuteProcessAndGetIntErrorCode(strCommandSrcmlToGenerateOnlyNameInXml);
            if (!FileExists(strPathXmlWithOnlyName)) {
                return null;
            }
            LinkedList<String> lstXmlWithName = ReadFileToList(strPathXmlWithOnlyName);
            for (String strXmlWithName : lstXmlWithName) {
                if (strXmlWithName.contains(Data.strXmlTagStartName) && strXmlWithName.contains(Data.strXmlTagEndName)) {
                    strFnNameToReturn = strXmlWithName
                            .substring(strXmlWithName.indexOf(Data.strXmlTagStartName), strXmlWithName.indexOf(Data.strXmlTagEndName))
                            .replace(Data.strXmlTagStartName, "");
                    break;
                }
            }
            return strFnNameToReturn;
        } catch (Exception ex) {
            System.out.println("error at Util.GetFunctionNameFromTextFile()");
            ex.printStackTrace();
            return null;
        }
    }
}
