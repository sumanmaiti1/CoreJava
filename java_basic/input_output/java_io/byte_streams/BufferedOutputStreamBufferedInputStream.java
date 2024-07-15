package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamBufferedInputStream {
	public static void main(String[] args) throws IOException {
		
		//-------------- Set the file ref and if the file doesn't exist, Create a new file ---------------
		File file = new File("abc.txt");
		if (file.exists()!= true){
			file.createNewFile();
			
		}
		
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			
			String Sentence = "Jay Shree Krishna \nHar Har Mahadev \nJay Shree Ram";
			byte[] mybyteArray = Sentence.getBytes(); 
			bos.write(100);
			bos.write('\n');
			bos.write(mybyteArray);
			bos.flush();
			
			System.out.println(bis.read());
			//System.out.println((char)bis.read());
			int i =0;
			while((i = bis.read())!= -1) {
				System.out.print((char)i);
			}
			
			System.out.println("\n-------------------------------------------------------------------------");
		}
		
		try(FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);){
			
			byte[] b = new byte[bis.available()] ;
			bis.read(b);
			for(byte byt:b) {
				System.out.print((char)byt);
			}
			System.out.println("\n-------------------------------------------------------------------------");
			
		}
		
		try(FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);){
			
			byte[] b = new byte[bis.available()] ;
			b = bis.readAllBytes();
			for(byte byt:b) {
				System.out.print((char)byt);
			}
			
		}
		
		file.delete();		
	}
}
