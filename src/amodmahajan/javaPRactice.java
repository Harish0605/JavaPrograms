package amodmahajan;

import java.util.*;
public class javaPRactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> arrlst = new ArrayList<>();
		Object[] arr= arrlst.toArray(); // converting list to array
		Arrays.asList(arr);     //Converting array to list
		
		
		arrlst.add("hi");
		arrlst.add("my");
		arrlst.add("name");
		arrlst.add("is");
		arrlst.add("harish");
		
		System.out.println(arrlst);
		arrlst.subList(0, 2).clear(); //remove subList from a list
		
		//Sort an Array
		
		
		
		
	}

}
