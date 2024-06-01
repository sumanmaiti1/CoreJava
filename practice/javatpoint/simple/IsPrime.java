// Prime Number Program in Java

package com.corejava.practice.javatpoint.simple;

public class IsPrime {
    public static void main(String... args){
        int number = Integer.parseInt(args[0]);
        System.out.println(number + " is " + IsPrime.isprime(number) );
    }

    private static String isprime(int num){
        boolean flag = false;
        if(num==0){return " is Prime Number";}
        else if(num ==1){return "is NOT prime Number";}
        else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                flag = true;
                break;
                }
            }
        }
        return (flag==false)? "a Prime Number":"NOT a prime number" ;
    }
}
