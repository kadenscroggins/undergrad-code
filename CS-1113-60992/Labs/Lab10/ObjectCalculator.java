// Lab 10
// Kaden Scroggins
// 60992
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectCalculator
{
	public static void main(String args[])
	{
		ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();

		System.out.println();

		// Create a Scanner to read input from the keyboard
		Scanner scan = new Scanner(System.in);

		// Prompt the user for a radius, get the radius from
		// the keyboard, and add the circle to the list of objects.
		System.out.print("Enter a radius: ");
		double radius = scan.nextDouble();
		Circle circle = new Circle(radius);
		objects.add(circle);

		// Prompt the user for a side length for an equilateral triangle.
		// Create an equilateral triangle with that side length and
		// add it to the list of objects.
		System.out.print("Enter a side length for an equilateral triangle: ");
		double side = scan.nextDouble();
		EquilateralTriangle triangle = new EquilateralTriangle(side);
		objects.add(triangle);

		// Prompt the user for the width and height of a rectangle.
		// Create a rectangle with that width and height and add it
		// to the list of objects.
		System.out.print("Enter the width of a rectangle: ");
		double width = scan.nextDouble();
		System.out.print("Enter the height of a rectangle: ");
		double height = scan.nextDouble();
		Rectangle rectangle = new Rectangle(width, height);
		objects.add(rectangle);

		System.out.println();

		// Write a for loop that will print out all of the objects
		// in the list, along with their attributes (radius for circle,
		// width and height for rectangle, and side length for
		// equilateral triangle).
		for (GeometricObject geo : objects)
		{
			System.out.println(geo.toString());
		}

		// Write code that will calculate and print the total perimeter
		// and total area of all the objects in the list.
		double totalperimeter = 0;
		for (GeometricObject geo : objects)
		{
			totalperimeter += geo.getPerimeter();
		}
	}
}