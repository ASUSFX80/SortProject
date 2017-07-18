package switchSort;

/**
 * 冒泡排序
 * @author tutu
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a =new int[] {6,9,4,0,2,4,6,7};
       bubbleSort(a);
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		if(a == null || a.length <= 1) {
			return;
		}
				
		int i = 0,j = 0;
		int flag = a.length;
		int k = 0;
		
		while(flag > 0) {
			k = flag;
			flag = 0;
			for(i = 1;i < k;i++) {
				if(a[i-1] >= a[i]) {
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					flag = i;
				}
			}
		}
		
		for(int t : a) {
			   System.out.print(" " + t + " ");	
		}
	}
}
