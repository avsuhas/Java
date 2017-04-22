import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class D_update {

	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "suhas123";
		
		try{
			//1.get connection to db
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2.create a statement(general)
			Statement myStat = myConn.createStatement();
			//Using prepared statement
			String updateTableSQL = "UPDATE sakila.film_text SET TITLE = ? WHERE FILM_ID = ?";

			//3. Execute SQL query
			PreparedStatement preparedStatement = myConn.prepareStatement(updateTableSQL);
			preparedStatement.setString(1,"EGG");
			preparedStatement.setInt(2, 5);
			
			preparedStatement .executeUpdate();
			
			
		/*	String sql = "update sakila.film_text"
						+ "set title='AFRICAN EGG'"
						+ " where film_id=5";
			myStat.executeUpdate(sql);
			
				
	*/
			System.out.println("update complete");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		

	}

}

