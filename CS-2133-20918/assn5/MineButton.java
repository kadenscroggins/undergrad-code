import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.Serializable;

public class MineButton extends JButton implements Serializable {
	Tile tile;

	public MineButton(int x, int y, Board b) {
		tile = b.getTile(y,x);
		this.setText("?");
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == e.BUTTON1) {
					if (!tile.isMine() && !tile.isFlagged()) {
						tile.reveal();
						tile.calcBordering(b.getMinefield(),x,y);
						setText("" + tile.getBordering());
					}
					else if (!tile.isFlagged()) {
						setText("!");
						JFrame loss = new JFrame("Game Over");
						JOptionPane.showMessageDialog(loss,"Game Over! You clicked a mine!");
					}
				}
				else if (e.getButton() == e.BUTTON3) {
					if (tile.isMine()) {
						if (!tile.isRevealed() && !tile.isFlagged()) {
							tile.flag();
							b.addFlag();
							setText("F");
							if (b.getMineCount() == b.getMinesFlagged()) {
								JFrame won = new JFrame("You Won!");
								JOptionPane.showMessageDialog(won,"Congradulations! You Won!");
							}
						}
						else if (!tile.isRevealed() && tile.isFlagged()) {
							tile.flag();
							b.removeFlag();
							setText("?");
						}
					}
					else if (!tile.isRevealed() && !tile.isFlagged()) {
						tile.flag();
						setText("F");
					}
					else if (!tile.isRevealed() && tile.isFlagged()) {
						tile.flag();
						setText("?");
					}
				}
			}
		});
	}
}