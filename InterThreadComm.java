
public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		foodItem fi = new foodItem("lemon rice");
		eater e = new eater(fi);
		server s = new server(fi);
		s.start();
		e.start();
	}

}

interface eating
{
	void eat();
}

interface serving
{
	void serve();
}
class foodItem implements eating, serving
{
	String name;
	boolean itemServed;
	public foodItem(String item)
	{
		name = item;
	}
	@Override
	public synchronized void eat() {
		// TODO Auto-generated method stub
		if(itemServed==false)
		{
			System.out.println("eat() : Waiting for the food item to be served...");
			try {
				wait();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("eat() : Food is eaten..."+name);
	}
	@Override
	public synchronized void serve() {
		// TODO Auto-generated method stub
		if(itemServed==false)
		{
		System.out.println("serve() :  Food is being served....");
		itemServed=true;
		notify();
	}
	
}
}

class eater extends Thread
{
	foodItem foodRef;
	
	eater(foodItem fi) {
		foodRef = fi;
	}
	
	public void run() {
		foodRef.eat();
	}
}

class server extends Thread
{
	foodItem foodRef;
	
	server(foodItem fi) {
		foodRef = fi;
	}
	public void run() {
		foodRef.serve();
	}
}