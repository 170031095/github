package bindudatabase1;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class inlab2dlab4 {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		Driver drv=new oracle.jdbc.driver.OracleDriver();
		   DriverManager.registerDriver(drv);
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","system","yashu"); 
		   String a="select * from stud2";
		   Statement stmt=con.createStatement();
		   ResultSet rs=stmt.executeQuery(a);
		   System.out.println("STUDENT_ID\tSTUDENT_NAME\t\tEMAIL\t\tDATE_OF_BIRTH");
		   System.out.println("-------------\t------------\t\t-------\t\t------------");
		   while(rs.next())
		    {
		      System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
		    }

	}

}