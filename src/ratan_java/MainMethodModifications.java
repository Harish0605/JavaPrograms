package ratan_java;
class Base{
	public static void main (String[] args) {
		System.out.println("Parent class main method");
	}
}

public class MainMethodModifications extends Base {
//public static void main (String[] args) {
//	//System.out.println("Child class main method");
//	}

	//static public void main(String abc[]) {
	//	static public void main(String[] args) {	 this is allowed
    //synchronized strictfp final static public void main(String[] args) { // this is allowed

	}
// cannot override method
