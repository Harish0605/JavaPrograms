package amodmahajan;

public class sortSentence {

	public static String sort(String s) {
		String[] arr = s.split(" ");
		String Output = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int a = Integer.parseInt(arr[i].substring(arr[i].length() - 1));
				int b = Integer.parseInt(arr[j].substring(arr[j].length() - 1));
				if (a > b) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			Output = Output + arr[i].substring(0, arr[i].length() - 1) + " ";
		}
		return Output.trim();
	}

	public static void main(String[] args) {
		String a = "is2 sentence4 This1 a3";
		String b = "Myself2 Me1 I4 and3";
		String c = "are2 You1 awesome3";
		System.out.println(sort(a));
		System.out.println(sort(b));
		System.out.println(sort(c));
	}

}
