// Write a program which counts number of vowels in a file

import java.io.*;
import java.util.*;

public class CountVowels
{
	public static void main(String args[])throws IOException
	{
		int count=0;
		try
		{
		FileReader fr=new FileReader("hello.txt");
		//String str="abc";
		int c;
		
		while((c=fr.read())!=-1)
		{
			char[] ch=new char[(char)c];
			//System.out.println((char)c);
		}
		String str=Character.toString(ch);
		//String str = String.valueOf(ch);
		System.out.println(str);
		//String str = String.valueOf(ch);
		
			/*for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
                count++;
				}
			}*/
		}
		catch(Exception e){}	
		System.out.println("No of vowels: "+count);
		/*for(int j=0;j<ch.length;j++)
		{
			System.out.println(ch[j]);
		}*/ 
	}
}