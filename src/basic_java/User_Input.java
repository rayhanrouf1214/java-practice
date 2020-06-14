package basic_java;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		
		//System.out.println("My");
		//System.out.println("favorite");
		//System.out.println("actress");
		//System.out.println("is");
		//System.out.println("Preity Zinta");
		//System.out.println("==========================");
		
		//System.out.print("My");
		//System.out.print(" favorite");
		//System.out.print(" actress");
		//System.out.print(" is");
		//System.out.print(" Preity Zinta");
		
		//=====================================================//
		
	Scanner userInput = new Scanner (System.in);
		//String userData = userInput.nextInt();
	
		int userData = userInput.nextInt();
	
			System.out.println(userData);
			
			Double data = userInput.nextDouble();
			
			System.out.println(data);
		
		
		
		//Difference between next and next line: Next will ONLY take the first word up until the space.
		//Next line will take the whole line (such as a sentence)
		//Next and Next line are String
		
		

	}

}
