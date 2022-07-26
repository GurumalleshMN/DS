
public class Televisions {

	public static void main(String[] args) {
		
		dth d = new dth("TataSky", 200, 150);
		electricity e = new electricity(220, "Reliance", 2);
		Led l = new Led("sony", 1234, 65000, d, "AndroidTv");
		watchingTv w = l.watch(e, d);
		w.printStand();
		d.printSer();
	}

}

class Tv
{
	String brand;
	int serialno;
	int cost;
	
	public Tv(String brand, int serialno, int cost) {
		super();
		this.brand = brand;
		this.serialno = serialno;
		this.cost = cost;
	}
	
	void printTv()
	{
		System.out.println("+----TELEVISION INFO----");
		System.out.println("|Serial No : "+serialno);
		System.out.println("|Company   : "+brand);
		System.out.println("|Cost      : "+cost);
		System.out.println("+-----------------------");
	}
}

class Led extends Tv
{
	dth d;
	String ledType;
	
	public Led(String brand, int serialno, int cost, dth d, String ledType) {
		super(brand, serialno, cost);
		this.d = d;
		this.ledType = ledType;
	}
	
	watchingTv watch(electricity e, dth d)
	{
		super.printTv();
		System.out.println("Type of Television " +ledType);
		watchingTv WatchingTV = new watchingTv("Plasma TV stand");
		return WatchingTV;
	}	
}

class electricity { 
	
	float volate;
	String supplier;
	float unitConsumed;
	
	public electricity(float volate, String supplier, float unitConsumed) {
		super();
		this.volate = volate;
		this.supplier = supplier;
		this.unitConsumed = unitConsumed;
	}
}

class dth
{
	int noOfCh;
	int costpm;
	String dthComp;
	
	public dth (String dthComp, int noOfCh, int costpm) {
		super();
		this.dthComp = dthComp;
		this.noOfCh = noOfCh;
		this.costpm = costpm;
	}
	
	void printSer()
	{
		System.out.println("+----DTH INFO----");
		System.out.println("DTH Service provider : " +dthComp);
		System.out.println("Number of channels :" +noOfCh);
		System.out.println("Cost per month :" +costpm);
		System.out.println("+-----------------------");
	}
}

class watchingTv
{
	String tvStand;

	public watchingTv(String tvStand) {
		super();
		this.tvStand = tvStand;
	}
	
	void printStand()
	{
		System.out.println("TV stand type " +tvStand);
	}
	
}