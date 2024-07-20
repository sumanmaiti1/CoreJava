/*The bubble sort algorithm has a worst-case time complexity of O(n^2). 
The bubble sort has a space complexity of O(1).
*/

package corejava.java_basic.dsa.sorting.bubble_sort;

public class BubbleSortIntegerAsc {
	public static void main(String[] args) {
		int[] a = new int[] {23,2,-8,-8,0100,-93,0,456,0};
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
			boolean flag = false;
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
					flag = true; 
				}
			}
			if(flag==false){
				break;
			}
		}
		for(int i:a){
			System.out.print(i + " ");
		}
	}
}
