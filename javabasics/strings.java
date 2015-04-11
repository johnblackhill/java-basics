package javabasics;
 
public class Strings {
    public static void strPrint(){
        // String Variables.
        String text = "This is a name:";         // "text" refers to a previously declared String class.
                                                 // "String" is not a basic type, so it starts with Capital Letters.
        String blank = " ";
        String name = "Peter Griffin";
        String greeting = text + blank + name;

        // Numerical Variables.
        short s_int = 22;
        double d_int = 22.2;

        // Printing Lines.
        System.out.println(greeting);
        System.out.println("This is " + "a hardcoded " + "string operation");
        System.out.println("This is an Integer: " + s_int);
        System.out.println("This is a Double: " + d_int);

        System.out.println();                               // Separation Line
    }
}
