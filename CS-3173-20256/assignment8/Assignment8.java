import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean input = false;

		System.out.println("\nPlease enter \"true\" or \"false\"");
		for (int i=0;i<3;i++) {
			if (i==0) System.out.print("Present state of A = ");
			else if (i==1) System.out.print("Present state of B = ");
			else if (i==2) System.out.print("Input = ");
		 	String in = scan.nextLine().toLowerCase();
			if (in.equals("false")) {
				if (i==0) a = false;
				else if (i==1) b = false;
				else if (i==2) input = false;
			}
			else if (in.equals("true")) {
				if (i==0) a = true;
				else if (i==1) b = true;
				else if (i==2) input = true;
			}
			else {
				System.out.println("Please enter \"true\" or \"false\"");
				i--;
			}
		}

		boolean nexta = false;
		boolean nextb = false;

		// States of next A
		if ((a==false)&&(b==false)&&(input==false)) nexta = false;
		if ((a==false)&&(b==false)&&(input==true)) nexta = false;
		if ((a==false)&&(b==true)&&(input==false)) nexta = false;
		if ((a==false)&&(b==true)&&(input==true)) nexta = true;
		if ((a==true)&&(b==false)&&(input==false)) nexta = true;
		if ((a==true)&&(b==false)&&(input==true)) nexta = true;
		if ((a==true)&&(b==true)&&(input==false)) nexta = true;
		if ((a==true)&&(b==true)&&(input==true)) nexta = false;

		// States of next B
		if ((a==false)&&(b==false)&&(input==false)) nextb = false;
		if ((a==false)&&(b==false)&&(input==true)) nextb = true;
		if ((a==false)&&(b==true)&&(input==false)) nextb = true;
		if ((a==false)&&(b==true)&&(input==true)) nextb = false;
		if ((a==true)&&(b==false)&&(input==false)) nextb = false;
		if ((a==true)&&(b==false)&&(input==true)) nextb = true;
		if ((a==true)&&(b==true)&&(input==false)) nextb = true;
		if ((a==true)&&(b==true)&&(input==true)) nextb = false;

		System.out.println("\nNext A: "+nexta);
		System.out.println("Next B: "+nextb);
	}
}