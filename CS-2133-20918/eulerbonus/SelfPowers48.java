// Euler problem 48
// solution: 9110846700

import java.math.BigInteger;

public class SelfPowers48 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		for (int i=1;i<1001;i++) {
			BigInteger temp = new BigInteger(""+i);
			sum = sum.add(temp.pow(i));
		}
		System.out.println(sum.toString());
	}
}