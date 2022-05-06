public class Assignment1 {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.setName("Michael");
		pet1.setAge(1);
		pet1.setSpecies("rat");
		pet1.setWeight(1.1);

		Pet pet2 = new Pet("Steevee", "spider", 3, 0.18);

		Pet pet3 = new Pet("Chief", "australian shepherd", 5, 30.0);

		System.out.println("You have the following pets:");
		pet1.display();
		pet2.display();
		pet3.display();

	}
}

class Pet {
	private String name;
	private String species;
	private int age;
	private double weight;

	public Pet(String name, String species, int age, double weight) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.weight = weight;
	}

	public Pet() {
		// empty constructor
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void display() {
		System.out.println("A "+age+" year old "+species+" named "
							+name+" that weighs "+weight+" pounds.");
	}

}