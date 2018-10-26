import java.io.*;
public class FileWriterDemo
{
	public static void main(String args[])
	{
		try
		{
			String source="my name is anila m shaju";
			char cbuf[]=new char[source.length()];
			source.getChars(0,source.length(),cbuf,0);
			FileWriter fw=new FileWriter("test1");
			FileWriter f1=new FileWriter("test2");
			for(int i=0;i<cbuf.length;i+=2)
			{
				fw.write(cbuf[i]);
			}
			f1.write(cbuf);
		}
		catch(IOException e)
		{
		}
	}
}