//package com.corejava.java_basic.datatypes.primitives;
package corejava.java_basic.datatypes.primitives;

/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

// package com.corejava.datatypes.primitives;
//----------Here we will see the BOOLEAN Object, boolean datatype ---------
public class Booleans {
    public static void main(String[] args) {
        boolean b1 = true;    
        boolean b2 = false;
        boolean b3 = (boolean)(1>2);
    
        System.out.println(b1);        
        System.out.println(b2);        
        System.out.println(b3);        
        System.out.println(Boolean.parseBoolean("true"));     
        System.out.println(Boolean.getBoolean("true"));
    }
}
