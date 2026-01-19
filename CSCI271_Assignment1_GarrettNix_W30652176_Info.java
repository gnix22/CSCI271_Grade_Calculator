
public class StudentInformation{
    // set each line with hard rules as structure of assignment allows for it
    private static void setStudentInformation(String lineIn){
        String[] values = line.split(","); // each split value placed into array via comma delimiting
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
            for(int idx = 0; idx < 7; i++){
                // use Double class with method parseDouble() to return converted double by string argument in values.
                // i+1 since values[0] is name if order is consistent
                assignmentsArray[i] = Double.parseDouble(values[i+1].trim());
            }
            // similarly to t1-t7, these are indices 8-14, assuming order is consistent to example csv.
            for(int idx = 0; idx < 7; i++){
                testsArray[i] = Double.parseDouble(values[i+8].trim());
            }
            double midtermScore = Double.parseDouble(values[15].trim()); // midterm is index 15
            double finalExamScore = Double.parseDouble(values[16].trim()); // final is index 16 in csv
        } catch(NumberFormatException e) { // catch throw from parseDouble 
            
        }
        
    }
}