// Write a program to store key value pair in HashMap and display it?

import java.util.*;
public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Anila",25000);
		hm.put("Eby",20000);
		hm.put("Meera",23000);
		Set<Map.Entry<String,Integer>> set=hm.entrySet();
		for(Map.Entry<String,Integer>me:set)
		{
			System.out.print(me.getKey()+" ");
			System.out.print(me.getValue()+" ");
		}
	}
}