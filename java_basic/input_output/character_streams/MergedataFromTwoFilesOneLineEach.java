package corejava.java_basic.input_output.character_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergedataFromTwoFilesOneLineEach {
	public static void main(String[] args) throws IOException{
		//-------- Creating two files and writing data into it ----------
		File f1 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\a.txt");
		File f2 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\b.txt");
		File f3 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\ab.txt");
		
		f1.createNewFile();
		f2.createNewFile();
		
		try(PrintWriter pw1 = new PrintWriter(f1);	PrintWriter pw2 = new PrintWriter(f2)){
			pw1.println("Jay Shree Krishna 1");
			pw1.println("Jay Shree Ram 1");
			pw1.println("On Namah Shivaya 1");
			pw1.flush();
			pw2.println("Har Har Mahadev 2");
			pw2.println("Jay Maa Durga 2");
			pw2.flush();
		}
		
		//-------------- Reading data from 2 Files and Writing into Third One ----------------------
		try(BufferedReader br1 = new BufferedReader(new FileReader(f1)); BufferedReader br2 = new BufferedReader(new FileReader(f2)); 
				PrintWriter pw1 = new PrintWriter(f3)){			
			
			String line1 = br1.readLine();
			String line2 = br2.readLine();
			
			while((line1 != null) | (line2 != null)) {
				if(line1 != null) {
					pw1.println(line1);
				}
				
				if(line2 != null) {
					pw1.println(line2);
				}
				
				line1 = br1.readLine();
				line2 = br2.readLine();
				
				pw1.flush();
			}
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
