public class Music extends Note {
	protected int tempo;
	protected String name;

	public Music() {
		super(' ', ' ');
		tempo = 80;
		name = "Untitled";
	}

	public Music(int tempo, String name) {
		super(' ', ' ');
		this.tempo = tempo;
		this.name = name;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}