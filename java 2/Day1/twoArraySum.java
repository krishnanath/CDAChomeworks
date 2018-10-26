import java.io.*;

public class twoArraySum
{
	public static void main(String args[])throws IOException
	{
		int i,sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];
		System.out.println("Enter the elements into first array:");
		for(i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the elements into second array:");
		for(i=0;i<size;i++)
		{
			b[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<size;i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println("The sum of array elements is ");
		for(i=0;i<size;i++)
		{
			System.out.println(c[i]);
		}
	}
}