package com.myCodeTest.leetcodeTests;

public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}

	public static boolean isPowerOfThree(int n) {

		if (n < 0) {
			return false;
		}

		if (n == 0) {
			return false;
		}
		

		for(int i =0;i<=n;i++) {
			
			int value = i^3;
//			if((i*i*i) == n) {
//				return true;
//			}
			
			if(n == value) {
				return true;
			}
			
		}

		return false;

	}

	public static boolean squareRoot(int input) {
		
		if(input == 0) {
			return false;
		}
		
		if(input < 0) {
			System.out.println("Input must not be negative.");
			return false;
		}
		
		for(int i =0;i<=input;i++) {
			if(i*i == input) {
				return true;
			}
		}
		
		return false;
	}

}
