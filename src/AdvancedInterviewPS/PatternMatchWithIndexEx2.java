package AdvancedInterviewPS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchWithIndexEx2 {

	public static void main(String[] args) {
		String  re = "aa";
		String  text = "aaabaaa";
		checkPatternMatch(text, re);
		
		checkPatternMatch("redblueabbaluered", "abba");
		checkPatternMatch("acaasdasdasdasd", "xxxx");
		checkPatternMatch("abbxyzabcxzyabbac", "abb");
	}

	/**
	 * the method
	 */
	private static void checkPatternMatch(String  text, String  re) {

	//	Pattern pattern = Pattern.compile(re);
	//	Matcher matcher = pattern.matcher(text);
		int index = text.indexOf(re);
		int count = 0;

		while (index >=0){
			count++;
			System.out.println("Matching sratrs at : "+ index);
			index = text.indexOf(re, index + re.length() - 1);
		}
		if (count>0){
			System.out.println("The pattern " + re + "\n\t\t exists " + count + " times in the text : " + text );
		}
		else
			System.out.println("The pattern " + re + " does not exist in the text : " + text );
	}

}

