package corejava.java_basic.oops.constructor;

//--------------- Basic Rules constructor -----------------
/*
    1) Constructor name must be the same as its class name
    2) A Constructor must have no explicit return type
    3) A Java constructor cannot be abstract, static, final, and synchronized
	4) We can use public, private, protected, default access modifiers with constructor

	NB : Constructor is NOT associated with Object creation. it's only deals with Object initialisation.
*/


public class DefaultConstructorBasicConstructor{
	public static void main(String... args){
		Man m1 = new Man(); //--------- Default constructor will be invoked
		Man m2 = new Man(); //--------- Default constructor will be invoked
		
		Woman w1 = new Woman(); //--------- Empty parameter constructor will be invoked
		
		Child ch = new Child("Sri Krishna", (byte)1, "Sri vashudev", "Srimati Devaki"); //--------- parameterised constructor will be invoked
				
		System.out.println(m1.name + " , " + m1.age); //------- will print Null and 0
		System.out.println(m2.name + " , " + m2.age); //------- will print Null and 0
		
		System.out.println(w1.name + " , " + w1.age); //------- will print Null and 0
		
		System.out.println(ch.name + " , " + ch.age + " , " + ch.fatherName + " , " + ch.motherName); //------- will print Null and 0
	}
}


class Man{
	String name;
	byte age;	
	
	// --------- we didn't explicitepky mentioned any constructor --------------
	// --------- in this case jvm will by default generate default constructor --------
	// --------- jvm will automatically generate Man(super();) as code of default constructor ----------
}

class Woman{
	
	String name;
	byte age;	
	
	//-------- This is not default constructor. Because we are providing a constructor with mo parameter ----------
	Woman(){super();}
}

class Child{
	String name;
	byte age;
	String fatherName;
	String motherName;
	
	// ------------ Constructor of Child class ------------
	Child(String name, byte age, String fatherName, String motherName){
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}	
}