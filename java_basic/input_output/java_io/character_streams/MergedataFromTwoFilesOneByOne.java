package corejava.java_basic.input_output.java_io.character_streams;

import java.io.*;

public class MergedataFromTwoFilesOneByOne {
	public static void main(String... args) throws IOException {
		
		//-------- Creating two files and writing data into it ----------
		File f1 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\a.txt");
		File f2 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\b.txt");
		File f3 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\ab.txt");
		
		char[] myCharArray1;
		char[] myCharArray2;
		
		f1.createNewFile();
		f2.createNewFile();
		
		try(PrintWriter pw1 = new PrintWriter(f1);	PrintWriter pw2 = new PrintWriter(f2)){
			pw1.println("Jay Shree Krishna");
			pw1.println("Jay Shree Ram");
			pw1.flush();
			pw2.println("Har Har Mahadev");
			pw2.println("Jay Maa Durga");
			pw2.flush();
		}
		
		//-------------- Reading data from 2 Files ----------------------
		try(BufferedReader br1 = new BufferedReader(new FileReader(f1)); BufferedReader br2 = new BufferedReader(new FileReader(f2))){
			
			long f1Length = f1.length();
			long f2Length = f2.length();
			myCharArray1 = new char[(int)f1Length];
			myCharArray2 = new char[(int)f2Length];
			
			br1.read(myCharArray1);
			br2.read(myCharArray2);
			
		}
		
		//-------------- Writing Data into Third File ----------------
		try(PrintWriter pw1 = new PrintWriter(f3)){
			for(char ch:myCharArray1) {
				pw1.print(ch);
			}
			
			pw1.println("Suman");
			
			for(char ch:myCharArray2) {
				pw1.print(ch);
			}
			
			pw1.println("Suman");
			pw1.flush();
		}
		
		
		//---------------- Reading the data from Third file and print in Console -----------------
		try(BufferedReader br1 = new BufferedReader(new FileReader(f3))){
			
			String line = br1.readLine();
			while(line !=null) {
				System.out.println(line);
				line = br1.readLine();
			}
		}
		
		f1.delete();
		f2.delete();
		f3.delete();
	}
}
