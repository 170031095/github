package bindudatabase1;
import java.sql.DriverManager;
import java.lang.*;
import java.sql.*;
public class jdbc3
{
	public static void main(String[] args)
	{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","SYSTEM","yashu");
		
		System.out.println("connection established");
		//ststement object
		Statement st=con.createStatement();
		//4.sql query
		String sql="select *from sales";
		//5.get results from database
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}	
}
}
