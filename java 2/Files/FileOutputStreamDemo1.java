import java.io.*;
class FileOutputStreamDemo1
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D:\\anila\\java\\Files\\hello.txt");
		String s="hai how are you anila?";
		byte[] buff=s.getBytes();
		//fos.write(buff);
		for(int i=0;i<buff.length;i+=2)
		{
			fos.write(buff[i]);
			
		}
	}
}