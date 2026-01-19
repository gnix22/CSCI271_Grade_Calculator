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
    // set up grade variables, not sure if 0s need to be specified like in c++, so leaving as placeholder for now.
    private double _avgAssignment = 0;
    private double _avgInClassTest = 0;
    private double _finalExamScore = 0;
    private double _midtermExamScore = 0;
    private double _combinedScore = (0.4*_finalExamScore + 0.2*_midtermExamScore + 0.1*_avgInClassTest)/70;
    // standard avg calculation using arrays
    public double calculateAvg(double[] scoreArray){
        double sum = 0;
        for(double score : scoreArray){
            sum += score; // summation over set
        }
        return sum / scoreArray.length;
    }

    // constructor
    private void initializeScores(double avgAssignmentScore, double avgInClassTestScore, double midtermExamScore, double finalExamScore) {
        /**
         * 
         */
        _avgAssignment = avgAssignmentScore;
        _avgInClassTest = avgInClassTestScore;
        _midtermExamScore = midtermExamScore;
        _finalExamScore = finalExamScore;
    }
    // use combined score and avg assignments grade if needed to create calculated grade.
    public double calculateGrade() throws InvalidScoring{
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
        double finalGrade = 0;
        double weights = 0.3 * (_combinedScore - 60) / 20;
        if(_combinedScore < 60){
            finalGrade = _combinedScore;
        } else if (_combinedScore >= 60 || _combinedScore < 80) {
            finalGrade = (1 - weights) * _combinedScore + weights * _avgAssignment;
        } else if (_combinedScore >= 80){
            finalGrade = 0.4*_finalExamScore + 0.2*_midtermExamScore + 0.1*_avgInClassTest + 0.3*_avgAssignment;
        } else {
            throw new InvalidScoring("invalid combined score... Please ensure grades are correct.");
        }
        return finalGrade;
    }
}
