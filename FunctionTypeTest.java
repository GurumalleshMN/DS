
public class FunctionTypeTest {

	public static void main(String[] args) {
	
		calculator myCalci = new calculator();
		myCalci.fun1();
		myCalci.fun2(2, 3.2f, 62.32);
		double output = myCalci.fun3('G',7 , 8.8f);
		System.out.println("output is" +output);
		int out1 = myCalci.fun4(); 
		System.out.println("output2 is" +out1);
	}

}

class calculator
{
// no arguments and no return 
	void fun1()
	{
		System.out.println("fun1 is doing an activity");
	}
	
//arguments and no return value
	void fun2(int x, float y, double z)
	{
		System.out.println("fun2 is doing an activity");
		System.out.println("x is" +x);
		System.out.println("y is" +y);
		System.out.println("z is" +z);
	}
	
//arguments and return value 
	double fun3(char x, int y, float z)
	{
		System.out.println("fun3 is doing an activity");
		System.out.println("x is" +x);
		System.out.println("y is" +y);
		System.out.println("z is" +z);
		return x+y+z;
	}
	
	int fun4()
	{
		System.out.println("fun3 is doing an activity");
		return 123;
	}
}

