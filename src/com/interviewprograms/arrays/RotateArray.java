package com.interviewprograms.arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;

		rotateArr(arr, d);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		rotateArr(arr, 3);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		rotateArr(arr, 4);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void rotateArr(int[] arr, int d) {
		int n =arr.length;
		for (int i = 0; i < d; i++) {
			
			
			int firstElement= arr[0];
			for(int j =0;j<n-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1] = firstElement;
		}

	}

}
