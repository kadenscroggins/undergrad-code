public class Note {
	protected char pitch;
	protected char sf; // Sharp or Flat

	public Note() {
		pitch = 'a';
		sf = ' ';
	}

	public Note(char pitch, char sf) {
		this.pitch = pitch;
		this.sf = sf;
	}

	public void setPitch(char pitch) {
		this.pitch = pitch;
	}

	public char getPitch() {
		return pitch;
	}

	public void setSF(char sf) {
		this.sf = sf;
	}

	public char getSF () {
		return sf;
	}
}