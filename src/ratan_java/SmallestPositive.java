package ratan_java;

import java.util.Arrays;



public class SmallestPositive {
	public static int small(int[] arr) {
		Arrays.sort(arr);
		int j=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==j) {
				j++;
			}
		}		
		
		return j;		
	}

	public static void main(String[] args) {
		int[] A = {1,3,6,4,1,2};
		int[] B = {1,2,3};
		int[] C = {-1,-3};
		System.out.println(SmallestPositive.small(A));
		System.out.println(SmallestPositive.small(B));
		System.out.println(SmallestPositive.small(C));
		
		

	}

}
