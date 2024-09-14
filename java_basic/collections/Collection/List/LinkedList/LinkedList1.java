/**
 * LinkedList extends AbstractSequentialList implements List, Deque, Cloneable, java.io.Serializable
 */
//--------------- This program declairs Linked List------------

package corejava.java_basic.collections.Collection.List.LinkedList;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings({"unchecked","deprecation"})
public class LinkedList1 {	
	public static void main(String[] args) {
		
		Iterable<Integer> ll1 = new LinkedList<Integer>() {{add(1); add(-3); add(4); add(5); add(-1); add(1);}};
		ll1.forEach(System.out::println); //-----------prints linkedlist 
		
		Collection<String> ll2 = new LinkedList<String>() {{add("Sri Ram"); add("Sri Krishna"); add("Sri Ram"); add("Sri Hari"); add("Sri Kalki");}};
		//--- append "Jay " in front of those element whose length is bigger than 7
		ll2.stream().distinct().filter(s->s.length()>7).map(s->"Jay "+s).forEach(System.out::println); 
		
		List<Integer> ll3 = new LinkedList<Integer>() {{add(1); add(-3); add(4); add(5); add(-1); add(1);}};
		System.out.println(ll3.stream().reduce((i,j)->Math.addExact(i, j)).get());
		
		AbstractSequentialList ll4 = new LinkedList<String>() {{add("Sri Ram"); add("Sri Krishna"); add("Sri Ram"); add("Sri Hari"); add("Sri Kalki");}};
		ll4.parallelStream().map(s->"Jay ".concat(s.toString())).forEach(System.out::println);
		
		LinkedList ll5 = new LinkedList() {{add(20); add(-12);add(33);add(-1);add(11);}};
		double d= (double) ll5.stream().collect(Collectors.averagingDouble(ch->Double.parseDouble(ch.toString())));
		System.out.println(d);
		
		Deque ll6 = new LinkedList() {{add(20); add(-12);add(33);add(-1);add(11);}};
		System.out.println(ll6.peekFirst());
		
		Cloneable ll7 = new LinkedList() {{add(20); add(-12);add(33);add(-1);add(11);}};
		System.out.println(ll7.toString());
	}
}
