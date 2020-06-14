package methods;

public class Overload {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(sum(5,5));
		System.out.println(sum("Preity", "Mahima"));
		System.out.println(sum());
		
		
		
	
	}
	
	public static int sum() {
		return 100;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static String sum(String a, String b) {
		return a+b;
		
		//Same method name with different type can't be created.
		//When you're creating methods with the same name, the return type is ignored. 
	}
}
