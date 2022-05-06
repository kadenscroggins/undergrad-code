// Kaden Scroggins
// CS-3173-20256
// Homework 1

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Assignment1 {
	
	public static void main(String[] args) {

		float frequency = 0;
		float period1 = 0;

		System.out.println("\nPeriodic pulse train calculation");
		frequency = scanFloat("Input frequency: ");
		// Period = 1 / Frequency
		period1 = 1 / frequency;
		System.out.println("A periodic pulse train with frequency " + frequency + " has a period of " + period1);
		

		float t_w = 0; // logic 1 pulse duration
		float period2 = 0;
		float dutycycle = 0;

		System.out.println("\nDuty cycle calculation");
		t_w = scanFloat("Input logic 1 pulse duration (t_w): ");
		period2 = scanFloat("Input period: ");
		// Duty cycle = (logic 1 pulse duration / period) x 100%
		dutycycle = (t_w / period2) * 100;
		System.out.println("A periodic pulse train with a t_w of " + t_w + " and a period of " + period2
			+ " has a duty cycle of " + dutycycle + "%");


		Scanner scan = new Scanner(System.in);
		System.out.print("\nName of file to output results to: ");
		String fileName = scan.nextLine().replaceAll("[^a-zA-Z0-9]", ""); // Scan for file name and use regex to strip special chars
		File file = new File(fileName + ".txt");
		try {
			PrintWriter output = new PrintWriter(file);
			output.println("A periodic pulse train with frequency " + frequency + " has a period of " + period1);
			output.print("A periodic pulse train with a t_w of " + t_w + " and a period of " + period2
			+ " has a duty cycle of " + dutycycle + "%");
			output.close();
			System.out.println("File " + fileName + ".txt created successfully, output saved.");
		}
		catch (Exception e) {
			System.out.println("Error during file creation process, exiting.");
			System.exit(0);
		}


	}

	/**
	* Returns a float from user input, prompting for what it should be.
	* Example: float frequency = scanFloat("Input frequency:");
	* 
	* @param prompt what to prompt the user before collecting input
	*/
	static float scanFloat(String prompt) {
		
		// Initialize variable to avoid errors
		float output = 0;
		Scanner scan = new Scanner(System.in);

		// Handle input and avoid crashing if it is invalid
		while (true) {
			System.out.print(prompt);

			try {
				output = scan.nextFloat();
			}
			catch (Exception e) {
				System.out.println("Invalid input! Must be a number");
				scan.next(); // clear scanner input to avoid looping error
				continue; // restart while loop
			}
			break; // exit while loop
		}
		return output;
	}
}