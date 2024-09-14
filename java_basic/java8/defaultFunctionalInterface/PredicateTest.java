/**
 * Predicate is a type of functional interface that takes oneor more parameter but always returns as boolean
 * It has Test method 
 * There are diff versions of Predicate for different type. But their purpose are same
 * eg. predicate, BiPredicate, IntPredicate,LongPredicate, DoublePredicate  etc
 */

package corejava.java_basic.java8.defaultFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		
		Predicate<Integer> p1 = (i -> (i>5)) ; // to Check if number is greater that 5
		Predicate<Integer> p2 = (i -> (i<50)) ; // to Check if number is less that 50
		Predicate<Integer> p3 =  p1.and(p2); // to Check if number is greater that 5 and less that 50
		Predicate<String> p4 = (s -> (s.contains("Sri"))) ; // to Check if String contains "Sri"
		Predicate<String> p5 = (s -> (s.length()>5)) ; // to Check if String length is greater that 5
		Predicate<String> p6 = p4.or(p5); // to Check if String contains "Sri" OR if String length is greater that 5
		Predicate<Integer> p7 = (i -> (i<0)) ; // to check if number is a negative number
		Predicate<Integer> p8 = p7.negate(); // to check if number is a positive number
		
		//---------------BiPredicate -------------		
		List l1 = List.of(1,2,3,4,5);
		List l2 = Arrays.asList(1,2,3,4,5);
		BiPredicate<List<Integer>,List<Integer>> p9 = (x,y)->(x.equals(y));
		
		//------------ IntPredicate ------------
		int a= ((int)(Math.random()*10));
		IntPredicate p10 = (x)->(x<5);
		
		//------------LongPredicate ------------
		long b = ((int)(Math.random()*100));
		LongPredicate p11 = x-> (x>5);
		
		//------------DoublePredicate ------------
		double c = (Math.random()*100);
		DoublePredicate p12 = x-> (x<50);
		
		System.out.println("4 is greater than 5 ? " + p1.test(4));
		System.out.println("4 is less than 5 ? " + p1.negate().test(4));
		System.out.println("5 is greater than 5 ? " + p1.test(5));
		System.out.println("5 is less than 5 ? " + p1.negate().test(5));
		
		System.out.println("54 is less than 50 ? " + p2.test(54));
		System.out.println("54 is greater than 50 ? " + p2.negate().test(54));
		
		System.out.println("4 is greater than 5 and less than 50 ? " + p3.test(4));	
		System.out.println("14 is greater than 5 and less than 50 ? " + p3.test(14));
		System.out.println("64 is greater than 5 and less than 50 ? " + p3.test(64));
		
		System.out.println("Sri Krishna contains Sri  ? " + p4.test("Sri Krishna"));
		System.out.println("Hare Krishna contains Sri  ? " + p4.test("Hare Krishna"));
		
		System.out.println("Length of Hari is greater than 5 ? " + p5.test("Hari"));
		System.out.println("Length of Sri Hari is greater than 5 ? " + p5.test("Sri Hari"));
		
		System.out.println("Length of Hari is greater than 5  and Hari contains Sri ? " + p6.test("Hari"));
		System.out.println("Length of Sri Hari is greater than 5  and Sri Hari contains Sri ? " + p6.test("Sri Hari"));
		
		System.out.println("is -10 Negative ? " + p7.test(-10));
		System.out.println("is 10 Negative ? " + p7.test(10));
		
		System.out.println("is -10 Positive ? " + p8.test(-10));
		System.out.println("is 10 Positive ? " + p8.test(10));
		
		System.out.println("are Both Lists equal : " + p9.test(l1, l2));
		System.out.println("random integer " + a +  " Less than 5 ? " + p10.test(a));
		System.out.println("random Long " + b +  " greater than 5 ? " + p11.test(b));
		System.out.println("random Double " + c +  " less than 50 ? " + p12.test(c));
	}
}
