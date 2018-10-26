import java.io.*;
import java.lang.*;
class box
{
	double width;
	double height;
	double depth;
	double v;
	
	public double volumeCalc(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
		return (width*height*depth);
		
	}
}
public class boxMain
{
	public static void main(String args[])
	{
		box b1=new box();
		double v=b1.volumeCalc(5.0,10.0,4.0);
		System.out.println("Volume is :"+v);
	}
}