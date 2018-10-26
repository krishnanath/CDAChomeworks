import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String args[])throws IOException
	{
		ByteArrayOutputStream f=new ByteArrayOutputStream();
		String s="This should end up to the array";
		byte buf[]=s.getBytes();
		try
		{
			f.write(buf);
		}
		catch(IOException e)
		{
		}
		FileOutputStream fos=new FileOutputStream("D:\\anila\\java\\Files\\hello.txt");
		f.writeTo(fos);
	}
	
}