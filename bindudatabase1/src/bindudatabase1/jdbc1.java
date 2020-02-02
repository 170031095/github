package bindudatabase1;

import java.sql.DriverManager;
import java.lang.*;
import java.sql.*;
public class jdbc1
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
try 
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","SYSTEM","yashu");
System.out.println("connection established");
}
catch(Exception e)
{
System.out.println(e);
}
}
}