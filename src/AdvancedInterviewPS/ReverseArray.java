package AdvancedInterviewPS;
public class ReverseArray {

	   public static void main(String[] args) {
	      double[] myList = {1.9, 2.9, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0};

	      // Print all the array elements
	      System.out.println("The original array is: " );  
	      
	      for (int i = 0; i < myList.length; i++) {
	         System.out.print(myList[i] + " ");
	      }
	     
	      
	      System.out.println("\nThe reverse array is [In memore reversal]: ");
	      for (int i = 0; i < myList.length/2; i++) {
	    	  int other = myList.length - 1 - i;
	    	  double temp= myList[i];
	    	  myList[i] = myList[other];
	    	  myList[other] = temp;
	    	 
	       }
	      for (int j = 0; j < myList.length; j++) {
		         System.out.print(myList[j] + " ");
		      }
	      
	      System.out.println("\nRe-rversing the array in alternative way is: ");
	      
	      double[] reversedList = new double[myList.length];
	          for (int i = 0; i < myList.length; i++) {
	    	  reversedList[i] =  myList[myList.length - 1 - i];
	       }
	      for (int j = 0; j < reversedList.length; j++) {
		         System.out.print(reversedList[j] + " ");
		      }
	   }
	}