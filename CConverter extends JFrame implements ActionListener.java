import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// listen to actions on the frame
class CConverter extends JFrame implements ActionListener {

        // decide according to action received
        public void actionPerformed(ActionEvent event){
                
                if (event.getSource() == compute) {
                        
                        // read amount
                        String Amount = cobalt.getText().toString();
                        double amount = Double.parseDouble(Amount);
                        
                        // read years
                        String Years = years.getText().toString();
                        int years = Integer.parseInt(Years);
                        
                        // decaying process
                        for(int n=1; n<=years; n++) 
                                amount -= (amount * 0.12); // reduce by 12% each year
                        
                        // set the result
                        result.setText("" + amount);
        
                }else if(event.getSource() == quit) 
                        dispose();  // close window
        }
        
        // default constructor
        public CConverter(){
        
                // label for amount of Cobalt 
                cobaltLabel = new JLabel();
                cobaltLabel.setSize(200, 20);
                cobaltLabel.setLocation(100, 10);
                cobaltLabel.setText("Amount of Cobalt");
                
                // input for amount of Cobalt
                cobalt = new JTextField();
                cobalt.setSize(100, 20);
                cobalt.setLocation(300, 10);
                
                // label for number of years 
                yearsLabel = new JLabel();
                yearsLabel.setSize(200, 20);
                yearsLabel.setLocation(100, 50);
                yearsLabel.setText("Number of Years");
                
                // input for number of years 
                years = new JTextField();
                years .setSize(100, 20);
                years .setLocation(300, 50);
                
                // compute button 
                compute = new JButton();
                compute.setLocation(150, 90);
                compute.setSize(100, 20);
                compute.addActionListener(this);
                compute.setText("Compute");
                
                // quit button
                quit = new JButton();
                quit.setSize(100, 20);
                quit.setLocation(270, 90);
                quit.addActionListener(this);
                quit.setText("Quit");
                
                // label for amount left
                resultLablel = new JLabel();
                resultLablel.setSize(100, 20);
                resultLablel.setLocation(100, 140);
                resultLablel.setText("Amount Left:");
                
                // label for result 
                result = new JLabel("");
                result.setSize(100, 40);
                result.setLocation(300, 140);
                
                // define the container for the form elements and
                // add the elements
                container = getContentPane();
                container.setLayout(null);
                container.add(cobaltLabel);
                container.add(cobalt);
                container.add(yearsLabel);
                container.add(years);
                container.add(compute);
                container.add(quit);
                container.add(resultLablel);
                container.add(result);
                
                // set jframe properties
                setTitle("Cobalt Converter");
                setBounds(100, 100, 500, 220);
                setVisible(true);
        }
        
        // fields
        private JLabel cobaltLabel;
        private JTextField cobalt;
        private JLabel result;
        private JLabel resultLablel;
        private JLabel yearsLabel;
        private JTextField years;
        private JButton compute;
        private JButton quit;
        private Container container;
        
        
        public static void main(String[] args) throws Exception{
                // start the converter
                CConverter cobalConverter = new CConverter();
        }
        
}