
public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Send s1 = new Send("Hello"); 
		Send s2 = new Send("\tGood Morning "); 
		Send s3 = new Send("\t\tNice talk"); 
		Send s4 = new Send("\t\t\tBye"); 

		System.out.println("s1 :" +s1.getName());
		System.out.println("s2 :" +s2.getName());
		System.out.println("s3 :" +s3.getName());
		System.out.println("s4 :" +s4.getName());
		
		s1.setName("Hello");
		s2.setName("Good Morning");
		s3.setName("Nice Talk");
		s4.setName("bye");
		
		System.out.println("-----> BEFORE START<------");
		System.out.println("is thread1 alive : "+s1.isAlive());
		System.out.println("is thread2 alive : "+s2.isAlive());
		System.out.println("is thread3 alive : "+s3.isAlive());
		System.out.println("is thread4 alive : "+s4.isAlive());
		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		System.out.println("-----> AFTER START<------");
		System.out.println("is thread1 alive : "+s1.isAlive());
		System.out.println("is thread2 alive : "+s2.isAlive());
		System.out.println("is thread3 alive : "+s3.isAlive());
		System.out.println("is thread4 alive : "+s4.isAlive());
		
		try {
			s1.join();
			s2.join();
			s3.join();
			s4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-----> END OF MAIN <------");
		
		
	}

}

class Send extends Thread 
{
	String msg;
	
	Send(String m) {
		msg = m;
	}
	
	public void run() { 
		for (int i = 1; i < 100; i++) {
			System.out.println(msg+" "+i);
		}
	}


}