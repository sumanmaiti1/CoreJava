package corejava.java_basic.oops.class_object;

public class DemoClassObjectInitializationWithMethods{
	public static void main(String... args){
		pupil s1 = new pupil();
		pupil s2 = new pupil();
		
		//------------ It will print default value fo rthe field datatypes ------------
		s1.showDetails();
		s2.showDetails();
		
		//----------- Initiating object values here by using methods -----------
		s1.enrollStudent(101, "Sri Ramesh", "Science");
		s2.enrollStudent(102, "Sri Durga", "Martial Art");
		
		s1.showDetails();
		s2.showDetails();		
	}
}

class pupil{
	int pupilId;
	String pupilName;
	String departent;
	
	//------- This smethod will initiate the object values--------------
	void enrollStudent(int id, String name, String dept){
		pupilId = id;
		pupilName = name;
		departent =dept;
	}
	
	//------- This smethod will show pupil details --------------
	void showDetails(){
		System.out.println("pupil Name : " + pupilName + "\nId : " + pupilId + "\nDepartment : " + departent);
		System.out.println("----------------------------------------");
	}
}