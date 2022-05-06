//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CS I : Program 3
// Credit Card
// Semester : 1
//
// Kaden Scroggins
// 60992
//
// Description:
// Prints a member's credit card statement

import java.util.Scanner;

public class CreditCard {

  public static void main(String[] args) {

    // Declaration of scanner, constants, and variables
    Scanner input = new Scanner(System.in);
    final double DESPICABLE_RATE = 0.008;
    final double DESPICABLE_LATE = 0.018;
    final double HORRIBLE_RATE = 0.02;
    final double HORRIBLE_LATE = 0.031;
    final double HORRIBLE_FEE = 10;
    final double NICEGUY_RATE = 0.031;
    final double NICEGUY_LATE = 0.043;
    final double NICEGUY_FEE = 20;
    String customerName;
    String customerLevel;
    double customerBalance;
    boolean customerLate = false;

    // Assigns user input to variables
    System.out.println("Credit Card program by Kaden Scroggins");
    System.out.print("\nCustomer name: ");
    customerName = input.nextLine();
    System.out.print("Customer member level: ");
    customerLevel = input.nextLine();
    if (customerLevel.equalsIgnoreCase("Despicable") || customerLevel.equalsIgnoreCase("Horrible") || customerLevel.equalsIgnoreCase("Niceguy")) {
      ;
    }
    else while (!(customerLevel.equalsIgnoreCase("Despicable") || customerLevel.equalsIgnoreCase("Horrible") || customerLevel.equalsIgnoreCase("Niceguy"))) {
      System.out.println("Invalid level. Must be one of Despicable, Horrible, Niceguy");
      customerLevel = input.nextLine();
    }
    System.out.print("Current balance: ");
    while (!input.hasNextDouble()) {
      System.out.println("Invalid balance.");
      input.nextLine();
    }
    customerBalance = input.nextDouble();
    System.out.print("Was the payment made late?: ");
    input.nextLine();
    for (boolean improper = true; improper;) {
      String a = input.nextLine();
      if (a.equalsIgnoreCase("Yes")) {
        customerLate = true;
        improper = false;
      }
      else if (a.equalsIgnoreCase("No")) improper = false; // false isn't assigned to customerLate because it was initialized as false
      else {
        System.out.println("Please enter yes or no");
      }
    }

    //Declaration of variables used in calculations
    final double MIN_PRINCIPAL = 0.04;
    double paymentToPrinciple;
    double customerInterest;
    double customerFees;
    double percentToPrinciple;
    double percentToFees;

    //Calculates credit card statement and prints output
    System.out.printf("%nBill for %s customer %s%n", customerLevel, customerName);
    System.out.printf("Card balance: $%1.2f%n", customerBalance);
    paymentToPrinciple = customerBalance * MIN_PRINCIPAL;
    System.out.printf("Minimum payment to principle (4.0%% of principle): $%1.2f%n", paymentToPrinciple);
    //Despicable Customer
    if (customerLevel.equalsIgnoreCase("Despicable")) {
      if (customerLate) {
        customerInterest = customerBalance * DESPICABLE_LATE;
        System.out.printf("Interest for late payment (%1.1f%% of principle): $%1.2f%n", 100 * DESPICABLE_LATE, customerInterest);
      }
      else {
        customerInterest = customerBalance * DESPICABLE_RATE;
        System.out.printf("Interest for on-time payment (%1.1f%% of principle): $%1.2f%n", 100 * DESPICABLE_RATE, customerInterest);
      }
      customerFees = paymentToPrinciple + customerInterest;
      System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", customerFees);
      percentToPrinciple = 100 * (paymentToPrinciple / customerFees);
      percentToFees = 100 - percentToPrinciple;
      System.out.printf("Percent to principle: %1.1f%%%n", percentToPrinciple);
      System.out.printf("Percent to fees: %1.1f%%%n", percentToFees);
    }
    //Horrible Customer
    if (customerLevel.equalsIgnoreCase("Horrible")) {
      if (customerLate) {
        customerInterest = customerBalance * HORRIBLE_LATE;
        customerFees = HORRIBLE_FEE + paymentToPrinciple + customerInterest;
        System.out.printf("Interest for late payment (%1.1f%% of principle): $%1.2f%n", 100 * HORRIBLE_LATE, customerInterest);
        System.out.printf("Late fee: $%1.2f%n", HORRIBLE_FEE);
      }
      else {
        customerInterest = customerBalance * HORRIBLE_RATE;
        customerFees = paymentToPrinciple + customerInterest;
        System.out.printf("Interest for on-time payment (%1.1f%% of principle): $%1.2f%n", 100 * HORRIBLE_RATE, customerInterest);
      }
      System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", customerFees);
      percentToPrinciple = 100 * (paymentToPrinciple / customerFees);
      percentToFees = 100 - percentToPrinciple;
      System.out.printf("Percent to principle: %1.1f%%%n", percentToPrinciple);
      System.out.printf("Percent to fees: %1.1f%%%n", percentToFees);
    }
    //Niceguy Customer
    if (customerLevel.equalsIgnoreCase("Niceguy")) {
      if (customerLate) {
        customerInterest = customerBalance * NICEGUY_LATE;
        customerFees = NICEGUY_FEE + paymentToPrinciple + customerInterest;
        System.out.printf("Interest for late payment (%1.1f%% of principle): $%1.2f%n", 100 * NICEGUY_LATE, customerInterest);
        System.out.printf("Late fee: $%1.2f%n", NICEGUY_FEE);
      }
      else {
        customerInterest = customerBalance * NICEGUY_RATE;
        customerFees = paymentToPrinciple + customerInterest;
        System.out.printf("Interest for on-time payment (%1.1f%% of principle): $%1.2f%n", 100 * NICEGUY_RATE, customerInterest);
      }
      System.out.printf("Minimum total payment (payment, interest, and fees): $%1.2f%n", customerFees);
      percentToPrinciple = 100 * (paymentToPrinciple / customerFees);
      percentToFees = 100 - percentToPrinciple;
      System.out.printf("Percent to principle: %1.1f%%%n", percentToPrinciple);
      System.out.printf("Percent to fees: %1.1f%%%n", percentToFees);
    }
  }
}
