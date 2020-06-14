package basic_java;

public class String_Activities {

	public static void main(String[] args) {
		
		
		String name="Preity Zinta";
		String age="45";
		
		
	//String length counts the size of the string including spaces
		
		//System.out.println(name.length());
		
	//String char tells you the position of a particular character
		
		//System.out.println(name.charAt(7));
		
	//String concat will add a certain string to a given string
		
		//System.out.println(name.concat(" is a Bollywood actress"));
		//System.out.println(name.concat(" is " +  age + " years old"));
		
	//String contains return true if certain character is present
		
		//System.out.println(name.contains("Preity"));
		//System.out.println(name.contains("Bollywood"));
		
	//String starts with checks if string was started with a given prefix
		
		//System.out.println(name.startsWith("Preity"));
		//System.out.println(name.startsWith("Zinta"));
		
	//String ends with checks if string was ended with a certain suffix
		
		//System.out.println(name.endsWith("Zinta"));
		
	//String equals compare two given strings (compares data in two different strings; both must have same data for the output
	//to be true, otherwise it will be false)
		
		//System.out.println(name.equals(age));
		
	//String index of returns character of a given character
		
		//System.out.println(name.indexOf("Preity"));
		//System.out.println(name.indexOf("Zinta"));
		
	//String empty will check if certain string is empty or not
		
		//System.out.println(name.isEmpty());
		
	//String replace will replace a certain character
		
		//System.out.println(name.replace("Preity", "Kareena"));
		
	//String substring returns a part of the string (takes the number of a certain string and onwards) 
		
		//System.out.println(name.substring(7));
		
	//**Skip String CharArray for now
		
	//String to lower case converts string to lower case
		
		//System.out.println(name.toLowerCase());
		
	//String to upper case converts string to upper case
		
		//System.out.println(name.toUpperCase());
		
	//String trim eliminates leading and trailing spaces
		
		System.out.println(name.trim());
		
		
		

	}

}
