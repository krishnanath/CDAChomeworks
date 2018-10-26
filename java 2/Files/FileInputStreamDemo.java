import java.io.*;
class FileInputStreamDemo
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\anila\\java\\Files\\hello.txt");
		System.out.println("Total avilable bytes: "+f.available());
		int n=f.available();
		for(int i=0;i<n;i++)
		{
			System.out.print((char)f.read());
		}
	}
}