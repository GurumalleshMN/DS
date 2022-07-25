
public class area {

	public static void main(String[] args) {
	
		areaof a1 = new areaof();
		a1.aofCir(5);
		int a = a1.aofSq(4);
		System.out.println("Area of Square is " +a);
		int area = a1.aofTri();
		System.out.println("Area of Triangle is " +area);
		a1.aofRec();
 
	}

}

class areaof
{
	//arguments but no return value
	void aofCir(int r)
	{
	   double cir = 3.14*(r^2);
	   System.out.println("area of circle is " +cir); 
	}   
	 
	//both arguments and return value
	int aofSq(int l)
	{
		int x = l*l;
		return x;
	}
	
	//return value but no arguments 
	int aofTri()
	{
	    int b = 3,h = 4; 
		return (1/2)*b*h;
	}
	// no arguments and no return value
	void aofRec()
	{
		int l = 5,b = 6;
		int z = l*b;
	System.out.println("Area of Rectangle is " +z);
	}
}

