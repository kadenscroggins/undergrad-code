import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birthDay = 0;
		int birthMonth = 0;
		int birthYear = 0;
		String nameLast = "";
		String nameFirst = "";

		// get name
		System.out.print("\nWhat is the First Name: ");
		nameFirst = scan.nextLine();
		System.out.print("What is the Last Name: ");
		nameLast = scan.nextLine();

		// get birth year from user
		while (true) {
			System.out.print("What is the birth year: ");
			try {
				birthYear = Integer.parseInt(scan.nextLine());
				if (birthYear < 0) throw new Exception();
			}
			catch (Exception e) {
				System.out.println("Invalid input!");
				continue;
			}

			break;
		}

		// get birth month from user
		while (true) {
			System.out.print("What is the birth month: ");
			try {
				// For some reason, the Calendar class indexes months from 0-11,
				// with 0 being January. Not the date, though! Weird.
				// So we subtract 1 from the input to adjust for this.
				birthMonth = Integer.parseInt(scan.nextLine()) - 1;
				if (birthMonth < 0 || birthMonth > 11) throw new Exception();
			}
			catch (Exception e) {
				System.out.println("Invalid input!");
				continue;
			}

			break;
		}

		// get birth day from user
		while (true) {
			System.out.print("What is the birth day: ");
			try {
				birthDay = Integer.parseInt(scan.nextLine());
				if (birthDay < 1) throw new Exception();
				// I could handle leap years, but the way they are calculated is so complicated
				// and it probably won't matter, so I won't handle them.
				else if (birthMonth == 1 && birthDay > 29) throw new Exception();
				else if ((birthMonth + 1) % 2 == 0 && birthMonth < 7
					&& birthDay > 30) throw new Exception();
				else if ((birthMonth + 1) % 2 != 0 && birthMonth >= 7
					&& birthDay > 30) throw new Exception();
				else if (birthDay > 31) throw new Exception();
			}
			catch (Exception e) {
				System.out.println("Invalid input!");
				continue;
			}

			break;
		}

		Person person = new Person(nameFirst, nameLast, birthYear, birthMonth, birthDay);
		System.out.print("\n" + person.getName() + ", age " + person.calculateAge()
			+ " was born on " + person.getBirthdayString() + " ");

		// Print today's date
		GregorianCalendar today = (GregorianCalendar) Calendar.getInstance();
		System.out.printf("and today is %d-%d-%d\n\n", today.get(Calendar.MONTH) + 1,
			today.get(Calendar.DATE), today.get(Calendar.YEAR));
	}
}