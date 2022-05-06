public class PlayMusic {
	public static void main(String[] args) {
		Note note1 = new Note();
		Note note2 = new Note('a', '#');
		System.out.println("\nnote2 sharp / flat symbol: " + note2.getSF());
		System.out.println("Setting note1 to b#");
		note1.setPitch('b');
		note1.setSF('#');
		System.out.println("note1 pitch: " + note1.getPitch() + "\n");

		Music song1 = new Music();
		Music song2 = new Music(40, "Mixtape");
		System.out.println("Name of song2: " + song2.getName());
		System.out.println("Setting song1 to \"Funky\" at 120 BPM");
		song1.setName("Funky");
		song1.setTempo(120);
		System.out.println("song1 tempo: " + song1.getTempo() + (" BPM\n"));

		GoodMusic song3 = new GoodMusic();
		GoodMusic song4 = new GoodMusic(98.2, 335515, 60, "Number Nine");
		System.out.println("song4 rating: " + song4.getRating());
		System.out.println("Setting song3 to have 100% ratings and 2000000000 listens");
		song3.setRating(100.0);
		song3.setListens(2000000000);
		System.out.println("song3 listens: " + song3.getListens() + "\n");
	}
}