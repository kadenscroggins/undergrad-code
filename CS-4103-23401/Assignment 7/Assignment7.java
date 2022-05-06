import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Assignment7 {
	public static void main(String[] args) {
		String data = "Kolmikko	snowland 88\nTohoku	JR ski ski 89\nYuki snow 87";

		// try-catch block to create and write the files
		try {
			FileWriter fw = new FileWriter("sequential.txt");
			RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

			fw.write(data);
			fw.flush();
			fw.close();

			raf.writeChars(data);
			raf.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

		// try-catch block to open and read files
		try {
			System.out.println("\n---- Sequential Access: Sequential File ----");
			System.out.println(
				Files.readString(
					Paths.get("sequential.txt")));

			System.out.println("\n-------- Random Access: Random File --------");
			RandomAccessFile raf = new RandomAccessFile("random.txt", "r");
			String line = raf.readLine();
			while (line != null) {
				System.out.println(line);
				line = raf.readLine();
			}

			System.out.println("\n------ Sequential Access: Random File ------");
			System.out.println(
				Files.readString(
					Paths.get("sequential.txt")));

			System.out.println("\n------ Random Access: Sequential File ------");
			raf = new RandomAccessFile("random.txt", "r");
			line = raf.readLine();
			while (line != null) {
				System.out.println(line);
				line = raf.readLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
