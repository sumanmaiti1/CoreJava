package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAnImage {
	public static void main(String[] args) throws  IOException,FileNotFoundException {
		
		File f = new File("E:\\Images\\Pictures\\Youtube\\Sanatani Sankha\\Channel Art\\channels4_profile.jpg");
		if(f.exists()) {
			try(FileInputStream fis = new FileInputStream(f); FileOutputStream fos = new FileOutputStream("test.jpg")){
				fis.transferTo(fos);
				fos.flush();
			}
			File ff = new File("test.jpg");			
			if(ff.exists()) {
				ff.delete();
				System.out.println("Deleted Newly Copied test.jpg ");
			}
		}
	}
}
