import java.util.*;

public class Poly {

	public static void main(String[] args) {
		int[] testArray = {4,0,-8,0,3,2};
		Poly testPoly = new Poly(testArray);

		if (testPoly != null) { 
			System.out.println("Test passed: Poly testPoly exists");
		}
		else {
			System.out.println("Test failed: Poly testPoly does not exist");
		}

		if (testPoly.degree() == 4) {
			System.out.println("Test passed: testPoly.degree() = " + testPoly.degree());
		}
		else {
			System.out.println("Test failed: testPoly.degree() = " + testPoly.degree());
		}

		if (testPoly.toString().equals("2x^5+3x^4-8x^2+4")) {
			System.out.println("Test passed: testPoly.toString() = " + testPoly.toString());
		}
		else {
			System.out.println("Test failed: testPoly.toString() = " + testPoly.toString());
		}

		int[] addArray = {0,-2,4,1};
		Poly addPoly = testPoly.add(new Poly(addArray));
		if (addPoly.toString().equals("2x^5+3x^4+x^3-4x^2-2x+4")) {
			System.out.println("Test passed: testPoly + addPoly = " + addPoly.toString());
		}
		else {
			System.out.println("Test failed: testPoly + addPoly = " + addPoly.toString());
		}

		if (testPoly.evaluate(2.0) == 84) {
			System.out.println("Test passed: testPoly.evaluate(2.0) = " + testPoly.evaluate(2.0));
		}
		else System.out.println("Test failed: testPoly.evaluate(2.0) = " + testPoly.evaluate(2.0));
	}

	private int[] coefficients;
	private int degree;
	private String toString = "";

	public Poly(int[] coefficients) {
		
		this.coefficients = coefficients;
		
		degree = 0;
		for (int i : coefficients) {
			if (i>degree) degree = i;
		}

		for (int i=coefficients.length-1;i>=0;i--) {
			if (coefficients[i]==0) {
				continue;
			}
			else if (i==0 && coefficients[0] > 0) {
				toString += "+" + coefficients[0];
			}
			else if (i==0 && coefficients[0] < 0) {
				toString += "-" + coefficients[0];
			}
			else if (i==1) {
				if (coefficients[i]<1) toString += coefficients[1] + "x";
				else if (coefficients[i]>1) toString += "+" + coefficients[1] + "x";
				else toString += "x";
			}
			else if (i==coefficients.length-1) {
				toString += coefficients[i] + "x^" + i;
			}
			else if (i>0 && coefficients[i] > 1) {
				toString += "+" + coefficients[i] + "x^" + i;
			}
			else if (i>0 && coefficients[i] == -1) {
				toString += "-x^" + i;
			}
			else if (i>0 && coefficients[i] == 1) {
				toString += "+x^" + i;
			}
			else if (i>0 && coefficients[i] < -1) {
				toString += coefficients[i] + "x^" + i;
			}
		}
	}

	private int degree() {
		return degree;
	}

	private int[] coefficients() {
		return coefficients;
	}

	public String toString() {
		return toString;
	}

	private Poly add(Poly a) {
		int[] coefficients = a.coefficients();
		int[] ret;
		if (coefficients.length >= this.coefficients.length) {
			ret = Arrays.copyOf(coefficients, coefficients.length);
			for (int i=0; i<this.coefficients.length;i++) {
				ret[i] += this.coefficients[i];
			}
		}
		else {
			ret = Arrays.copyOf(this.coefficients, this.coefficients.length);
			for (int i=0; i<coefficients.length;i++) {
				ret[i] += coefficients[i];
			}
		}
		return new Poly(ret);
	}

	private double evaluate(double x) {
		double ret = 0.0;
		for (int i=0; i<coefficients.length;i++) {
			ret += Math.pow(x, i)*coefficients[i];
		}
		return ret;
	}
}

// Finish the rest of the tests to make sure they work.