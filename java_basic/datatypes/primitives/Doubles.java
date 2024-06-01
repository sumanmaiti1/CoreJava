/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package com.corejava.datatypes.primitives;
//----------Here we will see the DOUBLE Object, double datatype ---------

public class Doubles {
    public static void main(String[] args) {

        //----------- Ths is dedault data type of decimal point in java -------------
        System.out.println("Max value of DOUBLR=" +Double.MAX_VALUE);
        System.out.println("Min value of DOUBLR=" + Double.MIN_VALUE);
        System.out.println("BYTES of DOUBLR=" + Double.BYTES);
        System.out.println("BIT SIZE of DOUBLR=" + Double.SIZE);
        System.out.println("TYPE of DOUBLR=" + Double.TYPE);
        System.out.println("TYPE of DOUBLR=" + Double.class);

        double d1 = 12.34;
        double d2 = -12.34;
        double d3 = (double)10;
        double d4 = Double.parseDouble("-10");
        System.out.println(Double.max(d3, d4));
        System.out.println(Double.min(d3, d4));
        System.out.println(Double.sum(d4, d3));
        System.out.println(Double.sum(d1, d2));

        System.out.println(10.12345 + 80.12345);


    }
}
