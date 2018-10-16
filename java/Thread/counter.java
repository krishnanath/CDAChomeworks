import java.awt.TextField;
class counter extends Thread
{
	TextField t;
	int i;
	public counter(TextField t1)
	{
		t=t1;
		i=0;
	}
	public void run()
	{
		while(i<=500)
		{
			t.setText(" "+i++);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{}
		}
	}
}