/*
	CS1: Program 6
	Postfix Calculator
	Semester: 1

	Kaden Scroggins
	CS-1113-60992

	Calculator that takes postfix notation
*/

import java.io.*;
import java.util.*;

public class PostfixCalc
{
	public static HashMap<String,Double> memory = new HashMap<String,Double>();
	public static ArrayList<String> keys = new ArrayList<String>();
	public static final double NOTENOUGHOPERATORS = -27984.0000800004;

	public static String[] parseOperators(String in)
	{
		// Returns the operators in string format
		// "+" "-" "*" "/" "sqrt" "sin" "cos" "tan"

		String[] tokens = in.split(" ");
		ArrayList<String> holding = new ArrayList<String>();

		int i;
		if (tokens.length > 2 && tokens[1].equals("=")) i = 2;
		else i = 0;

		for (;i<tokens.length;i++)
		{
			if (tokens[i].equals("+") || tokens[i].equals("-") ||
				tokens[i].equals("*") || tokens[i].equals("/") ||
				tokens[i].equalsIgnoreCase("sin") || tokens[i].equalsIgnoreCase("cos") ||
				tokens[i].equalsIgnoreCase("tan") || tokens[i].equalsIgnoreCase("sqrt"))
			{
				holding.add(tokens[i]);
			}
		}
		String[] ret = new String[holding.size()];
		for (int a=0;a<holding.size();a++)
		{
			ret[a] = holding.get(a);
		}
		return ret;
	}

	public static double[] parseOperands(String in)
	{
		// returns an array of the values of the operands
		// also pulls variables out of memory and returns as doubles

		String[] tokens = in.split(" ");
		ArrayList<Double> holding = new ArrayList<Double>();

		int i;
		if (tokens.length > 2 && tokens[1].equals("=")) i = 2;
		else i = 0;

		for (;i<tokens.length;i++)
		{
			if (memory.containsKey(tokens[i]))
			{
				holding.add(memory.get(tokens[i]));
			}
			else if (tokens[i].equals("+") || tokens[i].equals("-") ||
				tokens[i].equals("*") || tokens[i].equals("/") ||
				tokens[i].equalsIgnoreCase("sin") || tokens[i].equalsIgnoreCase("cos") ||
				tokens[i].equalsIgnoreCase("tan") || tokens[i].equalsIgnoreCase("sqrt"))
			{
				continue;
			}
			else try
			{
				holding.add(Double.parseDouble(tokens[i]));
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid variable: " + tokens[i]);
				double[] err = new double[0];
				return err;
			}
		}

		double[] ret = new double[holding.size()];
		for (int a=0;a<holding.size();a++)
		{
			ret[a] = holding.get(a);
		}
		return ret;
	}

	public static double calculate(String[] operators, double[] operands)
	{
		double ret = operands[0];
		int i = 1;
		if (operands.length == 1) System.out.println(operands[0]);
		else if (operators.length == 0) return ret;
		else if (operators.length < operands.length-1)
		{
			System.out.println("Not enough operators");
			return NOTENOUGHOPERATORS;
		}
		else do
		{
			if (operators[i-1].equals("+")) ret += operands[i];
			else if (operators[i-1].equals("-")) ret -= operands[i];
			else if (operators[i-1].equals("*")) ret *= operands[i];
			else if (operators[i-1].equals("/")) ret /= operands[i];
			else if (operators[i-1].equalsIgnoreCase("sqrt")) ret = Math.sqrt(ret);
			else if (operators[i-1].equalsIgnoreCase("sin")) ret = Math.sin(ret);
			else if (operators[i-1].equalsIgnoreCase("cos")) ret = Math.cos(ret);
			else if (operators[i-1].equalsIgnoreCase("tan")) ret = Math.cos(ret);
			i++;
		}
		while (i<operands.length || (i<=operators.length && "sqrtsincostan".contains(operators[i-1])));
		return ret;
	}

	public static void main(String[] args)
	{
		System.out.println("Postfix Calculator by Kaden Scroggins");

		Scanner scan = new Scanner(System.in);

		while (true)
		{
			System.out.print(">");
			String in = scan.nextLine();
			double result = 0.0;
			String[] tokens = in.split(" ");

			if (in.equalsIgnoreCase("quit"))
			{
				System.out.print("Goodbye.");
				System.exit(0);
			}
			else if (in.equalsIgnoreCase("clear"))
			{
				keys.clear();
				memory.clear();
				System.out.println("Memory cleared.");
			}
			else if (in.equalsIgnoreCase("var"))
			{
				System.out.print("{");
				for (String a : keys)
				{
					String b = ",";
					if (a.equals(keys.get(keys.size()-1))) b = "";
					System.out.printf(" %s:%1.4f%s ", a, memory.get(a), b);
				}
				System.out.println("}");
			}
			else if (in.equalsIgnoreCase("about"))
			{
				System.out.println("Postfix Notation Calculator by Kaden Scroggins" +
					"\nCommands:\nAbout - describes the program... \nQuit - exits the program" +
					"\nClear - removes all variables\nvar - prints all variable names and values");
			}
			else if (tokens.length == 1) System.out.println(memory.get(tokens[0]));
			else 
			{
				String[] operators = parseOperators(in);
				double[] operands = parseOperands(in);
				if (operands.length == 0) continue;
				result = calculate(operators, operands);

				if (tokens.length > 2 && tokens[1].equals("="))
				{
					if (memory.containsKey(tokens[0]))
					{
						memory.put(tokens[0],result);
					}
					else
					{
						memory.put(tokens[0],result);
						keys.add(tokens[0]);
					}
				}
				if (result != NOTENOUGHOPERATORS) System.out.println(result);
			}
		}
	}
}