// Different constructors of LinkedList
// There are two constructors.
// new LinkedList()
// new LinkedList(Collection c)
// Linked List methods part 1

package corejava.java_basic.collections.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

@SuppressWarnings({"unchecked","deprecation"})
public class LinkedList3 {
	public static void main(String[] args) {
		
		LinkedList ll1 =new LinkedList(new ArrayList() {{add(1); add(3); add(9) ; add(-1); add(-2); add(5); add(9); add(15);  add(5); add(25); add(45);}});		
		List ll2 = new LinkedList() {{add("Ram"); add("Shyam"); add("Yadu"); add("Madhu"); add("Ram"); add("Shyam");}};
		
		//---------- parallel Stream ------- 
		System.out.println("Sum using ParallelStream : " + ll1.parallelStream().reduce((i,j)->(Math.addExact((int)i, (int)j))).get());
		
		//---------- peek, peekFirst, peekLast --------------
		System.out.println(ll1);
		System.out.println("Peek : " + ll1.peek());
		System.out.println("PekFirst : " + ll1.peekFirst());
		System.out.println("PeekLast : " + ll1.peekLast());
		System.out.println(ll1);
		
		//----------- poll, pollFirst, pollLast -------------
		System.out.println(ll1.poll());
		System.out.println(ll1.pollFirst());
		System.out.println(ll1.pollLast());
		System.out.println(ll1);
		
		//---------- pop ------------
		System.out.println("Pop : " + ll1.pop());
		System.out.println(ll1);
		
		//------------ remove, removeFirst, removeLast, removeAll, removeIf, removeFirstOccurrence, removelastOccurrence
		ll1.addAll(List.of(12,-13,14,-15,16,-17,18,19,20));
		System.out.println(ll1);
		System.out.println("remove Head element : " + ll1.remove());
		System.out.println("remove First element : " + ll1.removeFirst());
		System.out.println("remove third element : " + ll1.remove(2));
		System.out.println("remove element as Object : " + ll1.remove(Integer.valueOf(19)));
		System.out.println(ll1.removeAll(List.of(25,18)));
		System.out.println("Removes odd elements : " + ll1.removeIf(i->Math.abs((int) i)%2==1));
		System.out.println(ll1);
		ll1.addAll(Arrays.asList(-1,64,-83,-22,10,-29,74,5,4, 6, 5, 6, 8));
		System.out.println(ll1);
		ll1.removeFirstOccurrence(6);
		ll1.removeLastOccurrence(6);
		System.out.println(ll1);
		
		//------------- retainAll ---------------
		System.out.println(ll1.retainAll(Arrays.asList(64,-83,-22,-29,74,5,4, 6, 5, 8)));
		System.out.println(ll1);
		
		//-------------- set method -----------
		System.out.println(ll1.set(1, -999));
		System.out.println(ll1);
		
		//-------------- reversed method -----------
		System.out.println(ll1.reversed());
		System.out.println(ll1);
		//-------------- subList method -----------
		System.out.println(ll1.subList(1, 7));
		
		//------------- push mehod -------------
		ll1.push(12345);
		System.out.println(ll1);
		
		//-------------- replaceAll --------------
		ll1.replaceAll(n-> ((int)n*-1));
		System.out.println(ll1);
		
		//------------ sort method ---------------
		ll1.sort((o1, o2) -> ((Integer) o2).compareTo((Integer)o1) );
		System.out.println(ll1);
		
		//--------------- Clear Method ------------
		ll1.clear();
		System.out.println(ll1);
	}
}
