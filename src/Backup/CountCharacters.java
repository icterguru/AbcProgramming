package Backup;


public class CountCharacters {

	public static void main(String args[]) {

		String string = "Today is Monday"; //count number of "a" on this String.
		char Ch = 'M';
		//Using Spring framework StringUtils class for finding occurrence of another String
		int count = countOccurrencesOf(string, Ch);

		System.out.println("Count of occurrence of character " + Ch + " in : " +  string + " is : " + count);

	}

	public static int countOccurrencesOf(String input, char ch){
		int charCount = 0;
		for(int c =0 ; c<input.length(); c++){
			//System.out.println(input.charAt(c) );
			if(input.charAt(c) == ch){
				charCount++;
			}
		}
		return charCount;
	}

}


//Read more: http://javarevisited.blogspot.com/2012/12/how-to-count-occurrence-of-character-in-String.html#ixzz4UCCEZ621