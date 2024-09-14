/**
 * Function is one type of Functional Interface. It takes one or more as input parameneters. It also returns one or more return values.
 * it has 4 methods.  apply(), andThen(), compose(), identity()
 * There are different types ofg Funtions but their purpose are same
 * eg. Function, BiFunction, DoubleFunction , DoubleToIntFunction, DoubleToLongFunction, IntFunction, LongFunction,IntToDoubleFunction, 
 * intToLongFunction, LongFunction, LongTooubleFunction, LongToIntFunction, ToDoubleBiFunction, ToDoubleFunction, ToIntBiFunction
 * ToIntFunction, ToLongBiFunction, ToLongFunction
 */

package corejava.java_basic.java8.defaultFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

@SuppressWarnings({"unchecked","deprecation"})
public class FunctionTest {
	public static void main(String[] args) {
	
		//--------Function ------------
		Function<Integer,Integer> f1 =(x)->(x*10);
		Function<Integer,Integer> f2 =(y)->(y*y);
		Function<Integer,Integer> f3 =(z)->(z-30);
		Function<Short, Integer> f4 = (zz) ->(Integer.valueOf(zz.toString()));
		
		//-------- BiFunction ----------			
		BiFunction<String, String, String> f5 = (i,j)->(Integer.valueOf(Integer.parseInt(i) * Integer.parseInt(j)).toString());
		Function<String,Integer> f6 = (i)->(Integer.valueOf(Integer.parseInt(i)/10));
		
		//----------- DoubleFunction ----------------
		DoubleFunction<String> f7 = x-> (Double.valueOf(Math.sqrt(x)).toString());
		
		//------------ DoubleToIntFunction ------------
		DoubleToIntFunction f8 = (x)->((int)(x*2));
		
		//----------- ToIntBiFunction ---------------
		ToDoubleBiFunction<Double, Integer> f9 = (x,y) -> (x*y);
		
		System.out.println("10 * 5 = " + f1.apply(5));
		System.out.println("Square of the value of (5 ^ 2) * 10 = " + f1.compose(f2).apply(5));
		System.out.println("Square of the value of ((5 ^ 2) * 10) - 30 = " + f1.andThen(f3).compose(f2).apply(5));
		System.out.println("Square of the value of ((5 ^ 2) * 10) - 30 = " + f1.compose(f2).andThen(f3).apply(5));
		
		System.out.println("20 * 12 is = " + f5.apply("20","12"));
		System.out.println("(20 * 12) % 10 is = " + f5.andThen(f6).apply("20","12"));
		System.out.println("Square Root of 36.0 is = " + f7.apply(36.0));
		System.out.println("12.00 * 2 is = " + f8.applyAsInt(12.25));
		System.out.println("12.5 * 2 is = " + f9.applyAsDouble(12.50, 2));
	}
}
