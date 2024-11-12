package corejava.java_basic.datatypes.strings.string;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class String_6 {
	public static void main(String[] args) {
		
		String s1 = "Jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		
		//-------------- toCharArray()
		for(char ch:s1.toCharArray()) {
			System.out.print(ch);
		}
		
		//------------toLowerCase()
		System.out.println("\n" +s1.toLowerCase()); //---------------prints in lowercase
		System.out.println(s1.toLowerCase(Locale.KOREA)); //---------------prints in lowercase
		
		
		//------------toUpperCase()
		System.out.println(s1.toUpperCase()); //---------------prints in Uppercase
		System.out.println(s1.toUpperCase(Locale.KOREA)); //---------------prints in Uppercase
		
		//------------ trim()
		System.out.println("   Ram  \n ".trim()); //------------ removed leading and trailing spaces
		
		//------------- split()
		String[] arr1 = s1.split(" "); //--------------- gives an array of Length 3
		System.out.println(arr1.length);
		
		arr1 = s1.split(" ",2); //--------------- gives an array of length 2
		System.out.println(arr1.length);
		for(String s: arr1) {
			System.out.println(s);
		}
		
		arr1 = "JayShreeKrishnaHarHarMahadev".splitWithDelimiters("[A-Z][a-z]+",10); //-------Splits with Regular Expression
		for(String s: arr1) {
			System.out.print(s + "--");
		}		
	}
}
