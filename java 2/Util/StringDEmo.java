/* 	Write a program to check CDAC was present in the string I am Studying in CDAC */

import java.util.*;
public class StringDEmo
{
	public static void main(String args[])
	{
		String str="I am Studing in CDAC";
		int index=str.indexOf("CDAC");
		//System.out.println(index);
		if(index!=-1)
		{
			System.out.println("The given substring is present at index position: "+index);
		}
		else
		{
			System.out.println("The given substrig is not present");
		}
	}
}