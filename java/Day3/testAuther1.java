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
	public String toString()            
	{
		return (name+" "+"("+gender+")"+" "+"at"+" "+email);
	}
}
class Book 
{
	private String name;
	private Auther auther;
	private double price;
	private int qntyInStock;
	public Book(String n,Auther au,double p)
	{
		name=n;
		auther=au;
		price=p;
	}
	public Book(String n,Auther au,double p,int qnty)
	{
		name=n;
		auther=au;
		price=p;
		qntyInStock=qnty;
	}
	public String getName()
	{
		return this.name;
	}
	public Auther getAuther()
	{
		return this.auther;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double p)
	{
		price=p;
	}
	public int getQuntyInStock()
	{
		return this.qntyInStock;
	}
	public void setQuntyInStock(int qnty)
	{
		qntyInStock=qnty;
	}
	public String toString()          
	{		
	String str=auther.toString();
		return (name+" by "+str);
	}
	public String getAutherName()
	{
		return (getAuther().getName());
	}
	public String getAutherEmail()
	{
		return (getAuther().getEmail());
	}
	public char getAutherGender()
	{
		return (getAuther().getGender());
	}
	
}
public class testAuther1
{
	public static void main(String args[])
	{
		Auther a1=new Auther("Ann","ann@gmail.com",'F');
		System.out.println(a1);
		a1.setEmail("paul@nowhere.com");
		System.out.println(a1);
		Book b1=new Book("Java Programming",a1,125.0,1000);
		System.out.println(b1);
		Book b2=new Book("ADJAVA",new Auther("John","john@gmail.com",'M'),275.5,500);
		System.out.println(b2);
		System.out.println("Auther name: "+b1.getAuther().getName());
		System.out.println("Auther's email: "+b1.getAuther().getEmail());
		System.out.println("Auther's gender: "+b1.getAuther().getGender());
		System.out.println(b1.getAutherName());
		System.out.println(b1.getAutherEmail());
		System.out.println(b1.getAutherGender());
		
	}
}