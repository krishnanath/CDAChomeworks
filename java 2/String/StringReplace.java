
public class StringReplace
{
	public static void main(String args[])
	{
		String str="This is ICS102 Lab";
		System.out.println(str);
		String str1=str.replaceAll("ICS102","COE-200");
		System.out.println("after replacement:");
		System.out.println(str1);
	}
}