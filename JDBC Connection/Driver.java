

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "suhas123");
			
			Statement myStat = myConn.createStatement();
			
			ResultSet myRs = myStat.executeQuery("select * from employees");
			
			while(myRs.next()){
				System.out.println(myRs.getString("last_name")+ " " + myRs.getString("first_name"));
		
			}
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
