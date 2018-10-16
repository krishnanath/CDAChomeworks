import java.util.*;

public class DateDemo
{
	public static void main(String args[])
	{
		Date d=new Date();
		System.out.println("Date: "+d);
		System.out.println("Time: "+d.getTime());
		Date d1=new Date(1293899253417l);
		System.out.println("date: "+d1);
		boolean after=d.after(d1);
		System.out.println(after);
		int cmpval=d.compareTo(d1);
		System.out.println(cmpval);
	}
}