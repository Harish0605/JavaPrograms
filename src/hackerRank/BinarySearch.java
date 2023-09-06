package hackerRank;
import java.util.*;

public class BinarySearch {
	public static int binarySearch(int[] a,int key) {
		Arrays.parallelSort(a);
		int left=0; int right=a.length-1; int mid=0;
		while(left<=right) {
			mid =(left+right)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key<a[mid]) {
				right = mid-1;			
				
			}
			else {
				left=mid+1;							
			}
			
		}
		return -1;	
		
	}

	public static void main(String[] args) {
		int a[] = {5,9,23,17,34,20,56,78,30,90};
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		int output =binarySearch(a,key);
		System.out.println(output);
	}

}
