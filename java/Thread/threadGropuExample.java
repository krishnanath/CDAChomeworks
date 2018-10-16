import java.awt.*;
import java.awt.event.*;
public class threadGroupExample extends Frame 
{
	TextField t;
	public threadGroupExample()
	{
		t=new TextField("30");
		this.setLayout(new FlowLayout());
		add(t);
	}
	public static void main(String args[])
	{
		threadGroupExample th=new threadGroupExample();
		th.setSize(300,300);
		th.show();
		timerExample te=new timerExample(th.t,th);
		te.start();
	}
}
class timerExample extends Thread
{
	int i;
	TextField t;
	threadGroupExample th;
	public timerExample(TextField t1,threadGroupExample th1)
	{
		t=t1;
		th=th1;
		i=10;
	}
	public void run()
	{
		while(i>0)
		{
			t.setText(" "+i--);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}
		th.hide();
		th.dispose();
		System.exit(0);
	}
}
