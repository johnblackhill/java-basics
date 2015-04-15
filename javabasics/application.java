package javabasics;

/**
 *  Main Testing Program for Java Basics.
 */
 
public class Application {
 
    // Main Program
    public static void main (String[] args){
        // Setters
        String helloVar = "Ahh Hello! Welcome to Hades!";   // String Var for the "HelloWorld" class.

        // HelloWorld!
        HelloWorld.printHelloWorld(helloVar);               // HelloWorld class print.

        // Variables!
        Variables.varPrint();                               // Variables class print.

        // Strings!
        Strings.strPrint();                                 // Strings class call.

        // Basic Structures!
        BasicStructures.bstruct_Tests();                    // Class that showcases Basic Structures usages.
    }
}
