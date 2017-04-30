public class Comment {

	private String description;
	public Integer commentID; 
	
	public Comment(String description)
	{
		this.description = description;
	}

	public void removeComment(Comment comment)
	{
		comment = null;
	}

	public void save()
	{
		/// This should be in the Book class
		
	}
}