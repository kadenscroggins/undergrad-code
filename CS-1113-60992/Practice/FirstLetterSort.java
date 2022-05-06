//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CS I : Program (number)
// (Program Name)
// Semester : 1
//
// Kaden Scroggins
// 60992
//
// Description:
// (Program Description)
import java.util.Scanner;

public class FirstLetterSort {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Type a word, and I'll list the first two letters of " +
      "it in alphabetical order for you.\n");
    String y;
    y = input.nextLine();
    char a = y.charAt(0);
    char b = y.charAt(1);
    System.out.println("\nFirst letter: " + a + "\nSecond letter: " + b + "\n");
    if (b > a) System.out.println("In order: " + a + b);
    else System.out.println("In order: " + b + a);

  }
}
