import java.util.HashMap;
import java.util.ArrayList;

public class Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("San", 3);
		map.put("Ni", 2);
		map.put("Roku", 6);
		map.put("Q", 9);

		// I don't know why I did it this way and I think it's terrible
		ArrayList<HashMap.Entry<String, Integer>> list = new ArrayList<HashMap.Entry<String, Integer>>();
		for (HashMap.Entry<String, Integer> i : map.entrySet()) {
			list.add(i);
		}

		for (HashMap.Entry<String, Integer> i : list) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}
}