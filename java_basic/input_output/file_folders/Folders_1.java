package corejava.java_basic.input_output.file_folders;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Folders_1 {
	public static void main(String[] args) throws IOException {
		
		// ------- get current working directory ----------
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		// ------- get current working directory ----------
		System.out.println("Working Directory = " + Path.of("").toAbsolutePath());
			
		// ------- get current working directory ----------
		System.out.println("Working Directory = " + Paths.get("").toAbsolutePath());		
		
		File f = new File("Sri Krishna");
		
		System.out.println(f.exists());
		if (f.exists() != true){
			f.mkdir();
			System.out.println(f.exists());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.getPath());
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			System.out.println(f.renameTo(new File("Sri Ram")));
			//f.delete();
			System.out.println(f.exists());			
		}
		
		File f1 = new File("Sri Ram");
		f1.deleteOnExit();
	}
}
