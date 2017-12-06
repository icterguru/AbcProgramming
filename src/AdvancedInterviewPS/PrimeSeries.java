package AdvancedInterviewPS;


// Ex 2. P 41
public class PrimeSeries {

	static boolean isPrime(int n){
		for (int i = 2; i*i<= n; i++)
		{	
			if (n %i ==0) 
				return false;
		}
		return true;
	}

	static void allPrimes(int n){
		for (int i = 2; i<= n; i++)
		{	
			if (isPrime(i)==true) 
				System.out.println(" " + i +" is a prime number");
			else
				System.out.println("\t\t" + i +" is not a prime number");
		}
	}

	public static void main(String[] args) {

		allPrimes(100);

	}

}
