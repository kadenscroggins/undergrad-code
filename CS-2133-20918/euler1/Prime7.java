// Euler Problem 7
// Answer - 104743

import java.util.*;

public class Prime7 {

	public static int[] primes(int n) {
		int[] ret = new int[n];
		if (n==0) {
			return ret;
		}
		else if (n==1) {
			ret[0] = 2;
			return ret;
		}
		else {
			ret[0] = 2;
		}
		// This is done to avoid the prime cases for the numbers 1 and 2

		int counter = 1;
		for (int i=3;counter<n;i++) { // loops until the last slot of the array is filled
			boolean div = true;
			for (int k=2;k<i;k++) {
				if (i%k==0) {
					div = false;
					break;
				}
			}
			if (div) {
				ret[counter] = i;
				counter++;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] primeArr = primes(10001);
		System.out.println(primeArr[primeArr.length-1]);
	}
}