package javabasics;
 
public class Variables {
    public static void varPrint () {
        // Variables
        int myInteger = 0;                                  // Integer Variable.
        short myShort = 246;                                // Short Integer Variable.
        long myLong = 135711;                               // Long Integer Variable.
        double myDouble = 3.1415;                           // Double Precision Variable.
        float myFloat = 357.1113f;                          // Float Variable.             (Use 'f' after the value!)
 
        char myChar = 'C';                                  // Char Variable.              (Only one Char per Variable!)
        boolean myBoolean = true;                           // Boolean Variable.           (true OR false)
        byte myByte = 127;                                  // Byte Variable.              (ALWAYS 2^n values)

        /*///////////////////////////////////////////////////////////////////////////////////////////////
        /   Variables refer to a previously declared type in the main core of the JAVA language.        /
        /   By convention, variable names do not start with capital letters, but new classes do.        /
        /   If we create a new type or subtype, it should (by convention) start with Capital Letters    /
        ///////////////////////////////////////////////////////////////////////////////////////////////*/
 
        //Printing lines.
        System.out.println("This is an 'int' Integer: " + myInteger);                  // myInteger Print.
        System.out.println("This is a 'short' Integer: " + myShort);                   // myShort Print.
        System.out.println("This is a 'long' Integer: " + myLong);                     // myLong Print.
        System.out.println("This is a 'double' Precision Number: " + myDouble);        // myDouble Print.
        System.out.println("This is a 'float' Number: " + myFloat);                    // myFloat Print.

        System.out.println(); ///////////////////////////////////////////////////////// Separation Line.

        System.out.println("This is a 'char': " + myChar);                             // myChar Print.
        System.out.println("This is a 'boolean': " + myBoolean);                       // myBoolean Print.
        System.out.println("This is a 'byte': " + myByte);                             // myByte Print.

        WaitForKey.call();                                                             // Wait for Enter Key
    }
}
