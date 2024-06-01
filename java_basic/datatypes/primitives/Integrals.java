/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package com.corejava.java_basic.datatypes.primitives;

public class Integrals{
	public static void main(String... args){
		//----------------- These are Numeric Data types -----------------------
		//----------------- There are 4 Integral Data types -----------------
		//----------------- Default data type for Integrals is string -------------
		//------------------ jvm provides the default value for Integrals. Defaulty value is 0 ---------
		
		byte b = 10; // Byte has 1 byte of menory that is 8 bits. Range is (-)2^7 to 2^7-1. Default value = 0
		short s = 12345; //Short has 2 byte of memory, i.e. 16 bits. Range is (-)2^15 to 2^15-1. Default value = 0
		int i = 457895468; //Int has 4 Byte of memory, i.e. 32 bits. Tange is (-)2^31 to 2^31-1. Default value = 0
		long l = 45789558768L; //Long has 8 Byte of memory, i.e. 64 bits. Tange is (-)2^63 to 2^63-1.Default value = 0L		
		System.out.println("byte b = " + b + "\n" + "short s = " + s + "\n" + "int i = " + i + "\n" + "long l = " + l + "\n");
		
		byte bb = 0B1111;	//---------- Binary representation ------------
		short ss = 0123;		//---------- Octal representation ------------
		int ii = -0XFace;		//---------- Hexadecimal representation ------------
		long ll = 123_456_789L;		//------------- from Java 1.5 this is a new feature ----------
		System.out.println("byte bb = " + bb + "\n" + "short ss = " + ss + "\n" + "int ii = " + ii + "\n" + "long ll = " + ll);
	}
}