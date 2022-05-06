// Lab 7a
// Kaden Scroggins
// 60992

import java.util.*;

public class Lab7a
{
	public static void main(String args[])
	{
		ArrayList<Double> list = createSquaresList(10);
		printList(list);
		removeElement(list, 4);
		printList(list);
		swapElements(list, 2, 6);
		printList(list);
		
		double max = getMaxValue(list);
		double ave = getAverage(list);
		
		// Print the max and average
		System.out.printf("Max value: %1.3f%nAverage: %1.3f%n", max, ave);
		
		int idx1 = linearSearch(list, 4);
		int idx2 = linearSearch(list, 75);
		
		// Print the two indices
		System.out.printf("Index 1: %d%nIndex 2: %d", idx1, idx2);
	}

	public static ArrayList<Double> createSquaresList(int n)
	{
		// Create an ArrayList with the squares of n numbers, 0 to n-1
		// Return the ArrayList
		ArrayList<Double> squaresList = new ArrayList<>();
		for (int i=0;i<n;i++)
		{
			squaresList.add((double)(i*i));
		}
		return squaresList;
	}

	public static double getMaxValue(ArrayList<Double> list)
	{
		double max = 0.0;
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i) > max) max = list.get(i);
		}
		return max;
	}
	
	public static double getAverage(ArrayList<Double> list)
	{
		double sum = 0.0;
		for (double a : list)
		{
			sum += a;
		}
		return sum;
	}
	
	public static void removeElement(ArrayList<Double> list, int index)
	{
		// Remove the specified element from the list.
		list.remove(index);
	}
	
	public static void swapElements(ArrayList<Double> list, int a, int b)
	{
		// Write code that swaps elements a and b of the ArrayList
		// Hint: you need a temporary variable.
		double c = list.get(a);
		list.set(a, list.get(b));
		list.set(b, c);
	}
	
	public static int linearSearch(ArrayList<Double> list, double val)
	{
		// Use a linear search to find the index of a particular value.
		// Return that index, or -1 if the value is not found.
		// Do not use list.indexOf(val)
		int index = -1;
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i)==val)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void printList(ArrayList<Double> list)
	{
		// Print out the number of the list on one line, separated by 
		// a comma and space, with a newline at the end.
		for (double i : list)
		{
			System.out.printf("%1.3f, ", i);
		}
		System.out.println();
	}
}
