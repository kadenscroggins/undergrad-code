import java.util.*;
/**
 * Creates an object type PolyFunc which represents one-variable polynomials
 * and extends the Function class to allow roots of polynomials to be found
 */
public class PolyFunc extends Function {

	public static void main(String[] args) {
		int[] testArray = {4,0,-8,0,3,2};
		PolyFunc testPolyFunc = new PolyFunc(testArray);

		if (testPolyFunc != null) { 
			System.out.println("Test passed: PolyFunc testPolyFunc exists");
		}
		else {
			System.out.println("Test failed: PolyFunc testPolyFunc does not exist");
		}

		if (testPolyFunc.degree() == 4) {
			System.out.println("Test passed: testPolyFunc.degree() = " + testPolyFunc.degree());
		}
		else {
			System.out.println("Test failed: testPolyFunc.degree() = " + testPolyFunc.degree());
		}

		if (testPolyFunc.toString().equals("2x^5+3x^4-8x^2+4")) {
			System.out.println("Test passed: testPolyFunc.toString() = " + testPolyFunc.toString());
		}
		else {
			System.out.println("Test failed: testPolyFunc.toString() = " + testPolyFunc.toString());
		}

		int[] addArray = {0,-2,4,1};
		PolyFunc addPolyFunc = testPolyFunc.add(new PolyFunc(addArray));
		if (addPolyFunc.toString().equals("2x^5+3x^4+x^3-4x^2-2x+4")) {
			System.out.println("Test passed: testPolyFunc + addPolyFunc = " + addPolyFunc.toString());
		}
		else {
			System.out.println("Test failed: testPolyFunc + addPolyFunc = " + addPolyFunc.toString());
		}

		if (testPolyFunc.evaluate(2.0) == 84) {
			System.out.println("Test passed: testPolyFunc.evaluate(2.0) = " + testPolyFunc.evaluate(2.0));
		}
		else System.out.println("Test failed: testPolyFunc.evaluate(2.0) = " + testPolyFunc.evaluate(2.0));
	}

	private int[] coefficients;
	private int degree;
	private String toString = "";

	/**
	 * Constructor for creating polynomial functions
	 * @param coefficients an array of int, in order of the coefficient
	 * of the term with lowest to highest degree
	 */
	public PolyFunc(int[] coefficients) {
		
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

	/**
	 * Gets the power associated with the highest non-zero coefficient
	 * @return the power associated with the highest non-zero coefficient
	 */
	public int degree() {
		return degree;
	}

	/**
	 * Gets the original coefficients used to build the polynomial
	 * @return the array of coefficients originally passed into the function
	 */
	public int[] coefficients() {
		return coefficients;
	}

	/**
	 * Gets the polynomial as a human-readable string
	 * @return the polynomial, string-ified into a normal function
	 */
	public String toString() {
		return toString;
	}

	/**
	 * Adds two polynomials together
	 * @param a add child PolyFunc to be added to the parent PolyFunc
	 * @return the result of adding the two polynomials together
	 */
	public PolyFunc add(PolyFunc a) {
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
		return new PolyFunc(ret);
	}

	/**
	 * Evaluates the polynomial with a given value of x
	 * @param x the value of x to pass to the polynomial
	 * @return the result of the polynomial evaluated using x
	 */
	public double evaluate(double x) {
		double ret = 0.0;
		for (int i=0; i<coefficients.length;i++) {
			ret += Math.pow(x, i)*coefficients[i];
		}
		return ret;
	}
}