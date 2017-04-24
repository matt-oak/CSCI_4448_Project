import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Collection{
	private List<Book> bookCollection;
	
	public Collection()
	{
		this.bookCollection = new ArrayList<Book>();
	}
	
	public void getCollection(){
		for(int i = 0; i < this.bookCollection.size(); i++){
			Book curBook = this.bookCollection.get(i);
			System.out.println(curBook.getTitle());
		}
	}
	
	public void searchBook(){
		Connection c = null;
		Statement stmt = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Book Name:");
		String book = input.nextLine();
		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.
					getConnection("jdbc:postgresql://localhost:5432/library", "test", "pass");
			c.setAutoCommit(false);
			stmt = c.createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT * FROM library WHERE \"Title\" = \'" + book + "\';");
		    if (rs.next()){
		    	String title = rs.getString("Title");
		        String author = rs.getString("Author");
		        String genre = rs.getString("Genre");
		        Integer pages = rs.getInt("Height");
		    
		        System.out.println("Add book to your library? (Y/N)");
		        String response = input.nextLine();
		        if (response.equals("Y") || response.equals("y")){
		        	Book searchedBook = new Book(title, author, genre, pages);
		        	this.bookCollection.add(searchedBook);
		        }
		        else{
		        	System.out.println("Going back...");
		        }
		    }
		}
		catch (Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
	}
	
}
