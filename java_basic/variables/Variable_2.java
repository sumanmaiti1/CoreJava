package com.corejava.java_basic.variables;

public class Variable_2 {
	public static void main(String[] args) {
		byte b = 125;
		short s= 12345;
		int i = 1234567;
		long l = 123456789l;
		float f = 123.123456789f;
		double d = 123.0123456789e-1;
		char ch = 1230;
		String str = new String("Jay Shree Krishna");
		int [] myArray = new int[]{1,2,3,4,5};
		
		System.out.println(b);
		System.out.println(s+1 + " " + ((Object)(s+1)).getClass().getName());
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(f/d + " " + ((Object)(f/d)).getClass().getName());
		System.out.println(ch);
		System.out.println(ch+1 + " " + ((Object)(ch+1)).getClass().getName());
		System.out.println(str);
		System.out.println(myArray);
	}
}