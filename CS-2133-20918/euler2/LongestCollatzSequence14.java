// Euler Problem 14
// Solution: 837799

public class LongestCollatzSequence14 {
	public static void main(String[] args) {
		long longest = 0;
		long longestCounter = 0;
		for (long i=1; i<1000000; i++) {
			System.out.println("On " + i);
			long n = i;
			long counter = 1;
			while (n != 1) {
				if (n%2==0) n /= 2;
				else n = 3*n+1;
				counter++;
			}
			if (counter>longestCounter) {
				longestCounter = counter;
				longest = i;
			}
		}
		System.out.println(longest);
	}
}