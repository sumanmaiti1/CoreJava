/*The bubble sort algorithm has a worst-case time complexity of O(n^2). 
The bubble sort has a space complexity of O(1).
*/
package corejava.java_basic.dsa.sorting.bubble_sort;

public class BubbleSortStringAsc{
	public static void main(String... args){
		String temp="";
		boolean flag;
		String[] a = new String[] {"Jay", "Shree", "Krishna", "Jay", "Sri", "Ram", "Sumit", "Suman", "A","Z","z"};
		
		for(int i=0; i<a.length; i++){
			temp="";			
			flag = false;
			for(int j=0; j<a.length-1-i;j++){
				if(a[j].compareTo(a[j+1])>0){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(flag ==false){
				break;
			}
		}
		
		for(String name:a){
			System.out.print(name + " ");
		}
	}
}