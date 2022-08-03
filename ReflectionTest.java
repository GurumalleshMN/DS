import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flight theFlightObj = new Flight(101);
		
		Class theClass = theFlightObj.getClass();
		
		
		System.out.println("This is an instance of "+theClass.getName());
		
		
		Method methodsArray[] = theClass.getMethods();
		
		for (Method method : methodsArray) {
			System.out.println("Method name is : "+method.getName());
		}
		System.out.println("-------");
		
		Constructor ctorArray[] = theClass.getConstructors();
		
		for (Constructor constructor : ctorArray) {
			System.out.println("Constructor with "+ constructor.getParameterCount()+" arguments");
			Parameter paraArray[] = constructor.getParameters();
			for (Parameter theParameter : paraArray) {
				System.out.println("Parameter is : "+theParameter.getType());
			}
		}
		
			System.out.println("---------");
	}

}
class Flight
{
	String fname;
	int fno;
	String src;
	String des;
	public Flight(String fname, int fno, String src, String des) {
		super();
		this.fname = fname;
		this.fno = fno;
		this.src = src;
		this.des = des;
	}
	public Flight(String fname, int fno) {
		super();
		this.fname = fname;
		this.fno = fno;
	}
	public Flight(int fno) {
		super();
		this.fno = fno;
	}
	
	
	
	
	 
	
}
