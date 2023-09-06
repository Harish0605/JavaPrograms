package ratan_java;

class Parent1{
	void m1() {
		System.out.println("m1 method");
	}
	void m2() {
		System.out.println("m2 method");
	}
}

public class Practice extends Parent1 {
	void m3() {
		System.out.println("m3 method");
	}
	void m4() {
		System.out.println("m4 method");
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		

	}

}
