
import java.io.*;
public class evenOddSum
{
	public static void main(String args[]) throws IOException
	{
	int a[]=new int[10];
	int odd_sum=0,even_sum=0,i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter numbers");
	for(i=0;i<10;i++)
	{
		int n=Integer.parseInt(br.readLine());
		a[i]=n;
	}
	for(i=0;i<10;i++)
	{
		if(a[i]%2==0)
		{
			even_sum=even_sum+a[i];
			
		}
		
		else
		{
			odd_sum=odd_sum+a[i];
		}
		
	}
	System.out.println("odd sum is "+odd_sum);
	System.out.println("even sum is "+even_sum);
	}
}