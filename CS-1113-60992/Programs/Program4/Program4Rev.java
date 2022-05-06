import java.util.*;

public class Program4Rev {
  private static final String b00 = "  |";
  private static final String b01 = " .|";
  private static final String b10 = ". |";
  private static final String b11 = "..|";
  private static final String[][] braille = {
                                  {b00, b00, b00},
                                  {b10, b00, b00},
                                  {b10, b10, b00},
                                  {b11, b00, b00},
                                  {b11, b01, b00},
                                  {b10, b01, b00},
                                  {b11, b10, b00},
                                  {b11, b11, b00},
                                  {b10, b11, b00},
                                  {b01, b10, b00},
                                  {b01, b11, b00},
                                  {b10, b00, b10},
                                  {b10, b10, b10},
                                  {b11, b00, b10},
                                  {b11, b01, b10},
                                  {b10, b01, b10},
                                  {b11, b10, b10},
                                  {b11, b11, b10},
                                  {b10, b11, b10},
                                  {b01, b10, b10},
                                  {b01, b11, b10},
                                  {b10, b00, b11},
                                  {b10, b10, b11},
                                  {b01, b11, b01},
                                  {b11, b00, b11},
                                  {b11, b01, b11},
                                  {b10, b01, b11}
                              };
  private static String[] getBraille(char in) {
    in = Character.toLowerCase(in);
    String checkLetter = "abcdefghijklmnopqrstuvwxyz";
    String checkNumber = "0123456789";
    String inString = "" + in;
    int value = (int)in;
    if (checkLetter.contains(inString)) {
      int i = value - 96;
      return braille[i];
    }
    else if (checkNumber.contains(inString)) {
      if (in == '0') {
        return braille[10];
      }
      else {
        int i = value - 48;
        return braille[i];
      }
    }
    else return braille[0];
  }
  private static void printBraille(String in) {
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < in.length(); y++) {
        String z[] = getBraille(in.charAt(y));
        System.out.print(z[x]);
      }
    System.out.println();
    }
  }
  public static void main(String[] args){
    System.out.println("Program 4 by Kaden Scroggins");
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter text to convert to braille: ");
    String input = scan.nextLine();
    for (int i=0; i<input.length();i++) {
      System.out.printf("%-3c",input.charAt(i));
    }
    System.out.println();
    printBraille(input);
  }
}
