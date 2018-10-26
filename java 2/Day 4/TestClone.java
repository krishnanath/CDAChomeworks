
public class TestClone implements Cloneable
{
	int a;
	double b;
	TestClone cloneTest()
	{
		try
		{
			return (TestClone) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning not allowed");
			return this;
		}
	}
}
public class CloneDemo
{
	public static void main(String args[])
	{
		TestClone x1=new TestClone();
		TestClone x2;
		x1.a=10;
		x1.b=20.98;
		x2=x1.cloneTest();
	}
}
