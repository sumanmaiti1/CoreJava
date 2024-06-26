package corejava.java_basic.operators;

public class Logical {
	public static void main(String[] args) {
		
		var temp = 'z'+ 1;
	
		if((3>2) && ('z'> 'a')) {System.out.println("Hurray I am Executed first timer");}
		if(("Krishna".contains("z")) && ('z'> 'a')) {System.out.println("Hurray I am Executed second time");}
		
		if((3<2) || ('z'> 'a')) {System.out.println("Hurray I am Executed third time");}
		if((3>temp) || (temp < 'a')) {System.out.println("Hurray I am Executed fourth time");}
		
		System.out.println(!false);
		
	}
}
