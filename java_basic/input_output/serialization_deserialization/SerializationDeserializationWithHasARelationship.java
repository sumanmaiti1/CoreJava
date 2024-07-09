package corejava.java_basic.input_output.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationDeserializationWithHasARelationship {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Employee Object Here -------------
		Employee s1 = new Employee(12345, "Mahadev Sanatani", "ACC012345","Sri Krishna Bank");
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Employee object value before Serialization");
			s1.showEmployeeDetails();
			oos.writeObject(s1);
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			
			//---------------- Static Variables will not be present in ABC.txt------------------
			Employee s2 = (Employee) ois.readObject();
			System.out.println("Printing Employee object value after De-Serialization");
			s2.showEmployeeDetails();
			System.out.println(s2);
			
			f.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Employee Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Employee implements Serializable {

	private int eID;
	private String eName;
	private Accounts account;
	

	// -------------- This is Employee Class Constructor ----------------
	public Employee(int eID, String eName, String acountID, String bank) {
		this.eID = eID;
		this.eName = eName;
		this.account = new Accounts(acountID, bank);
		
	}

	// ------------ This method Display the Employee Details ---------------
	public void showEmployeeDetails() {
		System.out.println("Printing Employee Details");
		System.out.println("--------------------------------");
		System.out.println("Employee ID : " + eID);
		System.out.println("Employee Name : " + eName);
		account.showAcountDetails();
		System.out.println("\n");
	}

}

//-------------- Account Class Vehicle ------------ 
class Accounts implements Serializable{
	private String acountID;
	private String bank;
	
	Accounts(String acountID, String bank){
		this.acountID = acountID;
		this.bank = bank;
	}
	
	public void showAcountDetails() {
		System.out.println("Account ID : " + acountID);
		System.out.println("Bank Name : " + bank);
	}
}