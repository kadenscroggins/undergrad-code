import java.util.*;

public class Ramanujan {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double pi = 0.0;
		double sum = 0.0;
		for (int k=0;k<n;k++) {
			sum += ((Factorial.calculate(4*k))*(1103+(26390*k)))/(Math.pow((Factorial.calculate(k)),4)*Math.pow(396,(4*k)));
		}
		pi = Math.pow(((2*Math.sqrt(2))/9801)*sum,-1);
		System.out.println("Pi according to Ramanujan's series: " + pi);
		double error = ((Math.PI - pi) / Math.PI) * 100;
		System.out.print("This differs from Java's value by " + error + " percent.");
	}
}