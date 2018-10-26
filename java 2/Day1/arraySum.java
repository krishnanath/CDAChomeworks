import java.io.*;

public class arraySum
{
	public static void main(String args[])throws IOException
	{
		int i,sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		System.out.println("Enter the elements into array:");
		for(i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of array elements is "+sum);
	}
}