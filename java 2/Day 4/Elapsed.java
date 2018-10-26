import java.util.*;
import java.lang.*;
public class Elapsed
{
	public static void main(String args[])
	{
		long start,end;
		start=System.currentTimeMillis();
		for(long i=0;i<1000000;i++)
		{
		
		}
		end=System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("Elapsed Time: "+(end-start));
	}
}