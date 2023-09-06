package ratan_java;

//class Emp1{
//	
//}
//class X1{
//	
//}

public class Methods3 {
// Example -1
//	int m1() {
//		System.out.println("m1 int method");
//		return 10;
//	}
//	
//	static char m3() {
//		System.out.println("m3 method");
//		return 'a';
//	}
//
//	public static void main(String[] args) {
//		Methods3 t = new Methods3();
//		int a = t.m1();
//		System.out.println(a);		
//		char ch =Methods3.m3();
//		System.out.println(ch);
//
//	}
	
//Example 2

//Emp1 m1() {	
//	Emp1 e = new Emp1();
//	System.out.println("m1 emp method");	
//	return e;	
//}
//X1 m2() {
//	X1 x = new X1();
//	System.out.println("m2 X method");
//	return x;
//}
//
//public static void main(String[] args) {
//	Methods3 m = new Methods3();
//	Emp1 e=m.m1();
//	System.out.println(e);	// printing hash code of the object
//	X1 x =m.m2();
//	System.out.println(x);   // printing hash code of the object in the output
//}
Methods3 m1() {
	System.out.println("m1 method");
	return this;
}
public static void main(String[] args) {
	Methods3 m= new Methods3();
	Methods3 t = m.m1();
	System.out.println(t);
}
}
