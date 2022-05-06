public class Book {
	protected String author;
	protected String title;
	protected String publisher;
	protected int pages;
	protected int year;

	public Book() {
		author = "Anonymous";
		title = "Untitled";
		publisher = "";
		pages = 1;
		year = 2000;
	}

	public Book(String author, String title, String publisher, int pages, int year) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.pages = pages;
		this.year = year;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}
}