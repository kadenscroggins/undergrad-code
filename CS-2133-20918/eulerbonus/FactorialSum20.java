// Euler Problem 20
// Solution: 648

import java.math.BigInteger;

public class FactorialSum20 {
	public static void main(String[] args) {
		BigInteger factorial = new BigInteger("1");

		for (int i=2; i<=100; i++) {
			BigInteger mult = new BigInteger("" + i);
			factorial = mult.multiply(factorial);
			//System.out.println("sup "+mult.toString()+" "+factorial.toString());
		}

		int sum = 0;
		String nums = factorial.toString();
		for (int i=0; i<nums.length(); i++) {
			sum += Integer.parseInt(""+nums.charAt(i));
			//System.out.println("hey");
		}
		System.out.println(sum);
	}
}