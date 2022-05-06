import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Sierpinski {
	public static void main(String[] args) {
		SFrame frame = new SFrame();
		frame.defaults();
		frame.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				frame.update();
			}
		});
	}
}