package javabasics;
import java.util.Scanner;                       // We need to import this Java class to scan user inputs!

    /*///////////////////////////////////////////////////////////////////////////////////////////
    /  This Class showcases the use of User Input methods, as well as Basic Control Structures. /
    /      We have a module that allows us to choose which Basic Structure we want to show      /
    /            and We use a Switch structure to run the selected part of the code             /
    ///////////////////////////////////////////////////////////////////////////////////////////*/

public class BasicStructures {
    public static int showcase () {
        // Variables
        int inInt = 0;
        int loopVar = 0;
        boolean exit = false;

        //// Main Input Block ////

        // Create Scanner Object
        Scanner input = new Scanner(System.in);                             // We need this to use Java's Input Module.

        // Prompt lines

        // Scan for user input

        while (exit != true){
            System.out.println("Select an Option to test Basic Structures: ");
            System.out.println("1. While Structure.");
            System.out.println("2. For Structure.");
            System.out.println("3. Do-While Structure.");
            System.out.println("4. If Structure.");
            System.out.println("0. Exit Subprogram.");
            System.out.println();  /////////////////////////////////////////// Separation Line
            int opt = input.nextInt();                                  // Get the User Input.

            switch (opt) {
                case 1:
                    System.out.println("Give me a number between 0 and 5");
                    inInt = input.nextInt();
                    while ((inInt < 0) || (inInt > 5)) {
                        System.out.println("Only Between 0 and 5");
                        inInt = input.nextInt();
                        System.out.println();
                    }
                    // While Structure. //
                    System.out.println("We will print in screen numbers from zero to your given number");
                    while (loopVar <= inInt) {                       // This will print "0 1 2 3 4 5"
                        // Value Print
                        System.out.println("The value of the While Variable is: " + loopVar);

                        loopVar++;                               // This equals "wa = wa +1".
                    }
                    WaitForKey.call();
                    break;

                case 2:
                    System.out.println("Give me a number between 0 and 5");
                    inInt = input.nextInt();
                    while ((inInt < 0) || (inInt > 5)) {
                        System.out.println("Only Between 0 and 5");
                        inInt = input.nextInt();
                    }
                    System.out.println("We will print in screen numbers from your given number to zero.");
                    // For Structure. //
                    for (loopVar = inInt; loopVar >= 0; loopVar--) {
                        // a "for" structure has three parts: a;b;c
                        // 'a': code ; 'b': loop condition ; 'c': post-loop operation.

                        // Value Print
                        System.out.println("The value of the For Variable is: " + loopVar);
                    }
                    WaitForKey.call();
                    break;

                case 3:
                    ////////////////////// Do-While Structure. //////////////////////
                    System.out.println("Give me a number between 0 and 5");
                    inInt = input.nextInt();
                    while ((inInt < 0) || (inInt > 5)) {
                        System.out.println("Only Between 0 and 5");
                        inInt = input.nextInt();
                    }

                    loopVar = 0;
                    System.out.println("We are going to multiply your N number N times!");
                    int mult = 0;
                    do {
                        mult = mult + inInt;
                        System.out.println("Multiplication result is: " + mult);
                        loopVar++;
                    }
                    while (loopVar != inInt);
                    WaitForKey.call();
                    break;

                case 4:
                    input.nextLine();                           // We MUST ALWAYS call a nextLine after an Integer input.

                    System.out.println("Give me a String: ");
                    String inStr = input.nextLine();
                    String isSpace = " ";

                    ////////////////////// If Structure. //////////////////////
                    if ((inStr.isEmpty()) || (inStr.equals(" "))) {
                        // JAVA usually needs library operations to operate with Strings, instead of
                        // using arithmetical or logical operations like "==" or "||"

                        // Value Print
                        System.out.println("inStr is null or empty");
                    } else {
                        System.out.println("inString reads: '" + inStr + "'");
                    }
                    WaitForKey.call();
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid parameter!!");
                    System.out.println(); /////////////////////////////////// Separation Line.
                    break;                // We only exit the Switch on "Exit" token.
            }
        }
        return 0;
    }
}
