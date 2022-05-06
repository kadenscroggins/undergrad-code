import java.io.*;

public class Caesar {
	public static void main(String[] args) {
		int key = 0;
		FileReader in = null;
		FileWriter out = null;

		if (args.length != 3 && args.length != 2) {
			System.out.println("Incorrect number of arguments");
			System.out.println("Usage: java Caesar <key> <infile> [outfile]");
			System.exit(0);
		}
		try {
			key = Integer.parseInt(args[0]);
			in = new FileReader(args[1]);
			if (args.length == 3) {
				out = new FileWriter(args[2]);
			}
			int charValue;
			char outputChar;
			while ((charValue = in.read()) != -1) {
				
				if (charValue < 32 || charValue > 126) {
					outputChar = (char)charValue;
					if (out != null) {
						out.write((char)outputChar);
					}
					else {
						System.out.print((char)outputChar);
					}
					continue;
				}
				charValue = charValue + key;

				if (charValue > 126) {
					charValue = charValue - 95;
				}
				else if (charValue < 32) {
					charValue = charValue + 95;
				}
				outputChar = (char)charValue;
				if (out != null) {
					out.write((char)outputChar);
				}
				else {
					System.out.print((char)outputChar);
				}
			}


			in.close();
			if (out != null) {
				out.close();
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Error: key not a valid Integer");
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: file not found / not readable - " + args[1]);
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("Error: file not writeable - " + args[2]);
		}
	}
}