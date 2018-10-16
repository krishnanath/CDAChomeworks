import java.io.*;
public class evenOdd
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
	System.out.println("Even numbers are:");
	for(i=0;i<size;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	System.out.println("\nOdd numbers are:");
	for(i=0;i<size;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
}