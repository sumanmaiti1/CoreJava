package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamFileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		File f1 =new File("abc.txt"); 
		
		//--------------- Here we will try to see FileOutputStrea -------------------
		FileOutputStream fos = new FileOutputStream("abc.txt");
		fos.write(65);
		fos.write(new byte[] {'\n',65,66,67,68});
		fos.write("\nJay Shree krishna".getBytes());
		fos.flush();
		fos.close();
		
		try(FileOutputStream fos1 = new FileOutputStream(f1,true)){
			fos1.write("\nHar Har Mahadev".getBytes());
			fos1.write("\nJay Shree Ram".getBytes());
			fos1.flush();
		}
		
		//-------------- Here we will try to write the data from .txt file from FileInputStream ---------------
		FileInputStream fis = new FileInputStream(f1);
		int ch = fis.read();
		while(ch !=-1) {
			System.out.print((char)ch);
			ch = fis.read();
		} fis.close();
		
		System.out.println("\n--------------------------------------------------");
		
		try(FileInputStream fis1 = new FileInputStream(f1)){
			byte[] myByteArray = fis1.readAllBytes();
			for(byte b:myByteArray) {
				System.out.print((char)b);
			}
		}
		
		System.out.println("\n--------------------------------------------------");
		
		try(FileInputStream fis2 = new FileInputStream(f1)){
			byte[] b = new byte[(int)f1.length()];
			fis2.read(b);
			for(byte indByte:b) {
				System.out.print((char)indByte);
			}
		}
		
		System.out.println("\n--------------------------------------------------");
		
		try(FileInputStream fis2 = new FileInputStream(f1)){
			byte[] b = new byte[fis2.available()];
			fis2.read(b);
			System.out.print(new String(b));
			
		}
		
				
		f1.delete();
		
	}
}
