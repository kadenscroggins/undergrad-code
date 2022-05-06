public class Tile {
	private boolean mine = false;
	private int bordering = 0;
	private boolean revealed = false;
	private boolean flagged = false;

	public Tile(boolean mine) {
		this.mine = mine;
	}

	public int getBordering() {
		return bordering;
	}

	public void calcBordering(Tile[][] borders, int x, int y) {
		bordering = 0;
		if (borders[x-1][y-1].isMine()) bordering += 1;
		if (borders[x-1][y].isMine()) bordering += 1;
		if (borders[x-1][y+1].isMine()) bordering += 1;
		if (borders[x][y-1].isMine()) bordering += 1;
		if (borders[x][y+1].isMine()) bordering += 1;
		if (borders[x+1][y-1].isMine()) bordering += 1;
		if (borders[x+1][y].isMine()) bordering += 1;
		if (borders[x+1][y+1].isMine()) bordering += 1;
	}

	public boolean isRevealed() {
		return revealed;
	}

	public boolean isMine() {
		return mine;
	}

	public boolean isFlagged() {
		return flagged;
	}

	public void flag() {
		flagged = !flagged;
	}

	public void reveal() {
		revealed = true;
	}
}