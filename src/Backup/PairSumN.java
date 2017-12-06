package Backup;

// Ex 2. P 41
public class PairSumN {
	static int pairsumSequence1(int n){
		int sum = 0;
		for (int i = 0; i<n; i++){
			sum += pairsum1(i, i+1);
			//i++; // i++ will yield the sum of the sequence
		}
		return sum;
	}

	static int pairsum1(int a, int b){
		return (a + b);
	}


	public static void main(String[] args) {

		System.out.println("pairsumSequence1(5) : "+ pairsumSequence1(5));
	}

}

