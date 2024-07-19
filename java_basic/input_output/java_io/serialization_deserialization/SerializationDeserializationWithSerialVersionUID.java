package corejava.java_basic.input_output.java_io.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.Externalizable;
import java.io.File;
import java.io.Serializable;

public class SerializationDeserializationWithSerialVersionUID {
	
	Students s1 = new Students(12345,"Ramesh Sanatani","Sri Ram Institute");
	
	public void doSerialize(Students s1) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.text"))) {
			
			System.out.println("Printing Students object value before Serialization");
			s1.showStudentsDetails();
			oos.writeObject(s1);
			oos.flush();
			System.out.println(s1);
			
			System.out.println("\n\n");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doDeSerialize(File f) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			
			Students s2 = (Students) ois.readObject();			
			System.out.println("Printing Students object value after De-Serialization");
			s2.showStudentsDetails();
			System.out.println(s2);	
			f.deleteOnExit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		SerializationDeserializationWithSerialVersionUID obj = new SerializationDeserializationWithSerialVersionUID();
		
		obj.doSerialize(obj.s1);
		//obj.doDeSerialize(f);		
		
	}
}

//------------------- This is Students Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Students implements Serializable {
	public static final long serialVersionUID = 123456789l;
	private int sID;
	private String sName;
	private String sCollegeName;
	//private String sMobileNumber = "9876543210"; 
	
	public Students(int sID, String sName, String sCollageName) {
		this.sID = sID;
		this.sName = sName;
		this.sCollegeName = sCollageName;
		
	}
	// ------------ This method Display the Students Details ---------------
	public void showStudentsDetails() {
		System.out.println("Printing Students Details");
		System.out.println("--------------------------------");
		System.out.println("Students Id : " + sID);
		System.out.println("Students Name : " + sName);
		System.out.println("College name  : " + sCollegeName);
	}

}