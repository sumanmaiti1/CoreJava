package corejava.java_basic.input_output.java_io.file_folders;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorDemo {
	public static void main(String[] args) throws IOException {
		File f1 =new File("abc.txt"); 
		
		//--------------- Here we will try to see FileOutputStrea -------------------
		FileOutputStream fos = new FileOutputStream("abc.txt");
		FileDescriptor fd = fos.getFD();
		fos.write(65);
		fos.write(new byte[] {'\n',65,66,67,68});
		fos.write("\nJay Shree krishna".getBytes());
		fos.flush();		
		fd.sync();
		
		//--------------------- Using FileInputStream to read data-----------------
		FileInputStream fis = new FileInputStream(f1);
		for(byte b:fis.readAllBytes()) {
			System.out.print((char)b);
		}
		
		fis.close();
		fos.close();
		
		f1.delete();
	}
}
