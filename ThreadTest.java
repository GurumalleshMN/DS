
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender s1 = new Sender("Hello"); 
		Sender s2 = new Sender("\tGood Morning "); 
		Sender s3 = new Sender("\t\tNice talking to you"); 
		Sender s4 = new Sender("\t\t\tBye"); 

		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		
	}
}

class Sender extends Thread 
{
	String msg;
	
	Sender(String m) {
		msg = m;
	}
	
	public void run() { 
		for (int i = 1; i < 100; i++) {
			System.out.println(msg+" "+i);
		}
	}


}


