package models;



public class Movie {
	private Integer movieId;//movieId
	private String title; //The Title of the movie
	private Integer reviewScore;// the Averaged Review score of all the reviews
	private Integer[] reviewersIds;// the IDs of all the profiles that have reviewed this movie
	private Integer[] reviewIds; // the Review Ids of all reviews that review this movie
	public Movie()
	{
		super();
	}
	public Movie(Integer movieId, String title, Integer reviewScore, Integer[] reviewersIds, Integer[] reviewIds) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.reviewScore = reviewScore;
		this.reviewersIds = reviewersIds;
		this.reviewIds = reviewIds;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(Integer reviewScore) {
		this.reviewScore = reviewScore;
	}
	public Integer[] getReviewersIds() {
		return reviewersIds;
	}
	public void setReviewersIds(Integer[] reviewersIds) {
		this.reviewersIds = reviewersIds;
	}
	public Integer[] getReviewIds() {
		return reviewIds;
	}
	public void setReviewIds(Integer[] reviewIds) {
		this.reviewIds = reviewIds;
	}
	
}