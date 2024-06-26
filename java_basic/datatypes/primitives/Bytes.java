package corejava.java_basic.datatypes.primitives;

/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

// package com.corejava.datatypes.primitives;
//----------Here we will see the Byte Object, byte datatype ---------

class Bytes{
    static public void main(String... args){

        System.out.println("Max value of Byte=" + Byte.MAX_VALUE);
        System.out.println("Min value of Byte=" + Byte.MIN_VALUE);
        System.out.println("BYTES of Byte=" + Byte.BYTES);
        System.out.println("BIT SIZE of Byte=" + Byte.SIZE);
        System.out.println("TYPE of Byte=" + Byte.TYPE);
        
        byte b = (byte)130;
        System.out.println(b);

        byte b1 = 100;
        var b2 = Byte.parseByte("13");
        var b3 = Byte.parseByte("123");
        var b4 = Byte.toString((byte)-100);
        var b5 = Byte.valueOf("-10");
        System.out.println(b1 + " , " + b2 + " , " + b3 + " , " + b4 + " , " + b5);
        //System.out.println("Memory of b1 is =" + VM.current().addressOf((Object)b1));

        System.out.println("Class of b1:-" + ((Object)b1).getClass().getName() );
        System.out.println("Class of b1:-" + ((Object)b1).getClass().getSimpleName() );
        System.out.println("Class of b1:-" + ((Object)b1).getClass().getCanonicalName() );
        System.out.println("Class of b1:-" + ((Object)b1).getClass().descriptorString() );
        System.out.println("Class of b1:-" + ((Object)b1).getClass().getTypeName() );

        
    }
}