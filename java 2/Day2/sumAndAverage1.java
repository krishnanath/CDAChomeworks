import java.io.*;

public class sumAndAverage1
{
	public static void main(String args[])throws IOException
	{
		int a[]=new int[10];
		int i=0,sum=0;
		double avg=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements into array");
		for(i=0;i<10;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		while(i<10)
		{
			sum=sum+a[i];
			i++;
		}
		System.out.println("The sum is "+sum);
		avg=sum/10;
		System.out.println("The average is "+avg);
		
	}
}