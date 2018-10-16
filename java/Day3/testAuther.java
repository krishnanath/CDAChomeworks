class Auther
{
	private String name;
	private String email;
	private char gender;
	public Auther(String na,String e,char g)
	{
		name=na;
		email=e;
		gender=g;
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String e)
	{
		email=e;
	}
	public char getGender()
	{
		return this.gender;
	}
}
class Book
{
	private String name;
	private String auther;
	private double price;
	private int qntyInStock;
	public Book(String n,Auther auther,double p)
	{
		name=n;
		auther=auther;
		price=p;
	}
	public Book(String n,Auther auther,double p,int qnty)
	{
		name=name;
		auther=auther;
		price=p;
		qntyInStock=qnty;
	}
	public String getName()
	{
		return this.name;
	}
	/*public Auther getAuther()
	{
		return this.auther;
	}*/
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice()
	{
		
	}
	public int getQuntyInStock()
	{
		return this.qntyInStock;
	}
	public void setQuntyInStock()
	{
		
	}
	
}
public class testAuther
{
	public static void main(String args[])
	{
		Auther a1=new Auther("Ann","ann@gmail.com",'F');
		System.out.println(a1.toString());
		a1.setEmail("paul@nowhere.com");
		System.out.println(a1);
	}
}