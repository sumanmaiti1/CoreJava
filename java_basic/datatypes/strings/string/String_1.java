/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti

*/

// String is indexed
// String is Immutable
// String is mostly used datatype in any Programming language
// String is an indexed char sequence

package corejava.java_basic.datatypes.strings.string;

public class String_1 {
	public static void main(String[] args) {
        String s1 = "Jay Shree Krishna"; // ---------- This is Literal form of String                
        String s2 = new String("The crazy frog jumps over the lazy dog 012*_$#."); //----------- This is Object Form of String
        
        String s3 = "Jay Shree Krishna";
        String s4 = new String("Jay Shree Krishna");
        String s5 = new String("Jay Shree Krishna");
        
        System.out.println(s1 + "\n" + s2);
        
        //---------- String s1 = "Jay Shree Krishna" ----------------
        // One object will be created in String Constant Pools (SCP) and will be assigned to reference variable s1
        
        //----------- In case of String s2 = new String("Jay Shree Ram") ---------------
        //----------- Total 2 Objects will be created. One will be created in Heap memory with "Jay Shree Ram" value
        //----------- Another one will be created in Sting Constant Pool with for reuse.
        
        //--------------- euuals and == in String
      
        System.out.println(s1==s3); //---------- Prints True
        System.out.println(s1.equals(s3)); //---------- Prints True

        System.out.println(s1==s4); //---------- Prints False
        System.out.println(s1.equals(s4));//---------- Prints True
        
        System.out.println(s4==s5); //---------- Prints False
        System.out.println(s4.equals(s5));//---------- Prints True
    }
}
