package AdvancedInterviewPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// Read more: http://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html#ixzz4U9oTZxv9

/** * Java Program to find duplicate characters in String. * * * @author http://java67.blogspot.com */ 

public class FindNumberOfCharacters{ public static void main(String args[]) { 
	printDuplicateCharacters("Java Programming"); 
}

/* * Find all duplicate characters in a String and print each of them. */ 

public static void printDuplicateCharacters(String word) { 
	char[] characters = word.toCharArray(); // build HashMap with character and number of times they appear in String 

	Map<Character, Integer> charMap = new HashMap<Character, Integer>();

	for (Character ch : characters) { 
		if (charMap.containsKey(ch)) 
		{ 
			charMap.put(ch, charMap.get(ch) + 1); 
		} 
		else { charMap.put(ch, 1); 
		} 
	} 

	// Iterate through HashMap to print all duplicate characters of String 

	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 

	System.out.println("List of All characters in String : " + word); 
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if (entry.getValue() >= 1) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} 
	}

	System.out.println("List of non-empty characters in String : " + word);
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if (entry.getKey() != ' ' && entry.getValue() >= 1) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} 
	}

	System.out.println("List of duplicate characters in String : " + word); 
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if (entry.getValue() >= 2) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} 
	}

} 
}


