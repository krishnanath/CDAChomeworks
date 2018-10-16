import java.util.*;
public class STDemo
{
	static String in="Title=Java: The complete reference; Auther=Schild; Publisher=Mc graw Hill; copy right=2011;";
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer(in,"=;");
		while(st.hasMoreTokens())
		{
			String key=st.nextToken();
			String value=st.nextToken();
			System.out.println(key+"\t"+value);
		}
	}
}