package ratan_java;

abstract class Test{
	Test(){
		System.out.println("Cons in abstract class");
	}abstract void m1();
	{
		System.out.println("instance blocks in abstract class");
	}
	static {
		System.out.println("static blocks in abstract class");
	}
}

public class AbstractConstructor extends Test{
	AbstractConstructor(){
		System.out.println("cons in normal class");
	}
	void m1() {
		System.out.println("m1 method implementation in child class");
	}

	public static void main(String[] args) {
		AbstractConstructor a = new AbstractConstructor();
		a.m1();
		Test b = new AbstractConstructor();
		b.m1();
		//AbstractConstructor c = new Test(); //not possible 
		//Test d = new Test(); // not possible since Test is abstract class hence no obj creation
		

	}

}
