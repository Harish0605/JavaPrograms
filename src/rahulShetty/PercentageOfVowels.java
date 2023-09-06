package rahulShetty;

public class PercentageOfVowels {

	public static double percentageCalc(String s) {
		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("Input string must not be empty or null.");
		}

		String vowels = "AEIOUaeiou";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (vowels.contains("" + s.charAt(i))) {
				count++;
			}
		}		

		double percentage = (double) count / s.length() * 100;
		return Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
	}

	public static void main(String[] args) {
		String[] testStrings = { "Google", "Hello World", "OpenAI", "The quick brown fox", "AEIOUaeiou" };
		for (String str : testStrings) {
			System.out.println("Percentage of vowels in '" + str + "': " + percentageCalc(str) + "%");
		}
	}
}
