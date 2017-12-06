package AdvancedInterviewPS;


// Ex 2. P 41
public class Factorial {

	static int factorial(int n){
		if (n<0) return -1;
		else if (n==0) return 1;			
		else return n * factorial(n-1);
	}

	public static void main(String[] args) {

		factorial(5);

		System.out.println(" factorial(5):" + factorial(5) );

	}

}
