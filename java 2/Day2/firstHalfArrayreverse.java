import java.io.*;
public class firstHalfArrayReverse
{
	public static void main(String args[])throws IOException
	{
		int i,j,temp;
		int a[]=new int[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements into array");
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0,j=10/2-1;i<j;i++,j--)
		{

			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Array after reverse");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}