package obj_oriented_programming;

public class A {

	public static void main(String[] args) {
		
	
		System.out.println(sum(2,2));
		
		A.sub(1, 22);
		
		B.printME();

	}
	
	public static int sum(int a, int b) {
		return a+a+b;
	
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
		sum(a,b);
   }
	
	//Return Type: int, String, boolean, Array
	//if the type is VOID -- you are really not returning anything
	
	//Return Type
	//Formula of a Method Creation
	//AccessModifier Static/Nonstatic ReturnType NameOfMethod(Parameters){
	//             Body;
	//  }
}

