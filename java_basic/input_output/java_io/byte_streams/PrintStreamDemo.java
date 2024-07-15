package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//------------- Creating file object and the Physical file ---------------- 
		File file = new File("abc.txt");
		if(file.exists()==false) {
			file.createNewFile();			
		}
		
		try(PrintStream ps = new PrintStream(new FileOutputStream(file))){
			ps.write(100);
			ps.write("\nJay Shree Krishna\n".getBytes());
			ps.writeBytes("Har har Mahadev".getBytes());
			ps.flush();
		}
		
		//---------------- Reading data from abc.txt file ---------------
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
			for(byte b:dis.readAllBytes()) {
				System.out.print((char)b);
			}			
		}
		
		
		//-------------- Deleting the file if it exists --------------------
		if(file.exists()) {
			file.delete()			;
		}		
		
	}
}
