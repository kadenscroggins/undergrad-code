import java.util.*;
/**
 * Extends the Function class to allow finding roots of the cos function
 */
public class CosFunc extends Function {

	/**
	 * Implements the Sin function
	 * @param x the value of x to be evaluated by cos(x)
	 * @return the result of cos(x)
	 */
	public double evaluate(double x) {
		return Math.cos(x);
	}

}