package obj_oriented_programming;

public class Creating_Object {

	public static void main(String[] args) {
		
		System.out.println("Running from the main method");
		
		xyz();
		abc();
		
		System.out.println("after ABC method");

	}
	
	public static void abc() {
		System.out.println("Print from ABC");
		System.out.println((11111));
		xyz();
	}
	
	public static void xyz() {
		System.out.println("Print from xyz");
		System.out.println(45576494);
		System.out.println(true);
	}
	
	//Creating Methods and Creating Objects

}
