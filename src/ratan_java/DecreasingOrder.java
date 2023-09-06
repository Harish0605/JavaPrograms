package ratan_java;

import java.util.Arrays;
import java.util.Random;

public class DecreasingOrder {
	
//public int removeDuplicates(int[] nums) {

//	
//
//
//
//return 1;
//}

	public static void main(String[] args) {
		int count=0; int value=0;
		//int[] nums = {1,1,2};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					nums[j]=101;
				}
			}
		}
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==101) {
				count++;
			}
		}
		value = nums.length-count;
		
		System.out.println(value);
		

	}

}
