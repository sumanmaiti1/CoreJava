/**
 * StringBuffer Object is Ditto same as String Builder. all methods and arguments, constructor
 * Apart from the fact that, all methods in String Buffer class is SYNCHRONISED. Hence String buffer is Thread Safe.
 */



package corejava.java_basic.datatypes.strings.stringBuffer;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Har har Mahadev");
		StringBuilder sb3 = new StringBuilder(100);

		System.out.println(sb1.append("Jay Shree Krishna"));
		System.out.println(sb1.charAt(10));
		System.out.println(sb1.capacity());
		System.out.println(sb1.codePointBefore(5));
		System.out.println(sb1.insert(10, "Radha "));
		System.out.println(sb1.length());
		System.out.println(sb1.reverse());

	}

}
