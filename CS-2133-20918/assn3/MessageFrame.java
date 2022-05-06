import java.awt.*;
import javax.swing.*;

public class MessageFrame extends JFrame {
	public void defaults() {
		MessagePanel bottle = new MessagePanel();
		this.add(bottle);
		this.setSize(bottle.getPreferredSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Message in a Bottle");
		this.setVisible(true);
	}
}