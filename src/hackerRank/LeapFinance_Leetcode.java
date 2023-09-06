package hackerRank;
import java.math.*;
public class LeapFinance_Leetcode {
	
	public static void leapFinance(int[] arr, int a,int b,int c) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c) {
						count++;
						System.out.println(arr[i]);
						System.out.println(arr[j]);
						System.out.println(arr[j]);
					}
				}
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		int[] arr = {3,0,1,1,9,7};
		int[] arr1 = {1,1,2,2,3};
	
		leapFinance(arr,7,2,3);
		leapFinance(arr1,0,0,1);

	}

}
