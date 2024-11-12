package corejava.java_basic.datatypes.strings.string;

public class String_4 {
	public static void main(String[] args) {
		
		String s1 = "Jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		
		//----------- equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase("JAY SHREE KRISHNA")); //------------ Prints true
		System.out.println(s1.equalsIgnoreCase("jay shree krishna")); //------------ Prints true
		System.out.println(s1.equalsIgnoreCase("jAy sHREe kriSHna")); //------------ Prints true
		System.out.println(s1.equalsIgnoreCase("jAysHREekriSHna")); //------------ Prints false
		
		//-----------hashCode()
		System.out.println(s1.hashCode());
		
		//------------- indexOf(int i) and other overloaded methods
		System.out.println(s1.indexOf(121)); //------------ Prints 2
		System.out.println(s1.indexOf("Shree")); //------------ Prints 4
		System.out.println(s1.indexOf(97, 10)); //------------ Prints 16
		System.out.println(s1.indexOf("a", 10)); //------------ Prints 16
		System.out.println(s1.indexOf(97, 0, 10)); //------------ Prints 1
		System.out.println(s1.indexOf("a", 5, s1.length())); //------------ Prints 16
		
		//------------ isBlank()
		System.out.println(s1.isBlank()); //------------Prints false
		System.out.println("   	 ".isBlank()); //------------Prints true
		
		//--------- isEmpty()
		System.out.println(s1.isEmpty()); //--------------Prints false
		System.out.println("	  	".isEmpty()); //--------------Prints false
		System.out.println("".isEmpty()); //--------------Prints true
		
		//------------- lastIndexOf(int ch)		
		System.out.println(s1.lastIndexOf(97)); //----------- Prints 16
		System.out.println(s1.lastIndexOf("a")); //----------- Prints 16
		System.out.println(s1.lastIndexOf(83, 10)); //----------- Prints 4
		System.out.println(s1.lastIndexOf("S",10)); //----------- Prints 4
		System.out.println(s1.lastIndexOf(83, 2)); //----------- Prints -1
		System.out.println(s1.lastIndexOf("S",2)); //----------- Prints -1
		
		//------------- matches()
		System.out.println(s1.matches("^Jay ..... Krishna$")); //------------- Prints true
		System.out.println(s1.matches("^Jay.*")); //------------- Prints true
		System.out.println(s1.matches(".*Krishna$")); //------------- Prints true
		System.out.println(s1.matches("Jay Shree Ram")); //------------- Prints false
			
	}
}

