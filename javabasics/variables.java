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

        /*                                                                                              /
        /   Variables refer to a previously declared type in the main core of the JAVA language.        /
        /   By convention, variable names do not start with capital letters, but new classes do.        /
        /   If we create a new type or subtype, it should (by convention) start with Capital Letters    /
        /                                                                                              */
 
        //Printing lines.
        System.out.println(myInteger);                      // myInteger Print.
        System.out.println(myShort);                        // myShort Print.
        System.out.println(myLong);                         // myLong Print.
        System.out.println(myDouble);                       // myDouble Print.
        System.out.println(myFloat);                        // myFloat Print.

        System.out.println();                               // Separation Line

        System.out.println(myChar);                         // myChar Print.
        System.out.println(myBoolean);                      // myBoolean Print.
        System.out.println(myByte);                         // myByte Print.

        System.out.println();                               // Separation Line
    }
}
