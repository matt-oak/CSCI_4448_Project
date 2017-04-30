import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

private class Library {

	public List[Books] bookCollection; 
	
	public Library(List[Books] bookCollection)
	{
		this.bookCollection = bookCollection;
	}

	public Book findBook(String title)
	{
		Connection c = null;
		Statement stmt = null;
		Scanner input = new Scanner(System.in);
		String book = title;
		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.
					getConnection("jdbc:postgresql://localhost:5432/library", "postgres", "2511");
			c.setAutoCommit(false);
			stmt = c.createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT * FROM library WHERE \"Title\" = \'" + book + "\';");
		    if (rs.next()){
		    	int bookID = rs.getInt("index");
		    	String title = rs.getString("Title");
		        String author = rs.getString("Author");
		        String genre = rs.getString("Genre");
		        String publisher = rs.getString("Publisher");
		        Integer pages = rs.getInt("Height");
		        
		        System.out.println("\nThis book exists:\n");
		        System.out.println("Title: "+ title + "\n");
		        System.out.println("Author: "+ author + "\n");
		        
		        System.out.println("Add book to your library? (Y/N)");
		        String response = input.nextLine();
		        if (response.equals("Y") || response.equals("y")){
		        	addBook(bookID, title, author, genre, publisher, pages);
		        }
		        else{
		        	System.out.println("Going back...");
		        }
		    }
		    else{
		    	System.out.println("Book does not exist");
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
