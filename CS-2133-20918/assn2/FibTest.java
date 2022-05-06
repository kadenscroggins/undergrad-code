import java.util.*;

public class FibTest {
	public static void main(String[] args) {
		
		int testNum = 40;
		
		long t;
		t = System.currentTimeMillis();
		System.out.println("fibIter("+testNum+") = "+fibIter(testNum));
		System.out.println("fibIter("+testNum+") took "+(System.currentTimeMillis()-t)+" milliseconds");
		t = System.currentTimeMillis();
		System.out.println("fibRecur("+testNum+") = "+fibRecur(testNum));
		System.out.println("fibRecur("+testNum+") took "+(System.currentTimeMillis()-t)+" milliseconds");
	}
	public static long fibIter(int n) {
		ArrayList<Long> fibList = new ArrayList<Long>();
		fibList.add((long)1);
		fibList.add((long)1);
		for (int i = 2; i<n; i++) {
			fibList.add(fibList.get(i-2)+fibList.get(i-1));
		}
		return fibList.get(n-1);
	}
	public static long fibRecur(int n) {
		if (n == 1 || n == 2) return (long)1;
		else return (fibRecur(n-1)+fibRecur(n-2));
	}
}