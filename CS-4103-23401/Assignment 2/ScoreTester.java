import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class ScoreTester
{
   public static void main(String[] args)
   {
      File file = null;
      Scanner in = null;
      try {
         file = new File(".\\input.txt");
         in = new Scanner(file);
      }
      catch (Exception e) {
         System.out.println("Error reading file");
         System.exit(-1);
      }

      ArrayList<Double> scores = new ArrayList<Double>();
      while (in.hasNextDouble()) {
         scores.add(in.nextDouble());
      }
      double expected = scores.get(0);
      Student fred = new Student(100);

      for (int i=0; i<scores.size(); i++) {
         if (i==0) System.out.println(scores.get(i));
         else {
            System.out.println(scores.get(i));
            fred.addScore(scores.get(i));
         }
      }

      System.out.println("Final score: " + fred.finalScore());
      System.out.println("Expected: " + expected);
   }
}
