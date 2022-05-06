import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = false;
		boolean b = false;

		System.out.println("\nPlease enter \"true\" or \"false\"");
		for (int i=0;i<2;i++) {
			if (i==0) System.out.print("A = ");
			else if (i==1) System.out.print("B = ");
			String in = scan.nextLine().toLowerCase();
			if (in.equals("false")) {
				if (i==0) a = false;
				else if (i==1) b = false;
			}
			else if (in.equals("true")) {
				if (i==0) a = true;
				else if (i==1) b = true;
			}
			else {
				System.out.println("Please enter \"true\" or \"false\"");
				i--;
			}
		}
		
		System.out.println("\nA: " + a + "\nB: " + b + 
			"\nA and B: " + (a && b) + "\nA or B: " + (a || b) +
			"\n(A and B) and (A or B): " + ((a && b) && (a || b)) + 
			"\n(A and B) or (A or B): " + ((a && b) || (a || b)));
	}
}