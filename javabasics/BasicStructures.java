package javabasics;
import java.util.Scanner;                       // We need to import this Java class to scan user inputs!

    /*///////////////////////////////////////////////////////////////////////////////////////////
    /  This Class showcases the use of User Input methods, as well as Basic Control Structures. /
    /      We have a module that allows us to choose which Basic Structure we want to show      /
    /            and We use a Switch structure to run the selected part of the code             /
    ///////////////////////////////////////////////////////////////////////////////////////////*/

public class BasicStructures {
    public static void bstruct_Tests () {
        // Variables
        String inStr = "";
        int inInt = 0;
        int wl = 0;

        //// Main Input Block ////

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt lines
        System.out.println("Select an Option to test Basic Structures: ");
        System.out.println("1. While Structure.");
        System.out.println("2. For Structure.");
        System.out.println("3. If Structure.");
        System.out.println("4. Do-While Structure.");

        // Scan for user input
        int opt = input.nextInt();              // We have many input methods so we can use all kinds of types.
                                                // 'int Variable = input.nextInt()' Works for Integers.
                                                // 'double Variable = input.nextDouble()' Works for Doubles.
                                                // 'String Variable = input.nextLine()' Works for Strings.
        /* switch (opt){
            default
        } */

        // While Structure. //
        System.out.println("We will print in screen numbers from zero to your given number");
        while (wl <= 5) {                       // This will print "0 1 2 3 4 5"
            // Value Print
            System.out.println("The value of the While Variable is: " + wl);

            wl++;                               // This equals "wa = wa +1".
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // For Structure. //
        for (int fl=5;fl>=0;fl--) {             // a "for" structure has three parts: a;b;c
                                                // 'a': code ; 'b': loop condition ; 'c': post-loop operation.
            // Value Print
            System.out.println("The value of the For Variable is: " + fl);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Do-While Structure. //
        int mult = 0;
        do {

        }
        while (inInt != 5);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // If Structure.
        if ((inStr == "") || (inStr == " ")) {              // We can evaluate different things at the same time.
                                                            // If logical ops: || (or), && (and)
                                                            // An If can evaluates logical expressions (like 4<6).
            // Value Print
            System.out.println("inStr is null or empty");
        }
        else {
            System.out.println("inString reads: '" + inStr + "'");
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
