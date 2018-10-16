import java.io.*;
public class arrayLargest
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[5];
		int temp,j,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array elements");
		for(i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<5;i++)
		{
			for(j=1;j<5-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The largest number is: "+a[4]);
	}
}