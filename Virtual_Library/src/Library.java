import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Library {

	private List<String> bookCollection; 
	
	public Library()
	{
		this.bookCollection = new ArrayList<String>();
	}

	public void populateLibrary(){
		Connection c = null;
		Statement stmt = null;
		try{
			System.out.println("Connected");
			Class.forName("org.postgresql.Driver");
			c = DriverManager.
					getConnection("jdbc:postgresql://localhost:5432/library", "test", "pass");
			c.setAutoCommit(false);
			stmt = c.createStatement();
		    	ResultSet rs = stmt.executeQuery( "SELECT * FROM library;");
		    	while (rs.next()){
		    		this.bookCollection.add(rs.getString("Title"));
		    	}
		   
		}
		catch (Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
	}

	public Integer getTotalNumBooks()
	{
		return bookCollection.size();
	}
}
