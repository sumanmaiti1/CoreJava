package corejava.java_basic.collections.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

public class List_1 {
	public static void main(String[] args) {
		
		List l111= List.of(-1,0,-2,3,-10,4,1,10,3,40,5,2);
		List l112 = List.of("Jay Shree Krishna","Jay Shree Ram","Jay Shree Krishna","Har Har Mahadev");
		List l113 = List.of(new Customer("Shyam", 1), new Customer("Ram",2));
		
		System.out.println(l111);
		System.out.println(l112);
		System.out.println(l113);
		System.out.println("------------------------------------------------------------");
		
		List l1 = new LinkedList() {{addAll(List.of(-2,-2,90,-78));addAll(List.of(11));}};
		System.out.println(l1);
		
		//------------- add + addAll method -------------------
		System.out.println(l1.add(11111));
		System.out.println(l1);
		l1.add(1,22222);
		System.out.println(l1);
		l1.add(Arrays.asList(-11111,-22222));		
		System.out.println(l1);
		l1.addAll(List.of(0,0));
		System.out.println(l1);
		l1.addAll(2, List.of(-99999,-88888));
		l1.addFirst(12345);
		System.out.println(l1);
		l1.addLast(54321);
		System.out.println(l1);
		System.out.println("------------------------------------------------------------");
		
		//------------ clear Method -------------
		l1.clear();
		System.out.println(l1);
		System.out.println("------------------------------------------------------------");
		
		//------------ contains + contailsAll Method -------------
		l1.addAll(List.of(11,2,3,4,5,-9,-2,7,-3,-3));
		System.out.println(l1);
		System.out.println(l1.contains(l1)); //------------ Prints False
		System.out.println(l1.contains(-3)); //------------- Prints True
		System.out.println(l1.contains(9999)); //------------ Prints False
		
		System.out.println(l1.containsAll(l1)); //------------ Prints true
		System.out.println(l1.containsAll(List.of(1,2,3,4))); //------------ Prints FalPrints truese
		System.out.println(l1.containsAll(List.of(999))); //------------ Prints False
		System.out.println("------------------------------------------------------------");
		
		//------------ forEach Method -------------
		l1.forEach(System.out::print);
		System.out.println("\n------------------------------------------------------------");
		
		//------------ get + getFirst + getLast Method -------------
		System.out.println(l1.get(3));
		System.out.println(l1.get(l1.size()-2));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println("------------------------------------------------------------");
		
		//------------ indexOf + isEmpty + lastIndexOf  Method -------------
		System.out.println(l1.indexOf(-3));
		System.out.println(l1.indexOf(-999)); //------------ This will give -1 as 999 doesn't exist
		System.out.println(l1.isEmpty());
		System.out.println(new ArrayList().isEmpty());
		System.out.println(l1.lastIndexOf(-3));
		System.out.println("------------------------------------------------------------");
		
		//------------ remove + removeAll + removeFirst + removeLast Method -------------
		System.out.println(l1);
		System.out.println(l1.remove(0)); //------------------ remove by Index. returns first element i.e.11
		System.out.println(l1);
		System.out.println(l1.remove(Integer.valueOf(-3))); //------------------ remove by Value.
		System.out.println(l1);
		System.out.println(l1.removeAll(List.of(4,5,99)));
		System.out.println(l1);
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		System.out.println(l1.removeLast());
		System.out.println(l1);
		System.out.println("------------------------------------------------------------");		

		//------------ retainAll + set + size + toArray Method -------------
		l1.addAll(Arrays.asList(56,89,76,45,35,22,16));
		System.out.println(l1);
		System.out.println(l1.retainAll(List.of(22,76,16,-2,-9,7777,3,45))); //------------------ remove by Index. returns first element i.e.11
		System.out.println(l1);
		System.out.println(l1.set(5, 99999));
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.toArray());
		System.out.println("------------------------------------------------------------");	
		
		//------------ listIterator Method -------------
		System.out.println(l1);
		ListIterator litr = l1.listIterator() ;
		litr.add(123);
		System.out.println(l1);
		System.out.println(litr.hasNext());
		System.out.println(litr.next());
		System.out.println(litr.nextIndex());
		System.out.println(litr.hasPrevious());
		System.out.println(litr.previous());
		System.out.println(litr.hasPrevious());
		System.out.println(litr.previous());
		System.out.println(litr.previousIndex());
		System.out.println(litr.hasPrevious());
		System.out.println(litr.next());
		System.out.println(litr.next());
		litr.remove();
		System.out.println(litr.next());
		System.out.println(l1);
		litr.set(789456);
		System.out.println(l1);
		litr.forEachRemaining(System.out::println);
		
		litr = l1.listIterator(3);
		litr.forEachRemaining(System.out::println);
		System.out.println("------------------------------------------------------------");
		
		//------------ replaceAll Method -------------
		l1.replaceAll(new TestUnary());
		System.out.println(l1);
		System.out.println("------------------------------------------------------------");
		
		
		//------------ spliterator Method -------------
		System.out.println(l1.reversed());
		System.out.println(l1);
		Spliterator sitr1 = l1.spliterator();
		Spliterator sitr2 = sitr1.trySplit();
		sitr1.forEachRemaining(System.out::println);
		System.out.println("~~~~~~");
		sitr2.forEachRemaining(System.out::println);		
		System.out.println("------------------------------------------------------------");
		
		//------------ replaceAll Method -------------
		System.out.println(l1.subList(2, 6));
		System.out.println(l1);
		System.out.println("------------------------------------------------------------");
	}
}

//------------------ This Test class is for replaceAll(UnitaryOperator e) method --------------
class TestUnary implements UnaryOperator<Integer>{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t+=100;
	}
	
}


//---------------- Customer Class ------------
class Customer {
	private int custId;
	public int getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	private String name;
	
	 Customer(String name, int custId){
		this.name = name;
		this.custId = custId;
	}
}