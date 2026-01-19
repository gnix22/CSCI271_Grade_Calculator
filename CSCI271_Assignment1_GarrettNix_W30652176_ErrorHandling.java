// custom exception for invalid combined scoring.
class PathError extends Exception{
    public pathError(String errorString){
        /*****************************<pathError>****************************
        * Description: Custom exception to be thrown when path isnt found
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
        super(errorString);
    }
}
class InvalidScoring extends Exception{
    public invalidScoring(String errorString){
        /*****************************<pathError>****************************
        * Description: Custom exception to be thrown when scoring is invalid
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
        super(errorString);
    }
}