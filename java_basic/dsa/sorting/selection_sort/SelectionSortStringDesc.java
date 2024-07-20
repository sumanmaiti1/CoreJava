/*
* The Selection sort algorithm has a time complexity of O(n^2) and a space complexity of O(1)
*/

package corejava.java_basic.dsa.sorting.selection_sort;

public class SelectionSortStringDesc{
	public static void main(String... args){
		String[] a = new String[] {"Jay", "Shree", "Krishna", "Jay", "Sri", "Ram", "Sumit", "Suman", "A","Z","z"};
		int max;
		String temp;
		
		for(int i=0;i<a.length;i++){
			max =i;
			for(int j=i+1;j<a.length;j++){
				if(a[max].compareTo(a[j])<0){
					max=j;
				}
			}
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
		
		for(String name:a){
			System.out.print(name + " ");
		}
	}
}