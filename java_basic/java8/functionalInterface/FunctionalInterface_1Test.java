package corejava.java_basic.java8.functionalInterface;

public class FunctionalInterface_1Test implements FunctionalInterface_1{
	public static void main(String[] args) {
		FunctionalInterface_1 fint = new FunctionalInterface_1Test();
		
		fint.m1();		
		FunctionalInterface_1.m2();
		System.out.println(fint.m3(10,20));
	}
	
	// we must override functional Interface method m3
	@Override
	public int m3(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}
}
