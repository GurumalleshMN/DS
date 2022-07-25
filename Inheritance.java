
public class Inheritance {

	public static void main(String[] args) {
		
		earth ear = new earth(110000, 1);
		ear.printSpeedTime();
		
		sun s = new sun(110000, 1, 220, 230000000000d);
		s.printSpeedTime();
		
		System.out.println("Details of Revolution of earth is " +ear);
		System.out.println("Details of Revolution of sun is " +s);

	}

}

class earth
{
	int earSpeed;
	int earTime;

	public earth(int earSpeed, int earTime) {
		super();
		this.earSpeed = earSpeed;
		this.earTime = earTime;
	}

	@Override
	public String toString() {
		return "[earSpeed=" + earSpeed + ", earTime=" + earTime + "]";
	}
	
	
	void printSpeedTime()
	{
		System.out.println("Earth revolves around the sun at a speed of(km/hr) " +earSpeed);
		System.out.println("Time taken by Earth to revolve around the sun(year) " +earTime);
	}
	
}

class sun extends earth
{
	int sunSpeed;
	double sunTime;
	public sun(int earSpeed, int earTime, int sunSpeed, double sunTime) {
		super(earSpeed, earTime);
		this.sunSpeed = sunSpeed;
		this.sunTime = sunTime;
	}
	
	@Override
	public String toString() {
		return "[sunSpeed=" + sunSpeed + ", sunTime=" + sunTime + "]";
	}
	
	void printSpeedTime()
	{
		System.out.println("Sun revolves around the milky way at a speed of(km/hr) " +sunSpeed);
		System.out.println("Time taken by sun to revolve around the milky way(year) " +sunTime);
	}
	
}