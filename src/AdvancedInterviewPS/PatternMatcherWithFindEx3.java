package AdvancedInterviewPS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherWithFindEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the patten :");
		String  re = sc.nextLine();
		System.out.print("Enter the text :");

		String  text = sc.nextLine();
		 */

		String  re = "aa";
		String  text = "aabcxyzaaabcaabc";

		/*char[] reArray = new char[] {'a', 'a'};
		String re = new String(reArray);

		char[] textArray = new char[] {'a', 'a', 'a', 'b', 'c', 'd', 'x', 'y', 'z', 'a', 'a', 'c', '1'};
		String text = new String(textArray);
		 */
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(text);
		 int index = text.indexOf(re);
		int count = 0;
		
		while (matcher.find()){
			//count++;
			//System.out.println(matcher.group());
			System.out.println("Found: " + matcher.group());
			
			System.out.println("Group count: " + matcher.groupCount());
			System.out.println("Start index: " + matcher.start());
	        System.out.println("End index: " + matcher.end());
	        System.out.println("Found substring: " + text.substring(matcher.start(), matcher.end()));
		}

/*		if (count>0){
			System.out.println("The pattern " + re + "\n\t\t exists " + count + " times in the text : " + text );
			//findIndexes(text, re);
		}
*/		
		
		while (index >=0){
			count++;
			System.out.println("Matching sratrs at : "+ index);
		       // index = text.indexOf(re, index + re.length() - 1)   ;
			 index = text.indexOf(re, index + re.length() - 1);
		    	System.out.println("The pattern " + re + "\n\t\t exists " + count + " times in the text : " + text );
				
		}
		if (count>0){
			System.out.println("The pattern " + re + "\n\t\t exists " + count + " times in the text : " + text );
			//findIndexes(text, re);
		}
		else
			System.out.println("The pattern " + re + " does not exist in the text : " + text );
		
		
/*		System.out.println(checkPattern("redblueabbaluered", "abba"));
		System.out.println(checkPattern("acaasdasdasdasd", "xxxx"));
		System.out.println(checkPattern("abbxyzabcxzyabc", "abb"));
*/
	}

	public static void findIndexes(String text, String re){
	 
	    int index = text.indexOf(re);
	    while (index >=0){
	        System.out.println("Matching sratrs at : "+index);
	        index = text.indexOf(re, index + re.length()-1)   ;
	        //int index2 = text.in
	    }
	 
	}
	
	public static int checkPattern(String text, String pattern) { 

		int m = text.length(); 
		int n = pattern.length(); 
		System.out.println("m: " + m + " \n n:" + n);
		
		
		
		int i, j;
		for (i =0; i < m-n; i++) { 
			for (j =0; j < n ; j++)  
				if ( text.charAt(i+j) != pattern.charAt(j) )  
					break; 
				if (j == text.length())  
					return i;					
			} 

		return -1;
	}
}

