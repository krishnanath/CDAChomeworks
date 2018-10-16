import java.io.*;
import java.lang.*;
class room
{
		int room_no;
		String room_type;
		int room_area;
		String ac;
	public void setData(int room_no,String room_type,int room_area,String ac)
	{
		this.room_no=room_no;
		this.room_type=room_type;
		this.room_area=room_area;
		this.ac=ac;
	}
	public void display()
	{
		System.out.println("Room no: "+room_no+"\tRoom type: "+room_type+"\tRoom area: "+room_area+"\tAC/NON-AC: "+ac);
	}
	
}	
public class roomMain
{
	public static void main(String args[])throws IOException
	{
		room r=new room();
		r.setData(303,"Single",560,"AC");
		r.display();
	}
}