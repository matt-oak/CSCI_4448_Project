public class Book {
	
	private String title;
	private String isbn;
	private String author;
	private String publisher; 
	private Integer wordCount;

	public Integer bookID; 
	
	public Book(String title, String isbn, String author, String publisher, Integer wordCount)
	{
		title = this.title;
		isbn = this.isbn;
		author = this.author;
		publisher = this.publisher;
		wordCount = this.wordCount;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setISBN(String isbn)
	{
		this.isbn = isbn;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	public void setWordCount(Integer wordCount)
	{
		this.wordCount = wordCount;
	}

	public Integer getBookID()
	{
		return bookID;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getISBN()
	{
		return isbn;
	}

	public String getAuthor()
	{
		return author;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public Integer getWordCount()
	{
		return wordCount;
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