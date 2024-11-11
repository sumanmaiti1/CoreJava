package corejava.java_basic.simple.practice.pattern;

public class LeftPascalTriangle {
	public static void main(String[] args) {
		LeftPascalTriangle.leftPascalTriangle(5, "+");
	}
	
	private static void leftPascalTriangle(int noOfRows, String fill) {
		int noOfCharacters = (2*noOfRows-1);
		String[] rowArray = new String[noOfCharacters];
		String strRow = "", strPreFill="";
		for(int a=0;a<noOfRows;a++) {
			strRow=strPreFill="";
			for(int b=0;b<a+1;b++) {
				strRow += (" " + fill);
			}
			
			for(int c=0;c<(noOfCharacters-(strRow.stripLeading().length()-1));c++){
				strPreFill += " ";
			}
			
			if(a!=noOfRows-1) {rowArray[a] = rowArray[noOfCharacters-a-1] = (strPreFill + strRow.stripLeading());}
			else {rowArray[noOfRows-1]=(strPreFill + strRow.stripLeading());}
		}
		
		for(String item:rowArray){System.out.println(item);}
	}
}
