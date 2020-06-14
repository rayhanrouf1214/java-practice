package conditions;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
	Scanner userInput = new Scanner(System.in);
	System.out.println("Traffic Light Color");
	
	String color = userInput.next(); //4
	
	switch(color) {
	
	case "red" : System.out.println("Stop the car");
	break;
	
	case "yellow" : System.out.println("Slow down the car");
	break;
	
	case "green" : System.out.println("Keep driving the car");
	break;
	
	default: System.out.println("Keep driving but slow");
	}

	}

}
