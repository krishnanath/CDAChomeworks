import java.io.*;
class ByteStreamTest
{
	public static void main(String args[])throws IOException
	{
		FileInputStream f=new FileInputStream("hello.txt");
		
		for(int i=0;i<f.available();i++)
		{
			System.out.print((char)f.read());
		}
	}
}