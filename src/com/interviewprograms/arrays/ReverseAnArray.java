package com.interviewprograms.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 3, 2, 6, 5 };
		for (int i : arr) {
			System.out.print(" " + i);
		}

		reverseArray(arr);
		System.out.println("");
		for (int i : arr) {
			System.out.print(" " + i);
		}

	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

}
