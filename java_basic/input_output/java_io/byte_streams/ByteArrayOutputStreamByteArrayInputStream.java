package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamByteArrayInputStream {
	public static void main(String[] args) throws IOException {

		File file1 = new File("abc.txt");
		File file2 = new File("xyz.txt");
		
		if (file1.exists() == false & file2.exists() == false) {
			file1.createNewFile();
			file2.createNewFile();
		}

		
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(file1));
				BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream(file2));
				BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(file1));
				BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(file2))) {
			// -------------- Write Data into the file --------------
			baos.write(100);
			baos.write('\n');
			baos.write("Jay Shree Krishna\n".getBytes());
			baos.writeBytes("Har har Mahadev\n".getBytes());
			baos.writeTo(bos1); //---------------------------------- Write the Buffer Array to first File -----------------------------
			baos.writeBytes("Jay Shree Ram".getBytes());
			baos.writeTo(bos2);  //---------------------------------- Write the same Buffer Array to Second File -----------------------------
			
			//baos.flush();
			bos1.flush();
			bos2.flush();
			
			// -------------- Read Data from the file --------------	
			
			ByteArrayInputStream bais1 = new ByteArrayInputStream(bis1.readAllBytes());
			ByteArrayInputStream bais2 = new ByteArrayInputStream(bis2.readAllBytes());
			for(byte b:bais1.readAllBytes()) {
				System.out.print((char)b);
			}
			System.out.println("\n----------------------------------------------------------------------");
			
			for(byte b:bais2.readAllBytes()) {
				System.out.print((char)b);
			}
		}
		
		if(file1.exists() & file2.exists()) {
			file1.delete();
			file2.delete();
		}
	}
}
