package amodmahajan;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int len = scan.nextInt();
		System.out.println("Enter the number of rotations");
		int n = scan.nextInt();
		System.out.println("Enter the array values");
		//Loop to copy input values to Array
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		//Outer loop to rotate the elements where n stands for rotation
		//Inner loop to shift the elements from index j to index j-1
		// Since we can only shift the values till array length
		//thats why manually copying the last element to arr[0]
		for (int j = 0; j < n; j++) {
			int last = arr[arr.length - 1];
			for (int k = arr.length - 1; k > 0; k--) {
				arr[k] = arr[k - 1];
			}
			arr[0] = last;
		}

		System.out.println();
		//Loop to print the values after rotation
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}

	}

}
