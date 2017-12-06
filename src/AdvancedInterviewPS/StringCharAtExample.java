package AdvancedInterviewPS;
public class StringCharAtExample { 

	public static void main(String args[]) { 
		String word = "Mokter"; 
		String newWord = "";
		System.out.println( "\t newWord: " + newWord);

		for (int i = 0; i< word.length() ; i++){
			newWord = word.substring(0, i) + word.substring(i, word.length());
			System.out.println( "i : " + i + "\t newWord: " + newWord);
		}

	} 

}

//Read more: http://javarevisited.blogspot.com/2015/04/how-to-remove-given-character-from.html#ixzz4UCIwYxmK