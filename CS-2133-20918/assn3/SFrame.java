import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SFrame extends JFrame {
	private SPanel panel;

	public void defaults() {
		panel = new SPanel();
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		this.setTitle("Sierpinski Triangles");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void update() {
		Dimension size = this.getContentPane().getSize();
		if (size.getWidth() > size.getHeight()) {
			size = new Dimension((int)size.getHeight(),(int)size.getHeight());
		}
		else {
			size = new Dimension((int)size.getWidth(),(int)size.getWidth());
		}
		Point start = new Point(0,0);
		panel.setSize(size);
		panel.drawSierp(start,size);
		panel.repaint();
	}
}