// Euler problem 10
// Solution: 142913828922

import java.util.*;
import java.math.*;

public class SumPrimes10 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		ArrayList<Long> list = primesTo(2000000);
		for (long i : list) {
			sum = sum.add(new BigInteger(""+i));
		}
		System.out.println(sum);
	}
	public static ArrayList<Long> primesTo(long n) {
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long)2);
		for (long i=3;i<=n;i++) {
			boolean div = true;
			for (long k=2;k<i;k++) {
				if (i%k==0) {
					div = false;
					break;
				}
			}
			if (div) {
				primes.add(i);
			}
			if (i%10000==0) System.out.println(i);
		}
		return primes;
	}
}