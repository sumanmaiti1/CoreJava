/*
*This Program will first Check if a String is Palindrome.
*If not Palindrome, it cheks if the String can be made Palindrome
If it can be made palindrome, it converts the string to a palindrome by Reshuffling
*/


package corejava.misc.interviews;

import java.util.HashMap;
import java.util.Map.Entry;

@SuppressWarnings({"unchecked","deprecation"})
public class MakePalindromeByReshuffle {
	
	private static boolean isPalindrome=false;
	private static boolean canBePalindrome=false;
	private static String testString = "qq1madam1";
	private static String palindromeString = "";
	private static HashMap<String,Integer> myMap1 = new HashMap<String,Integer>();
	private static int oddCharCount;
	private static String oddChar;
	
	public static void main(String[] args) {
		if(isPalindrome()) {
			System.out.println("Your String is Palindrome");
		}else {
			System.out.println("Your String is NOT Palindrome.");
			System.out.println("Checking if Your String can be made Palindrome....");			
			if(canBePalindrome()) {
				System.out.println("\nYour String can be made Palindrome.\nMaking your String Palindrome.....");
				makePalindrome();
				System.out.println("\nPalindrome Version of your String is : " + palindromeString );
			}else {
				System.out.println("\nYour String can't be made Palindrome.");
			}
		}
		
	}
	
	//-------- Check if a String is Palindrome.
	private static boolean isPalindrome() {		
		return (testString.equals(new StringBuilder(testString).reverse().toString()))?true:false;
	}
	//-------- Check if a String can be made palindrome.
	private static boolean canBePalindrome() {
		for(Character ch:testString.toCharArray()) {
			String str=ch.toString();
			int charCount = 0;
			if(null==myMap1.get(str)) {
				charCount +=1;
			}else {
				charCount = myMap1.get(str) + 1;
			}
			myMap1.put(str, charCount);
		}
		
		for(Entry<String,Integer> entry:myMap1.entrySet()) {
			if(entry.getValue() %2 ==1) {
				oddCharCount +=1;
				oddChar = entry.getKey();
			}
		}
		
		return (testString.length() %2 ==1 && oddCharCount ==1 )?true:false;
		
	}
	//-------- make a String as Palindrome.
	private static void makePalindrome() {
		String strLeft = "";
		String strRight = "";
		for(Entry<String,Integer> entry:myMap1.entrySet()) {
			for(int i=0; i<entry.getValue()/2; i++) {
				strLeft = strLeft + entry.getKey();
				strRight = entry.getKey() + strRight;
			}
		}
		
		if(testString.length() %2 ==0) {
			palindromeString = strLeft + strRight;
		}else{
			palindromeString = strLeft + oddChar + strRight;
		}
	}
}
