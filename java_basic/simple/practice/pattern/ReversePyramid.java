package corejava.java_basic.simple.practice.pattern;
public class ReversePyramid {
	public static void main(String[] args) {
		ReversePyramid.reversePyramid(7, "+");
	}
	
	private static void reversePyramid(int noOfRows, String strFill) {
		for(int a=0;a<noOfRows;a++) {
			String strrow = "";
			String strPrePost = "";
			String strMid = "";
			for(int b=0;b<noOfRows-a;b++) {
				strMid += (strFill + " ");				
			}
			
			for(int c=0;c<a;c++) {
				strPrePost += " ";
			}
			
			strrow = strPrePost + strMid.stripTrailing() + strPrePost;
			System.out.println(strrow);
		}
	}
}
