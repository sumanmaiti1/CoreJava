package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("a.txt");
		File f2 = new File("b.txt");
		File f3 = new File("c.txt");
		File f4= new File("d.txt");
		
		if (f1.exists() & f2.exists() & f3.exists() & f4.exists()) {}
		else {
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
			f4.createNewFile();
		}
		
		try(FileInputStream fis1 = new FileInputStream(f1);
				FileInputStream fis2 = new FileInputStream(f2);
				FileInputStream fis3 = new FileInputStream(f3);
				FileInputStream fis4 = new FileInputStream(f4);
				FileOutputStream fos1 = new FileOutputStream(f1);
				FileOutputStream fos2 = new FileOutputStream(f2);
				FileOutputStream fos3 = new FileOutputStream(f3);
				FileOutputStream fos4 = new FileOutputStream(f4);){
			
			fos1.write("Jay Shree Krishna \nJay Shree Gopal\n".getBytes());
			fos1.flush();
			
			fos2.write("Jay Shree Ram \nJay Shree Koushalya Nandan\n".getBytes());
			fos2.flush();
			
			fos3.write("Har Har Mahadev \nOm Namah Shivaya\n".getBytes());
			fos3.flush();
			
			
			//------------------ We need to use Vector Class to create an Enumaration of FileInputStream objects --------------------
			Vector<FileInputStream> vect = new Vector<FileInputStream>(3); 
			vect.add(fis1);
			vect.add(fis2);
			vect.add(fis3);
			
			// ---------------- This is the way to create Sequence Input Streams with more than 2 input streams -------------------
			SequenceInputStream sis = new SequenceInputStream(vect.elements());
			for(byte b:sis.readAllBytes()) {
				fos4.write(b);
			}
			
			fos4.flush();
			
			InputStream sis1 = new BufferedInputStream(fis4);
			for(byte b:sis1.readAllBytes()) {
				System.out.print((char) b);
			}
			
		}
		
		f1.delete(); f2.delete(); f3.delete(); f4.delete();
	}
}
