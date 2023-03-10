import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenuExample extends JFrame {
    public JMenuExample() {
        super("Menus");
        buildGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 175);
        setVisible(true);
    }
    
    public void buildGUI() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Appetizer");
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("Soup");
        menu.add(menuItem);

        JMenu submenu = new JMenu("Salad");
        menu.add(submenu);
        submenu.add(new JCheckBoxMenuItem("Lettuce", true));
        submenu.add(new JCheckBoxMenuItem("Tomato"));
        submenu.add(new JCheckBoxMenuItem("Onion"));

        menu.addSeparator();
        
        submenu = new JMenu("Bread");
        menu.add(submenu);
        submenu.add(new JMenuItem("French"));
        submenu.add(new JMenuItem("Olive"));
                
        menu = new JMenu("Main Course");
        menuBar.add(menu);

        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem radioMenuItem;
        radioMenuItem = new JRadioButtonMenuItem("Pasta");
        group.add(radioMenuItem);
        menu.add(radioMenuItem);

        radioMenuItem = new JRadioButtonMenuItem("Chicken");
        radioMenuItem.setSelected(true);
        group.add(radioMenuItem);
        menu.add(radioMenuItem);

        radioMenuItem = new JRadioButtonMenuItem("Fish");
        group.add(radioMenuItem);
        menu.add(radioMenuItem);
    }

    public static void main(String [] args) {
        JMenuExample jme = new JMenuExample();
    }
}