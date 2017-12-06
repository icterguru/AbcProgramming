package AdvancedInterviewPS;
public class ReverseString {

	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
    }
	
	public static String recursiveReverse(String input){

		if(input == null || input.isEmpty()){ 
			return input; 
		} 
		else 
		return input.charAt(input.length()- 1)  + recursiveReverse(input.substring(0, input.length() - 1)); 
	}
	
	public static void main(String[] args) {
		
		String input = "<Java>";
		System.out.println("\nThe original string is: " + input  ); 
		System.out.print("\nThe reverse of the string  " + input + " is: " ); 
		System.out.println(recursiveReverse(input));
		System.out.print("\nThe reverse of the string  " + input + " is: " ); 
		System.out.println(reverse(input));

		String  myString = "Hello World";

		System.out.print("\nThe original string is: ");
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(myString.charAt(i));
		}

		System.out.print("\nThe original string array is: ");
		char[] charStringArray = {};
		charStringArray = myString.toCharArray();
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(charStringArray[i]);
		}

		System.out.print("\nThe reverse string is [In memory reversal]: ");
		for (int i = myString.length() -1; i >=0 ; i--) {
			System.out.print(myString.charAt(i));
		}

	}
	

//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz4SFq4zBfK
	

}