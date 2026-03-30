
package com.interviewprograms.arrays;

import java.util.Arrays;


/**
 * 
 * 
Given array nums and integer k, rotate right by k steps in-place. Example: [1,2,3,4,5,6,7] with k=3 becomes [5,6,7,1,2,3,4].

Formal Statement
text
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Constraints:
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
- 0 <= k <= 10^5
- Modify in-place (O(1) extra space)
 * 
 * Rotates array right by k positions using reversal algorithm.
 * Time: O(n), Space: O(1)
 */
public class ArrayRotation {

	/**
     * Entry point demonstrating 3-step rotation
     */
	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.asList(arr));
		reverse(arr, 0, k - 1);
		System.out.println(Arrays.asList(arr));

		reverse(arr, k, arr.length - 1);
		System.out.println(Arrays.asList(arr));
	}
	
	 /**
     * Reverses subarray from start to end indices (inclusive).
     * @param arr array to modify
     * @param start start index
     * @param end end index
     */

	static void reverse(Integer[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}

}
