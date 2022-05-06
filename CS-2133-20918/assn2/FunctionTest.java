import java.util.*;

public class FunctionTest {

	public static void main(String[] args) {
		
		System.out.println(findRoot(3, 4, 0.00000001));

	}

	public static double findRoot(double a, double b, double epsilon) {
		
		double ret = 0.0;
		double x = (a+b)/2;
		if (Math.abs(a-x) < epsilon) ret = x;
		else if ((Math.sin(x) >= 0 && Math.sin(a) >= 0) || (Math.sin(x) < 0 && Math.sin(a) < 0)) {
			ret = findRoot(x , b, epsilon);
		}
		else {
			ret = findRoot(a, x, epsilon);
		}

		return ret;
	}

}