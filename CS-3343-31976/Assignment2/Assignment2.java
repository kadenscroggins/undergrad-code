import java.util.Scanner;
import java.lang.ProcessBuilder;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Assignment2 {
	public static void main(String[] args) {
		File file = new File("assignment2file.txt");

		// Create text file for opening
		try {
			PrintWriter writer = new PrintWriter(file);
			Scanner scan = new Scanner(System.in);
			System.out.print("Input text to be put into a new file: ");
			writer.print(scan.next());
			writer.close();
		}
		catch (Exception e) {
			System.out.println("An exception occurred while trying to create the file.");
			System.exit(-1);
		}

		// Get path to file in the working directory
		Path path = null;
		try {
			path = Paths.get(file.getCanonicalPath());
		}
		catch (Exception e) {
			System.out.println("An exception occurred while trying to get the file path.");
			System.exit(-1);
		}

		System.out.println("File created: \"" + path + "\"");

		// Create ProcessBuilder
		String[] processArgs = {"Notepad.exe", path.toString()};
		ProcessBuilder process = new ProcessBuilder(processArgs);

		try {
			process.start();
		}
		catch (Exception e) {
			System.out.println("An exception occurred while starting the process.");
			System.exit(-1);
		}

		System.out.println("File successfully opened in Notepad.");
	}
}