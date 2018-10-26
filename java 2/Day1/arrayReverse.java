import java.io.*;

public class arrayReverse
{
	public static void main(String args[])throws IOException
	{
		int i,j,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int a[]=new int[size];
		System.out.println("Enter the elements into array:");
		for(i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		j = i - 1;     
		i = 0;         
	
		while(i<j)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("The reversed array is:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}
}