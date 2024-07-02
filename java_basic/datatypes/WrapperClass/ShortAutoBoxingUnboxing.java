package corejava.java_basic.datatypes.WrapperClass;

public class ShortAutoBoxingUnboxing {

	public static void main(String... args) {
		
		Short a = 10;
		Short aa = 20;
		
		Short aaa = a;
		Short aaaa = aa;
		
		System.out.println("Short Object aaa =" + aaa);
		System.out.println("Primitive short aaaa =" + aaaa);
		
		System.out.println(Short.toString((short)101));
		System.out.println(Short.valueOf((short)111));
		System.out.println(Short.valueOf("88"));
		System.out.println(Short.parseShort("127"));
		System.out.println(Short.parseShort("-32111"));
		
		Short bbb =Short.valueOf((short)123);
		Short bbbb = (short)131;
		
		System.out.println(bbb.shortValue() + bbbb);
		System.out.println(bbb++);
	}

}
