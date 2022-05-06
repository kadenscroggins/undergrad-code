// CS1: Program 5
// Sorting
// Semester: 1
//
// Kaden Scroggins
// CRN 60992
//
// Sorts an input file of hospital records
//  and returns them in a formatted table

import java.util.*;
import java.io.*;

public class PatientList
{
	public static void main(String[] args)
	{
		// Declaration of array of patients and scanner of file input
		ArrayList<Patient> patients = new ArrayList<>();
		Scanner scan = new Scanner("");

		// Catches errors if file input is wrong
		try
		{
			scan = new Scanner(new File(args[0]));
		}
		catch (FileNotFoundException fx)
		{
			//fx.printStackTrace();
			System.out.println("PatientList: file not found: " + args[0]);
			System.out.print("Usage: java PatientList <patient record> <sort type>");
			System.exit(0);
		}
		catch (IndexOutOfBoundsException fe)
		{
			//fe.printStackTrace();
			System.out.println("PatientList: no file specified");
			System.out.print("Usage: java PatientList <patient record> <sort type>");
			System.exit(0);
		}

		// Fills the array of patients
		while (scan.hasNext())
		{
			String line = scan.nextLine();
			String[] tokens = line.split(",");

			String last = "";
			String first = "";
			int age = 0;
			int room = 0;
			// Stops if CSV file is formatted incorrectly
			try
			{
				last = tokens[0];
				first = tokens[1];
				age = Integer.parseInt(tokens[2]);
				room = Integer.parseInt(tokens[3]);
			}
			catch (IndexOutOfBoundsException csvf)
			{
				//csvf.printStackTrace();
				System.out.println("PatientList: Invalid CSV file contents");
				System.out.print("Line format: <last name>,<first name>,<age>,<room>");
				System.exit(0);
			}
			catch (NumberFormatException csvn)
			{
				//csvn.printStackTrace();
				System.out.println("PatientList: Invalid CSV file contents");
				System.out.print("Line format: <last name>,<first name>,<age>,<room>");
				System.exit(0);
			}

			Patient patient = new Patient(last, first, age, room);
			patients.add(patient);
		}

		// Determines what to sort by, and catches errors
		// 1 = last name, 2 = first name, 3 = age, 4 = room number
		int sortby = 0;
		try
		{
			if (args[1].equals("last")) sortby = 1;
			else if (args[1].equals("first")) sortby = 2;
			else if (args[1].equals("age")) sortby = 3;
			else if (args[1].equals("room")) sortby = 4;
			else
			{
				System.out.println("PatientList: invalid sort type");
				System.out.print("Must sort by \"last\", \"first\", \"age\", or \"room\"");
				System.exit(0);
			}
		}
		catch (IndexOutOfBoundsException fs)
		{
			//fs.printStackTrace();
			System.out.println("PatientList: no sort type specified");
			System.out.println("Usage: java PatientList <patient record> <sort type>");
			System.out.print("Sort types: \"last\", \"first\", \"age\", or \"room\"");
			System.exit(0);
		}

		// Sorts list of patients by chosen type
		if (sortby == 1) Collections.sort(patients, new PatientLastComparator());
		else if (sortby == 2) Collections.sort(patients, new PatientFirstComparator());
		else if (sortby == 3) Collections.sort(patients, new PatientAgeComparator());
		else if (sortby == 4) Collections.sort(patients, new PatientRoomComparator());

		// Prints the sorted list of patients
		System.out.println("Program 5 by Kaden Scroggins\n");
		System.out.printf("%-12s%-12s%3s%6s%n%n",
			"Last Name", "First Name", "Age", "Room");
		for (int i = 0; i < patients.size(); i++)
		{
			System.out.println(patients.get(i).toString());
		}
	}
}