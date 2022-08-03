import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class selectdataModification {

	public static void main(String[] args) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		
		try
		{
			
		System.out.println("Registering driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered....");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		System.out.println("trying to make a prepared statement");
		java.sql.PreparedStatement pst =  conn.prepareStatement("UPDATE EMPLOYEE SET EMPNAME=?, EMPSAL=? WHERE EMPNO=?;");
		System.out.println("Statement created: " +pst);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter employee number : ");
		
		int eno = scan1.nextInt();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPNO=" +eno);
		if(rs.next())
		{
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter employee name : ");
			String ename = scan2.next();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter employee salary : ");
			int esal = scan3.nextInt();
			
			pst.setInt(3, eno);
			pst.setString(1, ename);
			pst.setInt(2, esal);
			
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate();
			
			System.out.println("Prepared Statement executed, records inserted....");
		}
		else
		{
			EmployeeAlreadyExistsException ex = new EmployeeAlreadyExistsException("This employee already exists in the database");
			throw ex;
		}
		
		System.out.println("Employee number ");
		
	
		pst.close();
		conn.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
