package japneetSachdeva;
//Print first letter of each word present in string
public class PrintFirstCharInString {
	public static void printFirstChar(String s) {
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i].charAt(0));
		}

	}

	public static void main(String[] args) {
		String s = "Welcome To Tutorials Point";
		String s2 = "geeks for geeks";
		printFirstChar(s);
		printFirstChar(s2);
	}

}
