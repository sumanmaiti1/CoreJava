//---------------- The Interface having 0 abstract methods are called Marker Interface
//---------------- The Interface having 1 abstract methods are called Functional Interface

package corejava.java_basic.java8.functionalInterface;

public interface MarkerInterface {

	//------------ default method --------------
	default public void m1() {
		System.out.println("This is m1 Method of Marker Interface");
	}
	
	//------------ static method --------------
	static int m2(int i, int j ) {
		return i + j;
	}
}


