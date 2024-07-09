package corejava.java_basic.input_output.java_io.dynamic_Input;

import java.io.Console;
import java.io.IOException;

public class UsingConsoleClass {
	public static void main(String[] args) throws Exception {
		
		//------------ We can also use Sytem.Console class to read Dynamic input ----------------
		Console con = System.console();
		
		 if(con == null)  
	        { 
	            System.out.print("No console available"); 
	            return; 
	        }
		
		System.out.println(con.readLine("Please enter your name : "));
		
		System.out.println(new String(con.readPassword("Please enter any Secret password :")));
	}
}
