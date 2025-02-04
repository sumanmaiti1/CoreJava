package corejava.java_basic.datatypes.strings.stringBuilder;

public class StringBuilder_2 {
		
	public static void main(String[] args) {
		
		//------------- Constructors --------------
		
		StringBuilder sb1 = new StringBuilder(); //---------------- empty or Default constructor, with default initial capacity as 16
		StringBuilder sb2 = new StringBuilder("Jay Shree Krishna"); //---------------- constructor with string
		
		//----------------- codePointAt(int n) ------------
		System.out.println(sb2.codePointAt(2)); //------Returns the character (Unicode code point) at the specified index
		
		//----------------- codePointAt(int n) ------------
		System.out.println(sb2.codePointBefore(2)); //------Returns the character (Unicode code point) before the specified index
		
		//----------------- codePointAt(int n) ------------
		System.out.println(sb2.codePointCount(2, 3)); //------Returns the character (Unicode code point) before the specified index
		
		//----------------- codePointAt(int n) ------------
		System.out.println(sb2.appendCodePoint(98)); //------ Appends the string representation of the codePointargument to this sequence
		
		//----------------- compareTo(Stringbuilder) ------------
		System.out.println(sb2.compareTo(sb2)); //------ prints 0
		System.out.println(sb2.compareTo(sb1)); //------ prints +ve 
		System.out.println(sb1.compareTo(sb2)); //------ prints -ve
		
		//------------------- indexOf()
		System.out.println(sb2.indexOf("e")); //------ prints first index of e
		System.out.println(sb2.indexOf("a",7)); //------ prints first index of a after 7th inde
		
		//------------------- isEmpty
		System.out.println(sb1.isEmpty()); //------ prints true
		System.out.println(sb2.isEmpty()); //------ prints false
		
		//---------------------lastIndexOf()
		System.out.println(sb2.lastIndexOf("a"));
		System.out.println(sb2.lastIndexOf("e",8));
		
		//---------------------lastIndexOf()
		System.out.println(sb1.length()); //-------------------prints 0
		System.out.println(sb2.length()); //-------------------prints 0
		
	}
	
	
}
