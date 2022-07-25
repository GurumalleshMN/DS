
public class FunctionOverloading {

	public static void main(String[] args) {
	
	employee em = new employee();
	em.Ename();
	em.Eage(22);
	em.Eid("ABCD", "GSHV", "12345678");
	em.Esalary(25000, 85.6f);

	}
	
}

class employee
{
	void Ename()
	{
		System.out.println("Employee's name is Vish ");
	}
	
	void Eage(int age)
	{
		System.out.println("Employee's age is " +age);
	}
	
	void Esalary(int salary, float att)
	{
		System.out.println("Employee's salary is " +salary+ " Employee's attendance percentage is " +att);
	}
	
	void Eid(String tri, String uid, String Pw)
	{
		System.out.println("Employee's trigram  is " +tri+ " Employee's user id is " +uid+ " Employee's Password is " +Pw);
	}
	
	
	
}