package corejava.java_basic.input_output.java_io.character_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String...args) throws IOException {
		//-------------- Creating folders and File --------------
		File textFile1 = new File("a.txt");
		File mainFolder = new File("TestFolder");
		mainFolder.mkdir();
		File textFile2 = new File(mainFolder,"abc.txt");
		if(textFile1.exists()!= true) {textFile1.createNewFile();}
		if(textFile2.exists()!= true) {textFile2.createNewFile();}
				
				
		//---------------- Writing data to the file using PrintWriter in Overwrite mode ----------------
		try(PrintWriter pw1 = new PrintWriter("a.txt"); PrintWriter pw2 = new PrintWriter(textFile2); 
				PrintWriter pw3 = new PrintWriter(new FileWriter(textFile2,true))) {
			pw1.write(65);
			pw1.println();
			pw1.write(new char[] {'a','s','d'});
			pw1.println();
			pw1.write("Jay Shree Ram");
			pw1.print(true);
			pw1.println();
			pw1.print(new char[]{'a','s','d'});;
			pw1.println();
			pw1.print(111.11);
			pw1.println();
			pw1.print("Har Har Mahadev");
			pw1.println();
			pw1.println("Jay Maa Durga");
			pw1.println(Integer.parseInt("10"));
			pw1.flush();
			pw1.close();
			
			pw2.println("Om Namah Shivaya");
			pw2.println("Om Namo Bhagwate Basudevaya");
			
			pw2.flush();
			pw2.close();
			
			pw3.println(true);
			pw3.println("Om Namo Narayanaya");
			pw3.print("Jay Maa Kali");
			pw3.flush();

		}
		try(BufferedReader br1 = new BufferedReader(new FileReader(textFile1)); BufferedReader br2 = new BufferedReader(new FileReader(textFile2))){
			String line1 = br1.readLine();
			while(line1 !=null) {
				System.out.println(line1);
				line1 = br1.readLine();
			}
			
			System.out.println("-------------------------------------------- ");
			
			String line2 = br2.readLine();
			while(line2 !=null) {
				System.out.println(line2);
				line2 = br2.readLine();
			}
		}
		
		textFile1.delete();
		textFile2.delete();
		mainFolder.delete();	
	}
}
