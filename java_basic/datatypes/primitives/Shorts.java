/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

// package com.corejava.datatypes.primitives;
//----------Here we will see the SHORT Object, short datatype ---------

public class Shorts {
    public static void main(String[] args) {
        
        System.out.println("Max value of SHORT=" + Short.MAX_VALUE);
        System.out.println("Min value of SHORT=" + Short.MIN_VALUE);
        System.out.println("BYTES of SHORT=" + Short.BYTES);
        System.out.println("BIT SIZE of SHORT=" + Short.SIZE);
        System.out.println("TYPE of SHORT=" + Short.TYPE);
        
        short s1 = 12345;
        short s2 = Short.parseShort("12345");
        short s3 = Short.parseShort("12");
        short s4 = Short.valueOf("15");
        System.out.println(Short.reverseBytes(s3));
        short s5 = (short)(s1 + s2 + s3 + s4);
        System.out.println(s5);
    }
}
