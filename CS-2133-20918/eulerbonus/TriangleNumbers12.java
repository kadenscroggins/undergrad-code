// Euler problem 12
// Solution: 76576500

public class TriangleNumbers12 {
	public static void main(String[] args) {
		long triangle = 0;
		boolean loop = true;
		for (long i=1;loop;i++) {
			int divisors = 1;
			triangle += i;
			for (long k=1;k<=Math.sqrt(triangle);k++) {
				if (triangle%k==0) divisors+=2;
			}
			if (divisors >= 500) loop = false;
			//if (divisors>=100) System.out.println("triangle: "+triangle+" | i:  "+i+" | divisors: "+divisors);
		}
		System.out.println(triangle);
	}
}