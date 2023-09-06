package ratan_java;

class Parent{
	int a=10,b=20;
}
public class SuperClass extends Parent{
	int a=100,b=100;
	void add(int a,int b) {
		System.out.println(a+b);
		//System.out.println(a+b); // use this.a to add current class variables
		System.out.println(this.a+this.b);
		//System.out.println(a+b); // use super.a to add parent class variables
		//if variables names are differrent then super and this are not required
		//if names are same to differentitaite we have to use super and this keywords
		System.out.println(super.a+super.b);
	}

	public static void main(String[] args) {
		new SuperClass().add(30, 40);

	}

}
