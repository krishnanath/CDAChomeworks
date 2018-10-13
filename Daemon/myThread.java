import java.awt.*;
import java.util.Date;
import java.awt.event.*;
public class myThread extends Frame 
{
	TextField t,tf ;
  	
	public myThread()
	{
    

		t=new TextField(" 30 ");
        tf = new TextField( "  " , 30);
		 
		this.setLayout(new FlowLayout());
		add(t);
        add(tf);
		  
 			
	}


	public static void main(String args[])
	{ 
       ThreadGroup tg1 =new ThreadGroup("Parent ThreadGroup");
      
		myThread my1 =new myThread();
		my1.setSize(800,800);

		my1.show();
		timer te = new timer(my1.t , my1);

        Thread tt1 = new Thread(tg1,te, "Timer");
        tg1.setDaemon(true);
		te.start();
       currentTime tt = new currentTime(my1.tf);
               Thread tt2 = new Thread(tg1,tt, "Watch");
               

       tt.start(); 
		
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
 
 class currentTime extends Thread {



      int j;
      TextField tf;
     public currentTime(TextField tf1) {
tf = tf1;
j = 0;
     }
public void run() 
{

 

    while(j<=500){
        Date d = new Date();
        tf.setText("  "+d);
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
 


}
     }

 
 



 