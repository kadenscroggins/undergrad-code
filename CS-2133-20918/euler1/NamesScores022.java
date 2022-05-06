// Euler Problem 22
// Answer - 871198282

import java.util.*;
import java.io.*;

public class NamesScores022 {
	public static void main(String[] args) {
		ArrayList<String> sorted = new ArrayList<>();
		Scanner scan = null;
		try {
			scan = new Scanner(new File("p022_names.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found: p022_names.txt");
			System.exit(0);
		}
		while (scan.hasNextLine()) {
			sorted.add(scan.nextLine());
		}
		// Note: the p022_names.txt file format was changed to make it easier to input
		Collections.sort(sorted);

		int result = 0;
		for (int i=0;i<sorted.size();i++) {
			int val = 0;
			for (int k=0;k<sorted.get(i).length();k++) {
				val += (int)sorted.get(i).charAt(k) - 64;
				// subtracting 64 brings the ASCII value of A from 65 to 1, and so on
			}
			result += (i+1)*val;
		}
		System.out.println(result);
	}
}