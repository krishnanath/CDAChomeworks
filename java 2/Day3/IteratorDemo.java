import java.util.*;
class IteratorDemo
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		System.out.println("Original contents of al");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String ele=itr.next();
			System.out.println("Element "+ele);
		}
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext())
		{
			String element=litr.next();
			litr.set(element+"+");
		}
		Iterator<String> itr1=al.iterator();
		while(itr1.hasNext())
		{
			String e=itr1.next();
			System.out.println("element "+e);
		}
	}
}