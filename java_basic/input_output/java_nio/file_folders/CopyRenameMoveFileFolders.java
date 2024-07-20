package corejava.java_basic.input_output.java_nio.file_folders;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyRenameMoveFileFolders {
	public static void main(String[] args) throws IOException {
		Path path1 = Path.of("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio", "Test_1");
		Path path2 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test_1\\abc.txt");		
		Path path3 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test_1_copied");
		Path path4 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test_1_copied\\abc_copied.txt");
		Path path5 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test_1\\abc_copied.txt");
		Path path6 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\Test_1\\renamed.txt");
		
		//------Creating the main Folder -------
		if(!Files.exists(path1)) {
			Files.createDirectories(path1);
			
			//------------ creating abc.txt File -------------
			Files.createFile(path2);
			Files.write(path2, "Jay Shree krishna".getBytes());	//------------- writes jay Shree Krishna to abc.txt file
			
			//--------- Copying the File to the same Location ------------ 
			Files.copy(path2,path2); //------------- Nothing Happens Here
			Files.copy(path2,path5); //------------- Copies file with new Name.
			Files.move(path2, path6); //------------ Renames the File to rename.txt
			Files.move(path6, path2); //------------ Renames the File Back to abc.txt
			
			//------------------ Creates a Sub directory named Test_1_sub -------------
			Files.createDirectory(Paths.get(path1.toString() + "\\Test_1_sub"));
			//----------------- Copying abc.txt file to Test_1_sub folder -------------
			Files.copy(path2, Paths.get(path1.toString() + "\\Test_1_sub\\test.txt")); // --------------- Copying the file to another directory with different name
			Files.copy(path2, Paths.get(path1.toString() + "\\Test_1_sub\\" + path2.getFileName())); // --------------- Copying the file to another directory with same name
			
			//-------- Copying the Directory Test_1_sub ----------
			Files.copy(Paths.get(path1.toString() + "\\Test_1_sub"),
					Paths.get(path1.toString() + "\\Test_1_sub_Copied")); // ------------ This will only copy the
																			// Directory NOT the contents
			
			Files.deleteIfExists(Paths.get(path1.toString() + "\\Test_1_sub_Copied"));
			
			//------------- Deleting two files inside Test_1_sub folder -------------
			Files.delete(Paths.get(path1.toString() + "\\Test_1_sub\\test.txt"));
			Files.delete(Paths.get(path1.toString() + "\\Test_1_sub\\" + path2.getFileName()));
			
			//------------- Deleting Test_1_sub folder ------------------
			Files.deleteIfExists(Paths.get(path1.toString() + "\\Test_1_sub"));
			
			//------------ Deleting abc.txt File -------------
			Files.deleteIfExists(path2);
			//------------ Deleting abc_copied.txt File -------------
			Files.deleteIfExists(path5);
			
			//------- Deleting the main Folder -----------
			Files.deleteIfExists(path1);
			
		}
	}
}
