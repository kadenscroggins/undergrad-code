//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CS I : Program 1
// Mini-Madlibs
// Semester : 1
//
// Kaden Scroggins
// 60992
//
// Description:
// A program that fills out a miniature form of a madlibs story

import java.util.Scanner;

public class Program1 {

  public static void main(String[] args) {

    // This section creates a scanner for user input and defines the variables
    Scanner input = new Scanner(System.in); // Scans for keyboard input

    String kingName;
    String countryName;
    String superPower;
    String helplessGroup;

    // This section just prints my name and what program it is
    System.out.println("Program 1 by Kaden Scroggins\n");

    // This section takes in the input for the Madlib
    System.out.print("Enter a name fit for a king: ");
    kingName = input.nextLine();
    System.out.print("Enter the name of the country he rules: ");
    countryName = input.nextLine();
    System.out.print("Enter this king's divine power: ");
    superPower = input.nextLine();
    System.out.print("And what helpless group he will punish: ");
    helplessGroup = input.nextLine();

    // This section puts all of the inputs together to form the Madlib
    System.out.println("\nHere is your story:");
    System.out.println("\nBow down to king " + kingName + " of " + countryName
      + ", for he holds the power of " + superPower + ". ");
    System.out.println("King " + kingName + " will rain fury upon "
      + helplessGroup + " if we do not present him with sacrifices!");

  } // end of main()
} // end of class Program1
