import java.util.Scanner;


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
			System.out.println("Signing in...");
		}
		else
		{
			createAccount();
		}
	}
	public static void createAccount()
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
	}
	
	

	public static void main(String[] args) 
	{
		initialize();
		
	}

}
