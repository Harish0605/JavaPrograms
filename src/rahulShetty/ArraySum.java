package rahulShetty;

public class ArraySum {

	private static int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	// create a method which accepts Array and returns sum of all elements in array

	public static void main(String[] args) {
		int[] a = { 10, 11, 12, 13, 14 };
		int[] b = { 10, 20, 30, 40, 50 };
		System.out.println(arraySum(a));
		System.out.println(arraySum(b));

	}

}
