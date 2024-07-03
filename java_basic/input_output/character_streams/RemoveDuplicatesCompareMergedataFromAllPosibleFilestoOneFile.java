package corejava.java_basic.input_output.character_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesCompareMergedataFromAllPosibleFilestoOneFile {
	public static void main(String[] args) throws IOException{
		//-------- Creating two files and writing data into it ----------
		String line;
		String lineInC;
		File f1 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\a.txt");
		File f2 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\b.txt");
		File f3 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\c.txt");
		File f4 = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams\\abc.txt");
		
		File folder = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\character_streams");

		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f4.createNewFile();
		
		try(PrintWriter pw1 = new PrintWriter(f1);	PrintWriter pw2 = new PrintWriter(f2); PrintWriter pw3 = new PrintWriter(f3)){
			pw1.println("Jay Shree Krishna");
			pw1.println("Jay Shree Ram");
			pw1.println("Om Namah Shivaya");
			pw1.println("Om Namah Shivaya");
			pw1.println("Jay Shree Krishna");
			pw1.println("Om Namo Narayanaya");
			pw1.println("12345");
			pw1.println("11111");
			pw1.flush();
			
			pw2.println("Har Har Mahadev");
			pw2.println("Jay Maa Durga");
			pw2.println("Jay Shree Krishna");
			pw2.println("Jay Maa Durga");
			pw2.println("Om Namo Narayanaya");
			pw2.println("Jay Maa Kali");
			pw2.println("98765");
			pw2.println("11111");
			pw2.println("22222");
			pw2.flush();
			
			pw3.println("12345");
			pw3.println("98765");
			pw3.println("00000");
			pw3.println("98765");
			pw3.flush();
		}
		
		//-------------- Getting all the .txt Files inside Folder and Reading data from each comparing with c.txt. Then writing the same in abc.txt---------------
		try(PrintWriter pr = new PrintWriter(f4)){
			if(folder.isDirectory()) {
				File[] files = folder.listFiles();
				List<String> coveredList = new ArrayList<String>();						

				for(File file:files) {
					if(file.getAbsolutePath().contains(".txt") & (file.getAbsolutePath().contains("c.txt") == false)) {
						try(BufferedReader br1 = new BufferedReader(new FileReader(file))){
							line = br1.readLine();
						    while(line != null) {
								boolean flagMatch1 = false;	
						    	BufferedReader br2 = new BufferedReader(new FileReader(f3));
						    	lineInC = br2.readLine();
						    	
						    	while(lineInC != null) {
						    		if(line.equalsIgnoreCase(lineInC)) {						    			
						    			flagMatch1 = true;
						    			break;
						    		}
						    		lineInC = br2.readLine();
						    	}
						    	br2.close();
						    	
						    	boolean flagMatch2 = false;
						    	
						    	if(flagMatch1==false){
						    		for(String str:coveredList) {
						    			if(line.equalsIgnoreCase(str)) {
						    				flagMatch2 = true;
						    				break;
						    			}
						    		}
						    		if(flagMatch2 == false) {
						    			pr.println(line);
						    			coveredList.add(line);
						    		}
						    	}
						    	
								line = br1.readLine();
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
