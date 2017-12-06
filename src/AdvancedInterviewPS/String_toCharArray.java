package AdvancedInterviewPS;
public class String_toCharArray {


	public static void main(String[] args) {
		
		String  myString = "Hello World";

		System.out.print("\nThe original string array is: ");
		
		char[] charStringArray;
		// Or, char[] charStringArray = null;
		//	Or, char[] charStringArray = {};
		charStringArray = myString.toCharArray();
		
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(charStringArray[i]);
		}

		System.out.print("\nThe original string is: ");
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(myString.charAt(i));
		}

	}
	

//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz4SFq4zBfK
	

}