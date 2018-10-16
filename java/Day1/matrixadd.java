import java.io.*;
class matrixadd
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
System.out.println("Enter row size");
int row_size=Integer.parseInt(br.readLine());
System.out.println("Enter column size");
int col_size=Integer.parseInt(br.readLine());
int a[][]=new int[row_size][col_size];
int b[][]=new int[row_size][col_size];
int c[][]=new int[row_size][col_size];
System.out.println("Enter elements into first array");
for(i=0;i<row_size;i++) 
{
	for(j=0;j<col_size;j++)
	{
		a[i][j]=Integer.parseInt(br.readLine());
	}
}
System.out.println("Enter elements into second array");
for(i=0;i<row_size;i++) 
	{
	for(j=0;j<col_size;j++)
	{
		b[i][j]=Integer.parseInt(br.readLine());
	}
}
System.out.println("added array is:");
for(i=0;i<row_size;i++)
{
for(j=0;j<col_size;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print("   "+c[i][j]);
}System.out.println( );
}
}
}
