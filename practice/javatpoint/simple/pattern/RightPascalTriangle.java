package corejava.practice.javatpoint.simple.pattern;

public class RightPascalTriangle {
	public static void main(String[] args) {
		RightPascalTriangle.rightPascalTriangle(7, "+");
	}
	private static void rightPascalTriangle(int noOfRows, String fill) {
		String[] strArray = new String[2*noOfRows-1];
		for(int a=0;a<=(noOfRows-1);a++) {
			String rowString = "";
			for(int b=0;b<a+1;b++) {
				rowString += (fill + " ");
			}
			if(a!=(noOfRows-1)) {strArray[a] = strArray[2*noOfRows-a-2] = rowString.stripTrailing();}
			else {strArray[noOfRows-1]=rowString.stripTrailing();}
		}
		
		for(int i=0;i<strArray.length;i++) {System.out.println(strArray[i]);}
	}
}
