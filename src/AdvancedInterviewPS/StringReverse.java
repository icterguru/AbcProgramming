package AdvancedInterviewPS;

public class StringReverse {

	public static void main(String[] args) {
		String input = "<Java>";
		System.out.println("\nThe original string is: " + input  ); 
		System.out.print("\nThe reverse of the string  " + input + " is: " ); 
		System.out.println(recursiveReverse(input));
		System.out.print("\nThe reverse of the string  " + input + " is: " ); 
		strReverse(input);
	}

	public static void strReverse(String input) {

		if(input == null || input.isEmpty()){ 
			System.out.print(input); 
		}
		else{
			for (int i = input.length() -1; i>=0; i--) { 
				System.out.print(input.charAt(i)); 
			}
		}
	}

	public static String recursiveReverse(String input){

		if(input == null || input.isEmpty()){ 
			return input; 
		} 
	//	else 
		return input.charAt(input.length()- 1)  + recursiveReverse(input.substring(0, input.length() - 1)); 
	}

}

