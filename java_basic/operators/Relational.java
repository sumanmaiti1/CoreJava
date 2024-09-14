package corejava.java_basic.operators;

public class Relational {
	public static void main(String[] args) {
		System.out.println(2>5); //---- false
		System.out.println(2<5); //---- true
		System.out.println(4>=5); //---- false
		System.out.println(2<=5); //---- true
		System.out.println(3>3); //---- false
		System.out.println(3<3); //---- false
		System.out.println(3>=3); //---- true
		System.out.println(3<=3); //---- true
		System.out.println("Jay Shree Krishna"=="Jay Shree Krishna"); //---- true
		System.out.println('a' != 'b'-1); //---- false
		System.out.println(true != false); //---- true
		System.out.println("Jay Shree Krishna" instanceof java.lang.String); //---- true
		System.out.println(new int[]{1,2} instanceof Object); //---- true
	}
}
