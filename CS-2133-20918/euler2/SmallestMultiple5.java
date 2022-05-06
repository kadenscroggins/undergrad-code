// Euler Problem 5
// Solution: 232792560

public class SmallestMultiple5 {
	public static void main(String[] args) {
		long smallest=0;
		for (int i=20; smallest==0; i+=20) {
			if (i%19==0 && i%18==0 && i%17==0 && i%16==0 && i%15==0 && i%14==0 && i%13==0 & i%12==0 && i%11==0) {
				smallest = i;
			}
		}
		System.out.println(smallest);
	}
}