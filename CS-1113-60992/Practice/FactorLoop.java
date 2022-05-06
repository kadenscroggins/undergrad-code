import java.util.Scanner;

public class FactorLoop {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n;
    int k;
    System.out.print("\nInput a number to get the largest factor of it below a certain number: (input an integer)\n--> ");
    n = scan.nextInt();
    System.out.print("\nThe program will find the largest factor of said number which is smaller than this number: (input an integer)\n--> ");
    k = scan.nextInt();

    System.out.println("\nThe largest factor of the first number smaller than the second number is " + smallestFactor(n,k));
  }

  public static int smallestFactor(int n, int k) {
    int factor = k - 1;
    while (n % factor != 0) factor--;
    return factor;
  }

}
