/*
	CS1: Program 6
	Postfix Calculator
	Semester: 1

	Kaden Scroggins
	CS-1113-60992

	Calculator that takes postfix notation
*/

import java.util.*;
import java.io.*;

public class PostFix
{
	public static ArrayList<String> keys = new ArrayList<String>();
	public static HashMap<String, Double> memory = new HashMap<String, Double>();
	public static double result = 0.0;
	public static boolean nen;

	public static void main(String[] args)
	{
		System.out.println("Postfix Calculator by Kaden Scroggins");
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			nen = false;
			System.out.print("> ");
			String input = scan.nextLine();
			String[] tokens = input.split(" ");

			if (input.equalsIgnoreCase("quit"))
			{
				System.out.print("Goodbye.");
				System.exit(0);
			}
			else if (input.equalsIgnoreCase("clear"))
			{
				keys.clear();
				memory.clear();
				System.out.println("Memory cleared.");
			}
			else if (input.equalsIgnoreCase("var"))
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
			else if (input.equalsIgnoreCase("about"))
			{
				System.out.println("Postfix Notation Calculator by Kaden Scroggins" +
					"\nCommands:\nAbout - describes the program... \nQuit - exits the program" +
					"\nClear - removes all variables\nvar - prints all variable names and values");
			}
			else if (tokens.length == 0) { ; }
			else if (tokens.length == 1)
			{
				if (keys.contains(tokens[0])) System.out.println(tokens[0] + " = " + memory.get(tokens[0]));
				else if (isDouble(tokens[0])) System.out.println(tokens[0]);
				else System.out.println("Error: unknown variable " + tokens[0]);
			}
			else
			{
				Stack<String> stack = new Stack<String>();
				for (String i : tokens)
				{
					stack.push(i);
				}
				if (tokens[1].equals("="))
				{
					if (tokens.length == 3 && isDouble(tokens[2]))
					{
						if (!(keys.contains(tokens[0]))) keys.add(tokens[0]);
						memory.put(tokens[0], Double.parseDouble(tokens[2]));
						System.out.println(tokens[0] + " = " + tokens[2]);
					}
					else if (tokens.length == 3 && keys.contains(tokens[2]))
					{
						if (!(keys.contains(tokens[0]))) keys.add(tokens[0]);
						memory.put(tokens[0], memory.get(tokens[2]));
						System.out.println(tokens[0] + " = " + memory.get(tokens[2]));
					}
					else if (tokens.length == 3 && !(isDouble(tokens[2])))
					{
						System.out.println("Unknown variable " + tokens[2]);
					}
					else 
					{
						String[] trimmedTokens = new String[tokens.length-2];
						for (int i=2; i<tokens.length;i++)
						{
							trimmedTokens[i-2] = tokens[i];
						}
						calculate(trimmedTokens);
						if (!(keys.contains(tokens[0]))) keys.add(tokens[0]);
						memory.put(tokens[0], result);
						if (nen) continue;
						System.out.println(tokens[0] + " = " + result);
					}

				}
				else
				{
					calculate(tokens);
					if (nen) continue;
					System.out.println(result);
				}
			}
		}
	}

	public static void calculate(String[] tokens)
	{
		result = 0.0;
		Stack<Double> operands = new Stack<Double>();

		try
		{
			for (String x : tokens)
			{
				double a, b;
				if (isDouble(x)) operands.push(Double.parseDouble(x));
				else if (keys.contains(x)) operands.push(memory.get(x));
				else if (x.equals("+"))
				{
					b = operands.pop();
					a = operands.pop();
					operands.push(a+b);
				}
				else if (x.equals("-"))
				{
					b = operands.pop();
					a = operands.pop();
					operands.push(a-b);
				}
				else if (x.equals("/"))
				{
					b = operands.pop();
					a = operands.pop();
					operands.push(a/b);
				}
				else if (x.equals("*"))
				{
					b = operands.pop();
					a = operands.pop();
					operands.push(a*b);
				}
				else if (x.equalsIgnoreCase("sin"))
				{
					a = operands.pop();
					operands.push(Math.sin(a));
				}
				else if (x.equalsIgnoreCase("cos"))
				{
					a = operands.pop();
					operands.push(Math.cos(a));
				}
				else if (x.equalsIgnoreCase("tan"))
				{
					a = operands.pop();
					operands.push(Math.tan(a));
				}
				else if (x.equalsIgnoreCase("sqrt"))
				{
					a = operands.pop();
					operands.push(Math.sqrt(a));
				}
				else
				{
					System.out.println("Unknown variable" + x);
					nen = true;
					return;
				}
			}
		}
		catch (EmptyStackException e)
		{
			System.out.println("Not enough operands");
			nen = true;
			return;
		}

		if (operands.size() > 1)
		{
			System.out.println("Not enough operators");
			nen = true;
		}
		else result = operands.pop();
	}

	public static boolean isDouble(String in)
	{
		boolean ret = true;
		try
		{
			Double.parseDouble(in);
		}
		catch (NumberFormatException e)
		{
			ret = false;
		}
		return ret;
	}
}