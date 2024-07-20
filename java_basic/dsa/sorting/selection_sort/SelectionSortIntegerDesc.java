/*
* The Selection sort algorithm has a time complexity of O(n^2) and a space complexity of O(1)
*/

package corejava.java_basic.dsa.sorting.selection_sort;

public class SelectionSortIntegerDesc{
	public static void main(String... args){
		int[] a = new int[] {10,-89,0,23,-7,0,9,-0,456,-7};
		int max;
		int temp;
		for(int i=0;i<a.length;i++){
			max=i;
			for(int j=i+1;j<a.length;j++){
				if(a[max]<a[j]){
					max=j;
				}				
			}
			temp = a[i];
			a[i]=a[max];
			a[max] =temp;
		}
		for(int num:a){
			System.out.print(num + " ");
		}
	}
}