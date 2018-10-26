public class divisionExceptionDemo
{
	public static void main(String args[])
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not posible "+e);
		}
	}
}