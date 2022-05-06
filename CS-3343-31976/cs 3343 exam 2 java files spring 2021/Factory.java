  /**
 * Factory.java
 *
 * This class creates the reader and writer threads and
 * the database they will be using to coordinate access.
 */

import java.util.ArrayList;

public class Factory
{

   public static void main(String args[])
   {
      ArrayList<Semaphore> chopsticks = new ArrayList<Semaphore>();
      ArrayList<Philosopher> philos = new ArrayList<Philosopher>();

      for(int i = 0;i < 6;i++)
      	chopsticks.add(new Semaphore(1));
      for(int i = 0;i < 5;i++)
      	philos.add(new Philosopher(chopsticks.get(i), chopsticks.get((i+1)%chopsticks.size()), Integer.toString(i)));
      for(int i = 0;i < 5;i++)
        philos.get(i).start();
   }
}
