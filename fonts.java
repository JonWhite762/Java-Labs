import java.awt.*;
import javax.swing.*;

	public class Hello extends JPanel{
		
		private static final int WINDOW_WIDTH = 500;
		private static final int WINDOW_HEIGHT = 300;
		
		public Hello() {
				setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		}
	public void paintComponent( Graphics g ) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawString("Hello ", 30, 150);
	}
	}
	