package select_sort;

import utils.Utils;

public class HeapSort {

	public static void main(String[] args) {
		 int[] a =new int[] {88,10,7,77,4,70,2};
		 heapAdjust(a);
		 System.out.println("-------打顶堆--------");
		 Utils.print(a);
		 System.out.println("");
		 System.out.println("-------有序数组--------");
		 headSort(a);
		 Utils.print(a);
	}

	/**
	 * 把无序数组调整成大顶堆
	 * @param a
	 */
	private static void heapAdjust(int[] a) {
		// TODO Auto-generated method stub
		for(int end = a.length/2 -1;end >=0;end--) {
			int left = end * 2 + 1;
			int right = end * 2 + 2;
			int max = left;
			if(right <= a.length -1 && a[right] > a[left]) {
				max = right;
			}
			if(a[max] > a[end]) {
				int temp = a[max];
				a[max] = a[end];
				a[end] = temp;
			}
		}
	}
	
	/**
	 * 对大顶堆进行调整，获得有序数组
	 * @param a
	 */
	private static void headSort(int[] a) {
		for(int end = a.length - 1;end > 0;) {
			//把堆顶元素移到数组末尾，把数据末尾元素移到堆顶
		    int temp = a[end];
		    a[end] = a[0];
		    a[0] = temp;
		    //调整堆顶元素到正确的位置
		    adjustHeapTop(a,end--);
		}
	}

	/**
	 * 堆顶元素调整到正确的位置
	 * @param a
	 * @param length
	 */
	private static void adjustHeapTop(int[] a,int length) {
		int parent = 0;//堆顶
		int key = a[parent];
	    while(parent <= length / 2 -1) {	    	
	    	int left = parent * 2 +1;
	    	int right = parent * 2 + 2;
	    	int max = left;
	    	if(right <= length - 1 && a[left] < a[right]) {
	    		max = right;
	    	}
	    	
	    	if(a[max] > key) {
	    		a[parent] = a[max];
		    	parent = max;
	    	}else {
	    		break;
	    	}
	    	
	    }
	    
	    a[parent] = key;
	}
}
