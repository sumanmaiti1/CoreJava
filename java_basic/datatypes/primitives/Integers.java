/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package com.corejava.java_basic.datatypes.primitives;
//----------Here we will see the INTEGER Object, int datatype ---------

public class Integers {
    public static void main(String[] args) {
        //------------- Integer is the by default data types for integrals

        System.out.println("Max value of INTEGER=" + Integer.MAX_VALUE);
        System.out.println("Min value of INTEGER=" + Integer.MIN_VALUE);
        System.out.println("BYTES of INTEGER=" + Integer.BYTES);
        System.out.println("BIT SIZE of INTEGER=" + Integer.SIZE);
        System.out.println("TYPE of INTEGER=" + Integer.TYPE);
        System.out.println("TYPE of INTEGER=" + Integer.class);

        int i1 = 1000000;
        int i2 = 0XFACE;
        int i3 = -0100000;
        int i4 = 0b101010;
        int i5 = 100_00_000;

        int i6 = Integer.parseInt("100001");
        System.out.println(i1 + i2 + i3 + i4 + i5 + i6);
        System.out.println(Integer.toHexString(100000));
        System.out.println(Integer.toOctalString(100000));

        System.out.println(Integer.compare(i5, i6));
        System.out.println(Integer.max(i5, i6));
        System.out.println(Integer.min(i5, i6));
        System.out.println(Integer.sum(i5, i6));
        System.out.println(Integer.toString(i5,2));
        System.out.println(Integer.toBinaryString(-12));
    }
}
