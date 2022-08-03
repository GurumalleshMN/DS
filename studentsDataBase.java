import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class studentsDataBase {

	public static void main(String[] args) throws studentAlreadyExistsException{
		// TODO Auto-generated method stub

		try
		{
			
		System.out.println("Registering driver");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver registered....");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		
		System.out.println("trying to make a prepared statement");
		PreparedStatement pst =  conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?);");
		System.out.println("Statement created: " +pst);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter student roll number : ");
		int sno = scan1.nextInt();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO=" +sno); 
		if(rs.next())
		{
			studentAlreadyExistsException ex = new studentAlreadyExistsException("This student already exists in the database");
			throw ex;
		}
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter student name : ");
		String sname = scan2.nextLine();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter student's birthday : ");
		String sbd = scan3.nextLine();
		Date date = Date.valueOf(sbd);
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Enter student's Physics marks : ");
		int sphy = scan4.nextInt();
		
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Enter student's Chemistry marks : ");
		int sche = scan5.nextInt();
		
		Scanner scan6 = new Scanner(System.in);
		System.out.println("Enter student's maths marks : ");
		int smath = scan6.nextInt();
		
		int total = sphy + sche + smath;
		System.out.println("student's total marks : " +total);
		
		pst.setInt(1, sno);
		pst.setString(2, sname);
		pst.setDate(3, date);
		pst.setInt(4, sphy);
		pst.setInt(5, sche);
		pst.setInt(6, smath);
		pst.setInt(7, total);
		
		System.out.println("Student number ");
		System.out.println("Trying to execute the prepared statement....");
		int rows = pst.executeUpdate();
		System.out.println("Prepared Statement executed, records inserted....");
		rs.close();
		pst.close();
		conn.close();

	}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
	
