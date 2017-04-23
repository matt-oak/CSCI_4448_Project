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
		
		if (accountExist.equals("Y") || accountExist.equals("y"))
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
	
	public static void main(String[] args) 
	{
		initialize();
		Collection userCollection = new Collection();
		userCollection.searchBook();
		userCollection.searchBook();
		userCollection.searchBook();
		userCollection.getCollection();
	}

}
