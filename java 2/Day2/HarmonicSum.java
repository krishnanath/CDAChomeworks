import java.io.*;
public class HarmonicSum
{
	public static void main(String args[])throws IOException
	{
		double n,i;
		double sum=0.0;
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter limit:");
		n=Integer.parseInt(br.readLine());
		for(i=2.0;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println(sum);
		sum=1+sum;
		System.out.println("The sum of harmonic series is upto "+n+" is");
		System.out.println(sum);
	}
}