// Show  two ways to concatenate the following two strings together to get the string

public class StringConcatDemo
{
	public static void main(String args[])
	{
		String hi="Hi, ";
		String mom="Mom";
		String str1=hi+mom; //one method using +
		System.out.println(str1);
		String str2=hi.concat(mom); //another method using concat()
		System.out.println(str2);
	}
}