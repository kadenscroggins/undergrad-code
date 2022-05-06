// Lab 7c
// <Your name>
// <Your section number>
// Largest value for Strings = <your value here>
// Largest value for StringBuilder = <your value here>

public class Lab7c
{
	public static void main(String args[])
	{
		int size = Integer.parseInt(args[0]);
		String a = "x";
		for (int i=0; i<size; i++) 
		{
			if (i%1000==0) 
			{
				System.out.println(i);
			}
			// Concatenate a single letter onto a
			a = a + "x";
		}
		System.out.println(a);
	}
}
