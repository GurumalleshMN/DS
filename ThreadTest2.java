import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bikerFrame bf1 = new bikerFrame("bike1", 100, 200, 200, 100);
		bikerFrame bf2 = new bikerFrame("bike2", 100, 200, 200, 100);
		bikerFrame bf3 = new bikerFrame("bike3", 100, 200, 200, 100);
		bikerFrame bf4 = new bikerFrame("bike4", 100, 200, 200, 100);
		
		bf1.setVisible(true);
		bf2.setVisible(true);
		bf3.setVisible(true);
		bf4.setVisible(true);
		
		Thread t1 = new Thread(bf1);
		Thread t2 = new Thread(bf2);
		Thread t3 = new Thread(bf3);
		Thread t4 = new Thread(bf4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class bikerFrame extends JFrame implements Runnable
{
	JTextField t = new JTextField(20);
	public bikerFrame(String title, int h, int w, int x, int y)
	{
		setTitle(title);
		setSize(x, y);
		setLocation(h, w);
		add(t);
	}
	
	public void run()
	{
		for (int i = 0; i < 1000000; i++) {
			t.setText(i+ "");
		}
	}
}