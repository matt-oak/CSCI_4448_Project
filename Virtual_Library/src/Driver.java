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
		
		//Create User object
		User user = new User(email, username, pass, false);
		return user;
	}
	
	public static void main(String[] args) 
	{
		//User sign in
		initialize();
		
		//Create/use user's collection of books
		Collection userCollection = new Collection();
		Scanner input = new Scanner(System.in);
		boolean breaker = true;
		while (breaker){
			System.out.println("What would you like to  do?");
			System.out.println("1. Search for Book");
			System.out.println("2. View current library");
			System.out.println("3. Quit");
			int option = input.nextInt();
			if (option == 1){
				userCollection.searchBook();
			}
			else if (option == 2){
				userCollection.getCollection();
			}
			else if (option == 3){
				System.exit(0);
			}
			else{
				System.out.println("Invalid option");
			}
		}
	}

}
