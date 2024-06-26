package corejava.java_basic.operators;

public class Bitwise {
	public static void main(String[] args) {
		System.out.println(2&2);
		System.out.println(10&3);
		System.out.println(-10&2);
		System.out.println(-10&-10);
		
		System.out.println(2|2);
		System.out.println(10|4);
		System.out.println(-10|2);
		System.out.println(-10|-10);
		
		System.out.println(2^2);
		System.out.println(10^2);
		System.out.println(-10^2);
		System.out.println(-10^-10);
		
		System.out.println(~-10);
	}
}
