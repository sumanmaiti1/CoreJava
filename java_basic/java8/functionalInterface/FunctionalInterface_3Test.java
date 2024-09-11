package corejava.java_basic.java8.functionalInterface;

public class FunctionalInterface_3Test implements FunctionalInterface_3, FunctionalInterface_3Child2, FunctionalInterface_3Child3 {
	public static void main(String[] args) {
		FunctionalInterface_3 fint1 = new FunctionalInterface_3Test();
		FunctionalInterface_3Child2 fint2 = new FunctionalInterface_3Test();
		FunctionalInterface_3Child3 fint3 = new FunctionalInterface_3Test();
		
		fint1.m1();		
		FunctionalInterface_3.m2();
		System.out.println(fint1.m3(22,10));
		
		System.out.println("------------------------------");
		
		fint2.m1_FunctionalInterface_3Child2();
		fint2.m1();
		System.out.println(fint2.m3(30, 20));
		
		System.out.println("------------------------------");
		
		fint3.m1_FunctionalInterface_3Child2();
		fint3.m1_FunctionalInterface_3Child3();
		fint3.m1();
		System.out.println(fint3.m3(-10, 10));
		
	}

	@Override
	public int m3(int i, int j) {
		// TODO Auto-generated method stub
		return (j-i);
	}
	
	// we must override functional Interface method m3

}
