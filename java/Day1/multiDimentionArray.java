
import java.io.*;
public class multiDimentionArray
{
	public static void main(String args[]) throws IOException
	{
	int row_size,col_size;
	
	int i,j;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter row size");
	row_size=Integer.parseInt(br.readLine());
	System.out.println("Enter column size");
	col_size=Integer.parseInt(br.readLine());
	int a[][]=new int[row_size][col_size];
	int b[][]=new int[row_size][col_size];
	int c[][]=new int[row_size][col_size];
	System.out.println("Enter first array");
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			a[i][j]=Integer.parseInt(br.readLine());
		}
	}
	System.out.println("enter second array");
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			b[i][j]=Integer.parseInt(br.readLine());
			
		}
	}
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			
		}
	}
	System.out.println("sum is");
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			System.out.println(c[i][j]);
			
		}
	}
	
	
	
	
}}