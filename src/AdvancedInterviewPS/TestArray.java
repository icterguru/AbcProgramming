package AdvancedInterviewPS;
public class TestArray {

	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0};

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("\nTotal is " + total);

		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) max = myList[i];
		}

		System.out.println("\nMax elt is: " + max);  

		System.out.println("\nThe reverse array is: ");
		for (int i = 0; i < myList.length/2; i++) {
			int other = myList.length - 1 - i;
			double temp= myList[i];
			myList[i] = myList[other];
			myList[other] = temp;

		}
		for (int j = 0; j < myList.length; j++) {
			System.out.print(myList[j] + " ");
		}

		double[] reversedList = new double[myList.length];
		System.out.println("\nRe-rversing the array in alternative way is: ");
		for (int i = 0; i < myList.length; i++) {
			reversedList[i] =  myList[myList.length - 1 - i];
		}
		for (int j = 0; j < reversedList.length; j++) {
			System.out.print(reversedList[j] + " ");
		}
	}
}