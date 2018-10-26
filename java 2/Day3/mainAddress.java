import java.util.*;
class Address
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	Address(String n,String st,String c,String s,String cd)
	{
		name=n;
		street=st;
		city=c;            
		state=s;
		code=cd;
	}
	public String toString()
	{
		return ("name: "+name+"\n"+"street: "+street+"\n"+"city: "+city+"\n"+"state: "+state+"\n"+"code: "+code);
	}
	
}
public class mainAddress
{
	public static void main(String args[])
	{
		ArrayList<Address> al=new ArrayList<Address>();
		Address ad1=new Address("Anila","Palakuzha","Koothattukulam","Kerala","686686");
		al.add(ad1);
		Address ad2=new Address("Mini","Kothamangalam","Ernakulam","Kerala","686584");
		al.add(ad2);
		for(Address a:al)
		{
			System.out.println(a);
		}
	}
}