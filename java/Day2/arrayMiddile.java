import java.io.*;
public class arrayMiddile
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The original array is:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The array from middile is:");
		for(int i=size/2;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<size/2;i++)
		{
			System.out.println(a[i]);
		}
	}
}