import java.awt.*;
import java.awt.event.*;
public class myThread extends Frame 
{
	TextField t;
 	
	public myThread()
	{
		t=new TextField(" 30 ");
		 
		this.setLayout(new FlowLayout());
		add(t);
		 
 			
	}


	public static void main(String args[])
	{
		myThread my1 =new myThread();
		my1.setSize(800,800);

		my1.show();
		timer te = new timer(my1.t , my1);
		te.start();
		
	}
	 

		
}

class timer extends Thread 
{ 
	int i;
	TextField t;
	myThread my1;

	public timer(TextField t1, myThread my2){
		t = t1;
		my1 = my2;
		i = 10;

	}
	public void run()
	{
		while(i>0){
			t.setText(" " + i--);
			try{
				Thread.sleep(1111);
			}
			catch(Exception e) {

			}
		}
		my1.hide();
		my1.dispose();
		System.exit(0);
	}

}
