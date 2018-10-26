import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class threadGroupExample extends Frame 
{
	TextField t,tf;
	public threadGroupExample()
	{
		t=new TextField("20");
		tf=new TextField("0",30);
		this.setLayout(new FlowLayout());
		add(t);
		add(tf);
	}
	public static void main(String args[])
	{
		ThreadGroup tg1=new ThreadGroup("Parent ThreadGroup");
		threadGroupExample th=new threadGroupExample();
		th.setSize(500,500);
		th.show();
		timerExample te=new timerExample(tg1,th.t,th);
		tg1.setDaemon(true);
		te.start();
		currentTimeExample ct=new currentTimeExample(tg1,th.tf);
		ct.start();
		tg1.list();
		System.out.println("no of active threads: "+tg1.activeCount());
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
	public timerExample(ThreadGroup tg1,TextField t1,threadGroupExample th1)
	{
		super(tg1,"Timer");
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
class currentTimeExample extends Thread
{
	int j;
	TextField tf;
	
	public currentTimeExample(TextField tf1)
	{
		tf=tf1;
		j=0;
	}
	public currentTimeExample(ThreadGroup tg1,TextField tf1)
	{
		super(tg1,"Current Time");
		tf=tf1;
		j=0;
	}
	public void run()
	{ 
		while(j<=500)
		{
			Date d=new Date();
			tf.setText(" "+d);
			
		}
	}
}




















