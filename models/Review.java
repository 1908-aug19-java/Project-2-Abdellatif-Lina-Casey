package models;

public class Review {
	private Integer reviewId;//Id number of the review
	private String reviewBody;//Text body of the review
	private Integer reviewScore;//Score of the review
	private String title;//Title of the movie being reviewed
	private Integer movieId;//Id of the movie being reviewed
	
	public Review() {
		super();

}

	public Review(Integer reviewId, String reviewBody, Integer reviewScore, String title, Integer movieId) {
		super();
		this.reviewId = reviewId;
		this.reviewBody = reviewBody;
		this.reviewScore = reviewScore;
		this.title = title;
		this.movieId = movieId;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public Integer getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(Integer reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
}
