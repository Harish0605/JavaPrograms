package rahulShetty;

public class TwoDigitIntegerFromString {
	//Greatest two digit Integer From given String
	public static int greatestTwoDigitInteger(String s) {
		int[] arr = new int[s.length() - 1];

		for (int i = 0; i < s.length() - 1; i++) {
			arr[i] = Integer.parseInt(s.substring(i, i + 2));
		}
		for (int k = 0; k < arr.length; k++) {
			for(int j=k+1;j<arr.length;j++) {
				if(arr[k] > arr[j]) {
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length-1];
	}

	public static void main(String[] args) {
		
		String s = "50552";
		String s1 = "068967";
		String s2 = "87929";
		int result = greatestTwoDigitInteger(s);
		System.out.println("Greatest two digit integer is :"+result);
		int result1 = greatestTwoDigitInteger(s1);
		System.out.println("Greatest two digit integer is :"+result1);
		int result2 = greatestTwoDigitInteger(s2);
		System.out.println("Greatest two digit integer is :"+result2);

	}

}
