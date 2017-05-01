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
	
	public void setAdminId(Integer adminId){
		this.adminId =adminId;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setIsAdmin(Boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public Boolean getIsAdmin()
	{
		return isAdmin;
	}
	
	public Boolean getAdminId()
	{
		return adminId;
	}
	
	public void deleteUser(User user){
		/// Delete a user in the database
		
	}
}

