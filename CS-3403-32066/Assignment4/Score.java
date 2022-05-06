import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

// Acts as a Struct with static helper functions
class Score {
	public String team1name;
	public String team2name;
	public long team1score;
	public long team2score;

	@Override
	public String toString() {
		return(
			"Team 1: " + team1name
			+ "\nTeam 2: " + team2name
			+ "\nScore: " + team1score + "-" + team2score
			+ "\n");
	}

	// reads file from filePath and returns contents as JSONArray
	static JSONArray parseScores(String filePath) {
		JSONParser parser = new JSONParser();

		try {
			return (JSONArray) parser.parse(new FileReader(filePath));
		}
		catch (Exception e) {
			System.out.println("An exception occurred while parsing scores from JSON file " + filePath);
			System.exit(-1);
		}
		return new JSONArray();
	}

	// combine 3 JSONArray into one Score[]
	static Score[] combineLists(JSONArray list1, JSONArray list2, JSONArray list3) {
		Score[] temp = new Score[list1.size() + list2.size() + list3.size()];

		for (int i=0; i<temp.length; i++) {
			if (i<list1.size()) temp[i] = jsonObjectToScore(list1.get(i));
			else if (i<list1.size()+list2.size()) temp[i] = jsonObjectToScore(list2.get(i-list1.size()));
			else temp[i] = jsonObjectToScore(list3.get(i-(list1.size()+list2.size())));
		}

		return temp;
	}

	// cast Object to JSONObject, convert to Score
	static Score jsonObjectToScore(Object input) {
		Score temp = new Score();
		JSONObject obj = (JSONObject) input;

		temp.team1name = (String) obj.get("Team 1");
		temp.team2name = (String) obj.get("Team 2");
		temp.team1score = (long) obj.get("Team 1 Score");
		temp.team2score = (long) obj.get("Team 2 Score");

		return temp;
	}

	static void mergeSort(Score[] array, int length) {
		if (length < 2) {
			return;
		}

		int mid = length / 2;
		Score[] left = new Score[mid];
		Score[] right = new Score[length-mid];

		for (int i=0; i<mid; i++) {
			left[i] = array[i];
		}
		for (int i=mid; i<length; i++) {
			right[i-mid] = array[i];
		}

		mergeSort(left, mid);
		mergeSort(right, length-mid);

		merge(array, left, right, mid, length-mid);

	}

	static void merge(Score[] array, Score[] left, Score[] right, int leftindex, int rightindex) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftindex && j < rightindex) {
			if (compareStrings(left[i].team1name, right[j].team1name)) {
				array[k++] = left[i++];
			}
			else {
				array[k++] = right[j++];
			}
		}
		while (i<leftindex) {
			array[k++] = left[i++];
		}
		while (j<rightindex) {
			array[k++] = right[j++];
		}
	}

	// Returns true if first string should come before second string
	static boolean compareStrings(String s1, String s2) {
		s1 = s1.replaceAll("\\s+","").toLowerCase();
		s2 = s2.replaceAll("\\s+","").toLowerCase();
		if (s1.compareTo(s2) <= 0) return true;
		else return false;
	}
}