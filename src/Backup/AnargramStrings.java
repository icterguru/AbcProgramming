package Backup;

public class AnargramStrings {

	public static void main(String[] args) {
		System.out.println(isAnagram("Test", "Tste"));

	}

	public static boolean isAnagram(String word, String anagram){
		if(word.length() != anagram.length()){
			return false; 
		}
		//if(word.toLowerCase().equals(anagram.toLowerCase()) == false){ return false;	}
		
		char[] chars = word.toCharArray(); 

		for(char c : chars){
			int i = anagram.indexOf(c); 
			if(i != -1){
				anagram = anagram.substring(0,i) + anagram.substring(i +1, anagram.length()); 
			}

			else{
				return false; 
			} 
		}

		return anagram.isEmpty(); 
	}

	//Read more: http://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz4UBX6FNZj


}
