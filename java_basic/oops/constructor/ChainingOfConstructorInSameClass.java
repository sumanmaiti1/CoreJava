package corejava.java_basic.oops.constructor;

public class ChainingOfConstructorInSameClass{
	public static void main(String... args){
		Test t1 = new Test(); //---- This will invoke No arg + String + Mix parameter Constructor
		System.out.println("-----------------------------------------------");
		Test t2 = new Test("Medium"); //---- This will invoke String + Mix parameter Constructor
		System.out.println("-----------------------------------------------");
		Test t3 = new Test(001,"Easy"); //---- This will invoke only Mix parameter Constructor
	}
}


class Test{
	int TestId;
	
	//------------ No arg parameter Constructor -------------
	Test(){
		this("Easy");
		System.out.println("No parameter constructor");
	}
	
	//------------ String parameter Constructor-------------
	Test(String testComplexity){
		this(101, "Easy");
		System.out.println("String parameter constructor");
		System.out.println(testComplexity);
	}
	
	//------------ Mix parameter Constructor -------------
	Test(int TestId, String testComplexity){
		System.out.println("Mix parameter constructor");
		System.out.println("Test ID :" + TestId + " , " + "Test Complexity : " + testComplexity);
	}
}