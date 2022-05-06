public class Factorial {
	public static void main(String[] args) {
		if (calculate(0)==1) {
			System.out.println("Factorial.calculate(0) returned 1. Test passed");
		}
		if (calculate(5)==120) {
			System.out.println("Factorial.calculate(5) returned 120. Test passed");
		}
	}
	public static long calculate(long n) {
		long ret = n;
		if (n < 0 || n > 20) {
			System.out.println("Error - Factorial.calculate() only accpets n values where 0<=n<=20");
			System.exit(0);
		}
		else if (n == 1 || n == 0) {
			ret = 1;
		}
		else {
			ret *= calculate(n-1);
		}
		return ret;
	}
}