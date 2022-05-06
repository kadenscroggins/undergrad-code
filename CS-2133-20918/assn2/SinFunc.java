import java.util.*;
/**
 * Extends the Function class to allow finding roots of the cos function
 */
public class SinFunc extends Function {

	/**
	 * Implements the Sin function
	 * @param x the value of x to be evaluated by sin(x)
	 * @return the result of sin(x)
	 */
	public double evaluate(double x) {
		return Math.sin(x);
	}

}