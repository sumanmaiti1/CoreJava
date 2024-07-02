package corejava.java_basic.oops.constructor;

public class ConstructorOverloading{
	public static void main(String... args){
		//------------ Default Constructor will not be called here as we have already defined our own No arg Constructor -------------
		Sum s1 = new Sum(); //------- No Arg Constructor will be called.
		
		Sum s2 = new Sum(10); //------- One Arg Constructor will be called
		Sum s3 = new Sum(10,20); //------- Two Arg Constructor will be called
		Sum s4 = new Sum(new float[]{10,20.5f,30}); //------- Float Array Constructor will be called
		Sum s5 = new Sum(10,20,30,40); //------- Var-Arg Constructor will be called
		Sum s6 = new Sum("Har Har Mahadev"); //------- String Constructor will be called	
		Sum s7 = new Sum(s6); //------- Copy Constructor will be called	
	}
}

class Sum{
	
	String name;
	//----------- No Arg Constructor -----------
	Sum(){
		System.out.println("Inside No Arg Constructor");
		System.out.println("sun is 0");
	}
	
	//----------- One Arg Constructor -----------
	Sum(int num1){
		System.out.println("Inside One Arg Constructor");
		System.out.println("sun is " + num1);
	}
	
	//----------- Two Arg Constructor -----------
	Sum(int num1, int num2){
		System.out.println("Inside Two Arg Constructor");
		System.out.println("sun is " + (num1+num2));
	}
	
	//----------- Float` Array Constructor -----------
	Sum(float[] numbers){
		System.out.println("Inside Float Array Constructor");
		float sum = 0;
		for(float num:numbers){
			sum += num;
		}
		System.out.println("sun is " + sum);
	}	
	
	//----------- Var-Arg Constructor -----------
	Sum(int... numbers){
		System.out.println("Inside Var-Arg Constructor");
		int sum = 0;
		for(int num:numbers){
			sum += num;
		}
		System.out.println("sun is " + sum);
	}
	
	//----------- String arg Constructor ------------
	Sum(String name){
		this.name = name;
		System.out.println("Inside String Arg Constructor");		
	}
	
	//----------- Self- Object Construtor or Copy Constructor ------------
	Sum(Sum s1){
		this.name = s1.name;
		System.out.println("Inside Copy Constructor");		
		System.out.println("name : " + name);
	}
}