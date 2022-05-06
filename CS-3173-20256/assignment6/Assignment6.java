import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		// Input
		Scanner scan = new Scanner(System.in);
		String in = new String();
		boolean correctSyntax = false;

		while (!correctSyntax) {
			System.out.print("Input an 8-bit binary number: ");
			in = scan.nextLine();
			if (in.length() != 8) continue;

			for (int i = 0; i < 8; i++) {
				if ((in.charAt(i) == '0') || (in.charAt(i) == '1')) correctSyntax = true;
				else correctSyntax = false;
			}
		}

		// Calculation
		System.out.println("Input byte will now be inverted.\nInput byte : " + in);

		char bits[] = new char[8];
		for (int i = 0; i < 8; i++) {
			bits[i] = in.charAt(i);
			if (bits[i] == '0') bits[i] = '1';
			else bits[i] = '0';
		}

		String out = new String(bits);
		System.out.println("Output byte: " + out);
	}
}