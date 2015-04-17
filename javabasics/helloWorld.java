package javabasics;
import java.util.Scanner;

    /*///////////////////////////////////////////////////////////////////////////////////////////
    /      This Class simply prints a string given a the main class module ("Application")      /
    ///////////////////////////////////////////////////////////////////////////////////////////*/

public class HelloWorld {
    public static void printHelloWorld (){
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a String: ");
        String strPrnt = input.nextLine();
        System.out.println();
        System.out.println("You Wrote: " + strPrnt);           // strPrnt screen print.

        WaitForKey.call();                                     // Wait for Enter Key
    }
}
