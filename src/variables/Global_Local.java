package variables;

public class Global_Local {
	
	static int a = 5555;
	
	//Global, Instance, Class Level

	public static void main(String[] args) {
		
		
	int a = 10;
	System.out.println(a);
	a = 25;
	System.out.println(a+10);
	
	abc();
	
	}
	
	public static void abc() {
		
		//int a = 99;
		System.out.println(a);
	}

}
