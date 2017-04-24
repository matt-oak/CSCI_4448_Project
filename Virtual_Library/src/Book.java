import java.util.List;
import java.util.ArrayList;

public class Book {
	
	private String title;
	private String author;
	private String genre; 
	private Integer pageCount;
	private List<String> comments;
	
	public Book(String title, String author, String genre, Integer pageCount, List<String> comments)
	{
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
		this.comments = new ArrayList<String>();
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setComments(List<String> comments)
	{
		this.comments = comments;
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
	
	public String getComments()
	{
		return comments.get(0);
	}

	public void addComment(String comment)
	{
		List<String> comments = this.comments;
		comments.add(comment);
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