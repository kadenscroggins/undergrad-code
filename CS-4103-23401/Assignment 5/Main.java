public class Main {
	public static void main(String[] args) {
		Book cookbook = new Book("Betty", "Butter Cookins", "Food Network", 200, 2019);
		Book sample = new Book();
		
		sample.setAuthor("Cauline Hoober");
		sample.setTitle("Pants On Fire");
		sample.setPublisher("Me");
		sample.setPages(1);
		sample.setYear(2022);

		System.out.println("Sample book information:");
		System.out.println(
			sample.getAuthor() + ", " + 
			sample.getTitle() + ", " + 
			sample.getPublisher() + ", " + 
			sample.getPages() + ", " + 
			sample.getYear() );
	}
}