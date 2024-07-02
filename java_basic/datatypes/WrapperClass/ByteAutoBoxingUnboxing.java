package corejava.java_basic.datatypes.WrapperClass;

public class ByteAutoBoxingUnboxing {

	public static void main(String... args) {
		
		byte a = 10;
		Byte aa = 20;
		
		Byte aaa = a;
		byte aaaa = aa;
		
		System.out.println("Byte Object aaa =" + aaa);
		System.out.println("Primitive byte aaaa =" + aaaa);
		
		System.out.println(Byte.toString((byte)101));
		System.out.println(Byte.valueOf((byte)111));
		System.out.println(Byte.valueOf("111"));
		System.out.println(Byte.parseByte("127"));
		System.out.println(Byte.parseByte("-128"));
		
		Byte bbb = (byte)(Integer.valueOf((byte)12)).intValue();
		byte bbbb = ((int)(byte)131);
		
		System.out.println(bbb.byteValue() + bbbb);
		System.out.println(bbb++);
	}

}
