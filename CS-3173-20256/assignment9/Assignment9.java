import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a27 = false, a26 = false, a25 = false, a24 = false;

		System.out.println("Input \"true\" or \"false\" for each of the following chip selector lines:\n");
		for (int i=0;i<4;i++) {
			if (i==0) System.out.print("a27: ");
			else if (i==1) System.out.print("a26: ");
			else if (i==2) System.out.print("a25: ");
			else if (i==3) System.out.print("a24: ");

		 	String in = scan.nextLine().toLowerCase();

		 	if (in.equals("false")) continue; // default values are set to false, so setting to false isn't required
			else if (in.equals("true")) {
				if (i==0) a27 = true;
				else if (i==1) a26 = true;
				else if (i==2) a25 = true;
				else if (i==3) a24 = true;
			}
			else {
				System.out.println("Please enter \"true\" or \"false\"");
				i--;
			}
		}

		boolean output = !(!a27 && !a26 && a25 && a24);
		System.out.println("\nInput: a27="+a27+", a26="+a26+", a25="+a25+", a24="+a24);
		System.out.println("Output: "+output);

		if (!output) System.out.println("\nAs the output is false (low), and this is an active-low circuit, this microchip is selected.");
		else System.out.println("\nAs the output is true (high), and this is an active-low circuit, this microchip is not selected.");

	}
}