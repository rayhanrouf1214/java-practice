package arrayLearning;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		//Array is having one variable to hold multiple values.
		
		//How to define an array:
		
		//Method 1: by the size
		
		/*
		 * String[] student = new String[5];
		 * 
		 * student[0] = "Binya"; student[2] = "Juliet"; student[4] = "admin";
		 * 
		 * System.out.println(student[2]); student[1] = "John"; student[0] = "Frank";
		 * System.out.println(student[0]); System.out.println(student[4]);
		 * 
		 * 
		 * //Method 2: By values String[] actress = {"Preity", "Kareena", "Urmila",
		 * "Madhuri"};
		 * 
		 * System.out.println(actress[0]);
		 */
		
		/*
		 * String userData = "Rayhan";
		 * 
		 * System.out.println(userData);
		 * 
		 * char[] userDataCharacters = userData.toCharArray();
		 * 
		 * System.out.println(userDataCharacters[0]);
		 * System.out.println(userDataCharacters[1]);
		 * System.out.println(userDataCharacters[2]);
		 * System.out.println(userDataCharacters[3]);
		 * System.out.println(userDataCharacters[4]);
		 * System.out.println(userDataCharacters[5]);
		 */
		
		/*
		 * int[] grade = {55, 65, 99, 30, 55, 10}; System.out.println(grade[0]);
		 * System.out.println(grade[1]);
		 * 
		 * String[] words = {"Hello", "Art", "Zebra", "Test"};
		 * System.out.println(words[0]); System.out.println(words[1]);
		 * 
		 * Arrays.sort(grade); System.out.println(grade[0]);
		 * System.out.println(grade[1]);
		 * 
		 * Arrays.sort(words); System.out.println(words[0]);
		 * System.out.println(words[1]);
		 */
		
		/*
		 * String areaCode = "77014, 77067, 75061, 77032"; String[] areaCodeArray =
		 * areaCode.split(","); System.out.println(areaCodeArray[2]);
		 */
		
		//Loops
		
		//For Loop
		
		//Formula for ForLoop
		//i = iteration
		
		//i++ is the same as i=i+1
		//i=i+2 is NOT the same as i+++
		
		//for(int i=1; i<=5 ;i=i+1 ) {
			//System.out.println(i);
		
		//1-500 (even numbers)
		
		for(int i=2; i<=8; i=i+2 ) {
			System.out.println(i);
			
		}
			
		}
		


	}


