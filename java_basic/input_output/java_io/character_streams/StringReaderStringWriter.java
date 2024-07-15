package corejava.java_basic.input_output.java_io.character_streams;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderStringWriter {
	public static void main(String[] args) throws IOException {
		//------------- Creating file object and the Physical file ---------------- 
		File file = new File("abc.txt");
		if(file.exists()==false) {
			file.createNewFile();			
		}
		
		//---------------- Writing data from abc.txt file ---------------
		try(StringWriter sw = new StringWriter();
				PrintWriter ps = new PrintWriter(file)){
			sw.write("Jay Shree Krishna\n");
			sw.write("Jay Shree Ram\n");
			sw.write(100);
			sw.write(new char[]{'\n',500,501,502});
			sw.flush();
			
			System.out.println(sw.toString());
			
			ps.write(sw.toString().toCharArray());
		}
		
		//---------------- Reading data from abc.txt file ---------------
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			char[] myCharAray = new char[(int)file.length()];
			String strvalueFromFile = String.valueOf(br.read(myCharAray));
			StringReader sr = new StringReader(strvalueFromFile);
			
			int i = sr.read();
			while(i != -1) {
				System.out.print((char)i);
				i= sr.read();
			}
		}
		
		//-------------- Deleting the file if it exists --------------------
		if(file.exists()) {
			file.delete()			;
		}
	}
}
