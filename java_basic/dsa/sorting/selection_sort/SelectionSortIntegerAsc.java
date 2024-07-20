/*
* The Selection sort algorithm has a time complexity of O(n^2) and a space complexity of O(1)
*/

package corejava.java_basic.dsa.sorting.selection_sort;

public class SelectionSortIntegerAsc{
	public static void main(String... args){
		int[] a = new int[] {10,-89,0,23,-7,0,9,-0,456,-7};
		int min;
		int temp;
		
		for(int i=0;i<a.length;i++){	
			min = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int num:a){
			System.out.print(num + " " );
		}
	}
}