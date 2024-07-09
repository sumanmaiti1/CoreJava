package corejava.java_basic.input_output.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationDeserializationSimpleDemo2 {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating multiple Pupil Objects Here -------------
		Pupil s1 = new Pupil(12345,"Ramesh","Sanatani","Sri Ram Institute");
		Pupil s2 = new Pupil(12346,"Sankarshan","Sanatani","Sri Ram Institute");
		ArrayList<Pupil> aList1 = new ArrayList<Pupil>();
		aList1.add(s1); aList1.add(s2);
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Pupil object value before Serialization");
			s1.showStudentDetails();
			s2.showStudentDetails();
			oos.writeObject(aList1);
	
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(aList1);
			
			System.out.println("\n\n");
			
			ArrayList<Pupil> aList2 = (ArrayList<Pupil>) ois.readObject();
			System.out.println("Printing Pupil object value after De-Serialization");
			System.out.println(aList2);
			for(Pupil s:aList2) {
				System.out.println(s);
				s.showStudentDetails();
			}
			
			f.deleteOnExit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Pupil Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------

class Pupil implements Serializable {
	private int sID;
	private String sName;
	private String sTitle;
	private String sCollegeName;

	// -------------- This is Pupil Class Constructor ----------------
	public Pupil(int id, String name, String title, String collegeName) {
		sID = id;
		sName = name;
		sTitle = title;
		this.sCollegeName = collegeName;
	}

	// ------------ This method Display the Pupil Details ---------------
	public void showStudentDetails() {
		System.out.println("Printing Pupil Details");
		System.out.println("--------------------------------");
		System.out.println("Pupil Id : " + sID);
		System.out.println("Pupil Name : " + sName + " " + sTitle);
		System.out.println("College name  : " + sCollegeName);
		System.out.println();
	}

}