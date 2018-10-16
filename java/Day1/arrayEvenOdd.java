import java.io.*;
public class arrayEvenOdd
{
	public static void main(String args[]) throws IOException
	{
	int i,j,l1,l2;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter size of array:");
	int size=Integer.parseInt(br.readLine());
	int a[]=new int[size];
	int odd[]=new int[size];
	int even[]=new int[size];
	System.out.println("Enter elements into array:");
	for(i=0;i<size;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	for(i=0;i<size;i++)
	{
		if(a[i]%2==0)
		{
			for(j=0;j<size;j++)
			{
				even[j]=a[i];
			}
		}
		else
		{
			for(j=0;j<size;j++)
			{
				odd[j]=a[i];
			}
		}
		
		//l1=odd[j].length();
		
	}
	System.out.println("odd array is:");
	for(j=0;j<size;j++)
			{
				System.out.println(odd[j]);
			}
	System.out.println("even array is:");
	for(j=0;j<size;j++)
			{
				System.out.println(even[j]);
			}
	}
}