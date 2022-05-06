import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.File;
import java.io.FileWriter;

public class Assignment4 {
	public static void main(String[] args) {
		// parseScores reads JSON files from string path
		JSONArray list1 = Score.parseScores("data/1.json");
		JSONArray list2 = Score.parseScores("data/2.json");
		JSONArray list3 = Score.parseScores("data/3.json");

		// combineLists takes the 3 JSONArrays, converts data to Score type,
		// and returns them as a combined, unsorted array of Score type
		Score[] list4 = Score.combineLists(list1, list2, list3);
		Score.mergeSort(list4, list4.length);

		// print array to console
		for (Score s : list4) System.out.println(s);

		// print array to output.txt
		File output = new File("output.txt");
		FileWriter outputWriter = null;
		try {
			outputWriter = new FileWriter(output);
			for (Score s : list4) {
				outputWriter.write(s.toString());
				outputWriter.write("\n");
				outputWriter.flush();
			}
		}
		catch (Exception e) {
			System.out.println("An error occurred while attempting to write to file.");
			System.exit(-1);
		}

	}
}