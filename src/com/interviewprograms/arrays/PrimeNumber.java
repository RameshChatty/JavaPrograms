package com.interviewprograms.arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 0; i < 5000; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}

		}

	}

	private static boolean isPrimeNumber(int n) {

		if (n <= 1) {
			return false;
		}
		System.out.println(n + "= " + Math.sqrt(n));
		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
