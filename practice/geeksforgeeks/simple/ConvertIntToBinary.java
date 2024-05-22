//4. Write a Java Program to convert Integer numbers and Binary numbers.

package com.corejava.practice.geeksforgeeks.simple;
import java.lang.Math;

public class ConvertIntToBinary {
    public static void main(String[] args) {
        int num; String output;
        try{
            for(String s:args){
                num = Math.abs(Integer.parseInt(s));
                var temp = (Integer.toBinaryString(num));
                output = num>0 ? (temp + "b") : ("-" + temp + "b");
                System.out.println(output);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input provided:- " + e.toString());
            System.exit(0);
        }
    }
}
