//---------------- The Interface having 0 abstract methods are called Marker Interface
//---------------- The Interface having 1 abstract methods are called Functional Interface

package corejava.java_basic.java8.functionalInterface;

public interface FunctionalInterface_1 {
	public default void m1() {
		System.out.println("I am Functional Interface's Default Method");
	}
	
	public static void m2() {
		System.out.println("I am Functional Interface's Static Method");
	}
	
	//------------ This is Functional Interface's abstract method m3
	int m3(int i, int j);
	
	//------------ This is Functional Interface's abstract method m3
	//int m4(int i, int j); //------------ If we uncomment this line, then this interface will NO LONGER BE functional Interface
}
