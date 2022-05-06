public class GoodMusic extends Music {
	protected double rating;
	protected long listens;

	public GoodMusic() {
		super(100, "Untitled Hit");
		rating = 100.0;
		listens = 0;
	}

	public GoodMusic(double rating, long listens, int tempo, String name) {
		super(tempo, name);
		this.rating = rating;
		this.listens = listens;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public void setListens(long listens) {
		this.listens = listens;
	}

	public long getListens() {
		return listens;
	}
}