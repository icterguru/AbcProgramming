package AdvancedInterviewPS;

import java.util.Scanner;

public class LCM {
	private static int p;
	private static int q;
	private static int s = 1;
	private static int t = 1;

	 public LCM()
	    {
	        p = 0;
	        q = 0;
	        s = 1;
	        t = 1;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first no:");
		int m = sc.nextInt();
		System.out.print("Enter the second no:");
		
		int n = sc.nextInt();
	
		System.out.println("LCM of " + m + " and " + n + " is: " + lcmCalculator(m, n) );
	
	}

	public static int lcmCalculator(int m, int n) {
        for (p = 1;; p++) {
            s = m * p;
            for (q = 1; t < s; q++) {
                t = n * q;
            }
            if (s == t)
                break;
        }
        return s;
    }
	
}
