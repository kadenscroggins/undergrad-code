import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;

public class Minesweeper {
	public static final int GAME_HEIGHT = 10;
	public static final int GAME_WIDTH = 10;
	private static MineButton[][] buttons;
	private static Board board;
	private static File saveFile = null;

	public static void main(String[] args) {
		startSweeper();
	}

	public static void startSweeper() {
		double gameChance = 0.2;
		JFrame frame = new JFrame("Minesweeper");
		JPanel game = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem newGame = new JMenuItem("New");
		JMenuItem saveGame = new JMenuItem("Save");
		JMenuItem loadGame = new JMenuItem("Load");
		JMenuItem quitGame = new JMenuItem("Quit");

		file.add(newGame);
		file.add(saveGame);
		file.add(loadGame);
		file.add(quitGame);
		menuBar.add(file);

		game.setLayout(new GridLayout(GAME_HEIGHT,GAME_WIDTH));
		frame.setLayout(new BorderLayout());
		frame.add(game,BorderLayout.CENTER);
		frame.add(menuBar,BorderLayout.NORTH);
		frame.setSize(750,750);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		generateBoard(gameChance, game);

		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.removeAll();

				boolean breaker = true;
				while (breaker) {
					JFrame diff = new JFrame("Difficulty");
					String difficulty = JOptionPane.showInputDialog(diff, "What portion of the board should be mines?\n(Must be between 0 and 1)");
					try {
						double temp = Double.parseDouble(difficulty);
						if (temp > 0.0 && temp < 1.0) {
							generateBoard(temp, game);
							breaker = false;
						}
						else {
							JFrame err = new JFrame("Input error");
							JOptionPane.showMessageDialog(err, "Value must range from 0 to 1");
						}
					}
					catch (NumberFormatException ex) {
						JFrame err = new JFrame("Input error");
						JOptionPane.showMessageDialog(err, "Invalid input\nValue must be a double ranging from 0 to 1");
					}
				}

				game.validate();
			}
		});
		saveGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame saveMenu = new JFrame();
				JFileChooser save = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				int returnVal = save.showOpenDialog(saveMenu);
				if (returnVal == save.APPROVE_OPTION) {
					try {
						saveFile = save.getSelectedFile();
						FileOutputStream fos = new FileOutputStream(saveFile);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(board);
						oos.close();
					}
					catch (Exception fe) {
						JFrame err = new JFrame("Error");
						JOptionPane.showMessageDialog(err, "Error saving file");
					}
				}
			}
		});
		loadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame loadMenu = new JFrame();
				JFileChooser load = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				int returnVal = load.showOpenDialog(loadMenu);
				if (returnVal == load.APPROVE_OPTION) {
					try {
						saveFile = load.getSelectedFile();
						FileInputStream fis = new FileInputStream(saveFile);
						ObjectInputStream ois = new ObjectInputStream(fis);
						board = (Board) ois.readObject();
						ois.close();
					}
					catch (Exception fe) {
						JFrame err = new JFrame("Error");
						JOptionPane.showMessageDialog(err, "Error loading file");
					}
				}
				game.removeAll();
				loadBoard(board, game);
				game.validate();
			}
		});
		quitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		frame.validate();
	}

	public static void generateBoard(double gameChance, JPanel game) {
		board = new Board(gameChance, GAME_WIDTH, GAME_HEIGHT);
		buttons = new MineButton[GAME_WIDTH][GAME_HEIGHT];
		for (int r=0;r<GAME_HEIGHT;r++) {
			for (int c=0;c<GAME_HEIGHT;c++) {
				buttons[r][c] = new MineButton(r+1,c+1,board);
				game.add(buttons[r][c]);
			}
		}
	}

	public static void loadBoard(Board b, JPanel game) {
		board = b;
		buttons = new MineButton[GAME_WIDTH][GAME_HEIGHT];
		for (int r=0;r<GAME_HEIGHT;r++) {
			for (int c=0;c<GAME_HEIGHT;c++) {
				buttons[r][c] = new MineButton(r+1,c+1,b);
				game.add(buttons[r][c]);
			}
		}
	}
}