package corejava.java_basic.datatypes.WrapperClass;

public class IntegerAutoBoxingUnboxing {
	public static void main(String... args) {
		
		int a = 10;
		Integer aa = 20;
		
		Integer aaa = a;
		int aaaa = aa;
		
		System.out.println("Integer Object aaa =" + aaa);
		System.out.println("Primitive int aaaa =" + aaaa);
		
		System.out.println(Integer.max(a, aa));
		System.out.println(Integer.min(a, aa));
		System.out.println(Integer.parseInt("111", 5));
		System.out.println(Integer.reverse(aaaa));
		System.out.println(Integer.reverseBytes(aaaa));
		System.out.println(Integer.valueOf(1234));
		System.out.println(Integer.valueOf("123456"));
		
		int b = Byte.valueOf((byte)10);
		int bb = Byte.valueOf("11");
		Integer bbb = (int)(Byte.valueOf((byte)12));
		Integer bbbb = ((int)(byte)13);
		
		System.out.println(b + bb+ bbb + bbbb);
		System.out.println(bbb++);
		
		
	}
}
