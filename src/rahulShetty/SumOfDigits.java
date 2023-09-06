package rahulShetty;

public class SumOfDigits {

	public static int digitsum(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 756;
		System.out.println(digitsum(num));
		int num2 = 3;
		System.out.println(digitsum(num2));
		int num3 = 301;
		System.out.println(digitsum(num3));
		int num4 = 10;
		System.out.println(digitsum(num4));

	}

}
