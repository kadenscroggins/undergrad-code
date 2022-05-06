import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Minesweeper {
	public static void main(String[] args) {
		final double GAME_CHANCE = 0.2;
		final int GAME_WIDTH = 10;
		final int GAME_HEIGHT = 10;
		// commandLineSweeper(GAME_CHANCE,GAME_WIDTH,GAME_HEIGHT);
		graphicalSweeper(GAME_CHANCE,GAME_WIDTH,GAME_HEIGHT);
	}

	public static void commandLineSweeper(double gameChance, int gameWidth, int gameHeight) {
		boolean alive = true;
		Scanner scan = new Scanner(System.in);

		Board board = new Board(gameChance, gameWidth, gameHeight);

		while(alive) {
			String[] tiles = board.toStringArr();
			for (int i=-1; i<tiles.length;i++) {
				if (i==-1) { 
					for (int k=0;k<=gameWidth;k++) {
						if (k==0) System.out.print("     ");
						else System.out.printf("%4d",k);
					}
					System.out.println("\n");
				}
				else {
					System.out.printf("%4d    %s%n",(i+1), tiles[i]);
				}
			}

			System.out.print("Enter mine to reveal or flag (<int x> <int y> <char 'r'/'f'>) - ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			String response = scan.next();
			if (response.equals("r")) {
				board.getTile(x,y).reveal();
			}
			else if (response.equals("f")) {
				board.getTile(x,y).flag();
			}

			if (board.getTile(x,y).isMine()) {
				System.out.println("Game over!");
				System.exit(0);
			}
		}
	}

	public static void graphicalSweeper(double gameChance, int gameWidth, int gameHeight) {
		JFrame frame = new JFrame("Minesweeper");
		Board board = new Board(gameChance, gameWidth, gameHeight);
		MineButton[][] buttons = new MineButton[gameWidth][gameHeight];

		frame.setLayout(new GridLayout(gameHeight,gameWidth));
		frame.setSize(750,750);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		for (int r=0;r<gameWidth;r++) {
			for (int c=0;c<gameHeight;c++) {
				buttons[r][c] = new MineButton(r+1,c+1,board);
				frame.add(buttons[r][c]);
			}
		}

		frame.validate();
	}

	
}