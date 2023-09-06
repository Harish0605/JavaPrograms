package runningNotesJava;

//check whether the surname is Singh and print them
public class SubStringExample {

	public static void main(String[] args) {
		String str[] = { "Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli",
				"Rohit Sharma", "Sandeep Singh", "Milkha Singh" };
		String surName = "Singh";
		
// Using subString() method
		for (int j = 0; j < str.length; j++) {
			String subStr = str[j].substring(str[j].length() - surName.length());
			if (subStr.equals(surName)) {
				System.out.println(str[j]);
			}
		}
// Using contains() method
//		for(int i=0;i<str.length;i++) {
//			if(str[i].contains(surName)) {
//				System.out.println(str[i]);
//			}
//		}

	}

}
