import java.io.*;
class FileDemo
{
	public static void main(String args[])
	{
		File f1=new File("hello.txt");
		System.out.println("File name: "+f1.getName());
		System.out.println("File path: "+f1.getPath());
		System.out.println("Absolute path: "+f1.getAbsolutePath());
		System.out.println("Parent: "+f1.getParent());
		System.out.println("length in bytes: "+f1.length());
		System.out.println("Exist: "+f1.exists());
		System.out.println("Writable: "+f1.canWrite());
		System.out.println("Readable: "+f1.canRead());
		System.out.println("Is a directory: "+f1.isDirectory());
	}
}