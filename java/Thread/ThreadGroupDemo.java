public class ThreadGroupDemo implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e){}
	}
		public static void main(String args[])
		{
			ThreadGroupDemo runnable=new ThreadGroupDemo();
			ThreadGroup tg1=new ThreadGroup("Parent ThreadGroup");
			Thread t1=new Thread(tg1,runnable,"one");
			tg1.setDaemon(false);
			t1.start();
			t1.setPriority(Thread.MAX_PRIORITY);
			System.out.println("No of active thread: "+tg1.activeCount());
			Thread t2=new Thread(tg1,runnable,"two");
			t2.start();
			Thread t3=new Thread(tg1,runnable,"three");
			t3.start();
			System.out.println("No of active thread: "+tg1.activeCount());
			System.out.println("Is "+tg1.getName()+" a daemon thread group? "+tg1.isDaemon());
			tg1.list();
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			System.out.println("No of active thread: "+tg1.activeCount());
		}
	
}