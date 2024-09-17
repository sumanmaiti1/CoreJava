package corejava.practice.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class W3Resource {
	public static void main(String[] args) {
		ex_1(1,-45);
		ex_2("Jay Shree Krishna"); ex_2("");
		ex_3(List.of("Sri Hari","Har Har Mahadev","Jay Maa Durga"));
		ex_4(List.of(1,2,3,8,-8,7,-2,-3,100,0,-0));
		ex_5(List.of("Sri Hari","Har Har Mahadev","Jay Maa Durga"));
		ex_6(List.of(1.0,2.2,3.0,8.38,-8.0,7.12,-2.15,-3.1254,100.00,0.0001,-0.325));
	}
	
	
	//1. Write a Java program to implement a lambda expression to find the sum of two integers. 
	private static void ex_1(int... a) {
		System.out.println("Sum of numbers in List :" + Arrays.stream(a).reduce((i,j)->(Math.addExact(i, j))).orElseGet(()->0));
	}
	
	//2. Write a Java program to implement a lambda expression to check if a given string is empty. 
	private static void ex_2(String s) {
		Predicate<String> isEmpty = a->a.length()==0;
		System.out.println("is " + s + " Empty ? : " + isEmpty.test(s));
	}
	
	//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
	private static void ex_3(List<String> l) {
		List<String> al = new ArrayList<String>();
		Function<List<String> ,List<String> > upperFunction = list-> {
			al.clear();
			for(String s:list) {
				al.add(s.toUpperCase());				
			}
			return al;
		};
		
		Function<List<String> ,List<String> > lowerFunction = list-> {
			al.clear();
			for(String s:list) {
				al.add(s.toLowerCase());				
			}
			return al;
		};
	}

	//4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers. 
	private static void ex_4(List<Integer> l) {
		System.out.println("Odd Numbers are : " + l.stream().filter(i->(Math.abs(i)%2 ==1)).toList());
		System.out.println("Even Numbers are : " + l.stream().filter(i->(Math.abs(i)%2 ==0)).toList());
	}
	
	//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order. 
	private static void ex_5(List<String> l) {
		System.out.println("Sorting in Alphabetical Ascending Order : " + l.stream().sorted().toList());
		System.out.println("Sorting in Alphabetical Descending Order : " + l.stream().sorted((s1,s2)->(s2.compareTo(s1))).toList());
	}
	
	//6. Write a Java program to implement a lambda expression to find the average of a list of doubles. 
	private static void ex_6(List<Double> l) {
		System.out.println("Average of List : " + l.parallelStream().collect(Collectors.averagingDouble(d-> (double)d)));
	}
}
