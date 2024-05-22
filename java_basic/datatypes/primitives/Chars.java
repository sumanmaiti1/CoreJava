/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

// package com.corejava.datatypes.primitives;
//----------Here we will see the CHARACTER Object, chr datatype ---------

public class Chars {
    public static void main(String[] args) {

        System.out.println("Max value of CHAR=" + Character.MAX_VALUE);
        System.out.println("Min value of CHAR=" + Character.MIN_VALUE);
        System.out.println("BYTES of CHAR=" + Character.BYTES);
        System.out.println("BIT SIZE of CHAR=" + Character.SIZE);
        System.out.println("TYPE of CHAR=" + Character.TYPE);
        System.out.println("TYPE of CHAR=" + Character.class);

        char c1 = 'a';
        char c2 = 100;
        char c3 = (char)123;
        char c4 = '\uFFFF';

        System.out.println(c1 + c2 + c3);
        System.out.println(c4);
        System.out.println(Character.toUpperCase(c2));
        System.out.println(Character.toLowerCase('Z'));
        System.out.println(Character.digit(100, 2));
        System.out.println(Character.getName(c2));
        System.out.println(Character.getNumericValue('X'));
        System.out.println(Character.isAlphabetic(123));
        System.out.println(Character.isDigit(123));
        System.out.println(Character.isEmoji(1234));
        System.out.println(Character.isLowerCase(100));
        System.out.println(Character.isWhitespace(' '));
    }
}
