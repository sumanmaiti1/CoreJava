package corejava.java_basic.input_output.java_io.file_folders;

import java.io.File;

public class Files_1 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("Shree Ram.txt");
		if (f1.exists()== false) {
			f1.createNewFile();
			System.out.println(f1.exists());
			System.out.println(f1.isFile());
			System.out.println(f1.isDirectory());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.renameTo(new File("Shree krishna.jpg")));
			System.out.println(f1.exists());
			
			File f2 = new File("Shree krishna.jpg");
			System.out.println(f2.exists());
			System.out.println(f2.lastModified());
			System.out.println(f2.toString());
			System.out.println(f2.pathSeparator);
			System.out.println(f2.delete());
			System.out.println(f2.exists());
		}
	}
}
