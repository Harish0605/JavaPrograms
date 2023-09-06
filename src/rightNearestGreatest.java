import java.util.*;
public class rightNearestGreatest {
	public static void greatestArray(int[] arr) {
		int[] temp = new int[arr.length];
		 temp[temp.length-1]=-1; // last Integer=-1
		 
		 for(int i=0;i<=arr.length-2;i++) {
			 for(int j=i+1;j<=arr.length-1;j++) {
				 if(arr[j]>arr[i]) {
					 temp[i]=arr[j];
					 break;
				 }
				 if(j==arr.length-1) {
					 temp[i]=-1;
				 }
			 }
		 }
		
		System.out.println(Arrays.toString(temp));
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		int[] arr1 = {10,11,12,13,14};   
		int[] arr2 = {14,13,12,11,10};   
		int[] arr3 = {12,14,10,15,11}; 
		int[] arr4 = {12,10,9,8,13}; 
		greatestArray(arr1);
		greatestArray(arr2);
		greatestArray(arr3);
		greatestArray(arr4);
		

	}

}
