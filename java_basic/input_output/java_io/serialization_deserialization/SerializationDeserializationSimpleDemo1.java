package corejava.java_basic.input_output.java_io.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;

public class SerializationDeserializationSimpleDemo1 {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Student Object Here -------------
		Student s1 = new Student(12345,"Ramesh","Sanatani","Sri Ram Institute");
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Student object value before Serialization");
			s1.showStudentDetails();
			oos.writeObject(s1);
			oos.flush();
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			Student s2 = (Student) ois.readObject();
			System.out.println("Printing Student object value after De-Serialization");
			s2.showStudentDetails();
			System.out.println(s2);
			f.deleteOnExit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Student Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Student implements Serializable {
	private int sID;
	private String sName;
	private String sTitle;
	private String sCollegeName;

	// -------------- This is Student Class Constructor ----------------
	public Student(int id, String name, String title, String collegeName) {
		sID = id;
		sName = name;
		sTitle = title;
		this.sCollegeName = collegeName;
	}

	// ------------ This method Display the Student Details ---------------
	public void showStudentDetails() {
		System.out.println("Printing Student Details");
		System.out.println("--------------------------------");
		System.out.println("Student Id : " + sID);
		System.out.println("Student Name : " + sName + " " + sTitle);
		System.out.println("College name  : " + sCollegeName);
	}

}