//3. Write a Program to Swap Two Numbers

package com.corejava.practice.geeksforgeeks.simple;

public class SwapNumbers {
    public static void main(String[] arhs) {
        String[] args = {"a=5","b=2"};
        
        String temp = args[0].split("=")[0] + "=" + args[1].split("=")[1];
        args[1] = args[1].split("=")[0] + "=" +  args[0].split("=")[1];
        args[0] = temp;
        System.out.println(args[0] + " , " +args[1]);
        }
    }
