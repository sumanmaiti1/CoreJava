package corejava.java_basic.array;

public class Array_2 {
	//------------------ For Multi Dimentional Array ----------------
	public static int[][] myIntArray;
	public static String[][][] myStringArray = new String[3][3][];

	public static void main(String[] args) {
		for(int i=0;i<myStringArray.length;i++) {
			System.out.println(myStringArray[i]);
		}
		
		System.out.println("\n" + " ------------------ For 2 Dimentional Array ----------------");
		
		myIntArray =new int[][] {{0,1},{2,3,4},{5,6,7,8}} ;
		for(int i=0;i<myIntArray.length;i++) {
			for(int j =0;j<myIntArray[i].length;j++) {
				System.out.print(myIntArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n" +" ------------------ For 3 Dimentional Array ----------------");
		//myStringArray[0][0][0] = null;
		myStringArray[0][0] = new String[] {"a","b","c"};		
		myStringArray[0][1] = new String[] {"d","e","f","g"};
		myStringArray[0][2] = new String[] {"h","i","j","k","l"};
		myStringArray[1][0] = new String[] {"m","n","o","p","q"};
		myStringArray[1][1] = new String[] {"r","s","t","u","v","w","x","y","z"};
		myStringArray[1][2] = new String[] {"r","s","t","u","v","w","x","y","z"};
		myStringArray[2] = new String[][] {{"a","b","c","d","e"},{"f","g","i","j","k"},{"l","m","n","o","p","q"}};
		
		for(int i=0;i<myStringArray.length;i++) {
			for(int j=0;j<myStringArray[i].length;j++) {
				for(int k=0;k<myStringArray[i][j].length;k++) {
					System.out.print(myStringArray[i][j][k] + " ");					
				}
				System.out.println();
			}
			System.out.println();
		}		
	}
}
