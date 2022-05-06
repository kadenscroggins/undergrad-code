// Euler problem 55
// solution: 249

import java.math.BigInteger;

public class LychrelNumbers55 {
	public static void main(String[] args) {
		int count = 0; 
		for (int i=0;i<=10000;i++) {
			if (lychrel(((new BigInteger(""+i)).add(invert(new BigInteger(""+i)))),0)) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static BigInteger invert(BigInteger n) {
		String in = n.toString();
		String reverse = "";
		for (int i=in.length()-1;i>=0;i--) {
			reverse = reverse+""+in.charAt(i);
		}
		return new BigInteger(reverse);
	}
	public static boolean lychrel(BigInteger n, int loop) {
		if (loop==51) {
			return true;
		}
		else if (n.equals(invert(n))) {
			return false;
		}
		else return lychrel(n.add(invert(n)),loop+1); 
	}
}