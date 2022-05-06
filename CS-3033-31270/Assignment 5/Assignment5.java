import java.util.Collections;
import java.util.ArrayList;

public class Assignment5 {
	public static void main(String args[]) {
		ArrayList<Account> accounts = new ArrayList<Account>();

		accounts.add(new Account(150));
		accounts.add(new Account(75));
		accounts.add(new Account(200));
		accounts.add(new Account(800));
		accounts.add(new Account(50));

		System.out.print("Created " + accounts.size() + " accounts with the following balances\n	");
		for (int i=0; i<accounts.size(); i++) {
			System.out.printf("$%.2f", accounts.get(i).getBalance());
			if (i<accounts.size()-1) System.out.print(", ");
			else System.out.println();
		}

		System.out.print("Depositing $50.00 into account 2: ");
		accounts.get(1).deposit(50.00);
		System.out.printf("Now has $%.2f%n", accounts.get(1).getBalance());

		System.out.print("Withdrawing $25.00 from account 2 ");
		accounts.get(1).withdraw(25.00);
		System.out.printf("which now has $%.2f%n", accounts.get(1).getBalance());

		System.out.print("Sorted accounts\n	");
		Collections.sort(accounts);
		for (int i=0; i<accounts.size(); i++) {
			System.out.printf("$%.2f", accounts.get(i).getBalance());
			if (i<accounts.size()-1) System.out.print(", ");
			else System.out.println();
		}

	}
}

class Account implements Comparable<Account> {
	private double balance;

	public Account() {
		balance = 0;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double cash) {
		balance += cash;
	}

	public void withdraw(double cash) {
		balance -= cash;
	}

	@Override
	public int compareTo(Account compared) {
		if (balance < compared.getBalance()) return -1;
		else if (balance > compared.getBalance()) return 1;
		else return 0;
	}
}