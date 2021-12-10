import java.util.Arrays;
import java.util.*;

public class MergeSort2 {

  public static void main(String[] args)
  {
    int[] array1 = {1, 2, 3, 4,0,0,0};
	int[] array2 = {5, 6, 7};
	int m1 = 4;
	int n2 = 3;
	
	merge(array1,m1,array2,n2);
	 
  }
    
  public static void merge1(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < n; i++) {
      nums1[i + m] = nums2[i];
    }
    Arrays.sort(nums1);
	//System.out.println(nums1);
	
	for(int i = 0; i < m+n; i++){
	  System.out.println(nums1[i]);
	}
        
  }
   
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // Make a copy of the first m elements of nums1.
    int[] nums1Copy = new int[m];
    for (int i = 0; i < m; i++) {
      nums1Copy[i] = nums1[i];
    }

    // Read pointers for nums1Copy and nums2 respectively.
    int p1 = 0;
    int p2 = 0;
                
    // Compare elements from nums1Copy and nums2 and write the smallest to nums1.
    for (int p = 0; p < m + n; p++) {
      // We also need to ensure that p1 and p2 aren't over the boundaries
      // of their respective arrays.
      if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
        nums1[p] = nums1Copy[p1++];
      } else {
        nums1[p] = nums2[p2++];
      }
    }
	
	for(int i = 0; i < m+n; i++){
	  System.out.println(nums1[i]);
	}
  }

}