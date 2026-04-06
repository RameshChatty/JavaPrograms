package com.interviewprograms.arrays;

public class FindThirdLargestNumFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		System.out.println(getSecondLargest(arr));

	}

	private static Integer getSecondLargest(int[] arr) {

		Integer largest = 0;
		Integer secondLargest = 0;
		Integer thirdLargetNumber = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				thirdLargetNumber = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (secondLargest < arr[i]) {
				thirdLargetNumber = secondLargest;
				secondLargest = arr[i];

			} else if (thirdLargetNumber < arr[i]) {
				thirdLargetNumber = arr[i];
			}
		}
		System.out.println(largest + "---" +secondLargest+" --"+ thirdLargetNumber);

		return thirdLargetNumber;
	}

}
