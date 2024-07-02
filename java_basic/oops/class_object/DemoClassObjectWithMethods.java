package corejava.java_basic.oops.class_object;

public class DemoClassObjectWithMethods{
	public static void main(String... args){
		Veichle_1 bus = new Veichle_1(); //----------- Bus object
		Veichle_1 car = new Veichle_1(); //----------- car object
		
		bus.veichleType = "Volvo";		
		bus.numbeOfwheels = (short)6;
		bus.distanceCovered = 150.80;
		
		car.veichleType = "Maruti";
		car.numbeOfwheels = (short)4;
		car.distanceCovered = 56;
		
		bus.showDetails();
		car.showDetails();
		
		System.out.println("Average Speed of Bus is :"  + bus.calculateAverageSpeed(2.5) + " kmph");
		System.out.println("Average Speed of Car is :"  + car.calculateAverageSpeed(.75) + " kmph");
	}
}

class Veichle_1{
	String veichleType;
	short numbeOfwheels;
	double distanceCovered;
	private double averageSpeed;
	
	//------------- method without return type and without parameters --------------
	void showDetails(){
		System.out.println(veichleType + " , " + numbeOfwheels );
	}
	
	//------------- method with double return type and parameters --------------
	double calculateAverageSpeed(double timeTaken){
		averageSpeed = distanceCovered / timeTaken;
		return averageSpeed;
	}
}