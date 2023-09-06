package japneetSachdeva;
//Find largest, 2nd largest and smallest numbers
public class Largest_SmallestInArray {

	public static void main(String[] args) {
		int[] arr = { 55, 10, 8, 90, 43, 87, 95, 25, 50, 12 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("Largest element is "+arr[arr.length-1]);
		System.out.println("Smallest element is "+arr[0]);
		System.out.println("Second Largest element is "+arr[arr.length-2]);
		System.out.println("Second Smallest element is "+arr[1]);

	}

}
