package ratan_java;
abstract class Test1{
	abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("m3 normal method");
		
	}
}

public class AbstractClass extends Test1{
	void m1() {
		System.out.println("m1 normal method");
	}
	void m2() {
		System.out.println("m2 normal method");	
	}
	

	public static void main(String[] args) {
		new AbstractClass().m1();
		new AbstractClass().m2();
		new AbstractClass().m3();

	}

}
