public class ArrayExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
		int a[]={1,2,3,4,5};
		a[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}