package Backup;
import java.util.ArrayList; 
import java.util.List; 
/** * Java program to remove given character from a given String using loops and recursion, * asked as coding question to Java programmers. * * @author Javin Paul */ 
public class RemoveCharFromString { 
	public static void main(String args[]) { 
		String string = "Mokter"; 
		char Ch = 'r';
		System.out.println("After removong the character " + Ch + " from the " +  string + " is : " );

		System.out.println(removeRecursive(string, Ch)); 
	} 

	public static String removeRecursive(String word, char ch){ 
		int index = word.indexOf(ch); 
		if(index == -1){ 
			return word; 
		} else
		return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch); 
	}
}

//Read more: http://javarevisited.blogspot.com/2015/04/how-to-remove-given-character-from.html#ixzz4UCIwYxmK