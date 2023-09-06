package conditional_practice;

import java.util.ArrayList;

public class ArrayListStringReverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("ajay");
		al.add("harish");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
	}

}
