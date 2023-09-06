package amodmahajan;

import java.util.ArrayList;
import java.util.List;

public class makeStringGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leEeetcode";
		List<Character> li = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			li.add(s.charAt(i));
		}
		System.out.println(li.toString());

	}

}
