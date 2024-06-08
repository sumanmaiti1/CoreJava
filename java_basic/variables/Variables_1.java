/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

/* This is all about Java Variables */

package com.corejava.java_basic.variables;


class variables {
    // ------------ This is instance variable----------
    int a = 10;
    final String s1 = "JAY SHREE KRISHNA";
    
    {
    	// ------------ This is instance block --------
    	int i1 = 0;
		int i2=10;
		System.out.println("Values of Instance block variables i1 and i2 are " + i1 + " , " + i2);
    }

    // ------------ This is Static variable----------
    public static char ch1 = 'A';
    static {
    	int i3 = 0;
    	final int i4=15;
    	System.out.println("Values of Static block variables i3 and i4 are " + i3 + " , " + i4);
    }

    public static void main(String[] args) {
        /**        
        There are 3 types of variables in java.
        1. instance
        2.Static
        3.Local
        */
        // This is local variable
        var i = 100;
        String var = "sdre";
        variables var1 = new variables(); 

        System.out.println(variables.ch1); // accessing Static variable
        System.out.println(var1.a); // accessing instance variable
        System.out.println(var1.s1); // accessing instance variable
        System.out.println(i + ((Object)i).getClass().getCanonicalName()); // accessing local variable        
        System.out.println(var);
        
    }
}
