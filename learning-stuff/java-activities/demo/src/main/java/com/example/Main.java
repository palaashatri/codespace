package com.example;

import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("MyLogger");
    private static void primitiveDataTypes(){

        // byte
        byte b = 127;
        System.out.println("Size of byte is : " + Byte.SIZE);
        System.out.println("Byte goes from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Value of b is " + b);

        // short 
        short s = 127;
        System.out.println("Size of short is : " + Short.SIZE);
        System.out.println("Short goes from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Value of s is : " + s);

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
        float f = 127F;
        System.out.println("Size of float is : " + Float.SIZE);
        System.out.println("Float goes from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Value of f is : " + f);

        // double -> Use suffix D for specifying double decimal numbers (optional), default data type for decimal numbers in Java
        double d = 127;
        System.out.println("Size of double is : " + Double.SIZE);
        System.out.println("Double goes from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Value of d is : " + d);

        // char -> default data type for characters in Java
        char c = 'a';
        System.out.println("Size of char is : " + Character.SIZE);
        System.out.println("Char goes from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println("Value of c is : " + c);

        // boolean -> default data type for boolean values in Java
        System.out.println("Boolean has two values : " + Boolean.TRUE + " and " + Boolean.FALSE);

    }
    public static void main(String[] args) {
        
        logger.info("Hello World!");
        primitiveDataTypes();
    }
}