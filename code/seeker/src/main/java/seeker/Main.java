/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeker;


public class Main {

    public static void main(String[] args) {
        //debugger
        //args = new String[]{Data.strAnalyzeData};
        //args = new String[]{Data.strPrepareDataset};
        //args = new String[]{Data.strPrepareGroundTruthDataset};
        //args = new String[]{Data.strRunEvosuite};
        //args = new String[]{Data.strRunRandoop};
        //args = new String[]{Data.strSimutate};
        //args = new String[]{Data.strCleanup};
        //args = new String[]{Data.strSimutateWithPredictions};
        //args = new String[]{Data.strSimutateWithRandom};
        //args = new String[]{Data.strSimutateForGT};
        //args = new String[]{Data.strSimutateWithPredictionsForGT};
        //args = new String[]{Data.strSimutateWithRandomForGT};
        //args = new String[]{Data.strPrepareScalabilityDataset};
        //args = new String[]{Data.strAnalyzeSpecLogs};
        try {
            if (args.length != 1) {
                System.out.println("Please enter the name of a task to perform as argument, and try again.");
                System.out.println("Below is the help menu for the tasks that can be performed. The task name (mentioned in capital letters) should be passed as argument.\n");
                System.out.println("====================================================================================================");
                System.out.println(Data.strAnalyzeData + " analyzes the SpecFuzzer logs, determines assertion inferring mutants, subsuming mutants, and extracts related information.\n");
                System.out.println(Data.strPrepareDataset + " prepares the dataset for model training.\n");
                System.out.println(Data.strRunEvosuite + " executes Evosuite for all subjects.\n");
                System.out.println(Data.strRunRandoop + " executes Randoop for all subjects.\n");
                System.out.println(Data.strSimutate + " sets up directories to run simulations in default configuration, i.e., with no mutant selection.\n");
                System.out.println(Data.strSimutateWithPredictions + " sets up directories to run simulations with only the predicted mutants.\n");
                System.out.println(Data.strSimutateWithRandom + " selects random mutants from the entire mutant set and sets up directories to run simulations with the randomly selected mutants.");
                System.out.println("*Please note that prepared directories have to renamed manually as Random Mutant Selection should be performed 10 times.\n");
                System.out.println(Data.strSimutateForGT + " determines the score for the inferred Ground Truth assertions in default configuration, i.e., with no mutant selection.\n");
                System.out.println(Data.strSimutateWithPredictionsForGT + " determines the score for the inferred Ground Truth assertions with only the predicted mutants.\n");
                System.out.println(Data.strSimutateWithRandomForGT + " determines the score for the inferred Ground Truth assertions with the randomly selected mutants.");
                System.out.println("*Please note that for this step to be performed 10 times, directories have to be manually placed to calculate scores accordingly.\n");
                System.out.println(Data.strPrepareScalabilityDataset + " prepares the scalability dataset for model training.");
                System.out.println("*Please note that to run simulations, etc. for scalability dataset, the variable boolScalability in Data.java file should be changed to true (default is false).");
                System.out.println("====================================================================================================\n");
            } else {
                Controller objController = new Controller();
                objController.Perform(args);
            }
        } catch (Exception ex) {
            System.out.println("error at Main.main()");
            ex.printStackTrace();
        }
    }

}
