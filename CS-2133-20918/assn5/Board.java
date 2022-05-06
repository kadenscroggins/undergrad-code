import java.util.Random;
import java.io.Serializable;

public class Board implements Serializable {
	private double mineChance = 0;
	private int x = 0;
	private int y = 0;
	private Tile[][] minefield;
	private int mineCount = 0;
	private int minesFlagged = 0;

	/**
	 * Instantiates a board with a given chance to spawn
	 * a mine and a given board width and height.
	 * 
	 * @param d Chance for a mine to spawn, which must be from 0 to 1
	 * @param x Width of the minefield
	 * @param y Height of the minefield
	 */
	public Board(double d, int x, int y) {
		assert (d<=1 && d>=0);
		this.x = x;
		this.y = y;
		mineChance = d;
		minefield = new Tile[y+2][x+2];

		Random rng = new Random();
		for (int r=0;r<minefield.length;r++) {
			for (int c=0;c<minefield[r].length;c++) {
				if (r==0||c==0||r==minefield.length-1||c==minefield[r].length-1) {
					minefield[r][c] = new Tile(false);
				}
				else {
					double rand = rng.nextDouble();
					if (mineChance >= rand) {
						minefield[r][c] = new Tile(true);
						mineCount += 1;
					}
					else {
						minefield[r][c] = new Tile(false);
					}
				}
			}
		}
	}

	public Tile[][] getMinefield() {
		return minefield;
	}

	public int getMineCount() {
		return mineCount;
	}

	public int getMinesFlagged() {
		return minesFlagged;
	}

	public void addFlag() {
		minesFlagged += 1;
	}

	public void removeFlag() {
		minesFlagged -= 1;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public Tile getTile(int x, int y) {
		return minefield[y][x];
	}

	public String[] toStringArr() {
		String[] ret = new String[x];
		for (int r=1; r<=x;r++) {
			String add = "";
			for (int c=1; c<=y;c++) {
				Tile t = minefield[r][c];
				if (t.isRevealed()) {
					if (t.isMine()) {
						add += "!   ";
					}
					else {
						t.calcBordering(minefield, r, c);
						add += t.getBordering() + "   ";
					}
				}
				else if (t.isFlagged()) {
					add += "F   ";
				}
				else {
					add += "?   ";
				}
			}
			ret[r-1] = add;
		}
		return ret;
	}
}