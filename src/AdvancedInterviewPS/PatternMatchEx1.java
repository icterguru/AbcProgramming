package AdvancedInterviewPS;


public class PatternMatchEx1 {

	public static void main(String[] args) {

		String  text = "aaaabaaaba";
		String  re = "x";
		checkPatternMatch(text, re);
		System.out.println("=========================");
		checkPatternMatch("redblueabbaluered", "abba");
		System.out.println("=========================");
		checkPatternMatch("acaasdasdasdasd", "xxxx");
		System.out.println("=========================");
		checkPatternMatch("abbxyzabcxzyabbac", "abb");
	}

	private static void checkPatternMatch(String  text, String  re) {

		int index = text.indexOf(re);
		int count = 0;

		while (index >=0){
			System.out.println("Matching sratrs at : "+ index);
			index = text.indexOf(re, index + re.length() - 2 );
			count++;
		}
		if (count>0){
			System.out.println("The pattern " + re + "\n\t\t exists " + count + " times in the text : " + text );
		}
		else
			System.out.println("The pattern " + re + " does not exist in the text : " + text );
	}

}


