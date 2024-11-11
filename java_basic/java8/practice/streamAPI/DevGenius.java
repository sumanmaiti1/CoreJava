//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062?gi=b2d47f95383d

package corejava.java_basic.java8.practice.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DevGenius {
	public static void main(String... args) {
		ex_1(List.of(1,2,3,8,-8,-3,100));
		ex_2(Arrays.asList(1,2,3,4,15,-45,78,321,101,-123));
		ex_3(List.of(1,2,3,4,9,1,5,3,8,4,-9,-8,7,-3,-9));
		ex_4(List.of(1,2,3,4,9,1,5,3,8,4,-9,-8,7,-3,-9));
		ex_5(List.of(1,2,3,4,9,1,5,3,8,4,-9,-8,7,-3,-9));
		ex_6(List.of(9,-8,7,-3,-9));
		ex_7("Jay Shree Krishna");
		ex_8("Jay Shree Krishna");
		ex_9(List.of(1,2,3,4,9,1,5,3,8,4,-9,-8,7,-3,-9));
		ex_11(new int[] {1,2,3});
		ex_13(List.of(1,2,3), Arrays.asList("Ram","Shyam","Hari"));
		ex_14(List.of(1,2,3,4,9,1,5,3,8,4,-9,-8,7,-3,-9));
		ex_15(new int[] {1,5,3});
		ex_16(Arrays.asList("Ram","Shyam","Hari"));
		ex_17(List.of(new Order(1,"Pen",2,20), new Order(1,"Pen",2,200) , new Order(1,"Pen",3,20) , new Order(1,"Pencil",2,10), new Order(1,"Pencil",2,10)));
	}
	
	//1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	private static void ex_1(List<Integer> list) {
		System.out.println("Even Numbers in the List are : " + list.stream().filter(i-> i%2==0).toList() + "\n");
	}
	
	//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	private static void ex_2(List<Integer> list) {
		System.out.println("Numbers that starts with 1 are : " + list.stream().filter(i-> (Math.abs(i) + "").startsWith("1")).toList() + "\n");
	}
	
	//3. How to find duplicate elements in a given integers list in java using Stream functions?
	private static  void ex_3(List<Integer> list) {
		HashSet<Integer> s= new HashSet<Integer>();		
		System.out.println("Duplicate elements are : " + list.stream().filter(i-> !s.add(i)).toList());
		System.out.println("unique elements are : " + s);
		System.out.println("unique elements are : " + list.stream().distinct().toList());
		
		System.out.println("Duplicate elements are : " + list.stream().filter(i->Collections.frequency(list, i)>=2).distinct().toList());
		System.out.println("Non Repeatating elements are : " + list.parallelStream().filter(i->Collections.frequency(list, i)==1).distinct().toList());
		
		System.out.println("Duplicate elements are : " + list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toList())
				);
		
		System.out.println("unique elements are : " + list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().map(entry->entry.getKey()).toList()
				);
		
		System.out.println("Repeatating elements are : " + list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).toList() + "\n"
				);
	}
	
	//4. Given the list of integers, find the first element of the list using Stream functions?
	private static void ex_4(List<Integer> list) {
		System.out.println("First element is : " + list.stream().limit(1).toList() + "\n");
	}
	
	//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
	private static void ex_5(List<Integer> list) {
		System.out.println("Total number of elements present in the list : " + list.stream().count() + "\n");
	}
	
	//6. Given a list of integers, find the maximum value element present in it using Stream functions?
	private static void ex_6(List<Integer> list) {
		System.out.println("Maximum Value isn the List is : " + list.stream().max(Comparator.naturalOrder()).orElseGet(()->0) + "\n");
	}
	
	//7. Given a String, find the first non-repeated character in it using Stream functions?
	private static void ex_7(String str) {
		System.out.println("First Non repeated Character is : " + str.chars().boxed().collect(
				Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting())).entrySet()
				.stream().filter(entry->entry.getValue()==1).map(entry->(char)(int)entry.getKey()).limit(1).toList()
				);
	}
	
	//8. Given a String, find the first repeated character in it using Stream functions
	private static void ex_8(String str) {
		System.out.println("First repeated character : " +  str.chars().mapToObj(c-> (char)(c)).collect(
				Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1).map(entry -> entry.getKey())
				.limit(1).toList() + "\n"
				);
	}
	
	//9. Given a list of integers, sort all the values present in it using Stream functions
	//10. Given a list of integers, sort all the values present in it in descending order using Stream functions
	private static void ex_9(List<Integer> list) {
		System.out.println("Sorted in ascending order : "+ list.stream().sorted().toList());
		System.out.println("Sorted in Descending order : "+ list.stream().sorted(Comparator.reverseOrder()).toList() + "\n");

	}
	
	//11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	private static void ex_11(int[] arr) {
		var bool =(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==1).toList().size()==arr.length)?false:true ;
		System.out.println(bool + "\n");
	}
	
	//13. Write a Java 8 program to concatenate two Streams?
	private static void ex_13(List a,List b) {
		Stream stream1= a.stream();
		Stream stream2= b.stream();
		Stream stream3= Stream.concat(stream1, stream2);
		stream3.forEach(s->System.out.print(s+ " "));
		System.out.println();
	}
	
	//14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
	private static void ex_14(List<Integer> list) {
		System.out.println("\nCube of Individual elements which are greater that 50 : " + list.stream().map(i -> Math.pow(i, 3)).filter(i->i>50).toList() + "\n");
	}
	
	
	//15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
	private static void ex_15(int[] arr) {
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("\n");
	}
	
	//16. How to use map to convert object into Uppercase in Java 8?
	
	private static void ex_16(List<String> list) {
		System.out.println("Upper Case Version : " + list.stream().map(String::toUpperCase).toList());
	}
	
	//17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
	//We will consider an order duplicate if oreder item, itemcount and prices are same
	private static void ex_17(List<Order> list) {
		//System.out.println("Duplicate Objects : " + list.stream().filter((Order o1,Order o2)-> o1.equals(o2)));
	}
}


class Order{
	
	int orderId;
	String item;
	int itemCount;
	double price;
	
	public Order(int orderId, String item, int itemCount, double price) {
		this.orderId = orderId;
		this.item = item;
		this.itemCount = itemCount;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "(" + orderId + "," + item + "," + itemCount + "," + price + ")";
	}
	
	public boolean equals(Order order) {
	 if(this.item.equals(order.item) && this.itemCount==order.itemCount && this.price == order.price ) {
		 return true;
	 } else return false;
	}
	 
	@Override
	public int hashCode() {
		return Objects.hash(item, itemCount, price);
	 
	}
	
}
