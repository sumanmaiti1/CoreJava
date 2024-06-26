package corejava.java_basic.control_statements;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your name Here:");
        String name = scan.nextLine();
        scan.close();
        if (name.contains("S")){
            System.out.println("Name contains S");
        } else if(name.equalsIgnoreCase("suman")){
            System.out.println("your name is Suman");
        } else if (name.contains("n")){
            System.out.println("your name contains \"n\"");
        } else{
            System.out.println("your name is " + name);
        }
    }
}
