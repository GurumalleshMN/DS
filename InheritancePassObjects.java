import java.time.LocalDate;

public class InheritancePassObjects {

	public static void main(String[] args) {
		AadhaarCard AC1 = new AadhaarCard();
		AadhaarCard AC2 = new AadhaarCard();
		
		AC1.setAadhaarCard(123456789123l, "HSGV", "Kolar", LocalDate.of(2015,12,5), 9876543210l);
		AC2.setAadhaarCard(123412344567l, "GSHV", "Hoskote", LocalDate.of(2012,02,7), 9483451609l);
		
		person p1 = new person("HSGV", 'M', 9, AC1);
		person p2 = new person("GSHV", 'M', 12, AC2);
		p1.printPerson();
		p2.printPerson();
		
		student s1 = new student("HSGV", 'M', 9, AC1, "VIP", "BE",'B');
		student s2 = new student("GSHV", 'M', 12, AC2, "KVB", "BE",'A');
		s1.printStudent();
		s2.printStudent();
		
		Employee e1 = new Employee("HSGV", 'M', 9, AC1, "VIP", "BE",'B',"DS", "SA", "20000");
		Employee e2 = new Employee("GSHV", 'M', 12, AC2, "KVB", "BE",'A',"SD", "SA", "25000");
		e1.printEmployee();
		e2.printEmployee();
	}

}

class AadhaarCard
{
	long AdNo;
	String AdName;
	String AdAdd;
	LocalDate AdDOB;
	long AdMob;
	
	public void setAadhaarCard(long adNo, String adName, String adAdd, LocalDate adDOB, long adMob) 
	{
		this.AdNo = adNo;
		this.AdName = adName;
		this.AdAdd = adAdd;
		this.AdDOB = adDOB;
		this.AdMob = adMob;
		
	}
	
	void printAadhaarCard()
	{
		System.out.println("Aadhaar Number is " +AdNo);
		System.out.println("Aadhaar Name is " +AdName);
		System.out.println("Aadhaar Address is " +AdAdd);
		System.out.println("Aadhaar Date of Birth is " +AdDOB);
		System.out.println("Aadhaar linked Mobile number " +AdMob);
	}
}

class person
{
	String name;
	char gender;
	int age;
	AadhaarCard ac = new AadhaarCard();
	
	
	public person(String name, char gender, int age, AadhaarCard ac) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ac = ac;
	}

	void printPerson() 
	{
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		if(ac!=null)
		{
			ac.printAadhaarCard();
		}
		else
		{
			System.out.println("No Aadhar Card Info");
		}
	}
}

class student extends person
{
	String college;
	String qualification;
	char grade;
	
	public student(String name, char gender, int age, AadhaarCard ac, String college, String qualification,
			char grade) {
		super(name, gender, age, ac);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
	void printStudent()
	{
		super.printPerson();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);
	}
}

class Employee extends student
{
	String company;
	String job;
	String salary;
	
	public Employee(String name, char gender, int age, AadhaarCard ac, String college, String qualification, char grade,
			String company, String job, String salary) {
		super(name, gender, age, ac, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	void printEmployee()
	{
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
	}
}