package corejava.java_basic.input_output.java_nio.file_folders;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class CreateDeleteFoldersFiles {
	public static void main(String[] args) throws IOException {
		Path path1= Path.of("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test");
		Path path2= Path.of("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test\\Test_1");
		Path path3 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test\\abc.txt");
		
		//---------- Checking if the path exists and if not Create Folder ------------
		System.out.println("Test folders Exists ? " + Files.exists(path1));		
		System.out.println("Test folders Exists ? " + path1.toFile().exists());
		
		//----------- Creating the folder ----------
		if(!Files.exists(path1)) {
			Files.createDirectory(path1);
			System.out.println("Test Folder is Created by createDirectory method");
			
		//----------- Checking if the Test Directory Exists --------------
		System.out.println("Test folders Exists After Creation? " + Files.exists(path1));
		
		//-------------- Creating File ----------------
		System.out.println("	abc.txt file Exists inside Test folders before Creation ? " + Files.exists(path3));
		if(!Files.exists(path3)) {			
			Files.createFile(path3);
			System.out.println("	abc.txt file Exists inside Test folders after Creation ? " + Files.exists(path3));
			
			//--------------- Deleting the File --------------
			Files.deleteIfExists(path3);
			System.out.println("	abc.txt file Exists inside Test folders after Deletion ? " + Files.exists(path3));
			
		}
		
		
		//---------- Deleting the Folder ----------
		Files.deleteIfExists(path1);		
		System.out.println("Test folders Exists After Deletion? " + Files.exists(path1));
		
		//------------ Create Directories method -------------
		Files.createDirectories(path2);
		System.out.println("Test_1 Folder is Created Inside Test Folder by createDirectories method");
		System.out.println("Test_1 folders Exists inside Test folder After Creation? " + Files.exists(path2));
		
		//------------ Deleting the Test_1 folder --------------
		Files.delete(path2);
		System.out.println("Test_1 folders Exists inside Test folder After Creation? " + Files.exists(path2));
		
		// --------------Deleting Test Folder Again ----------
		System.out.println("Test folders Exists even After Deleting of Test_1 Folder ? " + Files.exists(path1));
		Files.deleteIfExists(path1);
		System.out.println("Test folders Exists after Deletion ? " + Files.exists(path1));
		
		}
		
	}
}
