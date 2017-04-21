public class Rating {

	public enum RatingEnum {
		VERY BAD, BAD, OK, GOOD, VERY GOOD;
	}

	RatingEnum rating;
	
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

	}

	public void save()
	{
		
	}
}
