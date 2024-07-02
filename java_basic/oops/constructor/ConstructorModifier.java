package corejava.java_basic.oops.constructor;

/* NOTE : Protected modifier will only work in same package  */

public class ConstructorModifier {
	public static void main(String[] args) {
		C c = new C();
		A a = new A();
		A aa = new A(10, "Jay Shree Krishna");
		//A aaa = new A(10) ------------ This will raise error 
	}
}


class A{
	public A(){
		System.out.println("This is A class Public Constructor");
	}
	
	private A(int i){
		System.out.println("This is A class Private Constructor");
		System.out.println(i);
	}
	
	protected A(String name){
		System.out.println("This is A class Protected Constructor");
		System.out.println(name);
	}
	
	A(int i, String name){
		System.out.println("This is A class Default Constructor");
		System.out.println(name + " " +i);
	}
}


class B extends A{
	B(){
	super("Jay Shree Ram");
	}
	
	A a = new A("Har Har Mahadev");
}

class C extends B{
}
