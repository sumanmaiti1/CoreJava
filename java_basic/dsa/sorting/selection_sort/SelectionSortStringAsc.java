/*
* The Selection sort algorithm has a time complexity of O(n^2) and a space complexity of O(1)
*/

package corejava.java_basic.dsa.sorting.selection_sort;

public class SelectionSortStringAsc{
	public static void main(String... args){
		String[] a = new String[] {"Jay", "Shree", "Krishna", "Jay", "Sri", "Ram", "Sumit", "Suman", "A","Z","z"};
		int min;
		String temp;
		
		for(int i=0;i<a.length;i++){
			min = i;
			for(int j=i+1;j<a.length;j++){
				if(a[min].compareTo(a[j])>0){
					min=j;
				}				
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(String name:a){
			System.out.print(name + " ");
		}
	}
}