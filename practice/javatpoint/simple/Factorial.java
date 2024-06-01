// Factorial Program in Java

package com.corejava.practice.javatpoint.simple;

import java.util.Scanner;

public class Factorial {
    static int result = 1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        scan.close();
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    private static int factorial(int number){        
        if(number==0){return 1;}
        else{
            result = result * number;
            factorial(number-1);
        }
        return result; 
    }
}
