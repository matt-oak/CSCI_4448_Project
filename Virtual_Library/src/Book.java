import java.util.List;
import java.util.ArrayList;

public class Book {
	
	private int bookID;
	private String title;
	private String author;
	private String genre; 
	private String publisher;
	private Integer pageCount;
	private List<String> comments;
	private List<Integer> ratings;
	private int averageRating;
	private boolean isFav;
	
	public Book(int bookID, String title, String author, String genre, String publisher, Integer pageCount, List<String> comments, List<Integer> ratings, boolean isFav)
	{
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.pageCount = pageCount;
		this.comments = new ArrayList<String>();
		this.ratings = new ArrayList<Integer>();
		this.averageRating = 0;
		this.isFav = isFav;
	}
	
	public void setBookID(int bookID)
	{
		this.bookID = bookID;
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
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public void setPageCount(Integer pageCount)
	{
		this.pageCount = pageCount;
	}
	
	public void setIsFav(boolean isFav)
	{
		this.isFav = isFav;
	}
	
	public int getBookID()
	{
		return bookID;
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
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public Integer getPageCount()
	{
		return pageCount;
	}
	
	public void getComments()
	{
		int i;
		if(comments.size() == 0){
			System.out.println("No comments exist for this book");
		}
		else{
			for (i = 0; i < comments.size() ; i++){
				System.out.println(comments.get(i));
			}
		}
	}
	
	public boolean getIsFav()
	{
		return isFav;
	}

	public void addComment(String comment)
	{
		List<String> comments = this.comments;
		comments.add(comment);
		/// This should be a list of Comment objects eventually
		
	}
	public void addRating(int rating)
	{
		List<Integer> ratings = this.ratings;
		ratings.add(rating);	
	}
	public float avgRating()
	{
		List<Integer> ratings = this.ratings;
		int i;
		float sum = 0;
		for(i = 0; i < ratings.size(); i++){
			sum += ratings.get(i);
		}
		return sum/i;
		
	}

	public void back()
	{

	}

	public void save()
	{
		
	}
}
