package corejava.java_basic.input_output.java_io.dynamic_Input;

import java.util.Scanner;

public class UsingScannerClass {
	public static void main(String[] args) {
		//------- We can also take dynamic User from User using Scanner class ---------
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your Name : ");
		System.out.println(scan.nextLine());
		
		System.out.println("\nPlease enter your age : ");
		System.out.println(scan.nextInt());
		
		System.out.println("\nPlease enter your pincode : ");
		System.out.println(scan.nextLong());
		
		scan.close();
	}
}
