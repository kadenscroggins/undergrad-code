import java.util.*;

public class Fib
{
	public static void main(String[] args)
	{
		int n = 0;
		try
		{
			n = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e)
		{
			System.out.print("Spits out Fibibacci numbers to degree n\nUsage: java Fib <n>");
			System.exit(0);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Spits out Fibibacci numbers to degree n\nUsage: java Fib <n>");
			System.exit(0);
		}
		finally
		{
			if (n < 1)
			{
				System.out.print("Error: n must be greater than 0");
				System.exit(0);
			}
		}

		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		for (int i = 2; i < n; i++)
		{
			fib.add(fib.get(i-1)+fib.get(i-2));
		}
		System.out.print(fib.get(n-1));
	}
}