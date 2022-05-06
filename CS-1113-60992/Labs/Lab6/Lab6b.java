// Lab 6b
// Kaden Scroggins
// 60992

import java.util.*;

public class Lab6b
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		// Read in the number of data points
		int numDataPoints = scan.nextInt();

		// Create an array to hold the data points, and another to
		// hold the moving average
		double data[] = new double[numDataPoints];
		double secondDerivative[] = new double[numDataPoints];

		// Read in all of the data points using a for loop
		for (int i=0;i<numDataPoints;i++) {
			data[i]=scan.nextDouble();
		}

		// Print out the data using printArray
		printArray(data);
		System.out.println();

		// Create the second derivative for each data point
		// and save them in the secondDerivative array
		// Since the first and last elements of the array do not have
		// neighbors, set the second derivatives of those indices to 0
		/* Because of the way the array was declared, the first and last
		 		elements are both already 0. */
		for (int i=1;i<data.length-1;i++) {
			secondDerivative[i] = (data[i-1])+2*(data[i])+(data[i+1]);
		}
		// Print the second derivative array using printArray.
		printArray(secondDerivative);
	}

	public static void printArray(double[] arr)
	{
		// Print the values of arr on a single line with spaces between them.
		System.out.println();
		for (double print : arr) {
			System.out.printf("%1.1f, ", print);
		}
	}
}
