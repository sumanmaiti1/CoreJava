package corejava.java_basic.datatypes.WrapperClass;

public class FloatAutoBoxingUnboxing {
	public static void main(String[] args) {
		float a = 10.012f;
		Float b = 11.123f;
		
		System.out.println("Float Object b =" + b);
		System.out.println("Primitive float a =" + a);
		
		float c = b;
		Float d = a;

		System.out.println("Float Object d =" + d);
		System.out.println("Primitive float c =" + c);
		
		System.out.println(Float.valueOf(.00001234f));
		System.out.println(Float.valueOf("-.123456987f"));
		System.out.println(Float.isFinite(123456));
		System.out.println(Float.isNaN(10/0.0f));
		System.out.println(Float.isInfinite(10/0.0f));
		System.out.println(0.0f/0);
		System.out.println(0.0f/0.0f);
		System.out.println(Float.max(.0000123f, .0000124f));
		System.out.println(Float.min(.0000123f, .0000124f));
		System.out.println(Float.parseFloat("-99999.000001234f"));
		System.out.println(Float.sum(.000001f, .000002f));
	}
}
