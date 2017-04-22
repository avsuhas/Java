import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class D_Insert {

	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "suhas123";
		
		try{
			//1.get connection to db
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2.create a statement
			Statement myStat = myConn.createStatement();
			
			//3. Execute SQL query
			String sql = "insert into sakila.film_text"
						+ "(film_id,title,description)"
						+ "values (1002,'ff8','action')";
			myStat.executeUpdate(sql);
			
			System.out.println("insert complete");	
		}
		catch (Exception e){
			e.printStackTrace();
		}
		

	}

}
