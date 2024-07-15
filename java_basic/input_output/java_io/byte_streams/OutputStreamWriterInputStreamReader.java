package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterInputStreamReader {
	public static void main(String[] args) throws IOException {
		
		//------------- Creating file object and the Physical file ---------------- 
		File file = new File("abc.txt");
		if(file.exists()==false) {
			file.createNewFile();			
		}
		
		//----------------- Writing data into abc.txt ---------------------
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file))){
			osw.write(100);
			osw.append('\n');
			osw.write(new char[] {500,501,502,'\n'});
			osw.write("Jay Shree Ram\n");
			osw.write("Jay Shree Krishna");
			osw.flush();
		}
		
		//---------------- Reading data from abc.txt-------------------
		
		try(FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis)){
			System.out.print((char)isr.read());
			int i = isr.read();
			while(i!=-1) {
				System.out.print((char)i);
				i= isr.read();
			}
		}
		
		//-------------- Deleting the file if it exists --------------------
		if(file.exists()) {
			file.delete();
		}	
		
	}
}
