// Lab 5b
// Kaden Scroggins
// 60992

import java.util.*;

public class Lab5b
{
	public static void main(String args[])
	{
		double[] a = {1, 0, 0};
		double[] b = {0, 1, 1};
		double[] c = {1, 1, 1};
		double[] d = {0, 0, 1};

		double ab = arraysqrt(a,b);
		double ac = arraysqrt(a,c);
		double ad = arraysqrt(a,d);

		System.out.println("ab=" + ab + ", ac=" + ac + ", ad=" + ad);
	}

	public static double arraysqrt(double[] x, double[] y) {
		return Math.sqrt(
      (x[0]-y[0])*(x[0]-y[0]) +
      (x[1]-y[1])*(x[1]-y[1]) +
      (x[2]-y[2])*(x[2]-y[2]) );
	}
}
