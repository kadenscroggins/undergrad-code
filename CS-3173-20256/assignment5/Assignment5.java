import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean c_in = false;

		// This part 
		System.out.println("\nPlease enter \"true\" or \"false\"");
		for (int i=0;i<3;i++) {
			if (i==0) System.out.print("A = ");
			else if (i==1) System.out.print("B = ");
			else if (i==2) System.out.print("Carryin = ");
			String in = scan.nextLine().toLowerCase();
			if (in.equals("false")) {
				if (i==0) a = false;
				else if (i==1) b = false;
				else if (i==2) c_in = false;
			}
			else if (in.equals("true")) {
				if (i==0) a = true;
				else if (i==1) b = true;
				else if (i==2) c_in = true;
			}
			else {
				System.out.println("Please enter \"true\" or \"false\"");
				i--;
			}
		}

		System.out.println("\nA = "+a+", B = "+b+", Carryin = "+c_in);

		/*
		Full-adder

		Carryout:
		B ∙ C_in + A ∙ B + A ∙ C_in
			(b && c_in) || (a && b) || (a && c_in)
		
		Sum:
		¬A ∙ ¬B ∙ C_in + ¬A ∙ B ∙ ¬C_in + A ∙ B ∙ C_in + A ∙ ¬B ∙ ¬C_in
			(!a && !b && c_in) || (!a && b && !c_in)
				|| (a && b && c_in) || (a && !b && !c_in)
		*/

		boolean c_out = false;
		boolean sum = false;

		c_out = ((b && c_in) || (a && b) || (a && c_in));
		sum = ((!a && !b && c_in) || (!a && b && !c_in)
				|| (a && b && c_in) || (a && !b && !c_in));

		System.out.println("\nCarryout = " + c_out);
		System.out.println("Sum      = " + sum);
	}
}