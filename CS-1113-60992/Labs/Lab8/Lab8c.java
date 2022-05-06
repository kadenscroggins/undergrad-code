
// Lab 8c
// Kaden Scroggins
// 60992
// Largest value = 752

public class Lab8c
{
	public static void main(String[] args)
	{
		int SIZE = Integer.parseInt(args[0]);

		// Create a 3-dimensional array of double where
		// the size of each dimension is SIZE:
		double table[][][] = new double[SIZE][SIZE][SIZE];

		// Fill in the table using a 3-deep nested loop so that
		// table[a][b][c] = 1.5 for all a,b,c.
		for (int l=0;l<SIZE;l++)
		{
			for (int w=0;w<SIZE;w++)
			{
				for (int h=0;h<SIZE;h++)
				{
					table[l][w][h] = 1.5;
				}
			}
		}
	}
}