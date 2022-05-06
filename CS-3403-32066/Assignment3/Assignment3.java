import java.io.File;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.io.FileWriter;
import java.util.Random;

public class Assignment3 {
	public static void main(String[] args) {
		File customerCSV = new File("customers.csv");
		File output = new File("output.txt");
		Customer[] customers = Customer.readFromCSV(customerCSV);
		FileWriter outputWriter = null;
		Random rand = new Random();


		// Set up output file
		try {
			outputWriter = new FileWriter(output);
		}
		catch (Exception e) {
			System.out.println("An error occurred.");
			System.exit(-1);
		}

		// create queue and enqueue customers
		Queue<Customer> queue = new LinkedList<>();
		for (Customer c : customers) queue.add(c);

		// Time, in minutes, from midnight - 540 would be 9AM
		int time = 540;

		// dequeue customers, generate random time, and call teller() to service each customer
		while (queue.peek() != null) {
			int duration = rand.nextInt(9) + 1; // generate from 0 to 9, add one
			Customer.totalTellerWaitTime += duration;
			time += duration;
			time += rand.nextInt(5); // Add 0 to 5 minutes of wait between customers

			Customer c = queue.remove();
			c.arrivalTime = time;
			c.serviceTime = duration;

			String serviceReport = Customer.serve(c);
			printAndWrite(serviceReport, outputWriter);
		}

		// Print how many times each teller was seen, average customers seen, and total wait time
		printAndWrite(Customer.tellerInfo(), outputWriter);
		printAndWrite("Average customers seen by each teller: "
			+ (Customer.tellerCount[0] + Customer.tellerCount[1] + Customer.tellerCount[2]) / 3 + "\n",
			outputWriter);
		printAndWrite("Total teller wait time: " + Customer.totalTellerWaitTime + " minutes", outputWriter);
		// Note that teller number was randomly generated and stored in file,
		//  so the teller number a customer goes to and the teller's totals will be the same each time,
		//  but the wait time will be different since it is random.


		// finish writing to file
		try {
			outputWriter.close();
		}
		catch (Exception e) {
			System.out.println("An error occurred.");
			System.exit(-1);
		}
	}

	// Prints the same text to file and to the console
	static void printAndWrite(String s, FileWriter fw) {
		System.out.print(s);
		try {
			fw.write(s);
			fw.flush();
		}
		catch (Exception e) {
			System.out.println("An error occurred.");
			System.exit(-1);
		}
	}
}