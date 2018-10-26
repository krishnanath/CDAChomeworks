import java.io.*;
class DataStreamDemo
{
	public static void main(String args[])throws IOException
	{
		try
		{
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("test.txt"));
		dout.writeDouble(98.6);
		dout.writeInt(1000);
		dout.writeBoolean(true);
		}
		catch(IOException e){}
		try{
		DataInputStream din=new DataInputStream(new FileInputStream("test.txt"));
		double d=din.readDouble();
		int i=din.readInt();
		boolean b=din.readBoolean();
		System.out.println("the values: "+d+" "+i+" "+b);
		}
		catch(IOException e1){}
	}
}