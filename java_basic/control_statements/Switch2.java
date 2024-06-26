package corejava.java_basic.control_statements;

import java.util.Scanner;
public class Switch2 {
	public static void main(String... args){
		int month;
		System.out.print("Please enter a value between 1 to 12: ");
		try{
			month = Integer.parseInt((new Scanner(System.in)).nextLine());
		} catch(NumberFormatException e){
			System.out.println("Runtime error is generated" + e);
			System.out.println("Setting Default value 0 to month");
			month = 0;
		}
		
		switch(month){
			case 1:
			case 2:
			case 3:
				System.out.println("This is Quarter 1");
				break;
			case 4 :
			case 5 :
			case 6 :
				System.out.println("This is Quarter 2");
				break;
			case 7 : 
			case 8 :
			case 9 :
				System.out.println("This is Quarter 3");
				break;
			case 10 :
			case 11 :
			case 12:
				System.out.println("This is Quarter 4");
				break;
			default:
			System.out.println("This is not permitted valu. Permitted values are 1 to 12");
			
		}
	}
}
