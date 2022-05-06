import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean s = false;
		boolean r = false;

		System.out.println("\nPlease enter \"true\" or \"false\"");
		for (int i=0;i<2;i++) {
			if (i==0) System.out.print("S = ");
			else if (i==1) System.out.print("R = ");
			String in = scan.nextLine().toLowerCase();
			if (in.equals("false")) {
				if (i==0) s = false;
				else if (i==1) r = false;
			}
			else if (in.equals("true")) {
				if (i==0) s = true;
				else if (i==1) r = true;
			}
			else {
				System.out.println("Please enter \"true\" or \"false\"");
				i--;
			}
		}

		// Hardcoded output for undefined S-R latch
		if (s && r) {
			System.out.println("SR Latch table:");
			System.out.println("");
			System.out.println("!S  !R  |  Q  !Q ");
			System.out.println("-----------------");
			System.out.println(" 0   0  |  U   U ");
		}

		// Hardcoded output for Q₀ S-R latch
		else if (!(s || r)) {
			System.out.println("SR Latch table:");
			System.out.println("");
			System.out.println("!S  !R  |  Q  !Q ");
			System.out.println("-----------------");
			System.out.println(" 1   1  |  Qo !Qo");
		}

		// Calculation for S-R latch
		else {
			boolean q0 = true;
			boolean q = (!(s && q0));
			char q_char = q ? '0' : '1';
			char nq_char = q ? '1' : '0';
			char ns_char = !s ? '1' : '0';
			char nr_char = !r ? '1' : '0';

			System.out.println("SR Latch table:");
			System.out.println("");
			System.out.println("!S  !R  |  Q  !Q ");
			System.out.println("-----------------");
			System.out.println(" "+ns_char+"   "+nr_char+"  |  "+q_char+"   "+nq_char+" ");
		}
	}
}