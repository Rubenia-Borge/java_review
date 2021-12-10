
import java.util.Arrays;
import java.util.*;

public class MergeSort1 {

  public static void main(String[] args)
  {
    int[] array1 = {1, 2, 3, 4,0,0,0};
	int[] array2 = {5, 6, 7};
	int m1 = 4;
	int n2 = 3;
	
	merge(array1,m1,array2,n2);
	 
  }
    
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < n; i++) {
      nums1[i + m] = nums2[i];
    }
    Arrays.sort(nums1);
	//System.out.println(nums1);
	
	for(int i = 0; i < m+n; i++){
	  System.out.println(nums1[i]);
	}
        
  }
}