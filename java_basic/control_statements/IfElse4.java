//------------- This program talks about nested if else --------------
package corejava.java_basic.control_statements;

import java.util.Scanner;

public class IfElse4 {
	public static void main(String... args){
		System.out.print("Please enter your age: ");
		int age = (new Scanner(System.in)).nextInt();
		
		if(age<18){
			System.out.println("You are a minor");
			if(age>=13 && age<18){
				System.out.println("You are a teenager");
			} else{
				System.out.println("You are a kid");
			}
		} else if(age>=18){
			System.out.println("You are NOT a minor");
			if(age<=19){
				System.out.println("You are a teenager");
			}

			if(age>=60){
			System.out.println("You are a Senior Citizen.");
			}
		}
	}
}
