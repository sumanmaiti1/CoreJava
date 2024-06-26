package corejava.java_basic.array;

public class Array_3 {	 
	public static int k = 0;
	public static void main(String[] args) {
		
		int[] myIntArray1 = {0,1,2,3}; 
		int[][] myIntArray2 = {{1},{2,3},{4,5,6},{7,8,9,0}};
		int[][] myIntArray3 = new int[2][3];
		int[][] myIntArray4 = new int[2][];
		
       int[][] integer2DArray = new int[5][3]; 
        System.out.println( 
            "Default value of int array element: "
            + integer2DArray[0][0]); 
        
        String[][] string2DArray = new String[4][4]; 
        System.out.println( 
            "Default value of String array element: "
            + string2DArray[0][0]); 
        
        
        boolean[][] boolean2DArray = new boolean[4][4]; 
        System.out.println( 
            "Default value of boolean array element: "
            + boolean2DArray[0][0]); 
        
        char[][] char2DArray = new char[10][10]; 
        System.out.println( 
            "Default value of char array element:"
            + char2DArray[0][0] + "\n"); 
        
        myIntArray4[0] = new int[]{1,2};
        myIntArray4[1] = new int[]{2,3,4};

		for(int i=0;i<myIntArray4.length;i++) {
			for(int j=0;j<myIntArray4[i].length;j++) {					
				System.out.print(myIntArray4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
        
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {	
				
				myIntArray3[i][j] = k+=1;
			}
		}

		for(int i=0;i<myIntArray2.length;i++) {
			for(int j=0;j<myIntArray2[i].length;j++) {
				System.out.print(myIntArray2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<myIntArray3.length;i++) {
			for(int j=0;j<myIntArray3[i].length;j++) {
				System.out.print(myIntArray3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
