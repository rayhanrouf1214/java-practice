package forLoops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String data = userInput.next();
		
		int i = 0;
		
		 while(data.equals("test") && i<3) {
			 System.out.println("oh hi ");
			 
			 i =i+1;
			 
		 }
		 
		 System.out.println("DONE");

	}

}
