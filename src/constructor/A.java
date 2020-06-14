package constructor;

public class A {

	public static void main(String[] args) {
		
		A obj = new A(10);
		obj.A1();
		A obj2 = new A();
		
		B obj3 = new B();
		
		
		//A1();
		//B.B1();
	

	}
	
	public static void A1() {
		System.out.println("A1");
	}
	
	public A() {
		this(10);
		System.out.println("it's me Rayhan");
	}
	
	public A(int a) {
		System.out.println("hi my name is Preity:" + a);
		
	}
	
	//Constructor: Just like method, except it has to be same name as Class
	//Also it cannot have any return type
	//Constructors cannot be static
	
	//Rules for "this" keyword:
	//Has to be put in first after the open curly brace
}
