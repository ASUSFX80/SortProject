package switchSort;
/**
 * 快速排序
 * @author tutu
 *
 */
public class QuickSort {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	       int[] a =new int[] {21,9,4,0,2,5,6,7};
	       quickSort(a,0,a.length - 1);
	       for(int t : a) {
			   System.out.print(" " + t + " ");	
		}

	}

	private static void quickSort(int[] a,int low,int heigh) {
		
		if(low >= heigh) {return;}
		int p = partition(a,low,heigh);
		quickSort(a,low ,p-1);
		quickSort(a,p+1 ,heigh);
	}


	private static int partition(int[] a,int low,int heigh) {
	    int t = a[low];
		while(low < heigh) {
			while(low < heigh && a[heigh] >= t) {
				--heigh;
			}
			a[low] = a[heigh];
			
			while(low < heigh && a[low] <= t) {
				++low;
			}
			a[heigh] = a[low];
		}
		
		a[low] = t;
		
		return low;
	}

}
