package corejava.java_basic.input_output.java_io.character_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergedataFromAllPosibleFilestoOneFile {
	public static void main(String[] args) throws IOException{
		//-------- Creating two files and writing data into it ----------
		String line;
		File f1 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\a.txt");
		File f2 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\b.txt");
		File f3 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\c.txt");
		File f4 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\abc.txt");
		
		File folder = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams");

		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f4.createNewFile();
		
		try(PrintWriter pw1 = new PrintWriter(f1);	PrintWriter pw2 = new PrintWriter(f2)){
			pw1.println("Jay Shree Krishna 1");
			pw1.println("Jay Shree Ram 1");
			pw1.println("On Namah Shivaya 1");
			pw1.flush();
			
			pw2.println("Har Har Mahadev 2");
			pw2.println("Jay Maa Durga 2");
			pw2.flush();
			
			pw2.println("Om Namo Narayanaya 3");
			pw2.println("Jay Maa Kali 3");
			pw2.flush();
		}
		
		//-------------- Getting all the .txt Files inside Folder and Reading data from each . Then copying the same in abc.txt---------------
		try(PrintWriter pr = new PrintWriter(f4)){
			if(folder.isDirectory()) {
				File[] files = folder.listFiles();
				for(File file:files) {
					if(file.getAbsolutePath().contains(".txt")) {
						try(BufferedReader br = new BufferedReader(new FileReader(file))){
							line = br.readLine();
						    while(line != null) {
								pr.println(line);
								line = br.readLine();
							}					 
						}
					}
				}
				pr.flush();
			}
		}
		
		//---------------- Reading the data from Third file and print in Console -----------------
		try(BufferedReader br1 = new BufferedReader(new FileReader(f4))){			
			line = br1.readLine();
			while(line !=null) {
				System.out.println(line);
				line = br1.readLine();
			}
		}
		
		f1.delete();
		f2.delete();
		f3.delete();
		f4.delete();
	}
}
