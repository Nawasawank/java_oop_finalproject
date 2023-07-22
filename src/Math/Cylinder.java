package Math;
public class Cylinder extends Circle{
	double h;
	public Cylinder(double r,double h)
	{
		super(r);
		this.h=h;
	}
	public double findArea()
	{
		return 2*super.findArea()+6.28*r*r;
	}
	public double radius()
	{
		return r;
	}
	public double height()
	{
		return h;
	}
	
}
