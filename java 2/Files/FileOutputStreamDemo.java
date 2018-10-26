import java.io.*;
class FileOutputStreamDemo
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D:\\anila\\java\\Files\\hello.txt");
		String s="hai how are you?";
		byte[] buff=s.getBytes();
		fos.write(buff);
	}
}