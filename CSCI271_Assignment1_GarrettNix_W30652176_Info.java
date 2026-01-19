import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class StudentInformation{
    // set each line with hard rules as structure of assignment allows for it
    private static void setStudentInformation(String lineIn){
        String[] values = lineIn.split(","); // each split value placed into array via comma delimiting
        // since assuming all information of csv is correct, should be 17 total values, 
        // throw to system err "buffer" (couldn't find info if it's technically a buffer or not) and skip if not
        String studentName = values[0].trim();
        if(values.length < 17){
            System.err.println("Error w/ student" + studentName + ": skipping line due to insufficient information");
            return; // exit method for this line since error with information.
        }
        try{
            double[] assignmentsArray = new double[7];
            double[] testsArray = new double[7];
            // assuming a1-a7, this are indices 1-7 in array values
            for(int idx = 0; idx < 7; idx++){
                // use Double class with method parseDouble() to return converted double by string argument in values.
                // i+1 since values[0] is name if order is consistent
                assignmentsArray[idx] = Double.parseDouble(values[idx+1].trim());
            }
            // similarly to t1-t7, these are indices 8-14, assuming order is consistent to example csv.
            for(int idx = 0; idx < 7; idx++){
                testsArray[idx] = Double.parseDouble(values[idx+8].trim());
            }
            double midtermScore = Double.parseDouble(values[15].trim()); // midterm is index 15
            double finalExamScore = Double.parseDouble(values[16].trim()); // final is index 16 in csv

            double finalGrade = new CalculateGrade().calculateGrade(assignmentsArray, testsArray, midtermScore, finalExamScore); // cool compact trick I discovered.
        } catch(NumberFormatException e) { // catch throw from parseDouble 
            System.out.println("Error: " + e.getMessage());
        } catch(InvalidScoring e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    // set information of entire csv using cli argument...
    public static void setInformation(String fileIn){
        try {
            File file = new File(fileIn);
            Scanner fileScanner = new Scanner(file);
            // assuming header in csv, assign it to its own variable
            String header = fileScanner.nextLine(); // nextline similar to getline in c++
            while(fileScanner.hasNextLine()){
                String lineInfo = fileScanner.nextLine().trim();
                if(lineInfo.isEmpty()){
                    System.out.println("parsed all lines...");
                    continue;
                }
                setStudentInformation(lineInfo);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error: File not found");
        } catch(Exception e) {
            System.out.println("Error Processing: "+ e.getMessage());
        }
    }
}