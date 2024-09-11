package corejava.java_basic.collections.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Collection_1 {
	
	public static void main(String[] args) {
		
		Collection c11 = List.of(-3,-1,-2,0,3,5,1,4,2); //--------------- Immutable List
		Collection c12 = List.of("Ram","Shyam","Madhav","Ram","Shyam"); //--------------- Immutable List
		Collection c13 = Arrays.asList(100,101,201,100,151,300);
		Collection c14 = Arrays.asList(new  String[] {"Radhe","Sita"});
		System.out.println(c11); //--------------- Printing Collection objects
		System.out.println(c12); //--------------- Printing Collection objects
		System.out.println(c13); //--------------- Printing Collection objects
		System.out.println(c14); //--------------- Printing Collection objects
		
		System.out.println("------------------------------------------------------");
		
		//--------------- Add methods of Collection --------------
		Collection c = new ArrayList();
		c.add(100); c.add("Ram"); c.add(12.05);
		System.out.println(c); //--------------- Printing Collection objects
		c.addAll(c11); c.addAll(c14);
		System.out.println(c); //--------------- Printing Collection objects
		System.out.println("------------------------------------------------------");
		
		//------------- Clear method. It clears the Collection ---------------
		Collection<Integer> c1 = new ArrayList<Integer>() {{add(1);add(-9);}};
		c1.addAll(List.of(-1,-3,-8,5));
		System.out.println(c1); //--------------- Printing Collection objects
		c1.clear();
		System.out.println(c1); //--------------- This will print Empty collection
		System.out.println("------------------------------------------------------");
		
		//--------------- Contains and Contains All method --------------
		Collection<String> c2= List.of("Sri Ram","Sri Krishna","Sri Hari");
		Collection<String> c21= Arrays.asList("Sri Ram","Sri Krishna","Sri Hari");
		Collection<String> c22= c2;
		Collection<String> c23= new ArrayList<String>() {{add("Sri Ram");}{add("Sri Krishna");}{add("Sri Hari");}};
		
		System.out.println(c2.contains("Sri Ram")); //-------Prints True
		System.out.println(c2.contains("Sri Sita")); //---------- Prints False
		System.out.println(c2.contains(c2)); //---------- Prints False
		System.out.println(c2.containsAll(c2)); //---------- Prints True
		System.out.println(c2.containsAll(List.of("Sri Hari","Sri Krishna"))); //---------- Prints True
		System.out.println(c2.containsAll(List.of("Sri Hari","Sri Radhe"))); //---------- Prints False
		System.out.println("------------------------------------------------------");

		//------------ Equals Method ----------
		System.out.println(c2.equals(c21)); //---------- Prints True
		System.out.println(c2.equals(c22)); //---------- Prints True
		System.out.println(c2.equals(c23)); //---------- Prints True
		System.out.println("------------------------------------------------------");
		
		//------------ HashCode Method ----------
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c21.hashCode());
		System.out.println(c22.hashCode());
		System.out.println(c23.hashCode());
		System.out.println("------------------------------------------------------");
		
		//-------------  forEach method ------------
		c2.forEach(s->System.out.println(s));		
		System.out.println("------------------------------------------------------");
		
		//-------------  GetClass method ------------		
		System.out.println(c2.getClass()); //------- prints class java.util.ImmutableCollections$ListN
		System.out.println(c21.getClass()); //-------prints class java.util.Arrays$ArrayList
		System.out.println(c23.getClass()); //------ prints class corejava.java_basic.collections.Collection.Collection_1$2
		System.out.println("------------------------------------------------------");
		
		//-------------  isEmpty method ------------
		System.out.println(c2.isEmpty()); //----------- Prints False
		System.out.println(new ArrayList().isEmpty()); //----------- Prints True
		System.out.println("------------------------------------------------------");
		
		//-------------  remove method ------------
		//System.out.println(c2.remove("Sri Hari")); //----------- exception because of ava.util.ImmutableCollections$AbstractImmutableCollection
		//System.out.println(c21.remove("Sri Hari")); //----------- exception because of ava.util.ImmutableCollections$AbstractImmutableCollection
		System.out.println(c23); 
		System.out.println(c23.remove("Sri Hari")); //------------ Returns True
		System.out.println(c23);
		System.out.println("------------------------------------------------------");
		
		//-------------  removeAll method ------------		
		System.out.println(c23); 
		System.out.println(c23.removeAll(c2)); //------------ Returns True
		System.out.println(c23);
		System.out.println("------------------------------------------------------");
		
		//-------------  removeIf method ------------		
		Collection<String> c3 = new ArrayList() {{addAll(List.of("Ram","Shyam","Yadu","Madhu","Hari"));}};
		System.out.println(c3);
		System.out.println(c3.removeIf(s->s.toLowerCase().contains("m")));
		System.out.println(c3);
		System.out.println("------------------------------------------------------");
		
		//-------------  retainAll method ------------		
		c3 = new ArrayList() {{addAll(List.of("Ram","Shyam","Yadu","Madhu","Hari"));}};
		System.out.println(c3);
		System.out.println(c3.retainAll(List.of("Ram","Madhu")));
		System.out.println(c3);
		System.out.println("------------------------------------------------------");
		
		//-------------  size method ------------		
		c3 = new ArrayList() {{addAll(List.of("Ram","Shyam","Yadu","Madhu","Hari"));}};
		System.out.println(c3);
		System.out.println("Size = " + c3.size());
		System.out.println("------------------------------------------------------");
		
		//-------------  toString + toArray method ------------		
		System.out.println(c3.toString());
		System.out.println(c3.toArray());
		System.out.println(c3);
		System.out.println("------------------------------------------------------");
		
		//-------------  iterator and it's method ------------	
		System.out.println(c3);
		Iterator itr = c3.iterator();
		System.out.println(itr.getClass());
		System.out.println(itr.hashCode());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.toString());
		itr.forEachRemaining(System.out::println);
		itr.remove();
		System.out.println(c3);
		System.out.println("------------------------------------------------------");
		
		//-------------  parallelStream and Stream method ------------		
		c3 = new ArrayList() {{addAll(List.of("Ram","Shyam","Yadu","Madhu","Hari"));}};
		c3.parallelStream().forEach(System.out::println);
		c3.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------");		
		
		//-------------  spliterator method ------------		
		c3 = new ArrayList() {{addAll(List.of("Ram","Shyam","Yadu","Madhu","Hari"));}};
		Spliterator<String> splitIterator1 = c3.spliterator();
		System.out.println(splitIterator1.characteristics());
		System.out.println(splitIterator1.estimateSize());
		System.out.println(splitIterator1.getExactSizeIfKnown());
		Spliterator<String> splitIterator2= splitIterator1.trySplit();
		splitIterator1.forEachRemaining(System.out::println);
		System.out.println("~~~~~~~");
		splitIterator2.forEachRemaining(System.out::println);
		System.out.println("------------------------------------------------------");
		
		
		}
}