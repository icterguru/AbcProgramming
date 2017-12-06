package AdvancedInterviewPS;

// Ex 1. P 40
public class SumN {
	static int sum1(int n){
		int s = 0;
		for (int i = n; i>=1; i--){
			s= s + i;
		}
		return s;
	}

	static int sum2(int n){
		int s = 0;
		if (n<=0){return 0;}
		else {s= n + sum2(n-1);}
		return s;
	}

	static int sumEven1(int n){
		int s = 0;
		for (int i = n; i>=1; i--){
			if(i%2==0)
				s= s + i;
		}
		return s;
	}

	static int sumEven2(int n){
		int s = 0;
		for (int i = 2; i<n; i++){
			if (i%2 == 0){
			if (n<=1){return 1;}
			}
			else {s = s + sumEven2(n-i);}
		}
		
		return s;
	}

	static int pairsumSequence1(int n){
		int sum = 0;
		for (int i = 0; i<n; i++){
			sum += pairsum1(i, i+1);
			i++; // i++ will yield the sum of the sequence
		}
		return sum;
	}

	static int pairsum1(int a, int b){
		return (a + b);
	}

	public static void main(String[] args) {

		System.out.println("sum1(5) : "+ sum1(5));
		System.out.println("sum2(5) : "+ sum2(5));
		System.out.println("pairsumSequence1(5) : "+ pairsumSequence1(5));
			
		System.out.println("sumEven1(5) : "+ sumEven1(5));

		System.out.println("sumEven2(5) ?? : "+ sumEven2(5));
		
		
	}

}

