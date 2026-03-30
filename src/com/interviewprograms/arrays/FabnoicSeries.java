/**
 * 
 */
package com.interviewprograms.arrays;

/**
 * The Fibonacci sequence is a series of numbers where each number is the sum of
 * the two preceding ones.
 * 
 * In other words, in the Fibonacci series, the next number is the sum of the
 * previous two numbers. It usually starts with 0 and 1. The sequence goes like
 * this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
 */
public class FabnoicSeries {

	/**
	 * @param args
	 */

	static int n1 = 0, n2 = 1, n3 = 0; // Use for recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		System.out.println("\nWithout Recurssion...........");
		getFabnoic(count);
		System.out.println("\nUsing Recurssion...........");
		System.out.print(n1 + " " + n2);
		usingFabnoicRecursion(count - 2);

	}

	private static void usingFabnoicRecursion(int count) {

		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			usingFabnoicRecursion(count - 1);
		}

	}

	private static void getFabnoic(Integer fabNoicCount) {
		// TODO Auto-generated method stub
		if (fabNoicCount < 2) {
			return;
		}

		int start = 0, next = 1;

		System.out.print(start + " " + next);

		for (int i = 2; i < fabNoicCount; i++) {
			int last = start + next;
			System.out.print(" " + last);
			start = next;
			next = last;
		}

		// 0 1 1 2 3 5 8 13 21 34
	}

}
