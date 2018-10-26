//Write a program to call super class constructor from the child class using super keyword?

class A
{
	A()
	{
		System.out.println("Parent class constructor invoked");
	}	
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Child class constructor invoked");
	}
}
public class test
{
	public static void main(String args[])
	{
		B b=new B();
	}
}