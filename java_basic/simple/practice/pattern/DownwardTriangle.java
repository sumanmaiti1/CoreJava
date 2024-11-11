package corejava.java_basic.simple.practice.pattern;

public class DownwardTriangle {
	public static void main(String[] args) {
		DownwardTriangle.downwardTriangle(17, "%");
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
