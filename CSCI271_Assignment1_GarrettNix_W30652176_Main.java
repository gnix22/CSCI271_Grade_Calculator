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
public class CSCI271_Assignment1_GarrettNix_W30652176_Main {
    /******************************<main>*****************************
    * Description: Main function that runs all classes and methods to produce
    * final grade of course
    *
    * Parameters: -args: commandline arguments
    *
    * Pre: A csv must be presented to the command line for usage
    *
    * Post: The final grade will be given and the program will be completed.
    *
    * Returns: none
    *
    * Called by: none
    * Calls: setInformation()
    ************************************************************************/
    public static void main(String[] args) {
    // try and run path given to calculate csv grades 
    try{    
      String filePath = args[0]; // cli arg for file path of csv
      StudentInformation studentInfo = new StudentInformation(); // construction of student info class.
      studentInfo.setInformation(filePath);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("An error was caught: " + e.getMessage() + ": please provide the path to your csv as an argument");
    }
  }
}
