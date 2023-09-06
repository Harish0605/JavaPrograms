package ratan_java;

public class VariablesAssignment {
static int a=100;
 static int b=200;
 int c=300;
 int d=400;
 
 public void m1() {
	System.out.println(VariablesAssignment.a);
	System.out.println(VariablesAssignment.b);
	System.out.println(c);
	System.out.println(d);
 }
public static void m2() {
	System.out.println(VariablesAssignment.a);
	System.out.println(VariablesAssignment.b);
	VariablesAssignment var = new VariablesAssignment();
	System.out.println(var.c);
	System.out.println(var.d);	 
 }
	public static void main(String[] args) {
		VariablesAssignment var = new VariablesAssignment();
		var.m1();
     m2();

	}

}
//assignment-1
//2 - instance variables
// static method and print 2 variables
//another static method and print 2 variables
//call m1 m2


//assignment-2
//2instanve
//2static
//m1 print 4 variables
//static m2 print 4 variables
//call m1 and m2