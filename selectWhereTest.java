import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class selectWhereTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		System.out.println("Registering driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered....");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		System.out.println("trying to make a statment");
		java.sql.Statement statement =  conn.createStatement();
		System.out.println("Statement created: " +statement);
		System.out.println("Enter the employee number");
		Scanner scan = new Scanner(System.in);
		int eno = scan.nextInt();
		System.out.println("Employee number ");
		System.out.println("Trying to execute the statement....");
		ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPNO=" +eno);
		System.out.println("Statement executed, got the result....");

		if(rs.next())
		{
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			int sal = rs.getInt(3);
			System.out.println("EMP NO : " +empno);
			System.out.println("EMP NAME : " +ename);
			System.out.println("EMP SAL : " +sal);
			System.out.println("------------------");
		}
		
		else
		{
			employeeNotFoundException empNotFndExc = new employeeNotFoundException("Employee is not found");
			System.out.println("Employee is not found");
			throw empNotFndExc;
		}
		rs.close(); 
		conn.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}


}

