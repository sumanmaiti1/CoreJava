package corejava.java_basic.datatypes.strings.string;

import java.util.List;

public class String_7 {
	public static void main(String[] args) {
		
		String s1 = "Jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		
		//------------- subSequence()
		System.out.println(s1.subSequence(3, 12)); //--------------print Shree Kr
		
		//----------- chars()
		s1.chars().mapToObj(i-> String.valueOf((char)(i)).toUpperCase()).forEach(System.out::print);
		System.out.println("\n");
		
		//---------- codePoints
		s1.codePoints().mapToObj(i-> String.valueOf((char)(i)).toLowerCase()).forEach(System.out::print);
		
		//---------- getBytes()
		System.out.println("\n");
		for(byte b: s1.getBytes()) {
			System.out.print((char)b);
		}
		
		//------------ lines()
		System.out.println("\n");
		"Jay Shree Krishna\nHar Har Mahadev\nOm Namah Shivaya".lines().forEach(System.out::println);
		
		//----------- transform()
		System.out.println(s1.transform(s->s.toUpperCase().replace("KRISHNA", "VISHNU")));
		
		//---------- copyValueOf()
		System.out.println(String.copyValueOf(new char[] {'R','A','M'}));
		System.out.println(String.copyValueOf(new char[] {'S','I','T','A','R','A','M'},0,4));
		
		//------------ format()
		System.out.println(String.format("My name is %S and my age is %d", "Suman Maiti", 100));
		
		//---------- join()
		System.out.println(String.join("--", s1, s2));
		System.out.println(String.join("--", new String[]  {"Ram","Shyam"}));
		
		//------------- ValueOf()
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(123));
		System.out.println(String.valueOf(123456879987564D));
		System.out.println(String.valueOf(1.345678f));
		System.out.println(String.valueOf(1.345678123456000000213456));
		System.out.println(String.valueOf(new String[]  {"Ram","Shyam"}));
		System.out.println(String.valueOf(new StringBuffer("Har Har Mahadev")));
		System.out.println(String.valueOf(new char[]  {'R','A','M'}));
		
		//----------getClass()
		System.out.println( s1.getClass().getSimpleName());
		
		

	}
}
