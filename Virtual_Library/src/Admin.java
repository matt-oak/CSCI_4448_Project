public class Admin extends User{

	private Integer adminId;
	
	
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
		/// This is not implemented yet
		
	}
	
	
}
