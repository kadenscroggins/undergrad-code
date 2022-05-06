import java.io.File;
import java.util.Scanner;

// Customer struct with static helper functions
class Customer {
	// Variables for the "struct"
	public int id;
	public int tellerNumber;
	public int arrivalTime;
	public int serviceTime;
	public double transactionAmount;
	public double balance;
	public char transactionType;
	public String firstName;
	public String lastName;

	// Static variables to keep track of teller transactions
	public static int[] tellerCount = {0,0,0};
	public static double[] tellerDeposits = {0.0,0.0,0.0};
	public static double[] tellerWithdrawls = {0.0,0.0,0.0};
	public static int totalTellerWaitTime = 0;

	// Converts CSV file into Customer array
	// CSV file shouldn't have any column titles or an empty line at the end
	static Customer[] readFromCSV(File file) {
		int lines = 0;

		// Scan length of file
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				scan.nextLine();
				lines++;
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong getting file length.");
			e.printStackTrace();
			System.exit(-1);
		}

		// Create array based on how many lines are in CSV
		Customer[] returnArray = new Customer[lines];

		// Read file to newly created array
		try {
			Scanner scan = new Scanner(file);
			for (int i=0; i<lines; i++) {
				Customer tempCustomer = new Customer();
				String line = scan.nextLine();
				Scanner lineScan = new Scanner(line);
				lineScan.useDelimiter(",");

				tempCustomer.id = lineScan.nextInt();
				tempCustomer.firstName = lineScan.next();
				tempCustomer.lastName = lineScan.next();
				tempCustomer.transactionAmount = lineScan.nextDouble();
				tempCustomer.transactionType = lineScan.next().charAt(0);
				tempCustomer.balance = lineScan.nextDouble();
				tempCustomer.tellerNumber = lineScan.nextInt();

				returnArray[i] = tempCustomer;
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong reading the file to the array.");
			e.printStackTrace();
			System.exit(-1);
		}


		return returnArray;
	}

	// Used to print out all the info from customer array
	static void testPrintCustomerArray(Customer[] customers) {
		for (Customer c : customers) {
			System.out.println(c.id + " "
						   + c.firstName + " "
						   + c.lastName + " "
						   + c.transactionAmount + " "
						   + c.transactionType + " "
						   + c.balance + " "
						   + c.tellerNumber);
		}
	}

	// Modify customer balances and teller totals, and return a report of the customer interaction
	static String serve(Customer customer) {
		String serviceReport = String.format(
			"Customer %d: %s %s arrived at %s to %s $%.2f with teller %d%nCurrent balance: $%.2f",
			customer.id,
			customer.firstName,
			customer.lastName,
			Customer.getTime(customer.arrivalTime),
			Customer.transactionTypeString(customer.transactionType),
			customer.transactionAmount,
			customer.tellerNumber,
			customer.balance
			);

		// Perform deposit / withdrawl on customer account
		if (customer.transactionType == 'D') customer.balance += customer.transactionAmount;
		else customer.balance -= customer.transactionAmount;

		serviceReport += String.format(
			"    New balance: $%.2f    Wait time: %d minutes%n%n",
			customer.balance,
			customer.serviceTime
			);

		// Add to teller totals
		tellerCount[customer.tellerNumber - 1] += 1;
		if (customer.transactionType == 'D') tellerDeposits[customer.tellerNumber - 1] += customer.transactionAmount;
		else tellerWithdrawls[customer.tellerNumber-1] += customer.transactionAmount;

		return serviceReport;
	}

	// converts integer representing seconds from midnight to formatted string representing time
	static String getTime(int time) {
		int hours = time / 60;
		int minutes = time % 60;

		String ampm;
		if (time >= 720) ampm = "PM";
		else ampm = "AM";

		return (String.format("%d:%02d%s", hours, minutes, ampm));
	}

	// Convert "W" to "withdrawl" and "D" to "deposit"
	static String transactionTypeString(char c) {
		if (c == 'W') return "withdrawl";
		if (c == 'D') return "deposit";
		return ("ERROR");
	}

	// returns a report of the current teller totals
	static String tellerInfo() {
		String tellerReport = new String();
		for (int i=0; i<tellerCount.length;i++) {
			tellerReport += String.format(
				"Teller %d was seen %d times today.    Deposits: $%.2f    Withdrawls: $%.2f    Total: $%.2f%n",
				i+1,
				tellerCount[i],
				tellerDeposits[i],
				tellerWithdrawls[i],
				tellerDeposits[i] - tellerWithdrawls[i]);
		}

		return tellerReport;
	}
}