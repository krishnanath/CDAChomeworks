import java.awt.TextField;
class timer extends Thread
{
	int i;
	TextField t;
	public timer(TextField t1)
	{
		t=t1;
		i=30;
	}
	public void run()
	{
		while(i>30)
		{
			t.setText(" "+i--);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}
		}
		
	}
}