package AdvancedInterviewPS;

public class NonSpaceCharacters {

	static char m;  
	static int c = 0, word, i, j, k;

	public static void main(String[] args) {
		String givenString = "Abracadabra      Alakazam!!";
		
		String[] words = givenString.trim().split("\\s+");

	    System.out.println("Word count is = "+(words.length));
	    
	    System.out.print("Non-whitespace character count = ");
	    
	    System.out.println(givenString.replace(" ", "").length());
	    
		nonWhiteCharacterCount(givenString);
		
		
	}

	static void nonWhiteCharacterCount(String string)

	{

		char[] temp=new char[string.length()];
		for(word=0;word<string.length();word++)
			temp[word]=string.charAt(word);
		for(i=0;i<word;i++)
		{
			char ch=temp[i];
			for(j=i+1;j<word;j++)
			{
				if(temp[j]==ch)
				{
					for(k=j;k<(word-1);k++)
						temp[k]=temp[k+1];
					word--;
					j=i;
				}
			}
		}

		System.out.println("Unique character breakdown in order they appeared...");

		int[] tempArray=new int[word];
		for(i=0;i<word;i++)
		{
			for(j=0,c=0;j<string.length();j++)
			{
				if(temp[i]==string.charAt(j) && temp[i] != ' ')
					c++;
			}
			tempArray[i]=c ;
			if (c !=0)
			System.out.println(temp[i]+": "+ c );
		}
	}

}

