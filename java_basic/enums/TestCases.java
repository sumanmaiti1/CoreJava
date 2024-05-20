/**
Purpose : This series is for the core java Batches
This is based on Java 17
Ref Books : Java Complete Reference- Herbert Schildt - 12th Edition
Instructor : Suman Maiti
*/

package com.corejava.enums;

/* This is Demo Enum type Java Program */
public class TestCases{
	public static void main(String[] args){
		TextComplexityPriority tcCmpxPrio = new TextComplexityPriority();
		tcCmpxPrio.complexity = TextComplexityPriority.Complexity.HIGH;
		tcCmpxPrio.priority = TextComplexityPriority.Priority.MEDIUM;
				
		System.out.println("TC Complexity:- " + tcCmpxPrio.complexity + "\nTC Priority:- " + tcCmpxPrio.priority );
	}
}


class TextComplexityPriority{
	enum Complexity{HIGH, MEDIUM, LOW};
	enum Priority{HIGH, MEDIUM, LOW};
	Complexity complexity;
	Priority priority;
}