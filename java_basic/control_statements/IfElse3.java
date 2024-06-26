// --------------- Multiple independent If conditions ------------------

package corejava.java_basic.control_statements;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String... args){
        System.out.println("Please enter our age:");
        int age =  (new Scanner(System.in)).nextInt();
        if (age<18){
            System.out.println("You are a minor");
        }

        if (age>=18 && age<=60){
            System.out.println("You fall under Working class");
        }

        if (age>60){
            System.out.println("You fall to Senior Citizen class");
        }
    }
}
