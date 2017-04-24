public class Admin extends User{

	private String adminId;
	
	
	public Admin(String email, String username, String password, Boolean isAdmin)
	{
		this.email = email;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
		this.adminId = adminId;
		
	}
	
	public void deleteUser(User user)
	{
		
	}
	
	
}
