import java.util.*;
public class RuntimeDemo
{
	public static void main(String args[])
	{
		Process p=null;
		try
		{
			Runtime r=Runtime.getRuntime();
			p=r.exec("notepad");
			p.waitFor();
		}
		catch(Throwable e)
		{
			System.out.println("Exception "+e);
		}
		System.out.println("Notepad returned "+p.exitValue());
	}
}