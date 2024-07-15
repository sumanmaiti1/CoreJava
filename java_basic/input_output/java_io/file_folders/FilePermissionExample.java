package corejava.java_basic.input_output.java_io.file_folders;

import java.io.*;
import java.security.PermissionCollection;

public class FilePermissionExample{
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\abc.txt");
		if(file.exists()==false) {
			file.createNewFile();
		}
		
		String srg = "D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\abc.txt";
		FilePermission file1 = new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\-", "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		
		//---------------- Checking if read permission is Given to abc.txt File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\abc.txt","read"))) {
			System.out.println("Read permission is granted \nfor the path= "+srg );
		}else{
			System.out.println("No Read permission is granted \nfor the path= "+srg);
		}
		
		System.out.println("\n------------------------------------------------------------------------------");
		//---------------- Checking if read permission is Given to the other File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\Files_1.java","read"))) {
			System.out.println("Read permission is granted \nfor the path= "+ "Files_1.java" );
		}else{
			System.out.println("No Read permission is granted \nfor the path= "+ "Files_1.java");
		}
		
		System.out.println("\n------------------------------------------------------------------------------");
		
		//---------------- Checking if read permission is Given to the other File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\Files_1.java","write"))) {
			System.out.println("Write permission is granted \nfor the path= "+ "Files_1.java" );
		}else{
			System.out.println("No Write permission is granted \nfor the path= "+ "Files_1.java");
		}
		
		System.out.println("\n------------------------------------------------------------------------------");
		
		//------------------ now Giving the Writing Permission for the file ------------------
		FilePermission file2 = new FilePermission(srg, "write");	    
		permission.add(file2);
		
		if(permission.implies(new FilePermission(srg, "read,write"))) {
			System.out.println("Read, Write permission is granted \nfor the path= "+ srg );
		}else{
			System.out.println("No Read, Write permission is granted \nfor the path= "+ srg);
		}
		
		System.out.println("\n------------------------------------------------------------------------------");
		
		//---------------- Checking if read permission is Given to the other File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\Files_1.java","read,write"))) {
			System.out.println("Both Read Write permission is granted \nfor the path= "+ "Files_1.java" );
		}else{
			System.out.println("Both Read Write permission is NOT granted \nfor the path= "+ "Files_1.java");
		}
		
		System.out.println("\n------------------------------------------------------------------------------");
		
		
		//---------------- Checking if read permission is Given to the other File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\Folders_1.java","read,write"))) {
			System.out.println("Both Read Write permission is granted \nfor the path= "+ "Folders_1.java" );
		}else{
			System.out.println("Both Read Write permission is NOT granted \nfor the path= "+ "Folders_1.java");
		}
		
		//------------------ Giving Read Write Permission at the folder level -------------------
		
		FilePermission file3 = new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\*", "read,write");
		PermissionCollection permission1 = file3.newPermissionCollection();
		permission.add(file3);
		
		System.out.println("\n------------------------------------------------------------------------------");
		
		
		//---------------- Checking if read permission is Given to the other File in the same directory -------------------
		
		if(permission.implies(new FilePermission("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_io\\file_folders\\Folders_1.java","read,write"))) {
			System.out.println("Both Read Write permission is granted \nfor the path= "+ "Folders_1.java" );
		}else{
			System.out.println("Both Read Write permission is NOT granted \nfor the path= "+ "Folders_1.java");
		}
		
		//------------------------- Deleting the file if exists ----------------------- 
		if(file.exists()) {
			file.delete();
		}		
	}
}
