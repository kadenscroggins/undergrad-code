// Euler problem 4
// Solution: 906609

public class PalindromeProduct4 {
	public static void main(String[] args) {
		String longest = "00";
		for (int i=100;i<1000;i++) {
			for (int k=100;k<1000;k++) {
				String current = ""+(i*k);
				String reverse = "";
				for (int j=current.length()-1;j>=0;j--) {
					reverse = reverse+""+current.charAt(j);
				}
				if (current.equals(reverse)&&Integer.parseInt(current)>Integer.parseInt(longest)) {
					longest = current;
				}
			}
		}
		System.out.println(longest);
	}
}