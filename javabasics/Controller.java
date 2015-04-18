package javabasics;

import java.util.Scanner;

/**
 * Created by JuanAntonio on 17/04/2015.
 */

public class Controller {
    public static int mainController() {

        // Variables. //
        Scanner input = new Scanner(System.in);                             // We need this to use Java's Input Module.

        System.out.println("Welcome to the JAVA Basics showcase program!");
        System.out.println("Type an option to showcase its functionalities. Type 'Exit' to close the program.");
        System.out.println();  /////////////////////////////////////////// Separation Line

        boolean exit = false;

        while (exit != true){
            System.out.println(" - 'StringPrint'        - Prints in screen a given String.");
            System.out.println(" - 'Variables'          - Showcases different types of Variables.");
            System.out.println(" - 'Strings'            - Showcases different operations with Strings.");
            System.out.println(" - 'BasicStructures'    - Showcases the use of different Control Structures.");
            System.out.println(" - 'Arrays'             - Showcases different operations with Arrays.");
            System.out.println(" - 'Exit'               - Exits Program.");
            System.out.println();  /////////////////////////////////////////// Separation Line
            String opt = input.nextLine();                                  // Get the User Input.
            switch (opt) {
                case "StringPrint":
                    HelloWorld.showcase();
                    break;

                case "Variables":
                    Variables.showcase();
                    break;

                case "Strings":
                    Strings.showcase();
                    break;

                case "BasicStructures":
                    BasicStructures.showcase();
                    System.out.println(); /////////////////////////////////// Separation Line
                    break;

                case "Arrays":
                    Arrays.showcase();
                    System.out.println(); /////////////////////////////////// Separation Line
                    break;

                default:
                    System.out.println("Invalid parameter!!");
                    System.out.println(); /////////////////////////////////// Separation Line.
                    break;

                case "Exit":
                    exit = true;
                    break;                                                 // We only exit the Switch on "Exit" token.
            }
        }
        return 0;
    }

}
