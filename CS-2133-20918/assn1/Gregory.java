public class Gregory
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
			System.out.print("Spits out Pi according to degree n of the Gregory series\nUsage: java Gregory <n>");
			System.exit(0);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Spits out Pi according to degree n of the Gregory series\nUsage: java Gregory <n>");
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

		double gregory = 0.0;
		for (int i = 1; i <= n; i++)
		{
			gregory += (Math.pow(-1,(i+1)))/((2*i)-1);
		}
		double approx = gregory * 4;
		System.out.println("Pi according to Gregory series: " + approx);
		double error = ((Math.PI - approx) / Math.PI) * 100;
		System.out.print("This differs from Java's value by " + error + " percent.");
	}
}