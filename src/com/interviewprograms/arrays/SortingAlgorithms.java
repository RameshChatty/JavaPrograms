/**
 * 
 */
package com.interviewprograms.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 */
public class SortingAlgorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]  arr1 = new int[] {3,2,5,7,8,2,9};
		
		// Bubble sort
		
		bubbleSort(arr1);
		
		selectionSort(arr1);
		
		
		insertionSort(arr1);

	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < arr.length; i++){
		    int key = arr[i];
		    int j = i - 1;

		    while(j >= 0 && arr[j] > key){
		        arr[j + 1] = arr[j];
		        j--;
		    }
		    arr[j + 1] = key;
		}
		
		System.out.println("Insertion sort");
		print(arr);
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			int minimumIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[minimumIndex]) {
					minimumIndex = j;
				}
			}
			
			int temp= arr[i];
			arr[i]=arr[minimumIndex];
			arr[minimumIndex]=temp;
		}
		
		System.out.println("selection sort");
		print(arr);
	}

	private static void bubbleSort(int[] arr1) {
		
		for(int i = 0; i<arr1.length;i++) { // only iteration
			
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]<arr1[j+1]) {
					int temp = arr1[j];
					arr1[j]= arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
			
		}
		
		System.out.println("Bubble sort :");
		print(arr1);
		
	}

	private static void print(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
