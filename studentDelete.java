import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class studentDelete {

	public static void main(String[] args) throws studentAlreadyExistsException {
		// TODO Auto-generated method stub
		
		try
		{
			
		System.out.println("Registering driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered....");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter student roll number : ");
		int sno = scan1.nextInt();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO=" +sno); 
		if(rs.next())
		{
			System.out.println("trying to make a prepared statement");
			PreparedStatement pst =  conn.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO=?");
			System.out.println("Statement created: " +pst);
			pst.setInt(1, sno);
			System.out.println("Student number ");
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate();
			pst.close();
		}
		else
		{
			studentAlreadyExistsException ex = new studentAlreadyExistsException("This student already exists in the database");
			throw ex;
		}	
		
		
		
		System.out.println("Prepared Statement executed, records inserted....");
		rs.close();
		conn.close();

	}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}


