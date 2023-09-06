package hackerRank;
import java.util.*;
import java.util.Scanner;

public class StringsLexicographically {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		int len = A.length()+B.length();
		System.out.println(len);
		if(A.compareTo(B)>=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		String sub = A.substring(0, 1).toUpperCase();
		for(int i=1;i<A.length();i++) {
			sub=sub+A.charAt(i);
		}
		String temp = B.substring(0, 1).toUpperCase();
		for(int i=1;i<B.length();i++) {
			temp=temp+B.charAt(i);
		}

		System.out.println(sub+" "+temp);

	}

}
