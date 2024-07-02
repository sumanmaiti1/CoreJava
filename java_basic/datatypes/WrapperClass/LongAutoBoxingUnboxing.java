package corejava.java_basic.datatypes.WrapperClass;

public class LongAutoBoxingUnboxing {
	public static void main(String[] args) {
		long a = 10;
		Long aa = (long) 20;
		
		Long aaa = a;
		long aaaa = aa;
		
		System.out.println("Long Object aaa =" + aaa);
		System.out.println("Primitive long aaaa =" + aaaa);
		
		System.out.println(Long.max(a, aa));
		System.out.println(Long.min(a, aa));
		System.out.println(Long.parseLong("123456879"));
		System.out.println(Long.reverse(aaaa));
		System.out.println(Long.reverseBytes(aaaa));
		System.out.println(Long.valueOf(1234));
		System.out.println(Long.valueOf("123456"));
		
		long b = Byte.valueOf((byte)10);
		long bb = Byte.valueOf("11");
		Long bbb = (long)(Byte.valueOf((byte)12));
		Long bbbb = 13213456987l;
		
		System.out.println(b + bb+ bbb + bbbb);
		System.out.println(bbb++);
		
		System.out.println(bbb.longValue());
	}
}
