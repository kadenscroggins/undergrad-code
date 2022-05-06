import java.util.*;

public class Homework4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What do you want repeated?");
    String a = input.nextLine();
    System.out.println("How many times?");
    int b = input.nextInt();
    System.out.println(multiLetters(a,b));
    System.out.println("What about that there checkerboard grid? How big?");
    int x = input.nextInt();
    printPattern(x);
  }
  public static String multiLetters(String s, int d) {
    int n = s.length()-1;
    String out = "";
    for (int i = 0; i <= n; i++) {
      for (int x = 0; x < d; x++) {
        out += s.charAt(i);
      }
    }
    return out;
  }
  public static void printPattern(int n) {
    //   02345
    // 0 ....O
    // 1 ...OO
    // 2 ..OOO
    // 3 ...OO
    // 4 ....O
    String out = "";
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++) {
        if (r+c>=n-1 && (c-r)>=0) System.out.print("O");
        else System.out.print(".");
      }
      System.out.println();
    }
  }
}
