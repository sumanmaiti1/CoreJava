// Factorial Program in Java

package corejava.java_basic.simple.practice;

import java.util.Scanner;

public class Factorial {
    static double result = 1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        scan.close();
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    private static double factorial(int number){        
        if(number==0){return 1;}
        else{
            result = (double)result * number;
            factorial(number-1);
        }
        return result; 
    }
}
