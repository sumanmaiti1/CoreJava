/**
 * Consumer interface takes one parameter as input and returns nothing
 * There are subversions of Consumer for different typer. But their purpose are same
 * eg. Consumer , BiConsumer , DoubleConsumer, intConsumer, longConsumer, objDoubleConsumer etc
 * It has 2 methods 1) accept() 2) andThen
 */

package corejava.java_basic.java8.defaultFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;

@SuppressWarnings({"uncheked","deprecation"})
public class ConsumerTest {
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList(Arrays.asList(1,2,3,4,5,67,89,-2,7,-6,-2));
		List<Integer> l2 = List.of(1,2,3,4,5);
		List<String> l3 = List.of("One","Two","Three","Four","Five");
		
		//---------- Simple Consumer ------------
		Consumer<List<Integer>> consumer1 = l-> l.stream().map(i -> i+ "-").forEach(System.out::print);;
		consumer1.accept(l1);
		
		System.out.println();
		
		//-------- BiConsumer ---------
		BiConsumer<List<String>, List<Integer>> consumer2 = (x,y) -> {
				for(int i=0;i<=x.size()-1;i++) {
					System.out.println(x.get(i) + " : " + y.get(i));
				}
		};
		
		BiConsumer<List<String>, List<Integer>> consumer3 = (x,y) -> {
			x.stream().forEach(System.out::println);
			y.stream().forEach(System.out::println);
			};
			
		consumer2.accept(l3, l2);
		consumer2.andThen(consumer3).accept(l3, l2);
		
		//-----------ObjDoubleConsumer --------------
		ObjDoubleConsumer<String> consumer4 =(x,y)-> System.out.println(Integer.parseInt(x)+y);
		consumer4.accept("88",12.00);
		
	}
}
