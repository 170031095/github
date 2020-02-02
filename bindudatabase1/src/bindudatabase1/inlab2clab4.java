package bindudatabase1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class inlab2clab4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection myConn=null;
		  PreparedStatement myStmt=null;
		  ResultSet rs=null;
		  Scanner sc=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myConn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","SYSTEM","yashu");
			System.out.println("connection established");
			sc=new Scanner(System.in);
        char choice;
        do
        {
        System.out.println("enter id number");
        int stuid=sc.nextInt();
		  String sql="select sid,sname from stud2 where sid = ?";
		  myStmt=myConn.prepareStatement(sql);
        myStmt.setInt(1, stuid);
        rs = myStmt.executeQuery();
        while(rs.next()) 
        {
      	  System.out.println("Student id number is present in the database"+ rs.getInt("sid"));
      	  System.out.println("Enter the name of the student");
      	  String stuname=sc.next();
      	  String sql1="insert into stud2"+"(sname)"+"values(?)";
  		  myStmt=myConn.prepareStatement(sql1);
            myStmt.setString(2,stuname);
            myStmt.executeUpdate();
            System.out.println("Inesrtion of name is completed");
        }
        System.out.println("Enter your choice of selection");
        choice = sc.next().charAt(0);
        }
        while ((choice == 'y') || (choice == 'Y'));
        
        
        System.out.println("Selection is completed");
		   }catch(Exception e) 
		{
			   e.printStackTrace();
	    }

	}

}



