// Interleave 
// Kaden Scroggins
// 60992

import java.util.*;
import java.io.*;

public class Interleave
{
	public static void main(String[] args)
	{
		// Usage statement (2 inputs needed)
		if (args.length != 2)
		{
			System.out.println("Usage: java Interleave <file> <file>");
			System.exit(0);
		}

		try {

			// Open scanner for file named args[0]
			Scanner scan1 = new Scanner(new File(args[0]));

			// Open scanner for file named args[1]
			Scanner scan2 = new Scanner(new File(args[1]));

			boolean moreLines = true;
			while (moreLines)
			{
				moreLines = false;

				// If scan1 has another line then read that line, copy it 
				// to the console, and set moreLines to true
				if (scan1.hasNextLine()) 
				{
					System.out.println(scan1.nextLine());
					moreLines = true;
				}

				// If the second scanner, scan2, has another line, 
				// then get that line, copy it to the console, and set 
				// moreLines to true.
				if (scan2.hasNextLine())
				{
					System.out.println(scan2.nextLine());
					moreLines = true;
				}
			}
		}
		catch (IOException ex)
		{
			System.out.println("Caught IOException\n");
			ex.printStackTrace(System.out);
		}
	} 
} 

