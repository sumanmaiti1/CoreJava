package com.corejava.java_basic.array;

public class Array_4 {
	//---------------- Anonymous Array & Array with var keyword ----------------	
	public static void main(String[] args) {
		
		// -------------- Array with var keyword ----------------
		var myIntArray1 = new int[] {1,2,3,4};
		var myIntArray2 = new int[3][];
		var myStringArray1 = new String[3][2];
		var myStringArray2= new String[][] {{"Jay Shree Krishna","Jay Shree Radhe"},{"Har Har Mahadev","Jay Maa Durga"}};
		
		myIntArray2[0] = new int[]{0,1};
		myIntArray2[1] = new int[]{0,1};
		
		System.out.println(myIntArray1.getClass().getName());
		System.out.println(myIntArray2.getClass().getName());
		System.out.println(myStringArray1.getClass().getName());
		System.out.println(myStringArray1[1][1]);
		System.out.println(myStringArray2.getClass().getName());
		
		System.out.println();
		
		for(int i=0;i<myStringArray2.length;i++) {
			for(int j=0;j<myStringArray2.length;j++) {
				System.out.print(myStringArray2[i][j] + " ");
			}System.out.println();
		}
		
		// --------------------- Anonymous Array --------------------
		System.out.println("\n" + Array_4.sumOf2DIntArray(new int[][] {{0,1},{2,3,4},{5,6,7,8,9}}));
	}
	
	public static int sumOf2DIntArray(int[][] myIntArray) {
		/*
		 This method will take a 2D integer array as input and return the Sum of 2 Integer array 
		 */
		int result = 0;
		for(int i=0;i<myIntArray.length;i++) {
			for(int j=0;j<myIntArray[i].length;j++) {
				result += myIntArray[i][j];		
			}
		}
		return result;
	}
}
