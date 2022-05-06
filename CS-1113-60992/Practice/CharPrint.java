import java.util.Scanner;
public class CharPrint {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    String s;
    System.out.println("Enter a word to spill out");
    s = x.nextLine();
    int a = s.length();
    int b = 0;
    while (a > b) {
      System.out.println("" + s.charAt(b));
      b++;
    }
  }
}
