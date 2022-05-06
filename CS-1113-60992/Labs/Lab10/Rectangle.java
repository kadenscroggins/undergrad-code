// Lab 10
// Kaden Scroggins
// 60992

public class Rectangle extends GeometricObject
{
	public double width;
	public double height;
	public Rectangle(double width, double height)
	{
		this.height = height;
		this.width = width;
	}
	public double getArea()
	{
		return width * height;
	}
	public double getPerimeter()
	{
		return width + width + height + height;
	}
	public String toString()
	{
		return String.format("Rectangle: Area=%f, Perimeter=%f", getArea(), getPerimeter());
	}
}