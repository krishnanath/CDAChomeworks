import java.io.*;

public class sumAndAverage2
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[10];
		int i=0,sum=0;
		double avg=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements into array");
		while(i<10)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		do
		{
			sum=sum+a[i];
			i++;
		}while(i<10);
		System.out.println("The sum is "+sum);
		avg=sum/10;
		System.out.println("The average is "+avg);
		
	}
}