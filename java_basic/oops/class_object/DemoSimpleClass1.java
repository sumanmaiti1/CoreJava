package corejava.java_basic.oops.class_object;

public class DemoSimpleClass1{
	public static void main(String... args){
		Veichle bus = new Veichle();
		Veichle bike = new Veichle();
		
		bus.distanceInKm = 120;
		bus.timeTakenInHour = 3.5;
		
		bike.distanceInKm = 100.5;
		bike.timeTakenInHour = 1.5;
		
		System.out.println("Average Speed of Bus was : " + ((float)bus.distanceInKm/bus.timeTakenInHour) + " kmph");
		System.out.println("Average Speed of Bike was : " + ((float)bike.distanceInKm/bike.timeTakenInHour) + " kmph");
	}
}

class Veichle{
	double distanceInKm;
	double timeTakenInHour;
}






