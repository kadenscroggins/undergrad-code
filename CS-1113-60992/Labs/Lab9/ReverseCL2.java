// ReverseCL
// Kaden Scroggins
// 60992

public class ReverseCL2
{
	public static void main(String[] args)
	{
		String s = null;
		if (args.length>0) s = args[0];
		else
		{
			System.out.println("Usage: ReverseCL2 <String>");
			System.exit(0);
		}
		String rev = "";

		for (int i=0; i<s.length(); i++) 
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println(rev); 
	} 
} 
