import java.util.*;
public class arrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Size of arraylist "+al.size());
		//System.out.println("Capacity of arraylist "+al.Capacity());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		System.out.println("Size of arraylist "+al.size());
		System.out.println("Elements of al "+al);
		al.add(4,"K");
		al.add("C");
		System.out.println("Elements of al "+al);
		ArrayList<String> al1=new ArrayList<String>(al);
		System.out.println("Elements of al1 "+al1);
		al1.add("X");
		al1.add("Y");
		al1.add("C");
		al1.add("X");
		System.out.println("Elements of al1 "+al1);
		al1.remove("C");
		System.out.println("Elements of al1 "+al1);
		al1.removeAll(al);
		System.out.println("Elements of al1 "+al1);
	}
}