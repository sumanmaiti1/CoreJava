/**
 * Supplier interface takes No parameter as input and returns value
 * There are subversions of Consumer for different typer. But their purpose are same
 * eg. Supplier, BooleanSupplier, DoubleSupplier, IntSupplier, LongSupplier etc
 * It has 1 methods 1) get()
 */


package corejava.java_basic.java8.defaultFunctionalInterface;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
		//------------- Supplier ----------------
		Supplier<List<Integer>> supplier1 = ()-> List.of((int)(Math.random()*10), (int)(Math.random()*100));		
		System.out.println(supplier1.get());
		
		//--------------BooleanSupplier ----------------
		BooleanSupplier supplier2 = ()->((int)(Math.random()*10)<5);
		System.out.println(supplier2.getAsBoolean());
		
		//-------------- DoubleSupplier -------------------
		DoubleSupplier supplier3 = ()-> (Math.random()*100);
		System.out.println(supplier3.getAsDouble());
		
		//-------------- IntSupplier -------------------
		IntSupplier supplier4 = ()-> ((int)(Math.random()*100));
		System.out.println(supplier4.getAsInt());
		
		//-------------- LongSupplier -------------------
		LongSupplier supplier5 = ()-> ((long)(Math.random()*100));
		System.out.println(supplier5.getAsLong());
	}
}
