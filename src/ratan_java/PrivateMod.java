package ratan_java;
class H{
	 //private void m1() {
	void m1() {
		System.out.println("m1 parent class method");
	}
}

public class PrivateMod extends H {
	 void m1() {
		System.out.println("m1 child class method");
	}

	public static void main(String[] args) {
		PrivateMod a = new PrivateMod();
		a.m1(); // here its not overriding and specific to child class as the method is private 
		// a.m1(); // Unresolved compilation problem:  private modifier 
		//The method m1() from the type H is not visible

	}

}
