/*************************************************************************
* Project 1 for CSCI 271-001 Spring 2026
*
* Author: Garrett Nix
* OS: NixOS 25.11
* Compiler: javac 25.0.1
* Date: Jan. 23, 2026
*
* Purpose
* Program calculates the final grade of the class CSCI271.
*************************************************************************/ 

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Garrett Nix
* W30652176
********************************************************************/ 
// grade calculator class.
class CalculateGrade {
    // standard avg calculation using arrays
    private double calculateAvg(double[] scoreArray){
        double sum = 0;
        for(double score : scoreArray){
            sum += score; // summation over set
        }
        return sum / scoreArray.length;
    }
    // changing function to take in arrays as arguments then calling avg function as nested.
    public double calculateGrade(double[] assignmentsArray, double[] testsArray, double midtermExamScore, double finalExamScore) throws InvalidScoring{
        /*****************************<CalculateGrade>****************************
        * Description: Calculates the final grade of...... finish this later since I'm wasting time formatting.
        * Parameters: errorString (string)
        *
        * Pre: error must be thrown for this function to be called.
        *
        * Post: a custom exception is thrown as an extension of the Exception class.
        *
        * Returns: N/A
        *
        * Called by: CalculateGrade()
        * Calls: N/A
        ************************************************************************/
        double assignmentsAvg = calculateAvg(assignmentsArray);
        double testsAvg = calculateAvg(testsArray);
        double combinedScore = (0.4*finalExamScore + 0.2*midtermExamScore + 0.1*testsAvg)/70;
        double finalGrade = 0;
        double weights = 0.3 * (combinedScore - 60) / 20;
        if(combinedScore < 60){
            finalGrade = combinedScore;
        } else if (combinedScore >= 60 || combinedScore < 80) {
            finalGrade = (1 - weights) * combinedScore + weights * assignmentsAvg;
        } else if (combinedScore >= 80){
            finalGrade = 0.4*finalExamScore + 0.2*midtermExamScore + 0.1*testsAvg + 0.3*assignmentsAvg;
        } else {
            throw new InvalidScoring("invalid combined score... Please ensure grades are correct."); 
        }
        return finalGrade;
    }
}
