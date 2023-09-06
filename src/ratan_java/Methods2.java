package ratan_java;

public class Methods2 {
//	void m1() {
//		m2();//calling instance method
//		System.out.println("m1 method");
//		
//	}
//	
//	void m2() {
//		m3(10);
//		System.out.println("m2 method");
//	}
//	
//	void m3(int a) {
//		System.out.println("m3 method");
//	}
//
//	public static void main(String[] args) {
//		Methods2 m = new Methods2();
//		m.m1();
//	}
	
	int x=100,y=200;
	void m1(int x, int y) {
		System.out.println(x+y);
		System.out.println(this.x+this.y); // this keyword is used to call instance variables with same name as local variables 
		
		
	}
	public static void main(String[] args) {
		Methods2 m = new Methods2();
		m.m1(400, 500);
		
	}

}
