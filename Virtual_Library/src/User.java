public class User 
{
	private int userID;
	private String email;
	private String username;
	private String password;
	private Boolean isAdmin;
	
	public User(String email, String username, String password, Boolean isAdmin)
	{
		//this.userID = userID;
		this.email = email;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	public void setUserID(int id)
	{
		this.userID = id;
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
}
