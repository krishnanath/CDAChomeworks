import java.io.*;

public class sortedArray
{
	public static void main(String args[])throws IOException
	{
		int i,j,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<size-1;i++)
		{
			for(j=1;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}