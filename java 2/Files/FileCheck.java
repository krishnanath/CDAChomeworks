import java.io.*;
class FileCheck
{
	public static void main(String args[])
	{
		File f=new File("D:\\anila\\java\\Files\\hello.txt");
		if(f.exists())
		{
			System.out.println("file found");
		}
		else
		{
			System.out.println("file not found");
		}
	}
}