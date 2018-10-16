import java.io.*;

public class product
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[10];
		int i,p=1;
		double avg=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements into array");
		for(i=0;i<10;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<10;i++)
		{
			p=p*a[i];
		}
		System.out.println("The product is "+p);
				
	}
}