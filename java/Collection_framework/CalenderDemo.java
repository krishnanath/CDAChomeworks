
import java.util.*;
class CalenderDemo
{
	public static void main(String args[])
	{
		String months[]={"Jan","feb","mar","apr","may","jun","ju                                                                                              l","aug","sep","oct","nov","dec"};
		Calendar cl=Calendar.getInstance();
		System.out.println(months[cl.get(Calendar.MONTH)]);
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.HOUR));
	}
	
}