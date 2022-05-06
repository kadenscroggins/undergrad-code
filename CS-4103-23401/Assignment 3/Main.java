// Main.java

public class Main {
   public static void main(String[] args)
   {
      System.out.println("\nCalling every function!\n");
      System.out.println("Calling: Harley harley = new Harley()");
      Harley harley = new Harley();
      System.out.println("Calling: harley.setFlames(false)");
      harley.setFlames(false);
      System.out.println("Calling: harley.getFlames()");
      System.out.println(harley.getFlames());
      System.out.println("Calling: harley.setNumberOfTires(3)");
      harley.setNumberOfTires(3);
      System.out.println("Calling: harley.getNumberOfTires()");
      System.out.println(harley.getNumberOfTires());
      System.out.println("Calling: harley.toString()");
      System.out.println(harley.toString());
      System.out.println("Calling: Vehicle vehicle = new Vehicle()");
      Vehicle vehicle = new Vehicle();
      System.out.println("Calling: Car car = new Car()");
      Car car = new Car();
      System.out.println("Calling: car.setLicensePlateNumber(\"ABC123\")");
      car.setLicensePlateNumber("ABC123");
      System.out.println("Calling: car.toString()");
      System.out.println(car.toString());
      System.out.println("Calling: VehicleDemo.process(vehicle, \"LOL101\")");
      VehicleDemo.process(vehicle, "LOL101");
      System.out.println("\nAll done\n");
   }
}