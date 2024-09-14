// Different constructors of LinkedList
// There are two constructors.
// new LinkedList()
// new LinkedList(Collection c)
// Linked List methods part 1

package corejava.java_basic.collections.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings({"unchecked","deprecation"})
public class LinkedList2 {
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList() {{add(1); add(3); add(9) ; add(-1); add(-2); add(5); add(9); add(5);  add(5); add(5); add(45);}};
		LinkedList ll1 = new LinkedList() {{add("Ram"); add("Shyam"); add("Yadu"); add("Madhu"); add("Ram"); add("Shyam");}};
		LinkedList ll2 = new LinkedList(ll1);
		LinkedList<Integer> ll3 = new LinkedList(al1);
		List ll4 = new LinkedList() {{add("Ram"); add("Shyam"); add("Yadu"); add("Madhu"); add("Ram"); add("Shyam");}};
		
		//---------- Will add all the distinct element ------- 
		System.out.println(ll2.stream().distinct().reduce((s1,s2)-> s1.toString().concat(" ").concat(s2.toString())).get());
		
		System.out.println(ll3);
		ll3.addAll(1, List.of(100,-99,200,-300));
		System.out.println(ll3);
		
		
		//----------- AddFirst and addLast methods
		System.out.println(ll1);
		ll1.addFirst("First");
		ll1.addLast("Last");
		System.out.println(ll1);
		
		//-----------removeFirst , removelast , removeFirstOccurrence , removeLastOccurrence methods
		System.out.println(ll3);
		ll3.removeFirst();
		ll3.removeLast();
		System.out.println(ll3);
		ll3.removeFirstOccurrence(5);
		ll3.removeLastOccurrence(9);
		System.out.println(ll3);
		
		//---------------descendingIterator method. It prints from last element to first
		Iterator<Integer> i = ll3.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		//------------- element() returns the head (First) element of the list
		System.out.println();
		System.out.println(ll3);
		System.out.println(+ ll3.element());
		
		//------------- get , getFirst , getLast method
		System.out.println(ll3.get(2) + " - " + ll3.getFirst() +  " - " + ll3.getLast());
		 
		//-------- Contains, contailsAll method ----------
		System.out.println("List Contains 5: " + ll3.contains(5));
		System.out.println("List Contains 9999: " + ll3.contains(9999));
		System.out.println("Does list contains Collection [-1,3,9,5] : " + ll3.containsAll(List.of(-1,3,9,5)));
		System.out.println("Does list contains Collection [-1,3,-100,5] : " + ll3.containsAll(List.of(-1,3,-100,5)));
		
		//-----------Size method --------------
		System.out.println("Size of List: " + ll3.size());
		
		//----------- IndexOf ------------
		System.out.println("Index of 5 (Exists in the list)= " + ll3.indexOf(5));
		System.out.println("Index of 9999 (Does Not exist in the List)= " + ll3.indexOf(9999));		
		System.out.println("Last Index of 5 (Exists in the list)= " + ll3.lastIndexOf(5));
		System.out.println("Last Index of 9999 (Doesn't Exists in the list)= " + ll3.lastIndexOf(9999));
		
		//------------- Iterator , listIterator-------------
		System.out.println(ll3.iterator().next());
		ll3.listIterator().add(25);
		System.out.println(ll3);
		System.out.println(ll3.listIterator().next());
		System.out.println(ll3.listIterator(3).nextIndex());
		System.out.println(ll3.listIterator(3).next());
		
		//------------- offer, offerFirst, offerlast method ------------
		System.out.println(ll3);
		ll3.offer(140);
		ll3.offerFirst(0);
		ll3.offerLast(1000);
		System.out.println(ll3);
				
	}
}
