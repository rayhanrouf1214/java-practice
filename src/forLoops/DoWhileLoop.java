package forLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String data = userInput.next();
		
		int i = 0;
		
		 do {
			 
			 System.out.println("oh hi ");
			 
			 i =i+1;
			 
		 } while(data.equals("w") && i<3);
		 
		 System.out.println("DONE");

	}



	}


