// Lab 10
// Kaden Scroggins
// 60992

public class EquilateralTriangle extends GeometricObject
{
	public double side;
	public double sp; // semiperimeter
	public EquilateralTriangle(double side)
	{
		this.side = side;
		sp = (3.0*side)/2;
	}
	public double getArea()
	{
		return ((Math.sqrt(3.0)/4.0)*(Math.pow(side, 2.0)));
	}
	public double getPerimeter()
	{
		return side*3.0;
	}
	public String toString()
	{
		return String.format("EquilateralTriangle: Area=%f, Perimeter=%f", getArea(), getPerimeter());
	}
}