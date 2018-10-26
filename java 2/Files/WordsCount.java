import java.io.*;

public class WordsCount
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your data to be stored in file");
		String s=br.readLine();
		FileOutputStream f1=new FileOutputStream("read_from_keyboard.txt");
		byte[] buf=s.getBytes();
		f1.write(buf);
		
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}