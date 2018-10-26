// Create an abstract class Figure having variables dim1,dim2 of double type and an abstract method area, 
//then make two subclasses Rectangle and Triangle which will implement the area method. Create the abstract class 
//reference variable, assign subclass objects to it and print the corresponding area.

abstract class Figure
{
	double dim1;
	double dim2;
	abstract double area(double dim1,double dim2);
}
class rectangle extends Figure
{
	public double area(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
		return (dim1*dim2);
	}
}
class triangle extends Figure
{
	public double area(double b1,double h)
	{
		dim1=b1;
		dim2=h;
		return ((dim1*h)/2);
	}
}
public class testFigure
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		double ra=r.area(7.5,5.0);
		System.out.println("Area of rectangle: "+ra);
		triangle t=new triangle();
		double ta=t.area(7.5,15.0);
		System.out.println("Area of triangle: "+ta);
	}
}