// CS I : Program 6
// Postfix Calculator
// Semester : 1
//
// Kaden Scroggins
// 60992
//
// Functions as a calculator that takes postfix notation

/* !!NOT A FINISHED PROJECT!! */

import java.io.*;
import java.util.*;

public class Program6
{
	public static HashMap<String,Double> memory = new HashMap<String,Double>();
	public static ArrayList<String> keys = new ArrayList<>();

	public static int inType(String in)
	{
		// 0 = quit (closes the program)
		// 1 = clear (clear all variables)
		// 2 = var (prints variable names and their values)
		// 3 = single variable (prints the variable specified if it is all that is given)
		// 4 = assignment (a = 1 1 +)
		// 5 = expression (1 1 +)
		// 6 = about (describes the program)

		int ret;
		String[] tokens = in.split(" ");

		if (tokens[0].equalsIgnoreCase("quit")) ret = 0;
		else if (tokens[0].equalsIgnoreCase("clear")) ret = 1;
		else if (tokens[0].equalsIgnoreCase("var")) ret = 2;
		else if (tokens.length == 1) ret = 3;
		else if (tokens[1].equals("=") && tokens.length >= 4) ret = 4;
		else if (tokens.length >= 2) ret = 5;
		else ret = 6;

		return ret;
	}

	public static ArrayList<Integer> parseOperators(String in, int type)
	{
		// 1 = addition
		// 2 = subtraction
		// 3 = multiplication
		// 4 = division
		// 5 = sqrt
		// 6 = sin
		// 7 = cos
		// 8 = tan

		String[] tokens = in.split(" ");
		ArrayList<Integer> ret = new ArrayList<>();

		int i;
		if (type == 4) i = 2; // stops the method from checking the variable and =
		else i = 0;

		for (;i<tokens.length;i++)
		{
			if (tokens[i].equals("+")) ret.add(1);
			else if (tokens[i].equals("-")) ret.add(2);
			else if (tokens[i].equals("*")) ret.add(3);
			else if (tokens[i].equals("/")) ret.add(4);
			else if (tokens[i].equalsIgnoreCase("sqrt")) ret.add(5);
			else if (tokens[i].equalsIgnoreCase("sin")) ret.add(6);
			else if (tokens[i].equalsIgnoreCase("cos")) ret.add(7);
			else if (tokens[i].equalsIgnoreCase("tan")) ret.add(8);
		}
		return ret;
	}

	public static ArrayList<Double> parseOperands(String in, int type)
	{
		String[] tokens = in.split(" ");
		ArrayList<Double> ret = new ArrayList<>();

		int i;
		if (type == 4) i = 2; // stops the method from checking the variable and =
		else i = 0;

		for (;i<tokens.length;i++)
		{
			boolean keycheck = false;
			try
			{
				ret.add(Double.parseDouble(tokens[i]));
			}
			catch (NumberFormatException e)
			{
				keycheck = true;
			}
			if (keycheck) try
			{
				ret.add(memory.get(tokens[i]));
			}
			catch (NullPointerException e)
			{
				System.out.println("Invalid variable");
			}
		}
		return ret;
	}

	public static double operate(ArrayList<Integer> operators, ArrayList<Double> operands)
	{
		double ret = operands.get(0);
		for (int i=1;i<operands.size();i++)
		{
			if (operators.get(i-1) == 1) ret += operands.get(i);
			else if (operators.get(i-1) == 2) ret -= operands.get(i);
			else if (operators.get(i-1) == 3) ret *= operands.get(i);
			else if (operators.get(i-1) == 4) ret /= operands.get(i);
			else if (operators.get(i-1) == 5) ret = Math.sqrt(ret);
			else if (operators.get(i-1) == 6) ret = Math.sin(ret);
			else if (operators.get(i-1) == 7) ret = Math.cos(ret);
			else if (operators.get(i-1) == 8) ret = Math.tan(ret);
		}
		return ret;
	}

	public static void calculator(String in)
	{
		int type = inType(in);
		ArrayList<Integer> operators = parseOperators(in, type);
		ArrayList<Double> operands = parseOperands(in, type);

		if (type == 0)
		{
			System.out.println("Goodbye.");
			System.exit(0);
		}
		else if (type == 1)
		{
			memory.clear();
			keys.clear();
		}
		else if (type == 2)
		{
			for (String i : keys)
			{
				System.out.printf("{ %s:%f, ", i, memory.get(i));
			}
			System.out.println(" }");
		}
		else if (type == 3) System.out.println(memory.get(in));
		else if (type == 4)
		{
			double result = operate(operators, operands);
			String[] split = in.split(" ");
			memory.put(split[0], result);
			System.out.println(result);
		}
		else if (type == 5) System.out.println(operate(operators, operands));
		else System.out.println("Postfix Notation Calculator");
	}

	public static void main(String[] args)
	{
		System.out.println("Program 6 by Kaden Scroggins");

		Scanner scan = new Scanner(System.in);
		while (true)
		{
			//System.out.print("> ");
			calculator(scan.nextLine());
		}
	}
}
