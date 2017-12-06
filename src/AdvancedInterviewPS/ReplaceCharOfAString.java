package AdvancedInterviewPS;
/** * Java program to remove given character from a given String using loops and recursion, * asked as coding question to Java programmers. * * @author Javin Paul */ 
public class ReplaceCharOfAString { 
	public static void main(String args[]) { 
		String string = "Mokter"; //count number of "a" on this String.
		int index = 0;
		char replachBy = 'N';
		// String newString = string.replace('M', 'N');
		
		System.out.println("After removong the character at " + index + " from the : " +  string + " is : " );

		System.out.println(replaceCharByIndex(string, index, replachBy)); 
		
		System.out.println(replaceChar(string, 'M'));
		
	} 

	public static String replaceCharByIndex(String word, int index, char replace){ 
		
		  if(word==null){
		        return word;
		    }else if(index<0 || index>=word.length()){
		        return word;
		    }
		    char[] chars = word.toCharArray();
		    chars[index] = replace;
		    return String.valueOf(chars);       
		
	}
	
	public static String replaceCharByAnotherAchar(String word, char index, char replace){ 
		
		  if(word==null){
		        return word;
		    }else if(index<0 || index>=word.length()){
		        return word;
		    }
		    char[] phraseArray = word.toCharArray();
		    phraseArray[index] = replace;
		    
		    return String.valueOf(phraseArray);       
		
	}
	
	
	public static String replaceChar(String phrase, char ch)
    {
		// http://stackoverflow.com/questions/1234510/how-do-i-replace-a-character-in-a-string-in-java
		
        char[] phraseArray = phrase.toCharArray(); 
        for(int i=0; i< phrase.length(); i++)
        {
            if(phrase.charAt(i) == ch) 
            {
                String value = Character.toString(phraseArray[i]); 
                value = value.replace(value,"*"); 
                phraseArray[i] = value.charAt(0);
            }
        }
        return String.valueOf(phraseArray);      
    }

	
}


//Read more: http://javarevisited.blogspot.com/2015/04/how-to-remove-given-character-from.html#ixzz4UCIwYxmK