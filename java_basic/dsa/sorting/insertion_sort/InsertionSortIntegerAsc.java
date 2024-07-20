/*The insertion sort algorithm has a worst-case time complexity of O(n^2). 
The insertion sort has a space complexity of O(1).
*/

package corejava.java_basic.dsa.sorting.insertion_sort;

public class InsertionSortIntegerAsc{
	public static void main(String... agrs){
		int[] a = new int[] {23,2,-8,-9,100,-93,0,456,0};
		int temp;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int num:a){
			System.out.print(num + " ");
		}
	}
}