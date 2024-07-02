package corejava.java_basic.input_output.character_streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReaderDemo {
	public static void main(String... args) throws IOException {
		//-------------- Creating folders and File --------------
		File textFile1 = new File("a.txt");
		File mainFolder = new File("TestFolder");
		mainFolder.mkdir();
		File textFile2 = new File(mainFolder,"abc.txt");
		if(textFile1.exists()!= true) {textFile1.createNewFile();}
		if(textFile2.exists()!= true) {textFile2.createNewFile();}
				
		//---------------- Writing data to the file using fileWriter in Overwrite mode ----------------
		try(FileWriter fw1 = new FileWriter("a.txt"); FileWriter fw2 = new FileWriter(textFile2)){
			fw1.write(65);
			fw1.write("\nJay Shree Ram");
			fw1.write(new char[]{'\n','a','s','d','\n'});
			fw1.flush();
			
			
			fw2.write("Har Har Manadev \nJay Shree Ram\n");
			fw2.flush();			
		}
		
		//---------------- Writing data to the file using fileWriter in Appending mode ----------------
		try(FileWriter fw3 = new FileWriter("a.txt",true); FileWriter fw4 = new FileWriter(textFile2,true)){
			fw3.write(100);
			fw3.write("\nJay Shree Ram");
			fw3.write(new char[]{'\n','a','s','d'});
			fw3.flush();
			
			
			fw4.write("Har Har Manadev \nJay Shree Ram");
			fw4.flush();			
		}
		
		//------------- Reading data from txt file using file Reader int read() method ------------
		System.out.println("----------------------------------");
		try(FileReader fr1 = new FileReader("a.txt"); FileReader fr2 = new FileReader(textFile2)){
			int i = fr1.read();
			while(i!=-1) {
				System.out.print((char)i);
				i = fr1.read();
			}
			
			System.out.println("\n");
			
			int j = fr2.read();
			while(j!=-1) {
				System.out.print((char)j);
				j = fr2.read();
			}
		}
		
		//------------- Reading data from txt file using file Reader char[] read() method ------------
		System.out.println("\n----------------------------------");
		try(FileReader fr3 = new FileReader("a.txt"); FileReader fr4 = new FileReader(textFile2)){
			int size = (int)textFile1.length();
			char[] charArray=new char[size];
			fr3.read(charArray);
			for(char chr:charArray) {System.out.print(chr);}
			
			size = (int)textFile2.length();
			charArray=new char[size];
			fr4.read(charArray);
			for(char chr:charArray) {System.out.print(chr);}
		}	
		
		textFile1.delete();
		textFile2.delete();
		mainFolder.delete();
	}
}
