package corejava.java_basic.input_output.java_nio.ReadWriteApendTxtFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadWriteApendTxtFile {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("D:\\Work\\Projects\\Java\\Language\\src\\corejava\\java_basic\\input_output\\java_nio\\ReadWriteApendTxtFile\\abc.txt");
		if(!Files.exists(path)) {Files.createFile(path);}
		
		//----------------Writing in the file ---------------
		Files.write(path, "Jay Shree Krishna".getBytes(),StandardOpenOption.WRITE); //--------------This will always write in the first line and overwrites
		Files.write(path, "Jay Shree Ram".getBytes(),StandardOpenOption.WRITE); //--------------This will always write in the first line and overwrites
		System.out.println(new String(Files.readAllBytes(path))); //---------------- Prints Jay Shree Ramshna
		
		Files.writeString(path, "Har Har Mahadev", StandardOpenOption.WRITE);
		Files.writeString(path, "Om Namah Shivaya\n", StandardOpenOption.WRITE);
		System.out.println(Files.readAllLines(path));
		
		Files.writeString(path, "Om Namo Bhagvate Basudevaya\n", StandardOpenOption.APPEND);
		Files.writeString(path, "On Namo Narayanaya\nJay Maa Durga", StandardOpenOption.APPEND);
		System.out.println(Files.readAllLines(path));
		System.out.println("-------------------------------------------------");
		System.out.println(Files.readString(path));
		System.out.println("-------------------------------------------------");
		System.out.println(new String(Files.readAllBytes(path)));
		Files.deleteIfExists(path);
		
		
	}
}
