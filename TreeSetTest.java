import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
	
		elementwt e1 = new elementwt(1, "Hydrogen", 1.00f, "H");
		elementwt e2 = new elementwt(2, "Helium", 1.00f, "He");
		elementwt e3 = new elementwt(3, "Lithium", 1.00f, "Li");
		elementwt e4 = new elementwt(4, "Hydrogen", 1.00f, "Be");
		
		System.out.println("Chemical elements are ready....");
		TreeSet<elementwt> elwt = new TreeSet<elementwt>(); 
		elwt.add(e1);
		System.out.println("Adding 1st element....");
		elwt.add(e2);
		System.out.println("Adding 2nd element....");
		elwt.add(e3);
		System.out.println("Adding 3rd element....");
		elwt.add(e4);
		System.out.println("Adding  4th element....");
		
		Iterator<elementwt> iterator =  elwt.iterator();
		
		while(iterator.hasNext())
		{
			elementwt  ele = iterator.next();
			System.out.println("Element "+ele);
		}
		
		for(elementwt ele : elwt)
		{
			System.out.println("Element "+ele);
		}
	}
}

class element
{
	int atno;
	String elname;
	
	public element(int atno, String elname) {
		super();
		this.atno = atno;
		this.elname = elname;
	}

	@Override
	public String toString() {
		return "element [atno=" + atno +  "elname=" + elname + "]";
	}
	
}

class elementwt extends element implements Comparable<elementwt>   
{
	float atwt;
	String atsym;
	
	public elementwt(int atno, String elname, float atwt, String atsym) {
		super(atno, elname);
		this.atwt = atwt;
		this.atsym = atsym;
	}

	@Override
	public String toString() {
		return "elementwt [atno=" + atno + ", elname=" + elname + ", atwt=" + atwt + ", atsym=" + atsym + "]";
	}

	@Override
	public int compareTo(elementwt o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
}