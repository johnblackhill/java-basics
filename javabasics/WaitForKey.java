package javabasics;

   /*///////////////////////////////////////////////////////////////////////////////////////////
    /      This Class simply waits for Enter input to resume code execution via Exceptions     /
    //////////////////////////////////////////////////////////////////////////////////////////*/

public class WaitForKey {
    public static void call(){
        System.out.println(); /////////////////////////////////// Separation Line
        System.out.println("Press Enter to continue...");
        try{System.in.read();}                          // System Call that only allows the program to resume on Enter.
        catch(Exception e){}
        System.out.println(); /////////////////////////////////// Separation Line
    }
}
