// Lab 4a
// Kaden Scroggins
// 60992
// This program will print user's current academic year given by the user.

import java.util.*;

public class Lab4a
{
	public static void main(String[] args)
	{
		// Declare five String constants, one for each year of possible input.
		final String YEAR1 = "Freshman";
		final String YEAR2 = "Sophomore";
		final String YEAR3 = "Junior";
		final String YEAR4 = "Senior";
		final String YEAR5 = "grad";

		// User input for current year
		int academicYear;

		// Create a Scanner Object to read in data.
		Scanner scan = new Scanner(System.in);

		// Write code to prompt the user for a year number.
		// Then, store the input into acedemicYear. You may assume that
		// the user will enter a valid number.
		System.out.println("What year of University are you in?: ");
		academicYear = scan.nextInt();

		// Write a series of if ... else if ... else statements
		// to print out what year you are based on the int read in.
		// If a 1 is entered print "Freshman"
		// If a 2 is entered print "Sophomore"
		// If a 3 is entered print "Junior"
		// If a 4 is entered print "Senior"
		// If a 5 is entered print "grad"
		// If something beside those five numbers was entered,
		// Print an error message and quit the program.
		if (academicYear > 5 || academicYear < 1) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		else if (academicYear == 1) {
			System.out.println("You are a Freshman");
		}
		else if (academicYear == 2) {
			System.out.println("You are a Sophomore");
		}
		else if (academicYear == 3) {
			System.out.println("You are a Junior");
		}
		else if (academicYear == 4) {
			System.out.println("You are a Senior");
		}
		else if (academicYear == 5) {
			System.out.println("You are a grad");
		}

	} // End of main()
} // End of class
