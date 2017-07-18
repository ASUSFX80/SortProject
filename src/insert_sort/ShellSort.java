package insert_sort;

import utils.Utils;
/***
 * Shell排序
 * @author tutu
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a =new int[] {88,10,7,77,4,70,2};
		 shellSort(a);
		 Utils.print(a);
	}

	private static void shellSort(int[] a) {
		// TODO Auto-generated method stub
		for(int gap = a.length/2 ; gap > 0 ; gap /= 2) {
			for(int i = gap;i<a.length;i++) {
				int k = a[i];
				int j = i-gap;
				for(;j >= 0 && a[j] > k;j -= gap) {
					a[j+gap] = a[j];
				}
				a[j+gap] = k;
			}
			
		}
	}

}
