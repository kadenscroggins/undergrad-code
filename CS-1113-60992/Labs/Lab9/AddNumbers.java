// ReverseCL
// Kaden Scroggins
// 60992

public class AddNumbers
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		if (args.length != 2)
		{
			System.out.println("Usage: java AddNumbers <Integer> <Integer>");
			System.exit(0);
		}
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Usage: java AddNumbers <Integer> <Integer>");
			System.exit(0);
		}
		System.out.println(a + b);
	} 
} 
