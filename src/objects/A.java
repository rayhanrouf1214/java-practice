package objects;

public class A {

	public static void main(String[] args) {
		
		
		A2();
		
		//Create Object
		//Formula: ClassName objectName = new ClassName();
		
		A obj = new A();
		obj.A1();//ObjectName.MethodName();
		obj.A4();
		
		B.B1();
		
		B jkl = new B();
		jkl.B2();
		
		C.C1();
		C.C2();
		
		
		

	}
	
	public  void A1() {
		System.out.println("A1");
		A3();
		A4();
		B.B1();
		
		B mn = new B();
		mn.B2();
	
	}
	
	public static void A2() {
		System.out.println("A2");
		A xyz = new A();
		xyz.A1();
	}
	
	public static void A3() {
		System.out.println("A3");
		A preity = new A();
		preity.A4();
	}
	
	public void A4() {
		System.out.println("A4");
		A1();
		A3();
	}
}
