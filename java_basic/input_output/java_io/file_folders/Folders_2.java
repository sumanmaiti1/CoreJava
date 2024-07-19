package corejava.java_basic.input_output.java_io.file_folders;

import java.io.File;
import java.io.IOException;

public class Folders_2 {
	public static void main(String[] args) throws IOException {
		File mainFolder = new File("Main Folder");
		if(mainFolder.exists()==false) {
			mainFolder.mkdir();
		}
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
			File file5 = new File(subFolder21,"zzz.txt");
			File file6 =  new File(subFolder22,"yyy.txt");
			File file7 = new File(subFolder22,"yy.txt");
			File file8 = new File(subFolder22,"y.txt");
			
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			file4.createNewFile();
			file5.createNewFile();
			file6.createNewFile();
			file7.createNewFile();
			file8.createNewFile();
			
			// -------------- This will print one level File directory and file names ---------------
			String[] mainFolderList = mainFolder.list();
			for(String item:mainFolderList) {
				System.out.println(item);
			}
			System.out.println("----------------------------------------------");
			iterativeFileSeach(mainFolder);
			
			file1.delete(); file2.delete(); file3.delete(); file4.delete(); file5.delete(); file6.delete(); file7.delete(); file8.delete();
			subFolder1.delete(); subFolder2.deleteOnExit(); subFolder21.deleteOnExit(); subFolder22.deleteOnExit();
			mainFolder.deleteOnExit();	
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
