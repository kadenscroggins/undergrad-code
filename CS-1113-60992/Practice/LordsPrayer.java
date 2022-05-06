import java.util.Scanner;

public class LordsPrayer {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int times;
    System.out.print("How many prayers do you want?: ");
    times = n.nextInt();
    System.out.print("\nOkay, comin' right up!\n");

    while (times > 0) {
      System.out.println(" 'Our Father in heaven, hallowed be your name. Your kingdom come, your will be done, on earth as it is in heaven.");
      times--;
    }
  }
}
