package rahulShetty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VeevaInterview {

	public static void sortWithList(int[] arr1, int[] arr2) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			li.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			li.add(arr2[i]);
		}
		System.out.println("Before sorting.... " + li);
		// Collections.sort(li);
		// instead of using in-built sort methods, we can try below code to swap
		// but we can not directly swap without using set method for arraylist
		for (int i = 0; i < li.size(); i++) {
			for (int j = i + 1; j < li.size(); j++) {
				if (li.get(i) > li.get(j)) {
					int temp = li.get(j);
					li.set(j, li.get(i));
					li.set(i, temp);

				}
			}
		}
		System.out.println("After sorting.... " + li);

	}

	public static void sortUsingArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		// adding two arrays
		int i = 0;
		int k = 0;
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		int j = 0;
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		// sort them
		for (int a = 0; a < arr3.length; a++) {
			for (int b = a + 1; b < arr3.length; b++) {
				if (arr3[a] > arr3[b]) {
					int temp = arr3[b];
					arr3[b] = arr3[a];
					arr3[a] = temp;
				}
			}
			System.out.println(arr3[a]);
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 1, 9, 4, 8 };
		int[] arr2 = { 2, 7, 3, 6, 12 };
		sortWithList(arr1, arr2);
		sortUsingArray(arr1, arr2);

	}

}
