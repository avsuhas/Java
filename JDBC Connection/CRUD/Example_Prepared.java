import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example_Prepared {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "suhas123";
		
		Connection myConn = null;
		PreparedStatement myStat = null;
		ResultSet myRs = null;
		try{
			
		
		myConn = DriverManager.getConnection(url,user,password);
		
		myStat = myConn.prepareStatement("select * from sakila.actor where actor_id < ? ");
		
		myStat.setInt(1,10);
		
		myRs = myStat.executeQuery();
		
	while(myRs.next()){
		String FirstName = myRs.getString("first_name");
		String LastName = myRs.getString("last_name");
		
		System.out.println(FirstName +" "+LastName);
	}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
