package pack1;

import pack2.*;


public class A {

	public static void main(String[] args) {
		
		A1();
		B.B1();
		
		A a = new A();
		a.A2();
		
		B b = new B();
		b.B2();
		
		//=============================================//
		
		C.C1();
		D.D1();
		
		C c = new C();
		c.C2();
		
		D d = new D();
		d.D2();
		
		D.D1();
		
		
		
		

	}
	
	public static void A1() {
		System.out.println("A1");
	}
	
	public void A2() {
		System.out.println("A2");
	}

}
