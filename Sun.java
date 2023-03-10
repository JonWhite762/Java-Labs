import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class Sun extends JPanel{
	private static final int WINDOW_WIDTH = 600;
	private static final int WINDOW_HEIGHT = 600;
	
	public Sun(){
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		setBackground(Color.BLUE);
	}
		protected void paintComponent( Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.YELLOW);
			Ellipse2D a = new Ellipse2D.Double(400, 450, 200, 200);
			g2d.fill(a);
		
		}
	public static void runApplication(JPanel app) {
        JFrame frame = new JFrame();
        frame.setSize(app.getPreferredSize());
        frame.setTitle(app.getClass().getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(app);
        frame.setVisible(true);
    }
	public static void main(String[] args) {
        Sun s = new Sun();
        runApplication(s);
	}	
}