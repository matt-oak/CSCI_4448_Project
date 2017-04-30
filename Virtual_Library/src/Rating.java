import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Rating {
	
	private Integer rating;
	public Integer ratingID;
	
	
	public Rating(Integer rating)
	{
		this.rating = rating;
	}

	private void removeRating(Integer ratingID)
	{
		this.rating = null;
	}

	public float getAverageRating(List<Integer> ratings)
	{
		int i;
		float sum = 0;
		for(i = 0; i < ratings.size(); i++){
			sum += ratings.get(i);
		}
		return sum/i;
	}

	public void save()
	{
		// This function will be moved to the Book class
		
	}
}
