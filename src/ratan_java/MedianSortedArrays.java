
package ratan_java;
import  java.util.*;

public class MedianSortedArrays {
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 double median=0.0;
		 int nums3[] = new int[nums1.length+nums2.length];	
		 for(int i=0;i<nums1.length;i++) {
			 nums3[i]=nums1[i];
		 }
		 for(int k=0;k<nums2.length;k++) {
			 nums3[nums1.length+k]=nums2[k];
		 }
		  Arrays.sort(nums3);
		    if(nums3.length%2==0) {
			  median = nums3[nums3.length/2]+nums3[nums3.length/2-1];
			  return median/2;
		  }
		  else {
			  median = nums3[nums3.length/2];
			  return median;
		  }	 
		 
	        
	    }

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		int[] nums3 = {1,3};
		int[] nums4 = {2};
		Double output = MedianSortedArrays.findMedianSortedArrays(nums1, nums2);
		System.out.println(output);
		Double output1 = MedianSortedArrays.findMedianSortedArrays(nums3, nums4);		
		System.out.println(output1);

	}

}
