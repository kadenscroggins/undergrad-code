import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<= 100; i++) numbers.add(i);

		ArrayList<Optional<Integer>> newNumbers = new ArrayList<>();
		numbers.forEach(n -> { if (n>50) newNumbers.add(Optional.of(n)); });

		System.out.println(newNumbers.stream()
			.collect(Collectors.averagingInt(n -> n.get())));
	}
}