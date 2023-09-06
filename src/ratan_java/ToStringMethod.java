package ratan_java;

public class ToStringMethod {
	public String toString() { // overriding the Object class toString method
	return "emp id";	
	}

	public static void main(String[] args) {
		ToStringMethod t = new ToStringMethod();
		System.out.println(t.toString()); 
		StringBuffer sb = new StringBuffer("harish");
		System.out.println(sb);
		System.out.println(sb.toString()); //hashcode is not printed because toString() is executed from StringBuffer class
        //equals() method
		String s1 = "kumar";
		String s2 = "kumar";
		StringBuffer sb1 = new StringBuffer("test");
		StringBuffer sb2 = new StringBuffer("test");
		System.out.println(s1==s2);
		System.out.println(sb1==sb2); // false 
		//StringBuffer doesnt have equals method hence it executes the object class equals method and compares the reference 
		//but not the content
		//Whereas
		//String class contains equals() which compares the content hence return true
		
	}

}
