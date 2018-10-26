import java.io.*;
class DemoFileList
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\anila\\java\\Files");
		if(f.isDirectory())
		{
			String s[]=f.list();
			for(int i=0;i<s.length;i++)
			{
				File f1=new File(f,s[i]);
				if(f1.isDirectory())
				{
					System.out.println(s[i]+" is directory");
				}
				else
				{
					System.out.println(s[i]+" is file");
				}
			}
		}
	}
}