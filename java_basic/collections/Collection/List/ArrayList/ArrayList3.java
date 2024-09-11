package corejava.java_basic.collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList<Double> al1 = new ArrayList<Double>();
		al1.addAll(List.of(1.0,-9.11,12.3,-4.56,8.59,7.23,89.12,-100.00));
		
		System.out.println(al1);
		
		//------------------ trimToSize Method -------------
		al1.trimToSize(); //-------------- This trims the capacity of ArrayList to ArraySize
		System.out.println(al1);
		al1.add(78.32);
		System.out.println(al1);
		
		
	}
}
