// Fibonacci Series in Java

package corejava.java_basic.simple.practice;

import java.util.Scanner;

public class Fibonacci {
    public static String fib1 ="0 1";
    public static String fib2 ="0 1";
    public static int first1,second1=1,temp1;
    public static int first2,second2=1,temp2;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        scan.close();
        System.out.println(printNFibonacci(number));
        System.out.println(printFibonacciTillN(number));
    }

    public static String printNFibonacci(int num){
        if(num==0){return "Invalid input - " + num;}
        else if(num == 1){return "0";}
        else if(num == 2){return fib1;}
        else{
            temp1 = first1 + second1;
            first1 = second1;
            second1 = temp1;
            fib1 = fib1 + " " +temp1;
            printNFibonacci(num - 1);
        }
        return fib1;
    }

    public static String printFibonacciTillN(int num){
        if(num==0){return "0";}
        else if(num == 1){return fib2 + " 1";}
        else{
            temp2 = first2 + second2;            
            first2 = second2;
            second2 = temp2;
            if (temp2<=num){
                fib2 = fib2 + " " + temp2;
                printFibonacciTillN(num);}
        }
        return fib2;
    }
}
