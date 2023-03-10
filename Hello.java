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
			g2d.drawString("Hello cunt", 30, 150);
	}
	}
	 public static void runApplication(JPanel app) { 
 JFrame frame = new JFrame(); 
 frame.setSize(app.getPreferredSize()); 
 frame.setTitle(app.getClass().getName()); 
 frame.setDefaultCloseOperation
 (JFrame.EXIT_ON_CLOSE); 
 frame.add(app); 
 frame.setVisible(true); 
 } 
 
 public static void main(String[] args) { 
 Hello hw = new Hello(); 
 runApplication(hw); 
 } 
}