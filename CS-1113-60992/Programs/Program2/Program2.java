//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CS I : Program 2
// The Drake Equation
// Semester : 1
//
// Kaden Scroggins
// 60992
//
// Description:
// Gives the product of user input for the coefficients of the Drake equation

import java.util.Scanner;

public class Program2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double r, e, l, i, c, s;

    // R.E.L.I.C.S. Input
    System.out.print("Program 2 (Drake Equation) by Kaden Scroggins\n" +
      "\nEnter the following:\nR: Average rate of Milky Way star " +
      "formation in stars/year: ");
    r = input.nextDouble();
    System.out.print("E: Average number of planets per star: ");
    e = input.nextDouble();
    System.out.print("L: Fraction of planets that develop life: ");
    l = input.nextDouble();
    System.out.print("I: Fraction of life bearing planets where civilizations develop: ");
    i = input.nextDouble();
    System.out.print("C: Fraction of civilizations that have detectable communications: ");
    c = input.nextDouble();
    System.out.print("S: Length of time (in years) over which civilizations release signals: ");
    s = input.nextDouble();

    // R.E.L.I.C.S. Output
    System.out.printf("\nN = R * E * L * I * C * S = %.2f * %.2f * %.2f * %.2f * %.2f * %.2f" +
      "\n  = %.2f detectable civilizations in the Milky Way galaxy\n",
       r, e, l, i, c, s, (r * e * l * i * c * s));
  }
}
