package corejava.java_basic.input_output.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationDeserializationDontConsiderStatic {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Human Object Here -------------
		Human s1 = new Human("Ramesh","Sanatani");
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Human object value before Serialization");
			s1.showStudentDetails();
			oos.writeObject(s1);
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			
			//---------------- Static Variables will not be present in ABC.txt------------------
			Human s2 = (Human) ois.readObject();
			System.out.println("Printing Human object value after De-Serialization");
			s2.showStudentDetails();
			System.out.println(s2);
			
			f.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Human Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Human implements Serializable {
	private String sName;
	private String sTitle;
	private static String scientificName = "Homo Sapience";

	// -------------- This is Human Class Constructor ----------------
	public Human(String name, String title) {
		sName = name;
		sTitle = title;
	}

	// ------------ This method Display the Human Details ---------------
	public void showStudentDetails() {
		System.out.println("Printing Human Details");
		System.out.println("--------------------------------");
		System.out.println("Human Name : " + sName + " " + sTitle);
		System.out.println("Scientific name  : " + scientificName);
	}

}