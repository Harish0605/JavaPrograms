package ratan_java;

//final class A{ // by declaring final we can prevent inheritance concept
class A{
	void m1() {
		System.out.println("m1 method");
	}
	void m2() {
		System.out.println("m2 method");
	}
	
}
class B extends A{
	void m3() {
		System.out.println("m3 method");
	}
	void m4() {
		System.out.println("m4 method");
	}
	
}

public class Oops_Inheritance extends B {
	void m5() {
		System.out.println("m5 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A a = new A();
      a.m1();
      a.m2();
      B b = new B();
      b.m1();
      b.m2();
      b.m3();
      b.m4();
      Oops_Inheritance c = new Oops_Inheritance(); // recommended
      c.m1();
      c.m2();
      c.m3();
      c.m4();
      c.m5();
	}

}
