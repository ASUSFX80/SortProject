package select_sort;

import utils.Utils;

/**
 * 选择排序
 * @author tutu
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a =new int[] {88,10,7,77,4,70,2};
		 selectSort(a);
		 Utils.print(a);
	}

	private static void selectSort(int[] a) {
		// TODO Auto-generated method stub
		for(int i = 0;i<a.length;i++) {
			int k = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j] < a[k]) {
					k = j;
				}
			}
			
			if(k != i) {
				int temp = a[i];
			    a[i] = a[k];
			    a[k] = temp;
			}
		}
	}

}
