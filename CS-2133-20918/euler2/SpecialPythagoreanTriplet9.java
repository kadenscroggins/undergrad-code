// Euler Problem 9
// Solution: 31875000

public class SpecialPythagoreanTriplet9 {
	public static void main(String[] args) {
		for (int i=1;i<1000;i++) {
			for (int k=1;k<1000;k++) {
				for (int j=1;j<1000;j++) {
					if ((i*i)+(j*j)==(k*k) && i+j+k==1000) {
						System.out.println("a="+i+",b="+j+",c="+k);
						System.out.println("product="+(i*j*k));
						System.exit(0);
					}
				}
			}
		}
	}
}