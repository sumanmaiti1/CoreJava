package corejava.java_basic.oops.constructor;

public class ChainingOfConstructorInDifferentClass{
	public static void main(String... args){
		Test2 t = new Test2("Haripada");
	}
}


class Test1{
	String name;
	String surName;
	//----------- Constructor of Test1 -----------
	Test1(String name){
		this.name = name;
		System.out.println(this.name);
	}
	
	Test1(String name, String surName){
		this.name = name;
		this.surName = surName;
		System.out.println("Inside Test1 Constructor");
		System.out.println(this.name + " , " + this.surName);
	}
	
}


class Test2 extends Test1{
	String name;
	//----------- Constructor of Test1 -----------
	Test2(String name){
		super(name, "Jay Shree Krishna");
		this.name = name;
		System.out.println("Inside Test2 Constructor");
		System.out.println(this.name);
	}
}