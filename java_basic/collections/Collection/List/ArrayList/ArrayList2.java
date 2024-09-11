//----------------------- Default ArrayList Capacity is 10
//------------------------ When ArrayList Size equals or exceeds the capacity, the capacity is increased by default
//----------------------- Increased capacity formula is         current capacity = (old capacity * 3)/2 + 1

package corejava.java_basic.collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String>() {{addAll(List.of("Sri Ram","Sri Krishna","Sri Hari","Sri Radhe"));}};
		ArrayList al3 = new ArrayList() {{addAll(List.of(11.11,22.22,44.44,999.99,-77.77));}};
		
		System.out.println(al1);
		System.out.println("Default ArayList Size is : " + al1.size());
		al1.addAll(Arrays.asList(-9,5,-3,-7,8,5,1,0,3));
		System.out.println(al1);
		System.out.println("Current ArayList Size is : " + al1.size());	
		al1.add(77);
		System.out.println(al1);
		
		//------------------- ensureCapacity method --------------
		System.out.println("Current ArayList Size is : " + al1.size());	
		al1.ensureCapacity(20);
		System.out.println(al1);
		System.out.println("Current ArayList Size is : " + al1.size());	
		System.out.println("Capacity and Size are different thing");
		
		System.out.println("--------------------------------------");
		
		//---------------------- Sorting ArrayList with Default Natural sorting order ------------
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		System.out.println("--------------------------------------");
		
		//---------------------- Sorting ArrayList with reversed sorting order ------------
		System.out.println(al1);
		Collections.sort(al1, new MyComparator());
		System.out.println(al1);
		//------------- Using lambda expression
		System.out.println(al2);
		al2.sort((s1,s2)->(s2.compareTo(s1)));
		System.out.println(al2);
	}
}


class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	}
}