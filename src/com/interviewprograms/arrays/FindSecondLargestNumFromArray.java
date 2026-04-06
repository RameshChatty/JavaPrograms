package com.interviewprograms.arrays;

public class FindSecondLargestNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));

	}

	private static Integer getSecondLargest(int[] arr) {
		
		Integer largest = 0;
		Integer secondLargest = 0;
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest = arr[i];
			}else if(arr[i]<largest && secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		System.out.println(largest +"---"+secondLargest);
		
		
		return secondLargest;
	}

}
