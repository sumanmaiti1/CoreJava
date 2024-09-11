package corejava.java_basic.java8.functionalInterface;

class MarkerInterfaceTest implements MarkerInterface{
	public static void main(String[] args) {
		System.out.println("I am Test Class....");
		MarkerInterface mi = new MarkerInterfaceTest();
		
		System.out.println("Calling Marker Interface's default method m1()....");
		mi.m1();
		
		System.out.println("Calling Marker Interface's static methiod  m2()....");
		System.out.println("Sum is " + MarkerInterface.m2(10,20));
	}
}