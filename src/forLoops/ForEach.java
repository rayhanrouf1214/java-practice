package forLoops;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to JAVA class! How many students are you expecting?");
		
		Scanner userInput = new Scanner(System.in);
		//capturing the user input for how many students
		 int studentNum = userInput.nextInt();//4
		 
		 
		 System.out.println("Ok, great! Lets input them in the class.");
		 
		 String[] names = new String[studentNum]; //4
		 
//		 System.out.println("Insert Name#1: ");
//		 names[0] = userInput.nextLine();
//		 
//		 System.out.println("Insert Name#2: ");
//		 names[1] = userInput.nextLine();
//		 
//		 System.out.println("Insert Name#3: ");
//		 names [2] = userInput.nextLine();
//		 
		 for(int i=0; i<=studentNum-1; i++) {
			 int j = i+1;
			 System.out.print("Insert Name#" + j + ":");
			 names[i] = userInput.next();
		 }
		
		 System.out.println("Great! I got all the names.");
		 Arrays.sort(names);
//		 //System.out.println("Your 2nd student name is:" + names[1] );
//		 
//		 for(int i=0; i<=(studentNum-1); i++) {
//		 System.out.println(names[i]);
//			 
//		 }
		 
		 System.out.println("===========================");
		 //For Each Loop
		 for(String x: names ) {
			 System.out.println(x);
			 
			 //Formula for-each loop
			 //for(dataTypeForTheGroup anyVariable   :  groupNameForData)
			 //System.out.println(anyVariable);
		 }
		
		 //While Loop
		 //If 2nd Name = "Arial" -- Print "Hello Arial"
		 
		 while(names[1].equals("Arial")) {
			 System.out.println("Hello Arial");
			 
		 }

	}

}
