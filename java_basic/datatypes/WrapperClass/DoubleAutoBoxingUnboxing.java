package corejava.java_basic.datatypes.WrapperClass;

public class DoubleAutoBoxingUnboxing {
	public static void main(String[] args) {
		double a = 10.012;
		Double b = 11.123;
		
		System.out.println("Double Object b =" + b);
		System.out.println("Primitive double a =" + a);
		
		double c = b;
		Double d = a;

		System.out.println("Double Object d =" + d);
		System.out.println("Primitive double c =" + c);
		
		System.out.println(Double.valueOf(.00001234f));
		System.out.println(Double.valueOf("-.123456987"));
		System.out.println(Double.isFinite(123456));
		System.out.println(Double.isNaN(10/0.0f));
		System.out.println(Double.isInfinite(10/0.0f));
		System.out.println(0.0/0);
		System.out.println(0.0f/0.0);
		System.out.println(Double.max(.0000123f, .0000124));
		System.out.println(Double.min(.0000123f, .0000124f));
		System.out.println(Double.parseDouble("-99999.000001234f"));
		System.out.println(Double.sum(.000001f, .000002));
		System.out.println(d.doubleValue());
	}
}
