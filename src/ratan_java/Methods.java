package ratan_java;
class X{
	
}
class Emp{
	 
}
class Y{
		
}
class Student{
	
}
public class Methods {
	
	//Example-1
//	void m1() { //Instance method
//		System.out.println("m1 method");
//	}
//	static void m2() { //Static method
//		System.out.println("m2 method");
//	}
//
//	public static void main(String[] args) {
//		Methods m = new Methods();
//		m.m1();// calling instance method using object
//		Methods.m2(); // calling static methos using class name
//	}

	//example-2
//	void m1(int a, char ch) { //local variables
//		System.out.println(a);
//		System.out.println(ch);
//	}
//	static void m2(String str, Double d) {
//		System.out.println(str);
//		System.out.println(d);
//	}
//	
//	public static void main(String[] args) {
//		Methods m = new Methods();
//		m.m1(10, 'a');
//		Methods.m2("Harish", 2.5);
//		
//		
//	}
	
	// example-3
	
	
	void m1(X x,Emp e) {
		System.out.println("m1 method");
		
	}
	static void m2(Y y, Student s) {
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		X x = new X();
		Emp e1 = new Emp();
		m.m1(x, e1);
		Y y = new Y();
		Student s = new Student();
		Methods.m2(y, s);
		
	}
	
}
