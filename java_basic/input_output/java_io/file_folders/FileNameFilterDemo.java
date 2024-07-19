package corejava.java_basic.input_output.java_io.file_folders;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileNameFilterDemo {
	public static void main(String[] args) throws IOException {
		
		File mainFolder = new File("D:\\Work\\Projects\\Java\\Main Folder");
		if(mainFolder.exists()==false) {
			mainFolder.mkdir();
		}
		
		File subFolder1 = new File(mainFolder,"Sub Folder1");
		File subFolder2 = new File(mainFolder,"Sub Folder2");
		File subFolder3 = new File(mainFolder,"Another Folder");
		if(!subFolder1.exists()) {subFolder1.mkdir();}
		if(!subFolder2.exists()) {subFolder2.mkdir();}
		if(!subFolder3.exists()) {subFolder3.mkdir();}
		File file1 = new File(mainFolder,"abc.txt");
		File file2 = new File(mainFolder,"xyz.txt");
		File file3 = new File(mainFolder,"aaa.java");
		File file4 = new File(mainFolder,"bbb.java");
		File file5 = new File(mainFolder,"Sub routine.java");
		
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		file4.createNewFile();
		file5.createNewFile();
		
		//------------------- This will give the folders and Files name with Sub in its name ---------------
		for(String folder : mainFolder.list(new FilterFileName("Sub "))) {
			System.out.println(folder);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		//------------------- This will give the text Files ---------------
		for(File folder : mainFolder.listFiles(new FilterFileName(".txt"))) {
			System.out.println(folder);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		//------------------- This will give the text Files ---------------
		for(File folder : mainFolder.listFiles(new FilterFileName(".java"))) {
			System.out.println(folder);
		}
		
		subFolder1.delete();subFolder2.delete();subFolder3.delete();
		file1.delete(); file2.delete(); file3.delete(); file4.delete(); file5.delete();		
		mainFolder.deleteOnExit();	
	}
}

//--------------- This si the Pattern Class-----------------
class FilterFileName implements FilenameFilter{
	String pattern;
	public FilterFileName(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.contains(this.pattern);
	}
}