/**
 * 
 */
package com.interviewprograms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Find common elements between two arrays (intersection), handling duplicates appropriately
 * Given arrays arr1 and arr2, return elements appearing in both (unique or with min frequency). Example: arr1=[1,2,2,1], arr2=[2,2] → [2,2]
 */
public class ArraysCommonElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {1,2,3,4,5,6,7};
		Integer[] arr2 = new Integer[] {3,4,5,6};
		
		
		findCommonElements(arr1,arr2);
	}

	private static void findCommonElements(Integer[] arr1, Integer[] arr2) {
		Set<Integer> set = new HashSet<>();	 
		List<Integer> result = new ArrayList<>();
		
		for(int a:arr2) {
			set.add(a);
		}
		for(int b:arr1) {
			
//			if(set.contains(b) && !result.contains(b)) {
//				result.add(b);
//			}
			
			if(!set.add(b)) { // set.remove(b) - which returns the true if num already present and removed
				result.add(b);
			}
		}
		
		System.out.println(result);
		
		
	}

}
