import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Problem9 {
	public static void main(String args[]) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Test", "test", "test")) {
			Statement stat = conn.createStatement();
			stat.execute("CREATE TABLE Publisher("
				+ "PublisherID int NOT NULL, "
				+ "Address VARCHAR(100), "
				+ "PRIMARY KEY (PublisherID))");
			stat.execute("CREATE TABLE Author("
				+ "AuthorID int NOT NULL, "
				+ "Name VARCHAR(50), "
				+ "PRIMARY KEY (AuthorID), "
				+ "FOREIGN KEY (PublisherID) REFERENCES Publisher(PublisherID)");
			stat.execute("CREATE TABLE Book("
				+ "BookID int NOT NULL, "
				+ "Title VARCHAR(50), "
				+ "Year DATE, "
				+ "PRIMARY KEY (BookID), "
				+ "FOREIGN KEY (PublisherID) REFERENCES Publisher(PublisherID), "
				+ "FOREIGN KEY (AuthorID) REFERENCES Author(AuthorID))");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}