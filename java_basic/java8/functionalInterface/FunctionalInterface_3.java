//---------------- The Interface having 0 abstract methods are called Marker Interface
//---------------- The Interface having 1 abstract methods are called Functional Interface
//--------------- We also have functional Interface annotations to enforce 

package corejava.java_basic.java8.functionalInterface;

@FunctionalInterface
public interface FunctionalInterface_3 {
	
	public default void m1() {
		System.out.println("I am Functional Interface's Default Method");
	}
	
	public static void m2() {
		System.out.println("I am Functional Interface's Static Method");
	}
	
	//------------ This is Functional Interface's abstract method m3
	int m3(int i, int j);
	
	//------------ This is Functional Interface's abstract method m3
	//int m4(int i, int j); //------------ If we uncomment this line, Compile Error will be generated 
							//------[Invalid '@FunctionalInterface' annotation; FunctionalInterface_2 is not a functional interface]
}


//----------------- This is a functional Interface
@FunctionalInterface
interface FunctionalInterface_3Child2 extends FunctionalInterface_3 {
	public default void m1_FunctionalInterface_3Child2() {
		System.out.println("I am FunctionalInterface_3Child2 Functional Interface's Default Method");
	}
}

//----------------- This is NOT functional Interface -------------
@FunctionalInterface
interface FunctionalInterface_3Child3 extends FunctionalInterface_3Child2, FunctionalInterface_3 {
	public default void m1_FunctionalInterface_3Child3() {
		System.out.println("I am FunctionalInterface_3Child3 Functional Interface's Default Method");
	}
	
	//void m3(); ---------------- generated Compile Error
				//------------- [Invalid '@FunctionalInterface' annotation; FunctionalInterface_3Child3 is not a functional interface]
	
}
