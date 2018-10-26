import java.io.*;
public class arrayDemo
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The array is:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}