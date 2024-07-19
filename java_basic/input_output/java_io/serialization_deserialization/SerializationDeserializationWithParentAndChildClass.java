package corejava.java_basic.input_output.java_io.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationDeserializationWithParentAndChildClass {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Car Object Here -------------
		Car s1 = new Car("Maruti",500000);
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Car object value before Serialization");
			s1.showCarDetails();
			oos.writeObject(s1);
			oos.flush();
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			
			//---------------- Static Variables will not be present in ABC.txt------------------
			Car s2 = (Car) ois.readObject();
			System.out.println("Printing Car object value after De-Serialization");
			s2.showCarDetails();
			System.out.println(s2);
			
			f.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Car Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Car extends Vehicle implements Serializable {


	private String carName;
	private double carPrice;
	private int noOfWheels;
	

	// -------------- This is Car Class Constructor ----------------
	public Car(String name, double price) {
		super.setNoOfWheels(4);
		this.carName = name;
		this.carPrice = price;
		this.noOfWheels = getNoOfWheels();
		
	}

	// ------------ This method Display the Car Details ---------------
	public void showCarDetails() {
		System.out.println("Printing Car Details");
		System.out.println("--------------------------------");
		System.out.println("Car Name : " + carName);
		System.out.println("Car Price : " + carPrice);
		System.out.println("No Of Wheels  : " + noOfWheels);
		System.out.println("\n");
	}

}

//-------------- Parent Class Vehicle ------------ 
abstract class Vehicle{
	private int noOfWheels;
	
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	final int getNoOfWheels() {
		return noOfWheels; 
	}
}