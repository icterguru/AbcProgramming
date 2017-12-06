package Backup;

import java.util.HashMap;

public class FirstRepeatedCharacter {


	public static void main(String... args){

		System.out.println(firstRepeatedCharacter("aabbccdProgrammming"));
		
	}

	public static char firstRepeatedCharacter(String word) {
		HashMap<Character,Integer> charMap = new HashMap<>(); 
		// build a Hashtable [char -> count] 
		for (int i = 0; i < word.length(); i++) 
		{ char ch = word.charAt(i); 
		if (charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch) + 1); 
		} else { 
			charMap.put(ch, 1); 
		} 
		} 
		// since HashMap doesn't maintain order, going through the string again 

		System.out.print("The first repeated character in the string  " + word + " is: " ); 

		for (int i = 0; i < word.length(); i++) { 
			char ch = word.charAt(i); 
			if (charMap.get(ch) >= 2) {
				return ch;
			} 
		}
						
		throw new RuntimeException("Undefined behaviour"); 
	}
	
}

