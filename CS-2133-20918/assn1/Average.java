import java.util.*;

public class Average
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double sum = 0.0;
		ArrayList<Double> input = new ArrayList<Double>();
		while (true)
		{
			double x;
			System.out.print("> ");
			try
			{
				x = Double.parseDouble(scan.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.print("Please input a single number!\nType a negative number to finish.\n");
				x = -1.0;
				continue;
			}
			if (x >= 0)
			{
				input.add(x);
			}
			else break;
		}
		for (double x : input)
		{
			sum += x;
		}
		System.out.println("Numbers entered: " + input.size());
		System.out.print("Average: " + (sum / input.size()));
	}
}