import java.sql.*;
import java.lang.*;

class Sample
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1234");
			if(con!=null)
			{
				System.out.println("Connection Done"+con);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}