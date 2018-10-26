import java.util.*;
public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,Double> hm=new HashMap<String,Double>();
		hm.put("John Doe",3434.34);
		hm.put("Thomas Smith",5674.00);
		hm.put("Jax Baker",7878.00);
		
		Set <Map.Entry<String,Double>> set=hm.entrySet();
		for(Map.Entry<String,Double> me:set)
		{
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
		double sal=hm.get("John Doe");
		hm.put("John Doe",sal+1000);
		System.out.println("John Doe's new salary: "+hm.get("John Doe"));
		
	}
}