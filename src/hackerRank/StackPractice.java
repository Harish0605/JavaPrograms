package hackerRank;
import java.util.*;
public class StackPractice {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		String a = "({()})";
		String b = "{}(";
		s.push(a);
		s.push(b);
		
		System.out.println(s);
		System.out.println(s.peek());
	   
	}

}
