package obj_oriented_programming;

import java.util.Scanner;

public class Creating_Objects_4 {

	public static void main(String[] args) {
		
System.out.println("What operation would you like to do: add, sub, multiply (pick one)");
		
		Scanner userInput = new Scanner(System.in);
		
		String opt = userInput.next();
		
		System.out.println("Great");
		System.out.println("Give me the first Number");
		int num1 = userInput.nextInt();
		System.out.println("Give me the second number");
		int num2 = userInput.nextInt();
		
		calculator(opt, num1, num2);
	}
		public static void calculator(String opt, int num1, int num2) {
			if(opt.equals("add")) {
				System.out.println("RESULT: " + (num1+num2));
			}
			else if (opt.equals("sub")) {
				System.out.println("RESULT: " + (num1-num2));
			}
			else if (opt.equals("multiply")) {
				System.out.println("RESULT: " + (num1*num2));
			}
			else {
				System.out.println("I don't know this operation, please pick one: add, sub, multiply");

	}
		}
}
