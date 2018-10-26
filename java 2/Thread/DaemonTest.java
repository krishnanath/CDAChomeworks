public class DaemonTest
{
	public static void main(String args[])
	{
		new WorkerThread().start();
		try
		{
			Thread.sleep(7500);
		}
		catch(Exception e)
		{
		}
		System.out.println("Main Thread ending");
	}
}
class WorkerThread extends Thread
{
	public WorkerThread()
	{
		setDaemon(false);
	}
	public void run()
	{
		int count=0;
		while(count<4)
		{
			System.out.println("hello from worker "+count++);
			try{
				sleep(5000);
			}
			catch(InterruptedException e1)
			{
			}
		}
	}
}