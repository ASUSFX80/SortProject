package insertSort;

import utils.Utils;

/**
 * 直接插入排序
 * @author tutu
 *
 */
public class SimpleInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a =new int[] {88,10,7};
		 simpleSort(a);
		 Utils.print(a);
	}

	public static void simpleSort(int[] a) {
	    if(a== null || a.length <= 1) {return;}
	    		
		for(int j = 1;j<a.length;j++) {
			int i = j-1;
			int temp = a[j];
			while(i >=0 && a[i] > temp) {
				a[i+1] = a[i];
				i--;
			}
		
			a[++i] = temp;
		}
	}
	
	/**
	 * 改进，二分插入排序法
	 */
	public static void BinSimSort(int[] a) {
		  if(a== null || a.length <= 1) {return;}
  		    //普通直接插入
			/*for(int j = 1;j<a.length;j++) {
				int i = j-1;
				int temp = a[j];
				while(i >=0 && a[i] > temp) {
					a[i+1] = a[i];
					i--;
				}
			
				a[++i] = temp;
			}*/
		  //利用二分插入法
		  for(int j = 1;j<a.length;j++) {
				int temp = a[j];
				int pos = binInsert(a,0,j-1,temp);
				int i = j-1;
			    for(;i>=pos;i--) {
			    	a[i+1] = a[i];
			    }
				a[++i] = temp;
			}  
	}
	
	public static int binInsert(int[] a,int low,int heigh,int num) {
		if(a == null || a.length <= 1) {return 0;}
		
		if(low >= heigh) {return low;}
	
		while(low < heigh) {
			int center = (low + heigh) / 2;
			
			if(a[center] == num) {
				return center;
			}if(num < a[center]) {
				heigh = center - 1;
            }else {
            	low = center + 1;
            }
		}
		
		 return low;
	}
}
