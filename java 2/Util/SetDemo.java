// Write a program to add and display elements of hashset and treeSet using Iterator and for loop

import java.util.*;

public class SetDemo
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		Iterator<String> itr=hs.iterator();
		System.out.println("Elements of hashset using iterator");
		while(itr.hasNext())
		{
			String s1=itr.next();
			System.out.println(s1);
		}
		System.out.println("Elements of hashset using for loop");
		for(String a: hs)
		{
			System.out.println(a);
		}
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		Iterator<Integer> itr1=ts.iterator();
		System.out.println("Elements of treeset using iterator");
		while(itr1.hasNext())
		{
			int n=itr1.next();
			System.out.println(n);
		}
		System.out.println("Elements of treeset using for loop");
		for(Integer i: ts)
		{
			System.out.println(i);
		}
	}
}