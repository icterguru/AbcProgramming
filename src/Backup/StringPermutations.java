package Backup;
/** * Java program to find all permutations of a given String using recursion. * For example, given a String "XYZ", this program will print all 6 possible permutations of * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX * * @author Javin Paul */ 

public class StringPermutations { 

	public static void main(String args[]) {

		permutation("123"); 

	}
	/* * A method exposed to client to calculate permutation of String in Java. */ 

	public static void permutation(String input){
		//	if(input.length()< 1)

		if (input.isEmpty()) 
		{ 
			System.out.println( input); 
			System.out.println("The given input string is empty.. No output ...");
		}
		else{
			permutation("", input); 
		}
	} 

	/* * Recursive method which actually prints all permutations * of given String, but since we are passing an empty String * as current permutation to start with, * I have made this method private and didn't exposed it to client. */

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) 
		{ 
			System.err.println(perm + word); 
		}

		else { 

			for (int i = 0; i < word.length(); i++) { 
				System.out.println("i :" + i );
				System.out.println("perm :" + perm );
				System.out.println("perm + word.charAt(i) :" + perm + word.charAt(i));
				System.out.println("word.substring(0, i) :" + perm + word.substring(0, i));
				System.out.println("word.substring(i + 1, word.length()) :" + word.substring(i + 1, word.length()));


				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));


			} 
		} 
	} 
}

//Read more: http://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#ixzz4UBdVufpP