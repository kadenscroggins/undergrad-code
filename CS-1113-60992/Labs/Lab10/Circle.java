// Lab 10
// Kaden Scroggins
// 60992

public class Circle extends GeometricObject
{
	public double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	public double getPerimeter()
	{
		return 2.0 * Math.PI * radius;
	}
	public String toString()
	{
		return String.format("Circle: Area=%f, Perimeter=%f", getArea(), getPerimeter());
	}
}