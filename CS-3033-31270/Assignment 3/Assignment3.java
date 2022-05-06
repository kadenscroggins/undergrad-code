public class Assignment3 {
	public static void main(String[] args) {
		Account[] accounts = new Account[]{
			new Account(),
			new Account(),
			new Account(400),
			new Account(20.21),
			new Account(-50),
			new Account(-0.01)
		};

		System.out.println();
		Account.printTotalAccounts();

		System.out.println();
		for (Account acc : accounts) acc.printDetails();

		System.out.println();
		accounts[0].withdraw(0.01);
		accounts[1].deposit(0.01);
		accounts[5].deposit(1.50);

		System.out.println();
		for (Account acc : accounts) acc.printDetails();
		Account.printTotalAccounts();

		System.out.println();
	}
}

class Account {
	public static final double OVERDRAFT_FEE = 20.00;

	private static double totalBalances = 0.0;
	private static int nextAccountNumber = 1;

	private int accountNumber;
	private double balance;

	public Account() {
		accountNumber = nextAccountNumber;
		balance = 0;

		nextAccountNumber++;

		System.out.printf("Created account %06d%n", accountNumber);
	}

	public Account(double bal) {
		balance = bal;
		totalBalances += bal;
		accountNumber = nextAccountNumber;

		nextAccountNumber++;

		System.out.printf("Created account %06d with $%.2f%n", accountNumber, balance);
	}

	public void withdraw(double wth) {
		System.out.printf("Withdrawl from account %06d of $%.2f%n", accountNumber, wth);

		if (balance - wth < 0.0) {
			balance -= OVERDRAFT_FEE;
			totalBalances -= OVERDRAFT_FEE;
		}
		balance -= wth;
		totalBalances -= wth;
	}

	public void deposit(double dep) {
		System.out.printf("Deposit to account %06d of $%.2f%n", accountNumber, dep);

		balance += dep;
		totalBalances += dep;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isOverdrawn() {
		if (balance < 0.0) return true;
		else return false;
	}

	public static double getTotalAccounts() {
		return totalBalances;
	}

	public static void printTotalAccounts() {
		System.out.printf("Total of accounts = $%.2f%n", Account.getTotalAccounts());
	}

	public void printDetails() {
		System.out.printf("Account number=%06d, balance=$%.2f, ",
			accountNumber, balance);
		if (this.isOverdrawn()) System.out.println("Overdrawn");
		else System.out.println("Not overdrawn");
	}
}