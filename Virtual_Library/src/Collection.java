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
		boolean stopper = true;
		while(stopper){
			//Print out current library
			System.out.println("\n-----------LIBRARY-----------");
			int i = 0;
			for(i = 1; i < this.bookCollection.size() + 1; i++){
				Book curBook = this.bookCollection.get(i - 1);
				System.out.println(i + ": " + curBook.getTitle());
			}
			System.out.println("--------------------------------\n");
		
			Scanner input = new Scanner(System.in);
			System.out.println("Book #: ");
			int bookChoice = input.nextInt();
			System.out.println("1. View book attributes");
			System.out.println("2. Make comment");
			System.out.println("3. View comment(s)");
			System.out.println("4. Set as favorite");
			System.out.println("5. Exit");
			int option = input.nextInt();
			Book book = this.bookCollection.get(bookChoice - 1);
			if (option == 1){
				System.out.println("\n-----------BOOK STATS-----------");
				System.out.println("Author: " + book.getAuthor());
				System.out.println("Genre: " + book.getGenre());
				System.out.println("Pages: " + book.getPageCount());
				System.out.println("--------------------------------\n");
			}
			else if (option == 2)
			{
				System.out.println("Comment: ");
				Scanner commentInput = new Scanner(System.in);
				String comment = commentInput.nextLine();
				book.addComment(comment);
			}
			else if (option == 3)
			{
				System.out.println(book.getComments());
			}
			else if (option == 5)
			{
				stopper = false;
			}
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
		        	Book searchedBook = new Book(title, author, genre, pages, null);
		        	this.bookCollection.add(searchedBook);
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
	
	public void selectBook(){
		
	}
	
}
