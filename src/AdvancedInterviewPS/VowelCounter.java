package AdvancedInterviewPS;

import java.util.Scanner;

public class VowelCounter { 
	public static void main(String args[]) {
		System.out.print("Please enter some text:"); 
		Scanner reader = new Scanner(System.in); 
		String input = reader.nextLine(); 
		//char[] letters = input.toCharArray(); 
		int count = 0; 
		for (char c : input.toCharArray()) {
			switch (c) { 
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++; 
				break; 
			default: 
				// no count increment 
			} 
		} 

		System.out.println("Number of vowels in string [" + input + "] is : " + count); 

	}

}


//Read more: http://www.java67.com/2013/11/how-to-count-vowels-and-consonants-in-Java-String-word.html#ixzz4UC5l4rrz