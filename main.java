import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Galaxy extends JPanel {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;

    public Galaxy() {
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		setBackground(Color.BLACK);
	}  

    protected void paintComponent( Graphics g ) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;


        g2d.setColor(Color.YELLOW);
        Ellipse2D a = new Ellipse2D.Double(300, 300, 40, 40);
        g2d.fill(a);
        g2d.setColor(Color.RED);
        Ellipse2D b = new Ellipse2D.Double(270, 335, 20, 20);
        g2d.fill(b);
		g2d.setColor(Color.BLUE);
        Ellipse2D c = new Ellipse2D.Double(440, 190, 23, 23);
        g2d.fill(c);
		g2d.setColor(Color.WHITE);
        Ellipse2D d = new Ellipse2D.Double(456, 240, 12, 12);
        g2d.fill(d);
	
	
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
        Galaxy s = new Galaxy();
        runApplication(s);
    }
}