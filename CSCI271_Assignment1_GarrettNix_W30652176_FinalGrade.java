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
* <Student's Name>
* <Student's WID>
********************************************************************/ 
import java.util.Scanner;

public class FinalGrade { // class name if public* must match file name to properly compile.... 
                          // (* I'm not sure just yet public is requirement for this)
  public static void main(String[] args) {
    String filePath = args[0]; // cli arg for file path of csv
    Scanner scan = new Scanner(System.in);
    PathError err = new PathError();
    // try and run path given to calculate csv grades 
    try{
      // just realized this wont work here, need to put with info.java most likely....
      if(!filePath){
        throw err.pathError("path does not exist, or was not given, please provide path to csv.") 
      }


    }
    catch(pathError e){
      System.out.println("An error was caught: " + e.getMessage());
    }
  }
}
