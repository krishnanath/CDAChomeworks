import java.io.*;
class circle
{
	private double radius=1.0;
	private String color="red";
	double area;
	circle()
	{
		double area=3.14*radius*radius;
		System.out.println("Radius is: "+radius+"\tColor is: "+color+"\tArea is: "+area);
	}
	circle(double r)
	{
		radius=r;
		area=3.14*radius*radius;
		//System.out.println("Radius is: "+radius+"\tColor is: "+color+"\tArea is: "+area);
	}
	circle(double radius,String color)
	{
		radius=radius;
		color=color;
		area=3.14*radius*radius;
		//System.out.println("Radius is: "+radius+"\tColor is: "+color+"\tArea is: "+area);
	}
	public String toString()
	{
		return("radius= "+radius+" "+"color: "+color);
	}
	public void setRadius(double radius)
	{
		radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return this.area;
	}
	public String getColor()
	{
		return this.color;
	}
}
public class circleMain
{
	public static void main(String args[])
	{
		circle c1=new circle();
		circle c2=new circle(1.5);
		circle c3=new circle(2.0,"Yellow");
		double r=c2.getRadius();
		System.out.println("Radius: "+r);
		double a=c2.getArea();
		System.out.println("Area: "+a);
		String c=c3.getColor();
		System.out.println("Color: "+c);
		//c1.radius=5.0;// since radius is private, it cannot access from outside or even using object
		circle c4=new circle();
		c4.setRadius(5.0);
		System.out.println(c2);
	}
}