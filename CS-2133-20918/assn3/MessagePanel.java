import java.awt.*;
import javax.swing.*;

public class MessagePanel extends JPanel {

	private int[] xpoints = {200,275,275,350,350,125,125,200};
	private int[] ypoints = {25,25,100,100,350,350,100,100};
	private int npoints = 8;
	private Polygon bottle = new Polygon(xpoints,ypoints,npoints);

	@Override
	protected void paintComponent(Graphics g) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		super.paintComponent(g);
		g.drawPolygon(bottle);
		g.drawString("STUCK IN UGLY BOTTLE HELP", 150, 200);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(500,500);
	}
}