package corejava.java_basic.input_output.file_folders;

import java.io.File;
import java.io.IOException;

public class Folders_2 {
	public static void main(String[] args) throws IOException {
		File mainFolder = new File("Main Folder");
		if(mainFolder.exists()==false) {
			mainFolder.mkdir();
			File subFolder1 = new File(mainFolder,"Sub Folder1");
			File subFolder2 = new File(mainFolder,"Sub Folder2");
			if(!subFolder1.exists()) {subFolder1.mkdir();}
			if(!subFolder2.exists()) {subFolder2.mkdir();}
			File file1 = new File(subFolder1,"abc.txt");
			File file2 = new File(subFolder2,"xyz.txt");

			File file3 = new File(subFolder2,"abc.txt");
			File file4 = new File(mainFolder,"xxx.txt");
			
			File subFolder21 = new File(subFolder2,"Sub Folder21");
			File subFolder22 = new File(subFolder2,"Sub Folder22");
			subFolder21.mkdir();
			subFolder22.mkdir();
			new File(subFolder21,"zzz.txt").createNewFile();
			new File(subFolder22,"yyy.txt").createNewFile();
			new File(subFolder22,"yy.txt").createNewFile();
			new File(subFolder22,"y.txt").createNewFile();
			
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			file4.createNewFile();
			
			// -------------- This will print one level File directory and file names ---------------
			String[] mainFolderList = mainFolder.list();
			for(String item:mainFolderList) {
				System.out.println(item);
			}
			System.out.println("----------------------------------------------");
			iterativeFileSeach(mainFolder);
			
		}	
	}
	
	//------------- recursion to get all the files and folders present inside a folder --------------
	private static void iterativeFileSeach(File folderName) {
		if(folderName.isDirectory()) {			
			for(File item:folderName.listFiles()) {
				if(item.isFile()) {
					System.out.println(item.getAbsolutePath());
					}
				else {
					iterativeFileSeach(item);
				}
			}
		} else {
			System.out.println(folderName.getName());}
	}
}
