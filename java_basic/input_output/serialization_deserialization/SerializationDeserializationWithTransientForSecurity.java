package corejava.java_basic.input_output.serialization_deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializationDeserializationWithTransientForSecurity {
	public static void main(String[] args) throws IOException {
		// ----------------- creating abc.text file if it doesn't exist ---------------
		File f = new File("abc.text");
		if (f.exists() != true) {
			f.createNewFile();
		}
		
		//------------- Creating Account Object Here -------------
		Account s1 = new Account("Acc12345","Har Har Mahadev");
		
		// ------------- Creating Stream Objects -----------------
		try (FileInputStream fis = new FileInputStream(f);
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			System.out.println("Printing Account object value before Serialization");
			s1.showAccountDetails();
			oos.writeObject(s1);
			System.out.println(s1);
			
			System.out.println("\n\n");
			
			
			//---------------- Transient Variables will not be present in ABC.txt------------------
			Account s2 = (Account) ois.readObject();
			System.out.println("Printing Account object value after De-Serialization");
			s2.showAccountDetails();
			System.out.println(s2);
			
			f.deleteOnExit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//------------------- This is Account Class. It needs to implement Serializable interface for Serialization and De-Serialization ----------------
class Account implements Serializable {
	private String accountNo;
	private transient String accountPwd;
	private static String accountBankName = "Sri Krishna Bank";

	// -------------- This is Account Class Constructor ----------------
	public Account(String accountNo, String accountPwd) {
		this.accountNo = accountNo;
		this.accountPwd = accountPwd;
	}

	// ------------ This method Display the Account Details ---------------
	public void showAccountDetails() {
		System.out.println("Printing Account Details");
		System.out.println("--------------------------------");
		System.out.println("Account ID : " + accountNo);
		System.out.println("Account Password  : " + accountPwd);
		System.out.println("Account Bank Name  : " + accountBankName);
		System.err.println("\n");
	}

}