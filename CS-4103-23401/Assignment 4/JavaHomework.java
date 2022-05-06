// JavaHomework.java
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class JavaHomework implements Homework {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			// create temporary instance to use non-static method
			(new JavaHomework()).genTxtFile();
			Scanner scan = new Scanner(new File("homework4.txt"));
			while (scan.hasNext()) list.add(scan.nextInt());
		}
		catch (Exception e) {
			System.out.println("An error occurred");
			System.exit(-1);
		}

		for (int x : list) System.out.println(x);
	}

	public void genTxtFile() throws IOException {
		try {
			FileWriter fw = new FileWriter("homework4.txt");
			for (int i=0; i<100; i++) {
				fw.write("" + (i+1));
				if (i<99) fw.write("\n");
			}
			fw.close();
		}
		catch (IOException e) {
			throw e;
		}
	}
}