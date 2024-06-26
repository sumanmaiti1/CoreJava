package corejava.practice.javatpoint.simple.pattern;

public class RightDownMirror {
	public static void main(String[] args) {
		RightDownMirror.rightDownMirror(7, "+");
	}
	
	private static void rightDownMirror(int noOfRows, String Fill) {
		for(int a=0;a<noOfRows;a++) {
			String preFill="",fill = "";
			for(int b=0;b<noOfRows-a;b++) {
				fill += (Fill + " ");
			}
			for(int c=0;c<a*2;c++) {
				preFill += " ";
			}
				
			System.out.println(preFill + fill.stripTrailing());
		}
	}
}
