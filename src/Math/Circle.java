package Math;

public class Circle {
	int x;
	int y;
	double r;
	
	public Circle(double r)
	{
		this.r=r;
	}
	
	public double findArea()
	{
		return 3.14*r*r;
	}
	
	public double findDiameter()
	{
		return 2*r;
	}
	public double radius()
	{
		return r;
	}
}
