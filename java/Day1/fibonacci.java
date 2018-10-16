import java.io.*;

public class fibonacci
{
	public static void main(String args[])throws IOException
	{
		int a=0,b=1,f=0,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the limit:");
		int l=Integer.parseInt(br.readLine());
		System.out.println("Fibonacci series is:");
		System.out.println("0\n1");
		for(i=1;i<l-1;i++)
		{
			f=a+b;
			System.out.println(f);
			a=b;
			b=f;
		}
		
	}
}