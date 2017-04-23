import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Driver 
{
	
	public static void initialize()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to VirtualLibrary!\n");
		System.out.println("Do you have an account? (Y/N)");
		String accountExist = input.nextLine();
		
		if (accountExist == "Y" || accountExist == "y")
		{
			System.out.println("Signing in..");
		}
		else
		{
			User user = createAccount();
		}
	}
	public static User createAccount()
	{
		//Get user-input
		Scanner input = new Scanner(System.in);
		System.out.println("Username:");
		String username = input.nextLine();
		System.out.println("Email:");
		String email = input.nextLine();
		System.out.println("Password:");
		String pass = input.nextLine();
		System.out.println(username + email + pass);
		
		//Create User object
		User user = new User(email, username, pass);
		return user;
	}
	public static void searchBook(){
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
	        	String author = rs.getString("Author");
		        System.out.println("Author: " + author);
	        }
		}
		catch (Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		}
	}
	

	public static void main(String[] args) 
	{
		initialize();
		searchBook();
	}

}
