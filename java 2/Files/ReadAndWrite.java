//	Write a program to read data from the keyboard and write it into the file?
import java.io.*;

public class ReadAndWrite
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your data to be stored in file");
		String s=br.readLine();
		FileOutputStream f1=new FileOutputStream("read_from_keyboard.txt");
		byte[] buf=s.getBytes();
		f1.write(buf);
	}
}