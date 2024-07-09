package corejava.java_basic.input_output.serialization_deserialization;

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

public class SerializationDeserializationWithExteenalization {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Pupils Object Here -------------
		Pupils s1 = new Pupils(12345,"Rames Sanatani","Sri Ram Institute", "+91-9876543210");
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Pupils object value before Serialization");
			s1.showPupilDetails();
			oos.writeObject(s1);
			oos.flush();
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			Pupils s2 = (Pupils) ois.readObject();
			System.out.println("Printing Pupils object value after De-Serialization");
			s2.showPupilDetails();
			System.out.println(s2);
			
			f.deleteOnExit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Pupils Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Pupils implements Externalizable {
	private int sID;
	private String sName;
	private String sCollegeName;
	private String sMobileNumber; //-------------- We will reformat this Mobile Number. This will be saved in ABC.TXT without +01- part ------------
	
	//--------------- this is Default Constructor .Needed forExternalization ------------------ 
	public Pupils() {}
	
	// -------------- This is Pupils Class Constructor ----------------
	public Pupils(int id, String name, String collegeName, String sMobileNumber) {
		sID = id;
		sName = name;
		this.sCollegeName = collegeName;
		this.sMobileNumber = sMobileNumber;
	}

	// ------------ This method Display the Pupils Details ---------------
	public void showPupilDetails() {
		System.out.println("Printing Pupils Details");
		System.out.println("--------------------------------");
		System.out.println("Pupils Id : " + sID);
		System.out.println("Pupils Name : " + sName);
		System.out.println("College name  : " + sCollegeName); //-------------- We will reformat this Mobile Number. This will be saved in ABC.TXT without +01- part ------------
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(sID);
		out.writeUTF(sName);
		out.writeUTF(sCollegeName);
		out.writeUTF(sMobileNumber.split("-")[1]);//-------------- We will reformat this Mobile Number. This will be saved in ABC.TXT without +01- part ------------
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		sID = in.readInt();
		sName= in.readUTF();
		sCollegeName = in.readUTF();
		sMobileNumber = "+91-" + in.readUTF();//-------------- We will reformat this Mobile Number. This will be saved in ABC.TXT without +01- part ------------
	}

}