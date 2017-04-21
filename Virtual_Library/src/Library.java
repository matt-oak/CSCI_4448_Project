public class Library {

	public List[Books] bookCollection; 
	
	public Library(List[Books] bookCollection)
	{
		this.bookCollection = bookCollection;
	}

	public Book findBook(String title)
	{

	}

	public Integer getTotalNumBooks()
	{
		return bookCollection.size();
	}
}