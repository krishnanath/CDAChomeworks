import java.io.*;

public class checkPassFail
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter yor mark:");
		int n=Integer.parseInt(br.readLine());
		if(n<50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}
}