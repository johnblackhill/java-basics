package javabasics;
 
public class Strings {
    public static void strPrint(){
        // String Variables.
        String text = "This is a name:";            // "text" refers to a previously declared String class.
                                                    // "String" is not a basic type, so it starts with Capital Letters.
        String blank = " ";                         // Blank space String.
        String name = "Peter Griffin";              // Name String
        String displayName = text + blank + name;   // String made of String operations.

        // Numerical Variables.
        short s_int = 22;
        double d_int = 22.2;

        // Printing Lines.
        System.out.println(displayName);
        System.out.println("This is " + "a hardcoded " + "string operation.");  // Hardcoded String concatenation.
        System.out.println("This is an Integer: " + s_int + ".");               // Concatenating Strings & Vars #1
        System.out.println("This is a Double: " + d_int + ".");                 // Concatenating Strings & Vars #2

        System.out.println();                                                   // Separation Line
    }
}
