package corejava.java_basic.datatypes.WrapperClass;

public class CharAutoBoxingUnboxing {
	public static void main(String[] args) {
		char a = 'A';
		char b = 98;
		
		Character c = a;
		Character d = Character.valueOf('b');
		
		char e = c;
						
		System.out.println("Primitive char a = " + a);
		System.out.println("Primitive char b = " + b);
		System.out.println("Character Object c = " + c);
		System.out.println("Character Object d = " + d);
		System.out.println("Primitive char e = "+ e);
		
		System.out.println(Character.digit('z',1));
		System.out.println(Character.valueOf((char)100));
		System.out.println(Character.getName(1234));
		System.out.println(Character.getNumericValue('$'));
		System.out.println(Character.isAlphabetic('X'));
		System.out.println(Character.isUpperCase(a));
		System.out.println(Character.toChars(123));
		System.out.println(Character.toUpperCase('y'));
	}
}
