// Euler Problem 3
// Solution: 6857

public class LargestPrimeFactor3 {
	public static long lpf(long n) {
		long largestPrime = 3;
		for (long i=3;i<=Math.sqrt(n);i++) {
			boolean div = true;
			if (n%i!=0) {
				continue;
			}
			for (long k=2;k<i;k++) {
				if (i%k==0) {
					div = false;
					break;
				}
			}
			if (div) {
				largestPrime = i;
				System.out.println("- "+i);
			}
		}
		return largestPrime;
	}
	public static void main(String[] args) {
		long in = new Long("600851475143");
		long largestPrimeFactor = lpf(in);
		System.out.println(largestPrimeFactor);
	}
}