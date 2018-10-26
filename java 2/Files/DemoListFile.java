import java.io.*;
class DemoListFile
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:\\anila\\java\\Files");
		if(f.isDirectory())
		{
			File s[]=f.listFiles();
			for(int i=0;i<s.length;i++)
			{
				
				if(s[i].isDirectory())
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