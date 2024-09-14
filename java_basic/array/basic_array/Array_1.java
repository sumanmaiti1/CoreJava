package corejava.java_basic.array.basic_array;

public class Array_1 {
	
	public static int[] myIntArray;
	public static String[] myStringArray;	
	
	public static void main(String[] args) {
		myIntArray = new int[] {1,2,3,4,5};
		int[] myIntArrayClone = myIntArray.clone();
		
		myStringArray = new String[5];
		
		myStringArray[0] = "Jay Shree Krishna";
		myStringArray[1] = "Jay Shree Ram";
		myStringArray[2] = "Jay Shree Durga";
		myStringArray[3] = "Jay Shree NriSingha";
		myStringArray[3] = "Har Har Mahadev";
		myStringArray[4] = "Om Namah Shivaya";
		// myStringArray[5] = "Radhe Rahe";   ----- This will generate java.lang.ArrayIndexOutOfBoundsException
		
		String[] myStringArrayClone = myStringArray.clone();
		String [] myStringArray1 = myStringArray;
		
		
		for(int i=0;i<myIntArray.length;i++) {System.out.println(myIntArray[i]);}
		for(int i=0;i<myStringArray.length;i++) {System.out.println(myStringArray[i]);}
		System.out.println(myIntArray.getClass().getCanonicalName());
		System.out.println(myIntArray.getClass().getName());
		
		System.out.println(myStringArray.equals(myStringArrayClone));
		System.out.println(myStringArray == myStringArrayClone);
		System.out.println(myStringArray.hashCode());
		System.out.println(myStringArrayClone.hashCode());
		System.out.println(myStringArray.toString());
		System.out.println(myStringArray.hashCode());
		System.out.println(myStringArray.length);
		System.out.println(myStringArray.equals(myStringArray1));
		System.out.println(myStringArray == myStringArray1);
		System.out.println(myStringArray1.hashCode());
		System.out.println(myStringArray1.toString());
		System.out.println(myStringArray1[0].hashCode()==myStringArray[0].hashCode());
		System.out.println(myStringArray[0].hashCode()==myStringArrayClone[0].hashCode());
		System.out.println(myStringArray[0]==myStringArrayClone[0]);
		System.out.println(myStringArray[0].equals(myStringArrayClone[0]));
		
		System.out.println(myIntArray.hashCode()==myIntArrayClone.hashCode());
		System.out.println(myIntArray[0]==myIntArrayClone[0]);
		
	}
}
