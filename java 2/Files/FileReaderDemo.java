import java.io.*;
public class FileReaderDemo
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("FileReaderDemo.java");
			int c;
			while((c=fr.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(IOException e)
		{
		}
	}
}