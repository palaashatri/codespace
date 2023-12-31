package com.example;

import java.util.logging.Logger;
import static java.lang.System.*;

public class Main {
    static Logger logger = Logger.getLogger("MyLogger");

    /**
     * Method to print details about primitive data types in Java
     */
    private static void primitiveDataTypes(){

        // byte
        byte b = 127;
        out.println("Size of byte is : " + Byte.SIZE);
        out.println("Byte goes from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        out.println("Value of b is " + b);

        // short 
        short s = 127;
        // or
        short s2 = (short) 127;
        out.println("Size of short is : " + Short.SIZE);
        out.println("Short goes from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        out.println("Value of s is : " + s + " " + s2);

        // int -> default data type for numbers in Java
        int i = 127;
        out.println("Size of integer is : " + Integer.SIZE); 
        out.println("Integer goes from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        out.println("Value of i is : " + i);

        // long -> use L suffix for specifying long integers, like 10L for example.
        long l = 127L;
        out.println("Size of long is : " + Long.SIZE);
        out.println("Long goes from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        out.println("Value of l is : " + l);

        // float -> Use suffix F for specifying float decimal numbers
        float f = 127.27F;
        // or
        float f2 = (float) 127.27;
        out.println("Size of float is : " + Float.SIZE);
        out.println("Float goes from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        out.println("Value of f is : " + f + " " + f2);

        // double -> Use suffix D for specifying double decimal numbers (optional), default data type for decimal numbers in Java
        double d = 127.27;
        out.println("Size of double is : " + Double.SIZE);
        out.println("Double goes from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        out.println("Value of d is : " + d);

        // char -> default data type for characters in Java
        char c = 'D';
        char c1 = '\u0044'; // -> D
        char c2 = 68; // -> D
        out.println("Size of char is : " + Character.SIZE);
        out.println("Char goes from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        out.println("Value of c is : " +  c + " " +  c1 + " " + c2);

        // boolean -> default data type for boolean values in Java
        out.println("Boolean has two values : " + Boolean.TRUE + " and " + Boolean.FALSE);

    }

    /**
     * Method to convert Pounds to Kilograms
     * @param weightInPound : weight in pounds
     */
    private static void convertPoundsToKilograms(double weightInPound){
        double weightInKilograms = weightInPound * 0.45359237;
        out.println("Weight in kilograms is : " + weightInKilograms);
    }

    /**
     * Method to convert Kilograms to Pounds
     * @param weightInKilograms : weight in kilograms
     */
    private static void convertKilogramsToPounds(double weightInKilograms){
        double weightInPounds = weightInKilograms * 2.20462262185;
        out.println("Weight in pounds is : " + weightInPounds);
    
    }

    /**
     * Print question mark (?) using different char references. 
     * Get unicode and decimals from https://www.unicode-table.com/ 
     */
    private static void printQuestionMarkChar(){
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f' ;
        char myDecimalChar = 63;
        out.println("My Values are : " + mySimpleChar + myUnicodeChar + myDecimalChar);
    }

    private static void diffLossyConversion(){
        int result = 10;
        result -= 5.5;
        out.println(result); // -> 4 (lossy)

        // similar to
        int result2 = 10;
        result2  = (int) (result2 - 5.5);
        out.println(result2); // -> 4 (lossy)
 
        // This proves that, compound assignment operator :
        // x -= y
        // is actually
        // x = (datatype of x) (x - y)
        // and not
        // x = x - y

        // what we should do instead :

        double result3 = 10;
        result3 -= 5.5;
        out.println(result3); // -> 4.5 (lossless)
    }

    public static void main(String[] args) {
        
        logger.info("Hello World!");
        primitiveDataTypes();
        convertPoundsToKilograms(200);
        convertKilogramsToPounds(90);
        printQuestionMarkChar();
        diffLossyConversion();
    }
}