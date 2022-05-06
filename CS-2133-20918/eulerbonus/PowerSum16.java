// Euler problem 16
// solution: 1366

import java.math.*;

public class PowerSum16 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);

		int sum = 0;
		String nums = number.toString();
		for (int i=0; i<nums.length(); i++) {
			sum += Integer.parseInt(""+nums.charAt(i));
			//System.out.println("hey");
		}
		System.out.println(sum);
	}
}