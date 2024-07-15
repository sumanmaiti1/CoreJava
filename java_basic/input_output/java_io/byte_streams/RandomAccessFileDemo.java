package corejava.java_basic.input_output.java_io.byte_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	
	static final String FILEPATH ="D:\\Work\\Projects\\Java\\abc.txt";
	
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
			ps.writeBytes("\nJay Shree Ram".getBytes());
			ps.flush();
		}
		
		try {
			System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
			writeToFile(FILEPATH, "I love my country and my people", 35);
			System.out.println("\n------------------------------------------------\n");
			System.out.println(new String(readFromFile(FILEPATH, 0, 50)));
			
			if(file.exists()) {
				file.delete();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static byte[] readFromFile(String filePath, int position, int size)
			throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(position);
		byte[] bytes = new byte[size];
		file.read(bytes);
		file.close();
		return bytes;
	}
	private static void writeToFile(String filePath, String data, int position)
			throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();
	}
}
