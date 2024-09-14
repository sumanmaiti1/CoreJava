/**
 * This Program will calculate average mark of each Student and print them in Desending order based on their Avg Number
 */

package corejava.practice.Misc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

@SuppressWarnings({"unchecked", "deprecation"})
public class FindOutTheHighestAvarageOfStudentsInside2DArray{
	public static void main(String[] args) {
		String[][] students = {{"Sri Ram","90"},{"Sri Krishna","98"},{"Sri Ram","95"},{"Sri Ram","100"},{"Sri Krishna","100"},{"Sri Ram","80"},{"Sri Kalki","95"},{"Sri Hari","95"}};
		printAverageNumber(students);
		printAverageNumberWithStudentClass(students);
	}
	
	private static void printAverageNumber(String[][] students) {
		HashMap<String,HashMap<String,Double>> studentMap = new HashMap<String,HashMap<String,Double>>();
		
		for(String[] individualStudentArray: Arrays.asList(students)) {
			if(null==studentMap.get(individualStudentArray[0])) {				
				studentMap.put(individualStudentArray[0], new HashMap<String,Double>(){{put("totalMarks",Double.parseDouble(individualStudentArray[1])); put("subjectCount",1.0); put("average",Double.parseDouble(individualStudentArray[1])); }});
			}else {
				var totalStudentMarks = studentMap.get(individualStudentArray[0]).get("totalMarks") + Double.parseDouble(individualStudentArray[1]) ;
				var subjectCount = (int)(studentMap.get(individualStudentArray[0]).get("subjectCount") + 1);
				var average = totalStudentMarks/subjectCount;
				studentMap.put(individualStudentArray[0], new HashMap<String,Double>(){{put("totalMarks",totalStudentMarks); put("subjectCount",(double)subjectCount); put("average",(double)average);}});
			}
		}
		//System.out.println(studentMap);
		List<String> l= studentMap.entrySet().stream().map(entry->(entry.getValue().get("average") + "-" + entry.getKey())).sorted((s1,s2)->(s2.compareTo(s1)))
				.toList().stream().map(e->(e.split("-")[1] + "-" + e.split("-")[0])).toList();
		System.out.println(l);
	}
	
	private static void printAverageNumberWithStudentClass(String[][] students) {
		Map<String,Student> studentMap = new HashMap() ;
		for(String[] individualStudent : students) {
			if(null==studentMap.get(individualStudent[0])) {
				studentMap.put(individualStudent[0], new Student(individualStudent[0],Double.parseDouble(individualStudent[1]),1));
			} else {
				int noOfSubject = studentMap.get(individualStudent[0]).getNumberOfSubjects() + 1;
				double totalmarks = studentMap.get(individualStudent[0]).getMarks() + Double.parseDouble(individualStudent[1]);
				studentMap.put(individualStudent[0], new Student(individualStudent[0],totalmarks,noOfSubject));
			}
		}
		
		System.out.println(studentMap.entrySet().stream().map(entry->(entry.getValue().getAverage() + "-" + entry.getKey()))
					.sorted(Comparator.reverseOrder()).toList()
					.stream().map(s->(s.split("-")[1]+ "-" + s.split("-")[0])).toList());
	}
}


class Student{
	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public int getNumberOfSubjects() {
		return numberOfSubjects;
	}

	public double getAverage() {
		return average;
	}

	private String name;
	private double marks;
	private int numberOfSubjects;
	private double average;
	
	public Student(String name, double marks, int numberOfSubjects) {
		this.name = name;
		this.marks = marks;
		this.numberOfSubjects =numberOfSubjects;
		this.average = marks/numberOfSubjects;
	}
}