package ratan_java;

class Animal{
	
	
}
class Dog extends Animal{
	
}

class C{
	Animal m1() { //overridden method
		System.out.println("A class method");
		return new Animal();
	}
}

public class MOR extends C {
	Dog m1() {//overriding method
		System.out.println("MOR class method");
		return new Dog(); // covariant return type
	}

	public static void main(String[] args) {
		new MOR().m1();

	}

}
