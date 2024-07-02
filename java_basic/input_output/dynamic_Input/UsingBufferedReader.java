package corejava.java_basic.input_output.dynamic_Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {
	public static void main(String[] args) throws IOException {
		//---------- We can take Dynamic input from user using Buffered Reader -----------
		
		char[] a = new char[50];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter your Name : ");
		System.out.println((char)br.read());
		
		System.out.println("Please Enter your Name : ");
		System.out.println(br.read(a));
		System.out.println(new String(a));
		
		System.out.println("Please Enter your Name : ");
		System.out.println(br.readLine());
		
		br.close();
	}
}
