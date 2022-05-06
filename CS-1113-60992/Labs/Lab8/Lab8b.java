
// Lab 8b
// Kaden Scroggins
// 60

public class Lab8b
{
	public static final int SIZE = 10; 
	public static void main(String[] args)
	{
		int table[][] = new int[SIZE][];
		for (int r=0; r<table.length; r++) 
		{
			// Set table[r] to a new array of int with
			// size r+1.
			table[r] = new int[r+1];
		}

		// Write code that fills in the array with
		// a subtraction table, so that table[r][c] = r-c.
		// Hint: Use a nested loop, and make
		// sure the inner loop iterates goes from 0
		// to the length of the row: table[r].length
		for (int r=0;r<table.length;r++)
		{
			for (int c=0;c<table[r].length;c++)
			{
				table[r][c] = r-c;
			}
		}

		// Iterate over the table, printing each value
		// so that columns align (hint: use a nested loop,
		// and printf)
		for (int r=0;r<table.length;r++)
		{
			for (int c=0;c<table[r].length;c++)
			{
				System.out.printf("%3d", table[r][c]);
			}
			System.out.println();
		}
	}
}