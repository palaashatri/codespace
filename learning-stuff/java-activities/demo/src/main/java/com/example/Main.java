package com.example;

import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("MyLogger");

    /**
     * Method to print details about primitive data types in Java
     */
    private static void primitiveDataTypes(){

        // byte
        byte b = 127;
        System.out.println("Size of byte is : " + Byte.SIZE);
        System.out.println("Byte goes from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Value of b is " + b);

        // short 
        short s = 127;
        // or
        short s2 = (short) 127;
        System.out.println("Size of short is : " + Short.SIZE);
        System.out.println("Short goes from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Value of s is : " + s + " " + s2);

        // int -> default data type for numbers in Java
        int i = 127;
        System.out.println("Size of integer is : " + Integer.SIZE); 
        System.out.println("Integer goes from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Value of i is : " + i);

        // long -> use L suffix for specifying long integers, like 10L for example.
        long l = 127L;
        System.out.println("Size of long is : " + Long.SIZE);
        System.out.println("Long goes from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Value of l is : " + l);

        // float -> Use suffix F for specifying float decimal numbers
        float f = 127.27F;
        // or
        float f2 = (float) 127.27;
        System.out.println("Size of float is : " + Float.SIZE);
        System.out.println("Float goes from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Value of f is : " + f + " " + f2);

        // double -> Use suffix D for specifying double decimal numbers (optional), default data type for decimal numbers in Java
        double d = 127.27;
        System.out.println("Size of double is : " + Double.SIZE);
        System.out.println("Double goes from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Value of d is : " + d);

        // char -> default data type for characters in Java
        char c = 'D';
        char c1 = '\u0044'; // -> D
        char c2 = 68; // -> D
        System.out.println("Size of char is : " + Character.SIZE);
        System.out.println("Char goes from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("Value of c is : " +  c + " " +  c1 + " " + c2);

        // boolean -> default data type for boolean values in Java
        System.out.println("Boolean has two values : " + Boolean.TRUE + " and " + Boolean.FALSE);

    }

    /**
     * Method to convert Pounds to Kilograms
     * @param weightInPound : weight in pounds
     */
    private static void convertPoundsToKilograms(double weightInPound){
        double weightInKilograms = weightInPound * 0.45359237;
        System.out.println("Weight in kilograms is : " + weightInKilograms);
    }

    /**
     * Method to convert Kilograms to Pounds
     * @param weightInKilograms : weight in kilograms
     */
    private static void convertKilogramsToPounds(double weightInKilograms){
        double weightInPounds = weightInKilograms * 2.20462262185;
        System.out.println("Weight in pounds is : " + weightInPounds);
    
    }

    /**
     * Print question mark (?) using different char references. 
     * Get unicode and decimals from https://www.unicode-table.com/ 
     */
    private static void printQuestionMarkChar(){
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f' ;
        char myDecimalChar = 63;
        System.out.println("My Values are : " + mySimpleChar + myUnicodeChar + myDecimalChar);
    }

    public static void main(String[] args) {
        
        logger.info("Hello World!");
        primitiveDataTypes();
        convertPoundsToKilograms(200);
        convertKilogramsToPounds(90);
        printQuestionMarkChar();
    }
}