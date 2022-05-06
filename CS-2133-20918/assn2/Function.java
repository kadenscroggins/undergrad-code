import java.util.*;
/**
 * Provides an abstract method for evaluating functions that can
 * be extended by a child class to allow its roots to be found
 */
public abstract class Function {

	public static void main(String[] args) {
		Function sin = new SinFunc();
		double resultsin = sin.findRoot(3, 4, 0.00000001);
		if (Math.abs(resultsin - Math.PI) < 0.0000001) {
			System.out.println("Test passed: root of Sin between 3 and 4 is Pi");
		}
		else {
			System.out.println("Test failed: root of Sin between 3 and 4 not found to be Pi");
		}

		Function cos = new CosFunc();
		double resultcos = cos.findRoot(0, 3, 0.00000001);
		if (Math.abs(resultcos - (0.5*Math.PI)) < 0.0000001) {
			System.out.println("Test passed: root of Cos between 1 and 3 is 1/2 Pi");
		}
		else {
			System.out.println("Test failed: root of Cos between 1 and 3 not found to be 1/2 Pi");
		}

		int[] coefa = {-3,0,1};
		Function polya = new PolyFunc(coefa);
		double resulta = polya.findRoot(0, 3, 0.0000001);
		if (Math.abs(resulta - Math.sqrt(3)) < 0.000001) {
			System.out.println("Test passed: positive root of x^2-3 is sqrt(3)");
		}
		else {
			System.out.println("Test failed: positive root of x^2-3 not found to be sqrt(3)");
		}

		int[] coefb = {-2,-1,1};
		Function polyb = new PolyFunc(coefb);
		double resultb = polyb.findRoot(0, 3, 0.0000001);
		if (Math.abs(resultb - 2.0) < 0.000001) {
			System.out.println("Test passed: positive root of x^2-x-2 is 2");
		}
		else {
			System.out.println("Test failed: positive root of x^2-x-2 not found to be 2");
		}
	}

	/**
	 * An abstract double that should be extended to return
	 * the result of a certain function applied to x
	 * @param x the value of x passed into the function to evaluate
	 * @return the result of the function using x
	 */
	public abstract double evaluate(double x);
	
	/**
	 * Finds the root of the function which extends the Function class
	 * @param a the lower bound for the root of the function
	 * @param b the upper bound forthe root of the function
	 * @param epsilon the maximum error for the root of the function
	 * @return the root of the function
	 */
	public double findRoot(double a, double b, double epsilon) {
		
		double ret = 0.0;
		double x = (a+b)/2;
		if (Math.abs(a-x) < epsilon) { 
			ret = x;
		}
		else if ((evaluate(x) >= 0 && evaluate(a) >= 0) || (evaluate(x) < 0 && evaluate(a) < 0)) {
			ret = findRoot(x , b, epsilon);
		}
		else {
			ret = findRoot(a, x, epsilon);
		}

		return ret;
	}
}