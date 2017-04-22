import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class D_Delete {

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
	/*		String updateTableSQL = "UPDATE sakila.film_text SET TITLE = ? WHERE FILM_ID = ?";
			PreparedStatement preparedStatement = myConn.prepareStatement(updateTableSQL);
			preparedStatement.setString(1,"EGG");
			preparedStatement.setInt(2, 5);
			// execute insert SQL stetement
			preparedStatement .executeUpdate();
	*/		
			
			String sql = "delete from film_text where film_id=1";
			myStat.executeUpdate(sql);
			
				

			System.out.println("delete complete");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		

	}

}

