package ratan_java;

public class ArraysExample1 {
	
	public static void sumArray(int[] a) {
		int sum=0;
		for(int k:a) {
			sum=sum+k;
		}System.out.println("sum of array elements : "+sum);
	}
	
	public static void greaterElement(int[] a) {
		int max = a[0];
		for(int aa:a) {
			if(aa>max) {
				max=aa;
			}
		}System.out.println("largest element : "+max);
		
	}
	
	public static void smallestElement(int[] a) {
		int min = a[0];
		for(int k: a) {
			if(k<min) {
				min=k;
			}
		}System.out.println("smallest element in array : "+min);
	}

	public static void main(String[] args) {
		int[] arr = {10,20,1,30,40,2,65};
		ArraysExample1.sumArray(arr);
		ArraysExample1.greaterElement(arr);
		ArraysExample1.smallestElement(arr);
	}

}
