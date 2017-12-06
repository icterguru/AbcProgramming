package Backup;
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
	
	public static void main(String[] args) {
		String  myString = "Hello World";

		System.out.println("\nThe original string is: ");
		for (int i = 0; i < myString.length(); i++) {
			System.out.print(myString.charAt(i) + "");
		}

		System.out.println("\nThe reverse string is [In memore reversal]: ");
		for (int i = myString.length() -1; i >=0 ; i--) {
			System.out.print(myString.charAt(i) + "");
		}

		System.out.println("\nReversing the array in alternative way is: ");

		StringBuilder reversedString = new StringBuilder();
		reversedString.append(myString);
		reversedString=reversedString.reverse();
		
	/*	//  Or just this
		StringBuilder reversedString = new StringBuilder();	
		reversedString.append(myString).reverse().toString();
	*/	
		
		for (int i = 0; i < reversedString.length(); i++) {
			System.out.print(reversedString.charAt(i) + "");
			
			
					}
	}
	
	

//	System.out.println("\nReversing the array in alternative way is: ");

//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz4SFq4zBfK
	

}