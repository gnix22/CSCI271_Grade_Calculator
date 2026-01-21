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
class InvalidScoringException extends Exception{
    /*****************************<pathError>****************************
    * Description: Custom exception extending Exception class to 
    * be thrown when scoring is invalid.
    * Parameters: errorString (string)
    * Pre: error must be thrown for this function to be called.
    * Post: a custom exception is thrown as an extension of the Exception class.
    * Returns: N/A
    * Called by: CalculateGrade()
    * Calls: N/A*
    ************************************************************************/
    public InvalidScoringException(String errorString){
        super(errorString);
    }
}
class InformationOutOfBoundsException extends ArrayIndexOutOfBoundsException{
    /******************************<InformationOutOfBoundsException>*****************************
    * Description: Custom exception extending Exception class.
    *
    * Parameters:
    *   - errorString: string of custom error message.
    *
    * Pre: Information that is obtained from csv input must be outside of {17}.
    *
    * Post: An exception is raised and the current list in the parsing process is skipped
    * while providing a programmer specified reason.
    *
    * Returns: None
    *
    * Called by: main()
    * Calls: N/A*
    ************************************************************************/
    public InformationOutOfBoundsException(String errorString){
        super(errorString);
    }
}
