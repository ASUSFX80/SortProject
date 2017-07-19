package merge_sort;

import utils.Utils;

/**
 * 归并排序
 * 空间复杂度：O(n),需要一个辅助的数组来存放合并两个有序表之后生成的新表，故归并排序不是就地排序 
 * 时间复杂度：最好，最坏，平均时间复杂度均是O(nlogn) 
 * 稳定性：归并排序是稳定的排序算法 
 * 思想：将两个或两个以上的有序表合并为一个新的有序表，递归的思想 
 * @author tutu
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a =new int[] {88,10,99,2,53,11,3,65,1,1};
		 int[] result = mergeSortR(a,0,a.length - 1);
		 Utils.print(result);
	}
	

	static int[] mergeSortR(int[] data,int low,int high) {
		
		if(low < high) {
			int mid = (low + high) / 2;
			int[] m1 = mergeSortR(data,low,mid);
			int[] m2 = mergeSortR(data,mid+1,high);
			return merge(m1,m2);
		}
		return new int[] {data[low]};
	
	}

	static int[] merge(int[] m1,int[]m2) {
		
		int size = m1.length + m2.length;
		int[] result = new int[size];
		int i1 = 0;
		int i2 = 0;
		int k = 0;
		while(i1 < m1.length && i2 < m2.length) {
			if(m1[i1] <= m2[i2]) {
				result[k++] = m1[i1++];
			}else {
				result[k++] = m2[i2++];
			}
		}
		
		while(i1 < m1.length) {
			result[k++] = m1[i1++];
		}
		
		while(i2 < m2.length) {
			result[k++] = m2[i2++];
		}
		return result;
	}
}
