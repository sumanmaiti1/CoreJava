package corejava.java_basic.datatypes.strings.stringBuilder;

public class StringBuilder_3 {
		
	public static void main(String[] args) {
		
		//------------- Constructors --------------
		
		StringBuilder sb1 = new StringBuilder(); //---------------- empty or Default constructor, with default initial capacity as 16
		StringBuilder sb2 = new StringBuilder("Jay Shree Krishna"); //---------------- constructor with string
		StringBuilder sb3 = new StringBuilder(); 
		
		//----------------- substring() ------------
		System.out.println(sb2.substring(4)); //------prints Shree Krishna
		System.out.println(sb2.substring(4,10)); //---prints Shree
		
		//----------------- toString(int n) ------------
		System.out.println(sb2.toString()); //-----prints Jay Shree Krishna
		
		//----------------- delete(int n) ------------
		System.out.println(sb2.delete(4,9)); //------prints Jay  Krishna
		System.out.println(sb2); //------prints Jay  Krishna
		System.out.println(sb2.deleteCharAt(5)); //------prints Jay  rishna
		
		//----------------- insert(int n) ------------
		System.out.println(sb1.insert(0, false));
		System.out.println(sb1.insert(1,'A'));
		System.out.println(sb1.insert(2, new char[] {'*','^','$'}));
		System.out.println(sb1.insert(9,"Radhe"));
		System.out.println(sb1.insert(1,12.562f));
		System.out.println(sb1.insert(4,123));
		System.out.println(sb1.insert(10,398745L));
		System.out.println(sb1.insert(19,123456.987654321));
		System.out.println(sb1.insert(0,new StringBuilder_2()));
		System.out.println(sb1.insert(0,new char[] {'#','@','!'},1,2));
		System.out.println(sb1.insert(2,"RAM",0,3));
		
		//----------------- repeat() ------------
		System.out.println(sb3.repeat("RAM-", 5));
		System.out.println(sb3.repeat(34,10));
		
		//----------------- repeat() ------------
		System.out.println(sb3.replace(0, 20, "KRISHNA"));
		
		//----------------- reverse() ------------
		System.out.println(sb3.reverse());
	}
	
	
}
