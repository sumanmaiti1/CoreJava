/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package com.corejava.java_basic.datatypes.primitives;
//----------Here we will see the FLOAT Object, float datatype ---------

public class Floats {
    public static void main(String[] args) {

        System.out.println("Max value of FLOAT=" + Float.MAX_VALUE);
        System.out.println("Min value of FLOAT=" + Float.MIN_VALUE);
        System.out.println("BYTES of FLOAT=" + Float.BYTES);
        System.out.println("BIT SIZE of FLOAT=" + Float.SIZE);
        System.out.println("TYPE of FLOAT=" + Float.TYPE);
        System.out.println("TYPE of FLOAT=" + Float.class);

        float f1 = 12.34f;
        float f2 = -12.34f;
        float f3 = (float)123.45;
        float f4 = Float.parseFloat("-123.45");
        System.out.println(Float.isFinite(f4));
        System.out.println(Float.isInfinite(f4));
        System.out.println(Float.isNaN(f4));
        System.out.println(Float.toHexString(f4));
        System.out.println(Float.toString(f4));
        System.out.println(Float.min(f3, f4));
        System.out.println(Float.max(f1,f1));
        System.out.println(Float.sum(f2, f4));

    }
}
