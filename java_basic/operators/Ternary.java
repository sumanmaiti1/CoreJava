package corejava.java_basic.operators;

public class Ternary {
	public static void main(String[] args) {
		var temp = ("Suman".contains("S")) ? "Jay Shree Krishna" : 12345;
		var temp1=10.123;
		var temp2 = 12;
		System.out.println(temp);
		
		//------------------ find the greater number between 2 ------------------------
		
		System.out.println((temp1>temp2) ? temp1 : temp2);
	}
}
