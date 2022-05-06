// Kaden Scroggins
// 60992
import java.util.Scanner;

public class SavingsAccount {

  private String name;
  private double balance;
  private static double lowRate;
  private static double highRate;

  public void setName(String a) {
    name = a;
  }
  public void setBal(double a) {
    balance = a;
  }
  public String getName() {
    return name;
  }
  public double getBal() {
    return balance;
  }
  public static void setLow(double a) {
    lowRate = a;
  }
  public static void setHigh(double a) {
    highRate = a;
  }
  public static double getLow() {
    return lowRate;
  }
  public static double getHigh() {
    return highRate;
  }
  public double iRate(double b) {
    if (getBal() >= 1000.0) return getLow();
    else return getHigh();
  }

  public SavingsAccount(String n, double b) {
    setName(n);
    setBal(b);
    System.out.printf("Account owner: %s%nAccount balance: $%1.2f%nInterest rate: %1.2f%%%n",
                      getName(), getBal(), 100*(iRate(getBal())));

  }
}
