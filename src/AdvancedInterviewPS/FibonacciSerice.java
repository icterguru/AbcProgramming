package AdvancedInterviewPS;


	// Ex 2. P 41
	public class FibonacciSerice {

		static int fibN(int n){
			if (n<=0) return 0;
			else if (n==1) return 1;
			else return fibN(n-1) + fibN(n-2);
		}

		static void allFibUptoN(int n){
			for (int i = 0; i<n; i++)
				System.out.print(fibN(i) + " " );
		}


		public static void main(String[] args) {

			allFibUptoN(10);
			
			//System.out.println(" allFinUptoN(5) :" +  allFibUptoN(10));
			
		}

	}
