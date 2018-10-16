import java.io.*;
interface A
{
	void meth1();
	void meth2();
}
class myClass implements A
{
	public void meth1()
	{
		System.out.println("Implementation of meth1");
	}
	public void meth2()
	{
		System.out.println("Implementation of meth2");
	}
}
public class myClassMain 
{
	public static void main(String args[])
	{
		myClass c=new myClass();
		c.meth1();
		c.meth2();
	}
}