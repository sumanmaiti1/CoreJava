/**
 * UnaryOPerator is a type of functional interface that takes one or more parameter as returns the same type
 * It has Apply , andThen, Compose method
 * There are diff versions of UnaryOperator for different type. But their purpose are same
 * eg. DoubleUnaryOperator, UnaryOperator, IntUnaryOperator, LongUnaryOperator, etc
 */
package corejava.java_basic.java8.defaultFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		
		
		//---------------- UnaryOperator -----------------
		List<Integer> l1 = Arrays.asList(-15,-12,-10,-8,-5,-2,0,1,2,3,4,5,6,7,9,10,11,12,14,15); 
		UnaryOperator<Boolean> u1 = x-> !x;
		UnaryOperator<List<Integer>> u2 = x->x.stream().map(i->i*i).toList();
		UnaryOperator<List<Integer>> u3 = x->x.stream().map(i->i+i).toList();
		UnaryOperator<List<Integer>> u4 = x->x.stream().filter(i->i>100).toList();
		
		System.out.println("Opposite if true is : " + u1.apply(2<3));
		System.out.println("Opposite if false is : " + u1.apply(2>3));
		System.out.println("square value of each number in List \n" + l1 + " is : " + u2.apply(l1));
		System.out.println("2 * [square value of each number in List] \n" + l1 + " is : " + u2.andThen(u3).apply(l1));
		System.out.println("Number those are Greater than 100 in [2 * [square value of each number in List]] \n" + l1 
				+ " is : " + u2.andThen(u3).andThen(u4).apply(l1));
		
	}
}
