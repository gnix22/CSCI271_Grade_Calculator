/*************************************************************************
* Project 1 for CSCI 271-001 Spring 2026
* Author: Garrett Nix
* OS: NixOS 25.11
* Compiler: javac 25.0.1
* Date: Jan. 23, 2026
* Purpose: Program calculates the final grade of the class CSCI271.
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
* Garrett Nix
* W30652176
********************************************************************/
class CalculateGrade {
    /******************************<calculateAvg>*****************************
    * Description: Standard calculation of sample mean of random variable.
    *
    * Parameters: scoreArray - array of type double
    *
    * Preconditions: Must have an array of values typed double that the average can be 
    * taken upon.
    *
    * Postconditions: The return value will be a summation of all values in the array,
    * divided by the n number of samples within said array.
    *
    * Returns: The average of the array used as input.
    *
    * Called by: calculateGrade()
    * Calls: N/A
    ************************************************************************/
    private double calculateAvg(double[] scoreArray){
        double sum = 0; // sum variable used for avg
        for(double score : scoreArray){
            sum += score; // summation over set
        }
        return sum / scoreArray.length; // return avg
    }
    /******************************<calculateGrade>*****************************
    * Description: Using the course syllabus provided, the piecewise function works 
    * to produce the output matching said syllabus.
    *
    * Parameters: 
    *   - assignmentsArray: array of type double of assignment scores
    *   - testsArray: array of type double of test scores
    *   - midtermScore: score for the midterm exam
    *   - finalExamScore: score for the final exam
    *
    * Pre: Must have sufficient information as arguments to satisfy error. Grades also
    * must be in standard grading domain (i.e grades out of 100).
    *
    * Post: The final grade given the correct amount of information will be produced.
    *
    * Returns: The final grade in the course CSCI271.
    *
    * Called by: Something, I dont recall at the moment
    * Calls: calculateAvg()
    ************************************************************************/
    public double calculateGrade(double[] assignmentsArray, double[] testsArray, double midtermExamScore, double finalExamScore) throws InvalidScoringException{
        double assignmentsAvg = calculateAvg(assignmentsArray); // uses assignment array arg to assign avg score
        double testsAvg = calculateAvg(testsArray); // average test grade
        double combinedScore = (0.4*finalExamScore + 0.2*midtermExamScore + 0.1*testsAvg)/70; // Combined score E from syllabus, I know error that was specified is solved with 0.7 in denom, but I prefer
                                                                                              // multiplying by 100 at the end for presentation.
        double finalGrade = 0; // variable for final returned score
        double weights = 0.3 * (combinedScore - 60) / 20; // weight based on syllabus
        if(combinedScore < 60){
            finalGrade = combinedScore;
        } else if (combinedScore >= 60 || combinedScore < 80) {
            finalGrade = (1 - weights) * combinedScore + weights * assignmentsAvg;
        } else if (combinedScore >= 80){
            finalGrade = 0.4*finalExamScore + 0.2*midtermExamScore + 0.1*testsAvg + 0.3*assignmentsAvg;
        } else {
            throw new InvalidScoringException("invalid combined score... please ensure grade information is correct."); 
        }
        return finalGrade * 100; // return percentage in form 00.00
    }
}
