package corejava.java_basic.array.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Arrays_1 {
	public static void main(String[] args) {
		List<Integer> intList1 = Arrays.asList(1,2,3);
		System.out.println(intList1);
		System.out.println(Arrays.asList("Jay" ,"Shree","Krishna"));
		System.out.println(Arrays.binarySearch(new int[]{1,2,3,4,5},5));
		System.out.println(Arrays.binarySearch(new int[]{1,2,3,4,5},10));
		
		System.out.println("---------------------");
		
		System.out.println(Arrays.compare(new int[] {1,2,3,4}, new int[] {1,2,3,4}));
		System.out.println(Arrays.compare(new int[] {1,2,3,4}, new int[] {1,2,3}));
		System.out.println(Arrays.compare(new int[] {1,2,3}, new int[] {1,2,3,4}));
		System.out.println(Arrays.compare(new int[] {1,2,3}, new int[] {4,5,6}));
		System.out.println(Arrays.compare(new int[] {1,2,3,4}, 0, 2, new int[] {-5,1,2,3,44}, 1, 3));
		
		System.out.println("---------------------");
		
		for(int i:Arrays.copyOf(new int[] {1,2,3,4}, 3)) {
			System.out.println(i);
		}
		
		List intList2 = new ArrayList(Arrays.asList(Arrays.copyOf(new int[] {1,2,3,4}, 3)));
		System.out.println(intList2);		
		System.out.println(Arrays.deepEquals(new Object[] {1, 2,"Sri Ram",4}, new Object[] {1,2,"Sri Ram",4}));
		System.out.println(Arrays.deepEquals(new Object[] {1, 2,"Sri Ram",4}, new Object[] {1,2,"Sri Krishna",4}));		
		System.out.println(Arrays.mismatch(new int[] {1,2,3}, new int[] {1,2,5,4}));		
		System.out.println(Arrays.toString(new int[] {1,3,4,8}));
		System.out.println(Arrays.toString(Arrays.copyOf(new String[] {"Jay","Jay","Shree","Ram"},3)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(new String[] {"Jay","Jay","Shree","Ram"},1,4)));
		
		System.out.println(Arrays.spliterator(new int[] {1,2,3,4,5}));
		
		Arrays.stream(new String[] {"Jay","Jay","Shree","Ram"}).filter(str->(str.length()>2)).collect(Collectors.toList()).
			forEach(str->System.out.print(str + " "));
		
		
		int[] intarr = new int[] {1,2,3,8,-8,7,100,-89};
		Arrays.sort(intarr);		
		System.out.println('\n' + Arrays.toString(intarr));
		
		Arrays.fill(intarr, 0);
		System.out.println( Arrays.toString(intarr));
		
		intarr = new int[] {1,2,3,8,-8,7,100,-89};
		Arrays.parallelSort(intarr, 1, 6);
		System.out.println( Arrays.toString(intarr));
	}
}
