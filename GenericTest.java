
public class GenericTest {

	public static void main(String[] args) {

		AnyDataType<Integer> id = new AnyDataType<Integer>(2, 3);
		id.print();
		id.swap();
		id.printswap();
		
		AnyDataType<Float> fd = new AnyDataType<Float>(2.0f, 3.0f);
		fd.print();
		fd.swap();
		fd.printswap();
		
		AnyDataType<String> sd = new AnyDataType<String>("Spider", "Man");
		sd.print();
		sd.swap();
		sd.printswap();
		
		song s1 = new song("Arijith Singh", "Sunn Raha Hai", "2013");
		song s2 = new song("J Yesudas", "Ayyappa Swamy", "1995");
		
		AnyDataType<song> songd = new AnyDataType<song>(s1, s2);
		songd.print();
		songd.swap();
		songd.printswap();
		
	}
	
}

class AnyDataType<T>
{
	T x;
	T y;
	
	public AnyDataType(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

	void print()
	{
		System.out.println("Before swapping ");
		System.out.println("x= " +x);
		System.out.println("y= " +y);
		
	}
	
	void swap()
	{
		T temp;
		temp = x;
		x = y;
		y = temp;
		
	}
	
	void printswap()
	{
		System.out.println("After swapping ");
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}
}

class song
{
	String title;
	String singer;
	String year;
	
	public song(String title, String singer, String year) {
		super();
		this.title = title;
		this.singer = singer;
		this.year = year;		
	}

	@Override
	public String toString() {
		return "song [title=" + title + ", singer=" + singer + ", year=" + year + "]";
	}
	
	
}
