package com.interviewprograms.arrays;

public class Factorial {

	public static void main(String[] args) {
		
		
		getFactorialOfGivenNumber(4);

	}

	private static void getFactorialOfGivenNumber(int i) {
		// TODO Auto-generated method stub
		int n =1;
		for(int fact = 1 ; fact<=i;fact++) {
			n =n*fact;
		}
		System.out.println(n);
	}

}
