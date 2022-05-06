public class Assignment2 {
	public static void main(String[] args) {
		Name me = new Name("Mr.", "Kaden", "Christopher", "Scroggins");
		Name mom = new Name("Dr.", "Tana", "Jo", "Scroggins");
		System.out.println("\nCreated two names");

		System.out.println("\nName #1:");
		System.out.println("	Short Name: " + me.getShortName());
		System.out.println("	Full Name: " + me.getFullName());
		System.out.println("	Formal Name: " + me.getFormalName());
		System.out.println("	Initials: " + me.getInitials());
		System.out.println("	Last, First: " + me.getLastCommaFirst());

		System.out.println("\nName #2:");
		System.out.println("	Short Name: " + mom.getShortName());
		System.out.println("	Full Name: " + mom.getFullName());
		System.out.println("	Formal Name: " + mom.getFormalName());
		System.out.println("	Initials: " + mom.getInitials());
		System.out.println("	Last, First: " + mom.getLastCommaFirst());

		System.out.println(); // gotta make that output look pretty
	}
}

class Name {
	private String prefix;
	private String first;
	private String middle;
	private String last;

	public Name(String prefix, String first, String middle, String last) {
		this.prefix = prefix;
		this.first = first;
		this.middle = middle;
		this.last = last;
	}

	public String getShortName() {
		return (first + " " + last);
	}

	public String getFullName() {
		return (first + " " + middle + " " + last);
	}

	public String getFormalName() {
		return (prefix + " " + first + " " + middle + " " + last);
	}

	// If there is not at least 1 character in each string, this throws an error
	public String getInitials() {
		return ("" + first.charAt(0) + middle.charAt(0) + last.charAt(0));
	}

	public String getLastCommaFirst() {
		return (last + ", " + first);
	}
}