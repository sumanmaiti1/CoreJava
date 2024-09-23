//https://www.w3resource.com/java-exercises/stream/index.php

package corejava.practice.java8.streamAPI;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class W3Resource {
	public static void main(String[] args) {
		List<Integer> ex_1 = List.of(-2,56,43,89,-41,65,23); 
		List<String> ex_2 = List.of("Sri Ram","Sri Krishna");
		List<Object> ex_4 = List.of(1,2,3,-4,-4,3,"Ram","Shyam","Hari","Ram");
		List<String> ex_5 = List.of("Sri Ram","Jay Shree Krishna","Har Har Mahadev","Sita Ram");
		
		ex_1(ex_1);
		ex_2(ex_2);
		ex_3(ex_1);
		ex_4(ex_4);
		ex_5(ex_5);
		ex_6(ex_5);
		ex_7(ex_1);
		ex_8(ex_1);
	}
	
	
	//1. Write a Java program to calculate the average of a list of integers using streams.
	private static void ex_1(List<Integer> l) {
		//System.out.println("Average : " + l.parallelStream().reduce((i,j)->(i+j)).orElseGet(()->0)/l.size());
		System.out.println("Average : " + l.parallelStream().collect(Collectors.averagingDouble(i-> (double)i)) + "\n");
	}
	
	//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
	private static void ex_2(List<String> l) {
		System.out.println("In UpperCase : " + l.stream().map(s->s.toUpperCase()).toList());
		System.out.println("In LowerCase : " + l.stream().map(s->s.toLowerCase()).toList() + "\n");		
	}
	
	//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
	private static void ex_3(List<Integer> l) {
		System.out.println("Sum of even Numbers :" + l.stream().filter(i-> (Math.abs(i) % 2 == 0)).reduce((i,j)->Math.addExact(i, j)).orElseGet(()->0));
		System.out.println("Sum of odd Numbers :" + l.stream().filter(i-> (Math.abs(i) % 2 == 1)).reduce((i,j)->Math.addExact(i, j)).orElseGet(()->0) + "\n");
	}
	
	//4. Write a Java program to remove all duplicate elements from a list using streams. 
	private static void ex_4(List<Object> l) {
		HashSet<Object> s= new HashSet<Object>();
		System.out.println("Duplicate Elements : " + l.stream().filter(e->(!s.add(e))).toList());
		System.out.println("After Removing Duplicate Elements : " + l.stream().collect(Collectors.toSet()));
		System.out.println("After Removing Duplicate Elements : " + l.stream().distinct().toList());
		System.out.println("After Removing Duplicate Elements : " + l.stream().filter(a->Collections.frequency(l, a)<2).toList());
		System.out.println("After Removing Duplicate Elements : " + l.stream().
																			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
																			.entrySet().stream()
																			.filter(entry->(entry.getValue()==1))
																			.map(entry->entry.getKey())
																			.toList()
																			+"\n");
		
	}
	
	
	//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams. 
	private static void ex_5(List<String> l) {
		System.out.println("Words that starts with 'S' are : " + l.stream().filter(a->a.startsWith("S")).toList() + "\n");
	}
	
	//6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams. 
	private static void ex_6(List<String> l) {
		System.out.println("Sorted List in Ascending Order : " + l.stream().sorted((a,b)->(a.compareTo(b))).toList());
		System.out.println("Sorted List in Descending Order : " + l.stream().sorted((a,b)->(b.compareTo(a))).toList());
		System.out.println("Sorted List in String Length Ascending Order : " + l.stream()
										.sorted((a,b)->(Integer.valueOf((a.length())).compareTo(b.length()))).toList());
		System.out.println("Sorted List in String Length Descending Order : " + l.stream()
										.sorted((a,b)->(Integer.valueOf((b.length())).compareTo(a.length()))).toList() + "\n");
	}
	
	//7. Write a Java program to find the maximum and minimum values in a list of integers using streams. 
	private static void ex_7(List<Integer> l) {
		System.out.println("Maximum Number is : " + l.stream().sorted((o1,o2)->(o2.compareTo(o1))).limit(1).toList().get(0));
		System.out.println("Maximum Number is : " + l.stream().max((o1, o2) ->o1.compareTo(o2)).orElseGet(null).toString());
		
		System.out.println("Minimum Number is : " + l.stream().sorted((o1,o2)->(o1.compareTo(o2))).limit(1).toList().get(0));
		System.out.println("Minimum Number is : " + l.stream().max((o2, o1) ->o1.compareTo(o2)).orElseGet(null).toString() + "\n");
	}
	
	//8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
	private static void ex_8(List<Integer> l) {
		System.out.println("Second Smallest Number is : " + l.stream().sorted().limit(2).skip(1).toList().get(0));
		System.out.println("Second Largest is : " + l.stream().sorted((i,j)->(j.compareTo(i))).skip(1).limit(1).toList().get(0));
	}
	
	
}
