package corejava.java_basic.oops.class_object;

public class DemoClassObjectInitializationThroughReference{
	public static void main(String... args){
		Animal dog = new Animal();
		Animal bird = new Animal();
		
		dog.animalType = "Bulldog";
		dog.numberOfLegs = 4;
		//dog.speak = "Bark" --------------- This will cause error as speak varibale isn't mentioned in Animal class
		
		bird.animalType = "Peacock";
		bird.numberOfLegs = 2;
		//bird.colour = "White" --------------- This will cause error as colour varibale isn't mentioned in Animal class
		
		System.out.println(dog.animalType + " , " + dog.numberOfLegs);
		System.out.println(bird.animalType + " , " + bird.numberOfLegs);
	}
}


class Animal{
	String animalType;
	byte numberOfLegs;
}