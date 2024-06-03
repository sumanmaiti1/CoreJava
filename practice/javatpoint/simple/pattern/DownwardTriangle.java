package com.corejava.practice.javatpoint.simple.pattern;

import java.rmi.NoSuchObjectException;

public class DownwardTriangle {
	public static void main(String[] args) {
		DownwardTriangle.downwardTriangle(7, "+");
	}
	
	private static void downwardTriangle(int noOfRows, String fill) {
		//int noOfCharacters = (2 * noOfRows) - 1;
		for(int i=0;i<noOfRows;i++){
			String strrow = "";
			for(int j=0;j<noOfRows-i;j++) {
			strrow += (fill+ " ");
			}
			System.out.println(strrow);
		}
	}
}
