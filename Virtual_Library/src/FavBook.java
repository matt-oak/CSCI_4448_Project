public class FavBook extends Book{

	private Boolean isFav;
	
	public FavBook(Boolean isFav)
	{
		this.isFav = isFav;
	}

	public void removeFavorite()
	{
		// Not sure this is needed as favorite is now implemented as an attribute on book
	}

	public void save()
	{
		// functionality will be moved to the book class
	}
	
}
