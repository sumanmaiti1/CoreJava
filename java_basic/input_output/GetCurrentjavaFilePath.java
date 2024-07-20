package corejava.java_basic.input_output;

import java.io.IOException;
import java.net.URL;


public class GetCurrentjavaFilePath {
	public static void main(String[] args) throws IOException {
		
		ClassLoader myClassLoader = GetCurrentjavaFilePath.class.getClassLoader();
		
		System.out.println(myClassLoader.getDefinedPackage("GetCurrentjavaFilePath"));
		System.out.println(myClassLoader.toString());
		System.out.println(myClassLoader.getDefinedPackages());
		System.out.println(myClassLoader.getParent());
		System.out.println(myClassLoader.getUnnamedModule());
		System.out.println(myClassLoader.getResource("GetCurrentjavaFilePath.class"));
		
		URL url = myClassLoader.getResource("GetCurrentjavaFilePath.class");
		
		System.out.println(url);
	}
}
