package corejava.java_basic.datatypes.WrapperClass;

public class BooleanAutoBoxingUnBoxing {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = Boolean.getBoolean("Sri Ram");
		
		Boolean c = a;
		Boolean d = true;
		
		System.out.println(c.booleanValue());
		System.out.println(c.toString());
		System.out.println(c.getClass());
		System.out.println(Boolean.valueOf("true"));
		System.out.println(Boolean.parseBoolean("Har Har Mahadev"));
		System.out.println(Boolean.toString(10==10));
	}
}
