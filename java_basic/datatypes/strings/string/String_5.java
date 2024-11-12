package corejava.java_basic.datatypes.strings.string;

public class String_5 {
	public static void main(String[] args) {
		
		String s1 = "Jay Shree Krishna";
		String s2 = "A Quick Brown Fox Jumps Over The Lazy Dog !@#$%^ .";
		String s3 = """
				  <html>
				      <body>
				            <p> Har Har Mahadev </p>
				     </body>
				 </html>
				 """;

		
		//----------- repeat()
		System.out.println(s1.repeat(2)); //-----------prints Jay Shree KrishnaJay Shree Krishna
		
		//------------ replace()
		System.out.println(s1.replace(' ', '_')); //------------Prints Jay_Shree_Krishna		
		System.out.println(s1.replace("Krishna", "Ram")); //------------ Prints Jay Shree ram
		
		//---------- replaceAll()
		System.out.println(s2.replaceAll("[!@#$%^]", "")); // ---------prints A Quick Brown Fox Jumps Over The Lazy Dog  .
		System.out.println(s1.replaceAll("a", "A")); //------------ prints JAy Shree KrishnA
		
		//-----------replaceFirst()
		System.out.println(s1.replaceFirst("a", "A")); //-------------prints JAy Shree Krishna
		
		//----------- strip()
		System.out.println("  Jay Shree Ram  ".strip());  //------------ prints Jay Shree Ram
		System.out.println(s3.stripIndent());  //------------ 
		System.out.println("   Jay Shree Ram    ".stripLeading()); //------------ removes leading whitespace characters
		System.out.println("   Jay Shree Ram    ".stripTrailing()); //------------ removes trailing whitespace characters
		
		//-------------- substring()
		System.out.println(s1.substring(0)); //--------- prints Jay Shree Krishna
		System.out.println(s1.substring(0, 10)); //--------- prints Jay Shree
		System.out.println(s1.substring(10, s1.length())); //--------- prints Krishna
		
	}
}
