public class Book {
	
	private String title;
	private String author;
	private String genre; 
	private Integer pageCount;
	
	public Book(String title, String author, String genre, Integer pageCount)
	{
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	

	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setPageCount(Integer pageCount)
	{
		this.pageCount = pageCount;
	}
	
	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public Integer getPageCount()
	{
		return pageCount;
	}

	public void addComment()
	{

	}
	public void addRating()
	{

	}

	public void addFavorite()
	{

	}

	public void back()
	{

	}

	public void save()
	{
		
	}
}