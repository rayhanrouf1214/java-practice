package stringFunctions;

import java.util.Scanner;

public class ReviewStringFunctions {

	public static void main(String[] args) {
		
		System.out.print("Give me a string: ");
		
		Scanner userInput = new Scanner(System.in);
		
		String userData = userInput.nextLine(); //Hello
		
		//Create a program where you ask the user for a string and
		//you as the programmer should let the user know about the followings for their string
		
		//1. how many characters are in their string.
		int userDataLength = userData.length();
		System.out.println("Length: " + userDataLength);
		
		//2. you are going to add "TEST" at the end of their given string (Use concat function)
		String userDataConcat = userData.concat("TEST");
		System.out.println("Concat TEST: " + userDataConcat);
		
		//3. you are going to check if there is any "e" in their string
		boolean userDataContains = userData.contains("e");
		System.out.println("Contain e?: " + userDataContains);
		
		//4. you should tell the user if their string is equal to "hello" (ignore case)
		boolean userDataEqual = userData.equalsIgnoreCase("hello");
		System.out.println("Equal hello?: " + userDataEqual);
		
		//5. you should tell the user if their string is empty or not
		boolean userDataEmpty = userData.isEmpty();
		System.out.println("Is the string empty?: " + userDataEmpty);
		
		//6. you should replace all o with 0 in their string
		
		String userDataReplace = userData.toLowerCase().replace("o", "0");
		System.out.println("Replace o with 0: " + userDataReplace);
		
		//7. get the first 3 characters from their string    // get the last 3 characters from a string//hello
		String userDataSubStr = userData.substring(0, 3);
		System.out.println("SubString 0,3: " + userDataSubStr);
		
		 //String userDataSub = userData.substring(3);
		 //System.out.println("Substring 1: " + userDataSub);
		
		//8. you should break down their string into single characters

		
		//9. You should remove extra spaces from their string
		String userDataTrim = userData.trim();
		System.out.println("Trim: " + userDataTrim);
		
		

	}

	private static void contains(String string) {
		// TODO Auto-generated method stub
		
	}

}
