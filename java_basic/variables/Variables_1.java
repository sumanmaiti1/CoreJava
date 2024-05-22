/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

/* This is all about Java Variables */

package com.corejava.java_basic.variables;

class variables {
    // ------------ This is instance variavle----------
    int a = 10;
    final String s1 = "JAY SHREE KRISHNA";

    // ------------ This is Static variavle----------
    public static char ch1 = 'A';

    public static void main(String[] args) {
        /**        
        There are 3 types of variables in java.
        1. instance
        2.Static
        3.Local
        */
        // This is local variable
        var i = 100;

        System.out.println(variables.ch1); // accessing Static variable
        System.out.println(new variables().a); // accessing instance variable
        System.out.println(new variables().s1); // accessing instance variable
        System.out.println(i); // accessing local variable
    }
}
