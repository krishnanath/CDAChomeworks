import java.io.*;
class DemoFile
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\anila\\java\\Files\\java1.txt");
		f.createNewFile();
		File f1=new File("D:\\anila\\java\\Files\\java1");
		f1.mkdir();
	}
}