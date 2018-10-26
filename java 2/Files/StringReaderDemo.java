/*	Write a text file that contains the following use StringReader and StringWriter: -
'When in the Course of human events, it becomes necessary for one people to dissolve the 
political bonds which have connected them with another, and to assume among the powers of the earth, 
the separate and equal station to which the Laws of Nature and of Nature's God entitle them, a decent 
respect for the opinions of mankind requires that they should declare the causes which impel them to the separation'
Open the file and ensure the content was there.*/

import java.io.*;

public class StringReaderDemo
{
	public static void main(String args[])throws IOException
	{
		String str="When in the Course of human events, it becomes necessary for one people to dissolve the political bonds"+ 
		"which have connected them with another, and to assume among the powers of the earth, the separate and equal station "+
		"to which the Laws of Nature and of Nature's God entitle them, a decent respect for the opinions of mankind requires "+
		"that they should declare the causes which impel them to the separation";
		FileOutputStream f1=new FileOutputStream("string_writerdemo.txt");
		byte[] buff=str.getBytes();
		f1.write(buff);
		StringReader sr=new StringReader(str);
		int i=0;
		while((i=sr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}