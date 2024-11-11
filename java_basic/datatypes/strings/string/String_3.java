package corejava.java_basic.datatypes.strings.string;

public class String_3 {
	public static void main(String[] args) {
		
		String s1 = "jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		
		//------Contains()
		System.out.println(s1.contains("Krishna")); //-----Prints true
		System.out.println(s1.contains("Ram")); //-----Prints false
		
		//--------contentEquals(String s)
		System.out.println(s1.contentEquals("jay Shree Krishna")); //-----Prints true
		System.out.println(s1.contentEquals(s1)); //-----Prints true
		System.out.println(s1.contentEquals(s2)); //-----Prints false
		
		//---------- contentEquals(stringBuffer sb)
		System.out.println(s1.contentEquals(new StringBuffer("jay Shree Krishna"))); //-----Prints true
		System.out.println(s1.contentEquals(new StringBuffer(s1))); //-----Prints true
		System.out.println(s1.contentEquals(new StringBuffer(s2))); //-----Prints false
		
		//--------- endsWith()
		System.out.println(s1.endsWith(s1)); //--------- Prints true
		System.out.println(s1.endsWith("Krishna")); //------------ Prints true
		System.out.println(s1.endsWith("a")); //------------ Prints true
		System.out.println(s1.endsWith("Ram")); ////-------- Prints false
		
		//--------- startsWith()
		System.out.println(s1.startsWith(s1)); //--------- Prints true
		System.out.println(s1.startsWith("jay")); //------------ Prints true
		System.out.println(s1.startsWith("j")); //------------ Prints true
		System.out.println(s1.startsWith("Jay")); ////-------- Prints false
		
		//---------- equals()
		System.out.println(s1.equals("jay Shree Krishna")); //------------- prints true
		System.out.println(s1.equals(s1)); //------------- prints true
		System.out.println(s1.equals("jay Shree Ram")); //------------- prints false
		System.out.println(s1.equals(s2)); //------------- prints false
	}
}
