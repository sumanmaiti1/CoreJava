package corejava.java_basic.datatypes.strings.stringBuilder;

public class StringBuilder_4 {
		
	public static void main(String[] args) {
		
		//------------- Constructors --------------
		
		StringBuilder sb1 = new StringBuilder(); //---------------- empty or Default constructor, with default initial capacity as 16
		StringBuilder sb2 = new StringBuilder("Jay Shree Krishna"); //---------------- constructor with string
		StringBuilder sb3 = new StringBuilder(); 
		char[] dstCharArray = {'4' ,'3' , '2' , '1'};
		
		//----------------- subSequence() ------------
		System.out.println(sb2.subSequence(4, 10)); 
		
		//----------------- chars() ------------
		sb2.chars().filter(a->a%2==0).distinct().sorted().forEach(System.out::println);		
		System.out.println("------------------------------------------------");
		
		//----------------- codePoints() ------------
		sb2.codePoints().forEach(System.out::println); 
		System.out.println("------------------------------------------------");
		
		//----------------- ensureCapacity() ------------
		sb2.ensureCapacity(100); 
		
		//----------------- getChars() ------------
		sb2. getChars(0, 3, dstCharArray, 1); //------prints Shree
		for(Character ch : dstCharArray) {
			System.out.print(ch + '-');
		}
		
		//----------------- setCharAt() ------------
		sb2.setCharAt(0,'@'); //------prints Shree
		System.out.println(sb2);
		
		System.out.println("------------------------------------------------");

		//------------------- setLength()----------------
		sb2.setLength(5); 
		System.out.println(sb2);
		
		//------------------- trimToSize()----------------
		sb2.trimToSize(); //------prints Shree
	}
	
	
}
