import java.util.Calendar;
import java.util.GregorianCalendar;

class Person {
	private String nameFirst;
	private String nameLast;
	private GregorianCalendar birthday;

	public Person(String nameFirst, String nameLast, int year, int month, int dayOfMonth) {
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		birthday = new GregorianCalendar(year, month, dayOfMonth);
	}

	public GregorianCalendar getBirthday() {
		return birthday;
	}

	public String getBirthdayString() {
		return (birthday.get(Calendar.MONTH) + 1) + "-" + birthday.get(Calendar.DATE)
			+ "-" + birthday.get(Calendar.YEAR);
	}

	public int calculateAge() {
		GregorianCalendar today = (GregorianCalendar) Calendar.getInstance();

		today.add(Calendar.DATE, -1 * birthday.get(Calendar.DATE));
		today.add(Calendar.MONTH, -1 * birthday.get(Calendar.MONTH));
		today.add(Calendar.YEAR, -1 * birthday.get(Calendar.YEAR));

		return (today.get(Calendar.YEAR));
	}

	public String getName() {
		return nameFirst + " " + nameLast;
	}
}