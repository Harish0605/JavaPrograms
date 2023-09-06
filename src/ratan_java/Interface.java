package ratan_java;
interface ib {
	int a=10;  // by default variables are public static final
	void m1();
	void m2();
}
interface ib1{
	int a =100;
}

public class Interface implements ib,ib1 {
	public void m1() {
		System.out.println("m1 implemenattion");
	}
	public void m2() {
		System.out.println("m2 implemnetation");
	}

	public static void main(String[] args) {
//		new Interface().m1();
//		new Interface().m2();
		//System.out.println(a); a is ambiguous
		//ib.a=ib.a+10;// cannot be modified
		System.out.println(ib.a); // call by using the interface name
		System.out.println(ib1.a);
		
		

	}

}
