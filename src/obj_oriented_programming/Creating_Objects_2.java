package obj_oriented_programming;

public class Creating_Objects_2 {

	public static void main(String[] args) {
		System.out.println("Running from the main method");
		
		int a =55;
		int b =65;
		
		sum(100,100);
		sum(50,50);
		xyz(a, 1, "Hello");
		
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void xyz(int x, int y, String z) {
		
		sum(x,y);
		System.out.println(10-5);
	}

}
