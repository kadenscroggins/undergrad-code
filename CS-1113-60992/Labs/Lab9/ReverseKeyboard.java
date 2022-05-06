// ReverseCL
// Kaden Scroggins
// 60992

import java.util.*;

public class ReverseKeyboard
{
	public static void main(String[] args)
	{
		System.out.println("Please input a string to be reversed.");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String rev = "";

		for (int i=0; i<s.length(); i++) 
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println(rev); 
	} 
} 
