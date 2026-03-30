/**
 * 
 */
package com.interviewprograms.arrays;

import java.util.List;

/**
 * 
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list = List.of(121, 134, 353, 12321, 4567654);

		for (Integer number : list) {

			int sum = 0;
			int temp = number;

			while (number > 0) {
				int reminder = number % 10;
				sum = (sum * 10) + reminder;
				number = number / 10;

			}
			
			if(temp == sum) {
				System.out.println("number is Palindrome ");
			} else { 
				System.out.println("not a palindrome");
			}

		}

	}

}
