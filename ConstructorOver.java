
public class ConstructorOver {

	public static void main(String[] args) {
	
		Bus b = new Bus("Guru");
		b = new Bus("Pune", "Bangalore");
		b = new Bus("HSGV", "HSHV", 123456);
		System.out.println(" Bus details " +b);

		}
		
	}

	class Bus
	{
		private String Name;
		private String Cname;
		private String Dname;
		private String Source;
		private String Dest;
		private int BusNo ;
		
		

		public Bus(String name, String cname, String dname, String source, String dest, int busNo) {
			super();
			Name = name;
			Cname = cname;
			Dname = dname;
			Source = source;
			Dest = dest;
			BusNo = busNo;
		}

		
		@Override
		public String toString() {
			return "Bus [Name=" + Name + ", Cname=" + Cname + ", Dname=" + Dname + ", Source=" + Source + ", Dest="
					+ Dest + ", BusNo=" + BusNo + "]";
		}



		Bus(String name)
		{
			this.Name = name;
			System.out.println("Passenger's name is " +name);
		}
		
		Bus(String cname, String dname, int busNo)
		{
			this.Cname = cname;
			this.Dname = dname;
			this.BusNo = busNo;
			System.out.println("Bus Conductor's name is " +cname+ " Bus Driver's name is " +dname+ " Bus number is " +busNo);
		}
		
		Bus(String source, String dest)
		{
			System.out.println("Source is " +source+ " Destination is " +dest);
		}
		
	}	
	
		
