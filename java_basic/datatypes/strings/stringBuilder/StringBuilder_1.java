package corejava.java_basic.datatypes.strings.stringBuilder;

public class StringBuilder_1 {
		
	public static void main(String[] args) {
		
		//------------- Constructors --------------
		
		StringBuilder sb1 = new StringBuilder(); //---------------- empty or Default constructor, with default initial capacity as 16
		StringBuilder sb2 = new StringBuilder(100); //---------------- constructor with initial capacity of 100 char
		StringBuilder sb3 = new StringBuilder("Jay Shree Krishna"); //---------------- constructor with string
		CharSequence chr = "Har Har Mahadev";
		StringBuilder sb4 = new StringBuilder(chr); //---------------- constructor with charsequence
		StringBuilder sb5 = new StringBuilder(); //---------------- empty or Default constructor, with default initial capacity as 16
		
		//----------- capacity(). when exceed (new Capacity = 2 * old capacity + 1) --------------                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		System.out.println(sb1.capacity()); //16
		System.out.println(sb2.capacity()); //100
		System.out.println(sb3.capacity()); //33
		System.out.println(sb4.capacity()); //31
		
		//------------- append method . it appends at the last ------------
		sb1= sb1.append(false).append('*').append(new char[] {'-','%'}).append("Jay Sri Ram");
		System.out.println(sb1);
		System.out.println(sb1.capacity());	//34
		System.out.println(sb2.append("Radhe Radhe"));
		System.out.println(sb2.append(12D));
		System.out.println(sb2.append(100.235568f));
		System.out.println(sb2.append(111));
		System.out.println(sb2.append(987654L));
		System.out.println(sb1.append(new int[] {10,20,30}));
		System.out.println(sb2.append(sb4));
		System.out.println(sb2.append("Om Namah Shivaya".toCharArray(),3,5));
		System.out.println(sb2.append("Sri Ram",4,7));
		
		//-------------------charAt(int n) - gives character at mentioned number. raised StringIndexOutOfBoundsException otherwise
		System.out.println(sb1.charAt(0));
		System.out.println(sb1.charAt(5));
		//System.out.println(sb1.charAt(55)); //--------------- will raise StringIndexOutOfBoundsException
	}
	
	
}
