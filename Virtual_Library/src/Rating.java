public class Rating {

	public enum RatingEnum {
		VERYBAD, BAD, OK, GOOD, VERYGOOD;
	}

	private RatingEnum rating;
	public Integer ratingID;
	
	
	public Rating(RatingEnum rating)
	{
		this.rating = rating;
	}

	private void removeRating(RatingEnum rating)
	{
		this.rating = null;
	}

	public Integer getAverageRating()
	{
		// This function will be moved to the Book class
		
	}

	public void save()
	{
		// This function will be moved to the Book class
		
	}
}
