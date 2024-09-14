/**
 * This class basically declairs Arraylist in different way 
 * ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 */

package corejava.java_basic.collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		
		Iterable i = new ArrayList() {{add(1.23); add(10); add("Sri Krishna");}};
		Collection c = new ArrayList();
		List l = new ArrayList();
		ArrayList al1 = new ArrayList();
		
		i.forEach(System.out::println);
		
		ArrayList al2 = new ArrayList();
		al2.add(1); al1.add("Sri Ram"); al2.add(1, 123.456); al2.addAll(List.of(1,2,3)); al2.addAll(1, List.of(9,-9));
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList() {{add("Sri Ram"); add("Sri Krishna");add("Sri Krishna"); add("Sri Hari");}};
		System.out.println(al3);
		
		System.out.println(al3.containsAll(List.of("Sri Hari","Sri Ram"))); //----------- Prints true
		System.out.println(al3.containsAll(List.of("Sri Hari","Sri Lakshmi"))); //----------- Prints false
		
		ArrayList<String> al4= (ArrayList<String>) al3.clone();
		ArrayList<String> al5 = new ArrayList() {{addAll(List.of("Sri Ram", "Sri Krishna", "Sri Krishna", "Sri Hari"));}};
		System.out.println(al3.hashCode());
		System.out.println(al4.hashCode());
		System.out.println(al5.hashCode());
		System.out.println(al3==al4); //--------------- Print false
		System.out.println(al3==al5); //--------------- Print false
		System.out.println(al4==al5); //--------------- Print false
		System.out.println(al3.equals(al4)); //--------------- Print true
		System.out.println(al3.equals(al5)); //--------------- Print true
		System.out.println(al4.equals(al5)); //--------------- Print true
	}
}
