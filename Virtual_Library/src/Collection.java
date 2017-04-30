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
			System.out.println("\n-----------MY LIBRARY-----------");
			int i = 0;
			for(i = 1; i < this.bookCollection.size() + 1; i++){
				Book curBook = this.bookCollection.get(i - 1);
				System.out.println(i + ": " + curBook.getTitle());
			}
			System.out.println("--------------------------------\n");
		
			int bookChoice = selectBook();
			System.out.println("1. View book attributes");
			System.out.println("2. Make comment");
			System.out.println("3. View comment(s)");
			System.out.println("4. Rate");
			System.out.println("5. View average rating");
			System.out.println("6. Set or remove as favorite");
			System.out.println("7. Exit");
			Scanner opChoice = new Scanner(System.in);
			int option = opChoice.nextInt();
			Book book = this.bookCollection.get(bookChoice - 1);
			if (option == 1){
				System.out.println("\n-----------BOOK INFO-----------");
				System.out.println("Book ID: " + book.getBookID());
				System.out.println("Title: " + book.getTitle());
				System.out.println("Author: " + book.getAuthor());
				System.out.println("Genre: " + book.getGenre());
				System.out.println("Pages: " + book.getPageCount());
				System.out.println("Publisher: " + book.getPublisher());
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
				
				System.out.println("Comments about the book:\n");
				book.getComments();
				System.out.println("\n");
			}
			else if (option == 4)
			{
				System.out.println("Rating (1-10): ");
				Scanner ratingInput = new Scanner(System.in);
				int rating = ratingInput.nextInt();
				book.addRating(rating);
			}
			else if (option == 5)
			{
				System.out.println("Average rating: " + book.avgRating());
			}
			else if (option == 6)
			{
				boolean favorite = book.getIsFav();
				if(favorite)
				{
					book.setIsFav(false);
					System.out.println("Removed book from favorites");
				}
				else
				{
					book.setIsFav(true);
					System.out.println("Added book to favorites");
				}
			}
			else if (option == 7)
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
		        
		        System.out.println("\nBook found:\n");
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
	
	public int selectBook(){
		Scanner input = new Scanner(System.in);
		System.out.println("Select Book from your library: ");
		int bookChoice = input.nextInt();
		return bookChoice;
	}
	
	public void addBook(int bookID, String title, String author, String genre, String publisher, int pages){
		Book searchedBook = new Book(bookID, title, author, genre, publisher, pages, null, null, false);
		this.bookCollection.add(searchedBook);
	}
	
}
