package japneetSachdeva;
//Move Negative numbers in start of array
public class MoveAllNegativeToBeginning {

	public static void main(String[] args) {
		int[] a = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			System.out.println(a[i]);
		}

	}
}
