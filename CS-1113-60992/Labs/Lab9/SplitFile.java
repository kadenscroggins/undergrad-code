
// SplitFile
// Kaden Scroggins
// 60992

import java.util.*;
import java.io.*;

public class SplitFile
{
	public static void main(String[] args)
	{
		// Usage statement (3 inputs needed)
		if (args.length != 3)
		{
			System.out.println("Usage: java SplitFile <Input file> <Output file 1> <Output file 2>");
			System.exit(0);
		}
		PrintWriter file1 = null;
		PrintWriter file2 = null;

		try {
			// Open Scanner for file named args[0]
			Scanner scan = new Scanner(new File(args[0]));

			// Open a PrintWriter for file named args[1]
			file1 = new PrintWriter(new File(args[1]));

			// Open a PrintWriter for file named args[2]
			file2 = new PrintWriter(new File(args[2]));

			while (scan.hasNextLine())
			{
				// Read a line from scan
				// Write that line to file1
				file1.println(scan.nextLine());

				if (scan.hasNextLine()) 
				{
					// Read a line from scan
					// Write that line to file2
					file2.println(scan.nextLine());
				}
			}
		}
		// Catch the IOException 
		catch (IOException ex)
		{
			System.out.println("Caught IO Exception\n");
			ex.printStackTrace();
		}

		// Create a finally block that closes the two PrintWriters
		finally
		{
			file1.close();
			file2.close();
		}
   } 
} 

