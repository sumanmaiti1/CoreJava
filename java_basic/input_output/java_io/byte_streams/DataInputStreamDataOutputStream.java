//----------These classes help to Read/write primitive Java data types From/To the Input/Output stream in a machine-independent way

package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamDataOutputStream {
	public static void main(String[] args) throws IOException {
		File file1 = new File("abc.txt");
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		
		try(FileInputStream fis = new FileInputStream(file1);
				FileOutputStream fos = new FileOutputStream(file1);
				DataInputStream dis = new DataInputStream(fis);
				DataOutputStream dos = new DataOutputStream(fos);){
			
			// --------------- write data into File----------------
			dos.write(1111);
			dos.writeBytes("\n");
			dos.writeByte(-1111);
			dos.writeBytes("\n");
			dos.writeBoolean(true);
			dos.writeBytes("\n");
			dos.write(new byte[]{100,101,102,103});
			dos.writeBytes("\n");
			dos.writeBytes("Har Har Mahadev\n");
			dos.writeBytes("\n");
			dos.writeChar(100);
			dos.writeBytes("\n");
			dos.writeChars("Jay Shree Ram\n");
			dos.writeDouble(1111.123456789);
			dos.writeBytes("\n");
			dos.writeFloat(123.456789f);
			dos.writeBytes("\n");
			dos.writeLong(123456879123l);
			dos.writeShort(127);
			dos.writeUTF("Jay Shree Krishna"
					+ "\nJay Shree DevakiNandan");
			
			dos.flush();
			
			//--------------- Read data from File --------------
			
			for(byte b:dis.readAllBytes()) {
				System.out.print((char)b);
			}
		}
		
		if(file1.exists()) {
			file1.delete();
		}
	}
}
