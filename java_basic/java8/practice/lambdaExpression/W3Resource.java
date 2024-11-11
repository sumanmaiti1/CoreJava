// 	https://www.w3resource.com/java-exercises/lambda/index.php


package corejava.java_basic.java8.practice.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class W3Resource {
	public static void main(String[] args) {
		ex_1(1,-45);
		ex_2("Jay Shree Krishna"); ex_2("");
		ex_3(List.of("Sri Hari","Har Har Mahadev","Jay Maa Durga"));
		ex_4(List.of(1,2,3,8,-8,7,-2,-3,100,0,-0));
		ex_5(List.of("Sri Hari","Har Har Mahadev","Jay Maa Durga"));
		ex_6(List.of(1.0,2.2,3.0,8.38,-8.0,7.12,-2.15,-3.1254,100.00,0.0001,-0.325));
		ex_7(List.of(1,2,3,2,4,5,4,6,-1,-3,-2,-1));
		ex_8(-4);
		ex_9(4);ex_9(7);ex_9(9);ex_9(13);
		ex_10("Shree","Ram");
		ex_11(List.of(1,2,3,8,-8,7,-2,-3,100,0,-0));
		ex_12(List.of(1,2,3,8,-8,7,-2,-3,100,0,-0));
		ex_13("Jay Shree Krishna");ex_13("Om");ex_13("");
		ex_14("madam"); ex_14("maadm");
		ex_15(List.of(1,2,3,2,4,5,4,6,-1,-3,-2,-1));
		ex_16("Jay Shree Ram","Ram"); ex_16("Jay Shree Ram","Shyam");ex_16("Ram","Ram"); ex_16("","Ram");
		ex_17(List.of("Sri Hari","Har Har Mahadev","Jay Maa Durga"));
		ex_18(25.00); ex_18(4.84); ex_18(2.0);
		ex_19(List.of(1,2,3,8,-8,7,-2,-3,100,0,-0));
		ex_20(List.of(new Employee(1, "Hari", (byte) 50),new Employee(3, "Shyam", (byte)55),new Employee(2, "Hari", (byte)35)));
		ex_21(0,10);
		ex_22(List.of("RAM","SHYAM","HARI")); ex_22(List.of("ram","shyam","hari"));ex_22(List.of("Ram","Shyam","Hari"));
		ex_23(List.of("RAM","SHYAM","HARI"));
		ex_24(176);
		ex_25(List.of(1,2,3,4,56,100,-9,-5));
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
		
		System.out.println("UpperCase Version is : " + upperFunction.apply(l));
		System.out.println("LowerCase Version is : " + lowerFunction.apply(l));
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
	
	//7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
	private static void ex_7(List<Integer> l) {
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println("Unique values are : " + l.stream().filter(a->hs.add(a)).collect(Collectors.toSet()));
		System.out.println("Unique values are : " + l.stream().distinct().toList());
	}
	
	//8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
	private static void ex_8(int n){
		Function<Integer,Integer> func = a->{
			int fact=1;
			for(int i=a;i>=1;i--) {
				fact*=i;
			} return fact;
		};
		
		System.out.println("Factorial of " + n + " is : " +func.apply(n));
	}

	//9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime. 
	private static void ex_9(int n) {
		Predicate<Integer> p = a->{
			boolean flagmatch = true;
			if(a<=1) {
				flagmatch = false;
			}else{
				for(int i=a-1;i>=2;i--) {
					if(a%i==0) {
						flagmatch = false;
					}
				}
			}
			return flagmatch;
		};
		System.out.println("is " + n + " a prime Number ? " + p.test(n));
	};	

	//10. Write a Java program to implement a lambda expression to concatenate two strings. 
	private static void ex_10(String a, String b) {
		BiFunction<String,String,String> func = (x,y)->(x+ " "+y);
		System.out.println("Concatenated String is : " + func.apply(a, b));
	}

	//11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers. 
	private static void ex_11(List<Integer> l) {
		System.out.println("Maximum Number is : " + l.stream().max(Integer::compareTo).orElseGet(null));
		System.out.println("Mainimum Number is : " + l.stream().min(Integer::compareTo).orElseGet(null));
	}

	//12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
	private static void ex_12(List<Integer> l) {
		System.out.println("Multiplication of all String is : " + l.stream().reduce((i, j)-> Math.multiplyExact(i, j)).orElseGet(null));
		System.out.println("Sum of all String is : " + l.stream().reduce((i, j)-> Math.addExact(i, j)).orElseGet(null));
	}
	
	//13. Write a Java program to implement a lambda expression to count words in a sentence.
	private static void ex_13(String s) {
		Function<String,Integer> func = str->{
			if(str.length()==0) {
				return 0;
			} else {
				if(str.split(" ").length==1) {
					return 1;
				}else {
					return str.split(" ").length;
				}
			}			
		};
		System.out.println("Number of Words in the Sentence [" + s + "] : "  + func.apply(s));
	}
	
	//14. Write a Java program to implement a lambda expression to check if a given string is a palindrome. 
	private static void ex_14(String s) {
		Predicate<String> p = a->{
			return a.equals(new StringBuffer(a).reverse().toString());
		};
		System.out.println("is [" + s + "] Palindrome ? : " + p.test(s));
	}
	
	//15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list. 
	private static void ex_15(List<Integer> l) {
		System.out.println("Sum of squares of all even number is : " + l.stream().filter(i->Math.abs(i)%2==0).map(i->i*i).reduce((i,j)->(i+j)).orElseGet(()->0));
		System.out.println("Sum of squares of all odd number is : " + l.stream().filter(i->Math.abs(i)%2==1).map(i->i*i).reduce((i,j)->(i+j)).orElseGet(()->0));
	}
	
	//16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word. 
	private static void ex_16(String s, String t){
		long count = Arrays.stream(s.split(" ")).toList().stream().filter(a->a.equals(t)).count();
		if(count>=1) System.out.println( t + " is present in " + s);
		else System.out.println( t + " isn't present in " + s);
	}
	
	//17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list. 
	private static void ex_17(List<String> l) {
		System.out.println("Length of Longest String in the List is : " + l.stream().sorted((s1 ,s2)->(Integer.compare(s2.length(), s1.length()))).limit(1).toList());
		System.out.println("Length of Longest String in the List and its length is : " + l.stream().sorted((s1 ,s2)->(Integer.compare(s2.length(), s1.length())))
				.limit(1).collect(Collectors.toMap(Function.identity(), element -> element.length())));
		System.out.println("Length of Smallest String tn the List is : " + l.stream().sorted((s2 ,s1)->(Integer.compare(s2.length(), s1.length()))).limit(1).toList());
		System.out.println("Length of Smallest String in the List and its length is : " + l.stream().sorted((s1 ,s2)->(-Integer.compare(s2.length(), s1.length())))
				.limit(1).collect(Collectors.toMap(Function.identity(), element -> element.length())));
	}
	
	//18. Write a Java program to implement a lambda expression to check if a given number is a perfect square.
	private static void ex_18(Double i) {
		Predicate<Double> p = n->( Math.sqrt(n) * Math.sqrt(n) == n );		
		System.out.println("is " + i + " a perfect square ? : "  +  p.test(i));
	}
	
	//19. Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
	private static void ex_19(List<Integer> l) {
		System.out.println("Second Largest element in the List is : " + l.stream().sorted((s1 ,s2)->(Integer.compare(s2,s1))).limit(2).skip(1).toList());
		System.out.println("Second Smallest element in the List is : " + l.stream().sorted((s1 ,s2)->(Integer.compare(s1,s2))).limit(2).skip(1).toList());
	}

	//20. Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute. 
	//Here we will try sort Employee List based on their Age in Descending Order
	private static void ex_20(List<Employee> emp) {
		System.out.println("Sorted list of employee accoording to Descending Employee Age is : " + 
				emp.stream().sorted((e1,e2)->(Integer.valueOf(e2.getAge()).compareTo(Integer.valueOf(e1.getAge())))).toList());
		
		System.out.println("Sorted list of employee accoording to Descending Employee id is : " + 
				emp.stream().sorted((e1,e2)->(Integer.valueOf(e2.getId()).compareTo(Integer.valueOf(e1.getId())))).toList());
	}

	//21. Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range. 
	private static void ex_21(int startRange, int closeRange){
		Predicate<Integer>  p= i-> {
				boolean flagMatch = true;
				for(int n = i-1; n>=2; n--) {
					if(i%n ==0) {
						flagMatch =false;
						break;
					}
				}
			return flagMatch;
		}; 
		
		//System.out.println("Sum of all Prime number is : " + IntStream.rangeClosed(startRange, closeRange).filter(i->p.test(i)).boxed().toList());
		System.out.println("Sum of all Prime number is : " + IntStream.rangeClosed(startRange, closeRange).filter(i->p.test(i)).sum());
	}
	
	//22. Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase. 
	private static void ex_22(List<String> l) {
		
		Predicate<List<String>> upperCase = list->{return (int) list.stream().filter(s->s.toUpperCase().equals(s)).count()==list.size();};
		Predicate<List<String>> lowerCase = list->{return (int) list.stream().filter(s->s.toLowerCase().equals(s)).count()==list.size();};
		Predicate<List<String>> mixedCase = upperCase.negate().and(lowerCase.negate());
		
		System.out.println("is Uppercase ? " + upperCase.test(l));
		System.out.println("is Lowercase ? " + lowerCase.test(l));
		System.out.println("is Mixedcase ? " + mixedCase.test(l));
	}

	//23. Write a Java program to implement a lambda expression to find the average length of strings in a list.
	private static void ex_23(List<String> list) {
		System.out.println("Average length of strings in a list : " +   list.stream().mapToInt(String::length).average().orElse(0));
	}

	//24. Write a Java program to implement a lambda expression to find the largest prime factor of a given number. 
	private static void ex_24(Integer i) {
		Function<Integer, List<Integer>> function = num -> {
			ArrayList<Integer> l = new ArrayList<Integer>();;
			for(int n= num-1;n>=2;n--) {
				for(int j =2; j<num;j++ )
					if(j*n==num && l.indexOf(n)<0 && l.indexOf(j)<0){
					l.addAll(List.of(j,n));
				}
			}
			return l;
		};
		
		Predicate<Integer> p = n->{
			boolean flagMatch = true;
			for(int k=n-1;k>=2;k--) {
				if(n%k==0) {
					flagMatch= false;
					break;
				}
			} 
			return flagMatch;
		};
		
		System.out.println("largest prime factor is : " + function.apply(i).stream().filter(p).sorted(Comparator.reverseOrder()).limit(1).toList());
	}

	//25. Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation
	private static void ex_25(List<Integer> l) {
		System.out.println("Binary Representation of each Integer is : " + l.stream().collect(Collectors.toMap(Function.identity(),i->Integer.toBinaryString(i))));
	}
}

class Employee{
	private int id;
	private String name;
	private byte age;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public byte getAge() {
		return age;
	}
	public Employee(int id,String name, byte age) {
		this.id=id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "(" + id + "," + name + "," + age + ")"; 
	}
}
