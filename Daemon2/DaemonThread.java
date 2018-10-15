import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
public class DaemonThread extends Frame implements ActionListener
{
    TextField t;
    counter c;
    Button b1,b2;
    public DaemonThread()
    {
  t=  new TextField("  0  ");
  b1 = new  Button("start");
  b2 = new Button("Stop");
  this.setLayout(new FlowLayout());
  add(t);
  add(b1);
  add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
  c=new counter(t);


    }

    class counter extends Thread 
    { 
        TextField t;
        int i;
        DaemonThread my1;
        public counter(TextField t1, DaemonThread my2)
        {
            t= t1;
            i=10;
            my1 = my2;
        }


 

        public void run(){
            while(i<=0)
            {
                t.setText(" " + i--);

            }
            try{
                Thread.sleep(10);

            }
            catch(Exception e){

            }
               my1.hide();
        my1.dispose();
        System.exit(0);
        }
      



         

    }


public static void main(String args[])
	{
		DaemonThread my1=new DaemonThread();
		my1.setSize(800,800);

		my1.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			c.start();
		}
		if(e.getSource()==b2)
		{
			c.stop();
		}
	}
	
}