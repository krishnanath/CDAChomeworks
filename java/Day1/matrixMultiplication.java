import java.io.*;
public class matrixMultiplication
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j;
	System.out.println("Enter the size of array:");
	int size=Integer.parseInt(br.readLine());
	int a[][]=new int[size][size];
	int b[][]=new int[size][size];
	int c[][]=new int[size][size];
System.out.println("Enter elements into first array");
for(i=0;i<size;i++) 
{
	for(j=0;j<size;j++)
	{
		a[i][j]=Integer.parseInt(br.readLine());
	}
}
System.out.println("Enter elements into second array");
for(i=0;i<size;i++) 
	{
	for(j=0;j<size;j++)
	{
		b[i][j]=Integer.parseInt(br.readLine());
	}
}
System.out.println("Multiplied array is:");
for(i=0;i<size;i++)
	{
	for(j=0;j<size;j++)
		{
			for(int k=0;k<size;k++)
			{
			c[i][j] = c[i][j] + a[i][k] * b[k][j];
			System.out.print("   "+c[i][j]);
			}
		}
		System.out.println( );
	}
}
}
