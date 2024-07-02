package corejava.java_basic.oops.class_object;


public class AnonymousObject{
	public static void main(String... args){
		// ------------- new DemocCircle(5) is anonymus Object here. It doesn't have any reference vareiable associated with it. It's only for one time use ------------
		System.out.println("Radius of Circle is : " + new DemoCircle(5).calculateRadius());
	}
}


class DemoCircle{
	double radius;
	
	//------- this is class constructor -----------
	DemoCircle(double radius){
		this.radius =radius;
	}
	
	//--------- This method wil print the radius of circle -----------
	double calculateRadius(){
		return Math.PI * radius * radius;
	}
}