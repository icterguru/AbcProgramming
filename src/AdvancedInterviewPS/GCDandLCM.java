package AdvancedInterviewPS;

import java.util.Scanner;

public class GCDandLCM {

	private static Scanner sc;

	public static int gcd(int m, int n){
		if (n == 0){
			return m;
		}
		return gcd(n, m % n);
	}

	public static int gcd(int m, int n, int p){
		return gcd(gcd(n, n), p);
	}

	public static int gcd(int m, int n, int p, int q){
		return gcd(gcd(n, n), gcd(p, q));
	}

	public static int lcm(int m, int n){
		return (m*n)/gcd(m, n);
	}
	

	public static int lcm(int m, int n, int p){
		return lcm(lcm(m, n),  p);
	}
	public static int lcm(int m, int n, int p, int q){
		return lcm(lcm(m, n),  lcm(p, q));
	}

	
	public static void main(String[] args) throws Exception{
		sc = new Scanner(System.in);
		System.out.print("Enter the first no:");
		int m = sc.nextInt();
		System.out.print("Enter the second no:");
		
		int n = sc.nextInt();
	

		System.out.print("Enter the third no:");
		
		int p = sc.nextInt();
	
	System.out.print("Enter the fourth no:");
		
		int q = sc.nextInt();
	
		System.out.println("GCD of " + m + " and " + n + " is: " + gcd(m, n) );
		System.out.println("LCM of " + m + " and " + n + " is: " + lcm(m, n) );
		System.out.println("GCD of " + m + ", " + n + " and " + p + " is: " + gcd(m, n, p) );
		System.out.println("LCM of " + m + ", " + n + " and " + p + " is: " + lcm(m, n, p) );
	
		System.out.println("GCD of " + m + ", " + n +  "  " + p + " and " + q + " is: " + gcd(m, n, p, q) );
		System.out.println("LCM of " + m + ", " + n +  "  " + p + " and " + q + " is: " + lcm(m, n, p, q) );
		
	}

}
