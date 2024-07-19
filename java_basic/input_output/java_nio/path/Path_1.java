package corejava.java_basic.input_output.java_nio.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Path_1 {
	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\path");
		Path path2 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\path");
		Path path3 = Paths.get("corejava\\java_basic\\input_output\\java_nio\\path");
		Path path4 = Paths.get("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\path", "Path_1.java");
		Path path5 = Path.of("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\path");
		Path path6 = Path.of("D:\\Work\\Projects\\Java\\com\\corejava\\java_basic\\input_output\\java_nio\\path", "Path_1.java");
		
		//------------ Checks if the path is Absolute ------------
		String str ;		
		System.out.println("The path is Absolute : " + path1.isAbsolute()); // Returns True
		System.out.println("The path is Absolute : " + path2.isAbsolute()); // Returns True
		System.out.println("The path is Absolute : " + path3.isAbsolute()); // Returns False
		System.out.println("The path is Absolute : " + path4.isAbsolute()); // Returns True
		System.out.println("The path is Absolute : " + path5.isAbsolute()); // Returns True
		System.out.println("The path is Absolute : " + path6.isAbsolute()); // Returns True
		
		System.out.println();
		
		//------------ Checks if both Paths are same ------------
		
		System.out.println("Both the Paths are : " + (str = path1.compareTo(path2)==0 ? "Same":"Not Same" ) ); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.compareTo(path2)==0 ? "Same":"Not Same" ) ); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.compareTo(path5)==0 ? "Same":"Not Same" ) ); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.compareTo(path6)==0 ? "Same":"Not Same" )); // Both Paths are NOT Same
		
		System.out.println();
		
		//------------ Checks if one Path Ends with another ------------
		System.out.println("Path Ends With : " + path1.endsWith(Paths.get("java_nio\\path\\"))); // Returns True as the path is Inclusive
		System.out.println("Path Ends With : " + path1.endsWith(path3)); // Returns True as the path is Inclusive
		System.out.println("Path Ends With : " + path1.endsWith(Paths.get("java_nio\\new_path\\"))); // Return False as the path is NOT Inclusive
		
		System.out.println();
		
		//--------- Checks if both paths are equal or Not -------------
		System.out.println("Both the Paths are : " + (str = path1.equals(path1) ? "Equal" : "Not Equal")); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.equals(path2) ? "Equal" : "Not Equal")); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.equals(path3) ? "Equal" : "Not Equal")); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.equals(path4) ? "Equal" : "Not Equal")); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.equals(path5) ? "Equal" : "Not Equal")); // Both Paths are Same
		System.out.println("Both the Paths are : " + (str = path1.equals(path6) ? "Equal" : "Not Equal")); // Both Paths are Same
		
		System.out.println();
		
		//----------- getNameCount method Returns the number of Levels / sub directories to the path -----------------
		System.out.println(Arrays.asList(path1.getNameCount(), path2.getNameCount(), path3.getNameCount(),
				path4.getNameCount(), path5.getNameCount(), path6.getNameCount()));
		
		System.out.println();
		
		//----------- getting the hashcode of Path objects -----------------
		System.out.println(Arrays.asList(path1.hashCode(), path2.hashCode(), path3.hashCode(), path4.hashCode(), path5.hashCode(), path6.hashCode()));
		
		System.out.println();
		
		//------------ Checks if one Path Ends with another ------------
		System.out.println("Path Starts With : " + path1.startsWith(Paths.get("D:\\Work\\Projects\\Java\\com"))); // Returns True as the path is Inclusive
		System.out.println("Path Starts With : " + path3.startsWith(path3)); // Returns True as the path is Inclusive
		System.out.println("Path Starts With : " + path3.startsWith("corejava\\java_basic")); // Returns True as the path is Inclusive		
		System.out.println("Path Starts With : " + path1.startsWith(path3)); // Return False as the path is NOT Inclusive
		
		System.out.println();
		
		//------------Path.toString() ------------
		Arrays.asList(path1.toString(), path2.toString(), path3.toString(), path4.toString(),
				path5.toString(), path6.toString()).parallelStream().forEachOrdered(System.out::println);
		
		System.out.println();
		
		//---------- get the Internal class of Path. It's taken care of by java. on windows machine it's class sun.nio.fs.WindowsPath --------------
		System.out.println(path1.getClass());
		System.out.println(Path.of("/a/b/c","java.txt").getClass());		
		
		System.out.println();
		
		//----------- getFileName method Return the File/Directory names -----------------
		System.out.println(Arrays.asList(path1.getFileName(), path2.getFileName(), path3.getFileName(),
				path4.getFileName(), path5.getFileName(), path6.getFileName()));
		
		System.out.println();
		
		// ----------- Returns internal class of Computer File System. it's
		// automatically detected by Java. for Windows machine it's
		// sun.nio.fs.WindowsFileSystem@6adca536 -------------
		System.out.println(path1.getFileSystem());
		
		System.out.println();
		
		//------------ getName(int n) returns the nth level of Directory/filename --------------- 
		System.out.println(path1.getName(0)); //------------ prints the first folder/directory
		System.out.println(path1.getName(1)); //------------ prints the first folder/directory
		System.out.println(Paths.get("abc.txt").getName(0)); //------------ prints the File name itself
		//System.out.println(Paths.get("abc.txt").getName(1)); //------------ This will throw java.lang.IllegalArgumentException
				
		System.out.println();
		
		//------------ getParent() return the Parent of the file/folder --------------- 
		System.out.println("Parent of Path1 : " + path1.getParent());
		System.out.println("Parent of abc.txt : " + Path.of("abc.txt").getParent()); //--- returns Null
		System.out.println("Parent of Path_1.java i.e. path4 : " + path4.getParent());
		
		System.out.println();
		
		//------------- getRoot() gives the Root of the Folder or Files ------------
		System.out.println("Root of path1 : " + path1.getRoot()); //----------- returns D:\
		System.out.println("Root of path4 : " + path4.getRoot()); //----------- returns D:\
		System.out.println("Root of abc.txt : " + Path.of("abc.txt").getRoot()); //-------- returns Null
		
		System.out.println();
		//------------- Creates an Iterator Object of the sub Folders/files ------------------
		path1.iterator().forEachRemaining(System.out::println);
		Path.of("abc.txt").iterator().forEachRemaining(System.out::println); // ------------- prints abc.txt -------
		
		System.out.println();
		//--------------- Normalized the path ------------------
		System.out.println(path1.normalize()); //------------- returns the whole path
		System.out.println(Path.of("A/B/C/.././..").normalize()); //------------ returns A 
		
		System.out.println();

		//---------------- Gives the [ Difference of Paths / the equivalent path ] to navigate from one path to another --------------
		System.out.println(path1.relativize(path1)); //------ returns BLANK
		System.out.println(path1.relativize(path6)); //------ returns Path_1.java
		System.out.println(Paths.get("D:\\some other folder\\abc.txt").relativize(path4)); // returns
																							// ..\..\Work\Projects\Java\com\corejava\java_basic\input_output\java_nio\path\Path_1.java
		
		System.out.println();
		
		//----------- Resolves the Path --------------
		System.out.println(path1.resolve(path1)); // returns path1 as path1 and path1 are same
		System.out.println(path1.resolve(path2)); // returns path1 as path1 and path2 are same
		System.out.println(path1.resolve(path3)); // returns Path1 + path3
		System.out.println(path1.resolve(path4)); // returns path1 + Path_1.java
		System.out.println(path1.resolve(path5)); // returns path1 as path1 and path5 5are same
		System.out.println(path1.resolve(path6)); // returns path1 + Path_1.java
		System.out.println(Path.of("abc.txt").resolve("Suman Maiti")); //-------- return abc.txt\Suman Maiti
		System.out.println(path1.resolve("Jay Shree krishna")); // returns Path1 + Jay Shree krishna
		
		System.out.println();
		
		//-------- Converts a given path string to a Path and resolves it against this path's parent path  -----------------
		//----------- It replace the last Folder/ file of a path with another path
		System.out.println(path1.resolveSibling(path1)); // returns path1
		System.out.println(path1.resolveSibling(path3)); // returns D:\Work\Projects\Java\com\corejava\java_basic\input_output\java_nio\corejava\java_basic\input_output\java_nio\path
		System.out.println(path1.resolveSibling("path1\\abc.txt")); // returns D:\Work\Projects\Java\com\corejava\java_basic\input_output\java_nio\path1\abc.txt
		System.out.println(Path.of("abc.txt").resolveSibling("path1\\abc.txt")); // returns path1\\abc.txt
		System.out.println(Path.of("abc.txt").resolveSibling("xyz.java")); // returns xyz.java
		
		System.out.println();
		
		//-------------- returns an Split Iterator Object. ----------------
		System.out.println(path1.spliterator()); // returns java.util.Spliterators$IteratorSpliterator@725bef66
		path4.spliterator().forEachRemaining(System.out::println); //----------- prints each sub directory till last 
		Path.of("abc.xml").spliterator().forEachRemaining(System.out::println); //-----------prints abc.xml
		
		System.out.println();
		
		//--------------- Prints Subpaths/relative path on the basis of From and To sub folder level ----------------- 
		System.out.println(path1.subpath(0, 5)); //------------- returns Work\Projects\Java\com\corejava
		System.out.println(Path.of("abc.json").subpath(0, 1)); //------------ Returns abc.json
		//System.out.println(Path.of("abc.json").subpath(0, 2)); //------------ Returns java.lang.IllegalArgumentException
		System.out.println(path4.subpath(0, path4.getNameCount())); //------------ Returns Work\Projects\Java\com\corejava\java_basic\input_output\java_nio\path\Path_1.java
				
		System.out.println();
		
		System.out.println(path1.toAbsolutePath()); // returns D:\Work\Projects\Java\com\corejava\java_basic\input_output\java_nio\path
		System.out.println(path3.toAbsolutePath()); // returns D:\Work\Projects\Java\corejava\java_basic\input_output\java_nio\path
		System.out.println(Path.of("abc.xml").toAbsolutePath()); // returns D:\Work\Projects\Java\abc.xml
		
		System.out.println();
		
		//----------- Returns a File object representing this path
		System.out.println(path1.toFile() +". Exists : " + path1.toFile().exists());
		System.out.println(path3.toFile() +". Exists : " + path3.toFile().exists());
		System.out.println(path4.toFile() +". Exists : " + path4.toFile().exists());
		System.out.println(Path.of("abc.xml").toFile() +". Exists : " + Path.of("abc.xml").toFile().exists());
		
		System.out.println();
		
		System.out.println(path1.toRealPath());
		
		System.out.println();
		
		//--------------- Returns a URI to represent this path--------------
		System.out.println(path1.toUri()); //------ file:///D:/Work/Projects/Java/com/corejava/java_basic/input_output/java_nio/path/
		System.out.println(path3.toUri()); //------ file:///D:/Work/Projects/Java/corejava/java_basic/input_output/java_nio/path
		System.out.println(path4.toUri()); //------ file:///D:/Work/Projects/Java/com/corejava/java_basic/input_output/java_nio/path/Path_1.java
		System.out.println(Path.of("abc.txt").toUri()); //------ file:///D:/Work/Projects/Java/abc.txt
		
		System.out.println();
		
		path1.forEach(subpath -> System.out.println( subpath + "_SRI RAM"));
		
	}
}
