package corejava.java_basic.input_output.java_io.character_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritedBufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//-------------- Creating folders and File --------------
		File textFile1 = new File("a.txt");
		File mainFolder = new File("TestFolder");
		mainFolder.mkdir();
		File textFile2 = new File(mainFolder,"abc.txt");
		if(textFile1.exists()!= true) {textFile1.createNewFile();}
		if(textFile2.exists()!= true) {textFile2.createNewFile();}
				
		//---------------- Writing data to the file using fileWriter in Overwrite mode ----------------
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter("a.txt")); BufferedWriter bw2 = new BufferedWriter(new FileWriter(textFile2))){
			bw1.write(100);
			bw1.write(new char[] {'\n','x','y','z'});
			bw1.write("\nJay Shree Krishna\nHar Har Mahadev");
			bw1.newLine();
			bw1.write("Jay Maa Durga");
			bw1.flush();
			
			bw2.write(65);
			bw2.write(new char[] {'\n','a','b','c'});
			bw2.write("\nOm Namah Shivaya\nOm Namo Bhagwate Vasudevaya");
			bw2.newLine();
			bw2.write("Jay Mata di\n");
			bw2.flush();
		}
		
		
		//---------------- Writing data to the file using fileWriter in Overwrite mode ----------------
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter("a.txt",true)); BufferedWriter bw2 = new BufferedWriter(new FileWriter(textFile2,true))){
			bw1.write(100);
			bw1.write(new char[] {'\n','x','y','z'});
			bw1.write("\nJay Shree Krishna\nHar Har Mahadev");
			bw1.newLine();
			bw1.write("Jay Maa Durga");
			bw1.flush();
			
			bw2.write(65);
			bw2.write(new char[] {'\n','a','b','c'});
			bw2.write("\nOm Namah Shivaya\nOm Namo Bhagwate Vasudevaya");
			bw2.newLine();
			bw2.write("Jay Mata di");
			bw2.flush();
		}
		
		//-------------- Reading data from .txt file from Buffered reader -----------------
		try(BufferedReader br1 = new BufferedReader(new FileReader("a.txt")); BufferedReader br2 = new BufferedReader(new FileReader(textFile2))){
			String i = br1.readLine();
			while(i!=null) {
				System.out.println(i);
				i = br1.readLine();
			}
			
			String j = br2.readLine();
			while(j!=null) {
				System.out.println(j);
				j = br2.readLine();
			}
		}
		
		textFile1.delete();
		textFile2.delete();
		mainFolder.delete();
	}
}
