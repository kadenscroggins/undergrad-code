// Euler Problem 6
// Solution: 25164150

public class SumSquareDifference6 {
	public static void main(String[] args) {
		int sum = 0;
		int sumsquares = 0;
		int squaresum = 0;
		for (int i=1;i<101;i++) {
			sumsquares += i*i;
			sum += i;
		}
		squaresum = sum*sum;
		System.out.println("Difference="+(squaresum-sumsquares));
	}
}