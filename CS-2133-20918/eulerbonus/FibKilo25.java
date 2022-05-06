// Euler Problem 25
// Solution: 4782

import java.math.BigInteger;
import java.util.*;

public class FibKilo25 {
	public static void main(String[] args) {
		ArrayList<BigInteger> list = new ArrayList<>();
		list.add(new BigInteger("1"));
		list.add(new BigInteger("1"));

		for (int i=2;(list.get(i-1).toString()).length()<=1000;i++) {
			list.add(list.get(i-2).add(list.get(i-1)));
			if ((list.get(i-1).toString()).length()>=1000) {
				System.out.println(i);
				break;
			}
			//else {
			//	System.out.println("at "+i);
			//}
		}
	}
}