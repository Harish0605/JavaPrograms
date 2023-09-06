package ratan_java;
interface It1{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
}
class Adap implements It1{ // Adapter class that has empty implementations of interface methods
public void m1() {
		
	}
public void m2() {
		
	}
public void m3() {
	
}
public void m4() {
	
}
public void m5() {
	
}
public void m6() {
	
}
}

public class AdapterClass extends Adap { // here I can write required method implemnattaions after extending adapter class
	// no need to implement all methods
	public void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		new AdapterClass().m1();

	}

}
