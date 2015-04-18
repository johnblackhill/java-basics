package javabasics;

    /*///////////////////////////////////////////////////////////////////////////////////////////
    /      This Class showcases the use of Arrays, as well as Basic Operations with them.       /
    ///////////////////////////////////////////////////////////////////////////////////////////*/

import java.util.Scanner;

public class Arrays {
    public static void showcase(){

        boolean exit = false;

        // Create Scanner Object
        Scanner input = new Scanner(System.in);                             // We need this to use Java's Input Module.

        // Prompt lines

        // Scan for user input

        while (exit != true){
            System.out.println("Select an Option to showcase Array Declarations and Uses: ");
            System.out.println("1. Basic Array Declarations.");
            System.out.println("2. String Arrays.");
            System.out.println("3. Multidimensional Arrays.");
            System.out.println("0. Exit Subprogram.");
            System.out.println();  /////////////////////////////////////////// Separation Line
            int opt = input.nextInt();                                  // Get the User Input.
            String array = "";

            switch (opt) {
                case 1:

                    //////// Basic Arrays. ////////

                    // Variables
                    int[] integers_even;                 // This is an unrestricted ([]) group of Integer variables.
                    array = "";

                    // Operations. //
                    integers_even = new int[3];     // Here the Array gets restricted to [3] integer values.
                    int[] integers_odd ={1, 3, 5};  // Alternative definition of a length [3] Array.

                    integers_even[0] = 2;           // Array indexes start from Zero to n-1 (in this case, from 0 to 2).
                    integers_even[1] = 4;           // We assign 'even' values to the three possible indexes
                    integers_even[2] = 6;           // If we try to assign a value to integers[3], JAVA will warn us,
                                                    // as we are trying to access an "out of limits" zone of the Array.

                    System.out.println("We will print the elements of an Array which length is 3.");
                    System.out.println("This Array is declared as 'int[] integers_even;' and is restricted afterwards");
                    System.out.println("using 'integers_even = new int[3];'. Then, Array elements get initialized.");
                    for (int i=0;i<integers_even.length;i++){
                        array = array + "{" + integers_even[i];
                        if (i==integers_even.length-1) array = array + "}.";
                        else array = array + "} , ";
                    }
                    System.out.println(array);    // We showcase the declaration of an Array.
                    array = "";

                    System.out.println(); ///////////////////////// Separation Line.

                    System.out.println("We will print the elements of an Array which length is 3.");
                    System.out.println("This Array is declared as 'int[] integers_odd ={1, 3, 5};'.");
                    for (int i=0;i<integers_odd.length;i++){
                        array = array + "{" + integers_odd[i];
                        if (i==integers_odd.length-1) array = array + "}.";
                        else array = array + "} , ";
                    }
                    System.out.println(array);    // We showcase the declaration of an Array.

                    WaitForKey.call();
                    break;

                case 2:

                    //////// String Arrays. ////////

                    // Variables. //
                    String[] phrase = new String [4];

                    // Operations. //
                    phrase[0] = "This";
                    phrase[1] = "is";
                    phrase[2] = "a";
                    phrase[3] = "Phrase.";

                    String[] parts = {"MoBo","CPU","RAM","GPU"};

                    // Prints. //
                    System.out.println("We will print the elements of a String Array which length is 4.");
                    System.out.println("This Array is declared as 'String[] phrase = new String [4];'.");
                    System.out.println("Each of its elements is a String, initialized to a value.");
                    for (int i=0;i<phrase.length;i++){
                        array = array + "{" + phrase[i];
                        if (i==phrase.length-1) array = array + "}.";
                        else array = array + "} , ";
                    }
                    System.out.println(array);    // Declaration of a String Array.
                    array = "";

                    System.out.println(); ///////////////////////// Separation Line.

                    System.out.println("We will print the elements of a String Array which length is 4.");
                    System.out.println("Declared as 'String[] parts = {\"MoBo\",\"CPU\",\"RAM\",\"GPU\"};'.");
                    for (int i=0;i<parts.length;i++){
                        array = array + "{" + parts[i];
                        if (i==parts.length-1) array = array + "}.";
                        else array = array + "} , ";
                    }
                    System.out.println(parts);    // Alternative declaration of a String Array.

                    WaitForKey.call();
                    break;

                case 3:

                    //////// Multidimensional Arrays. ////////

                    // Variables. //
                    int[] vector = {1,2,3,4,5};
                    int[][] matrix = {
                            {1,2,3,4,5},
                            {1,2,3,4,5},
                            {1,2,3,4,5},
                            {1,2,3,4,5},
                            {1,2,3,4,5}
                    };

                    int[][][] cube = new int[5][5][5];      // This is an example of a three-dimensional Array.
                                                            // Its members are accessed via 'cube[x][y][z];
                                                            // This is not showcased at console because of lacking
                                                            // a proper 3D representation.

                    // Prints. //
                    System.out.println("This is an Monodimensional Array (also called 'Vector'.");
                    System.out.println("This Array is declared as 'int[] vector = {1,2,3,4,5};'.");
                    System.out.println();
                    for (int i=0;i<vector.length;i++){
                        array = array + "{" + vector[i];
                        if (i==vector.length-1) array = array + "}.";
                        else array = array + "} , ";
                    }
                    System.out.println(array);    // We showcase a Vector.
                    array = "";

                    WaitForKey.call();

                    System.out.println("This is a Bidimensional Array (also called 'matrix').");
                    System.out.println();
                    for (int i=0;i<matrix.length;i++){
                        for (int j=0;j<matrix[i].length;j++){
                            array = array + "{" + matrix[i][j];
                            if (j==matrix[2].length-1) array = array + "}.";
                            else array = array + "} , ";
                        }
                        System.out.println(array);
                        array = "";
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

    }

}
