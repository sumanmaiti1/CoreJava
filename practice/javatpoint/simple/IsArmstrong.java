// Armstrong Number in Java
package com.corejava.practice.javatpoint.simple;

public class IsArmstrong {
    public static void main(String[] args) {
        System.out.println(IsArmstrong.isArmstrong(372));
    }
    private static String isArmstrong(long num){
        long sum=0;
        long result=num;
        while(result>0){
            sum = sum + (long)(Math.pow(result%10,3));
            result= result/10;
        }
        return (sum==num)?"Armstrong number":"NOT Armstrong number";
    }
}
