package corejava.java_basic.datatypes.strings.string;

import java.lang.invoke.StringConcatException;

public class String_2 {
	
	public static void main(String[] args) {
		
		String s1 = "jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		
		//-------------length()
		System.out.println("Length of String s1 : " + s1.length());
		
		
		//-----------charAt()
		System.out.println("Character at 0th index : " + s1.charAt(0));
		System.out.println("Character at last index : " +s1.charAt(s1.length()-1));
		
		//----------- codePointAt(int index)
		System.out.println(s1.codePointAt(1)); //------------- returns the integer that represents 'a', i.e.e 97
		
		//----------- codePointBefore(int index)
		System.out.println(s1.codePointBefore(1)); //------------- returns the integer that represents 'j', i.e.e 106
	

		//----------- codePointBefore(int index)
		System.out.println(s1.codePointCount(0, 17)); //------------- Returns the number of Unicode code points in the specified textrange of this String
		
		//-----------compareTo()
		System.out.println(s1.compareTo(s1)); //----------- return 0
		System.out.println("Ram".compareTo("Ra")); //----------- return 1
		System.out.println("Ram".compareTo("Shyam")); //----------- return -1
		System.out.println("Ram".compareTo("Raa")); //----------- return 12 , i.e. difference between m and a
		System.out.println("Ram".compareTo("Sar")); //----------- return -1
		System.out.println("Ram".compareTo("Ras")); //----------- return -6 , i.e. difference between m and s
		
		//---------- compareToIgnoreCase()
		System.out.println(s1.compareToIgnoreCase("Jay shree krishna")); //------------ returns 0
		
		//---------
		s1.concat(s2);   // --------- This will create a new String object with concatenated value of s1 and s2. 
						//But as that object is not given any reference variable, it will be elligible for garbage collection
		System.out.println(s1); //----------------- print Jay Shree krishna
		System.out.println(s2); //----------- prints A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .
		System.out.println(s1.concat(". Har Har Mahadev")); //--------- Prints Jat Shree krishna. Har Har Mahadev 
		
	}
	
}
