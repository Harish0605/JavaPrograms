
package ratan_java;
import java.util.*;

public class ArrayRunTimeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = scan.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			System.out.println("Enter the element"+" at index :"+i);
			Scanner scan1 = new Scanner(System.in);
			int num = scan1.nextInt();
			arr[i]=num;
			
		}
		for (int k=0;k<len;k++) {
			System.out.println(arr[k]);
			
		}

	}

}
