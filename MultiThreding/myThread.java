import java.awt.*;
import java.awt.event.*;
public class myThread extends Frame implements ActionListener
{
	TextField t;
	counter c;
	Button b1,b2;
	public myThread()
	{
		t=new TextField("  0  ");
		// t.setBounds(50, 100, 200, 30);
		b1=new Button("Start");
		b2=new Button("Stop");
		this.setLayout(new FlowLayout());
		add(t);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		c=new counter(t);
			
	}
	public static void main(String args[])
	{
		myThread my1=new myThread();
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
