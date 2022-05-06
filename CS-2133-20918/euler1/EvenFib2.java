// Euler Problem 2
// Answer - 4613732

import java.util.*;

public class EvenFib2 {

	public static ArrayList<Integer> fibArrayList(int n) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		for (int i = 2;fib.get(fib.size()-1)<n; i++) // gets the fibbonaci sequence up to term size n
		{
			fib.add(fib.get(i-1)+fib.get(i-2));
		}
		return fib;
	}

	public static void main(String[] args) {
		ArrayList<Integer> fibList = fibArrayList(4000000);
		long sum = 0;
		for (int i : fibList) {
			if (i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}