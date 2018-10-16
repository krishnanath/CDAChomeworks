import java.util.*;
class foreachDemo
{
	public static void main(String args[])
	{
		int sum=0;
		ArrayList<Integer> vals=new ArrayList<Integer>();
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		
		for(int v: vals)
		{
			System.out.println(v);
			sum=sum+v;
		}
		System.out.println("Sum of numbers: "+sum);
	}
}