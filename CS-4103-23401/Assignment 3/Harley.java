// Harley.java

public class Harley extends Motorcycle {
	private boolean hasFlames;

	public Harley() {
		hasFlames = true;
	}

	public boolean getFlames() {
		return hasFlames;
	}

	public void setFlames(boolean flames) {
		hasFlames = flames;
	}
}