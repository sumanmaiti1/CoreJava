package corejava.java_basic.input_output.java_io.character_streams;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CharArrayReaderCharArrayWriterDemo {
	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		
		if(file1.exists()==false) {
			file1.createNewFile();
			file2.createNewFile();
		}
		
		//------------------ Writing data into a.txt and b.txt----------------
		try(CharArrayWriter caw1 = new CharArrayWriter();
				PrintWriter pw1 = new PrintWriter(file1);
				PrintWriter pw2 = new PrintWriter(file2)){
			
			caw1.write("Jay Shree Ram\n".toCharArray());
			caw1.write("Jay Shree Krishna\n");
			caw1.writeTo(pw1);
			caw1.write("Har Har Mahadev".toCharArray());
			caw1.writeTo(pw2);
			caw1.flush();
		}
		
		//-------------- Reading data from a.txt--------------------
		try(BufferedReader br1 = new BufferedReader(new FileReader(file1))){
			
			String line = br1.readLine();
			int i = 0;
			while(line != null) {
				CharArrayReader car1 = new CharArrayReader(line.toCharArray());
				while((i=car1.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println("");
				line = br1.readLine();
			}
			
		}
		
		System.out.println("\n-----------------------------------------------------------------------------\n");
		
		
		//-------------- Reading data from b.txt--------------------
		try(BufferedReader br2 = new BufferedReader(new FileReader(file2))){
			
			String line = br2.readLine();
			int i = 0;
			while(line != null) {
				CharArrayReader car1 = new CharArrayReader(line.toCharArray());
				while((i=car1.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println("");
				line = br2.readLine();
			}
		}
		
		if(file1.exists()) {
			file1.delete();
			file2.delete();
		}
	}	
}
