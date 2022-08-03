import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class selectInsertTest {

	public static void main(String[] args) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		try
		{
			
		System.out.println("Registering driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered....");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		System.out.println("trying to make a prepared statement");
		java.sql.PreparedStatement pst =  conn.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?);");
		System.out.println("Statement created: " +pst);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter employee number : ");
		int eno = scan1.nextInt();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPNO=" +eno);
		if(rs.next())
		{
			EmployeeAlreadyExistsException ex = new EmployeeAlreadyExistsException("This employee already exists in the database");
			throw ex;
		}
			
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter employee name : ");
		String ename = scan2.next();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter employee salary : ");
		int esal = scan3.nextInt();
		
		pst.setInt(1, eno);
		pst.setString(2, ename);
		pst.setInt(3, esal);
		
		System.out.println("Employee number ");
		System.out.println("Trying to execute the prepared statement....");
		int rows = pst.executeUpdate();
		System.out.println("Prepared Statement executed, records inserted....");

		
		
/*if(rs.next())
		{
			int empno = rs.getInt(1);
			String name = rs.getString(2);
			int sal = rs.getInt(3);
			System.out.println("EMP NO : " +empno);
			System.out.println("EMP NAME : " +name);
			System.out.println("EMP SAL : " +sal);
			System.out.println("------------------");
		}
		
		else
		{
			employeeNotFoundException empNotFndExc = new employeeNotFoundException("Employee is not found");
			System.out.println("Employee is not found");
			throw empNotFndExc;
		} 
		rs.close();*/
		
		pst.close();
		conn.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}


}
