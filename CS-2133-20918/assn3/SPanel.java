import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.*;

public class SPanel extends JPanel {
	private BufferedImage triangle = new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB);
	private Graphics2D triangleGraphics = triangle.createGraphics();

	@Override
	protected void paintComponent(Graphics g) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		super.paintComponent(g);
		g.drawImage(triangle,0,0,null);
	}

	public void setSize(Dimension d) {
		int width = (int) d.getWidth();
		int height = (int) d.getHeight();
		triangle = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		triangleGraphics = triangle.createGraphics();
	}

	public void drawSierp(Point p, Dimension d) {
		Graphics2D g = triangleGraphics;
		g.setColor(Color.BLACK);
		if ((int)d.getWidth()==1&&(int)d.getHeight()==1) {
			g.fillRect((int)p.getX(),(int)p.getY(),1,1);
		}
		else {
			Dimension recur = new Dimension((int)(d.getWidth()/2),(int)(d.getHeight()/2));
			Point top = new Point((int)((d.getWidth()/4)+p.getX()),(int)p.getY());
			Point left = new Point((int)p.getX(),(int)((d.getHeight()/2)+p.getY()));
			Point right = new Point((int)((d.getWidth()/2)+p.getX()),(int)((d.getHeight()/2)+p.getY()));

			drawSierp(top,recur);
			drawSierp(left,recur);
			drawSierp(right,recur);
		}
	}
}