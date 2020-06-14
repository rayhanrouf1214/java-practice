package conditions;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
	
		
		System.out.println("Give me a greeting");
		String msg = userInput.next();
		
		System.out.println("Give me a number");
		int a = userInput.nextInt();
		
		
		
		
		
		if(msg.equals("hello")) {
			System.out.println("hi");
		}
		
		else if(msg.equals("hi")) {
			System.out.println("hi back");
		}
		
		else {
			System.out.println("bye");
		}
		
		
			
	}
	   	
}	



