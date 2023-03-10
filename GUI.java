import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent event){
		
		if (event.getSource() == compute) {
			
			String Amount = savings.getText().toString();
			double amount = Double.parseDouble(Amount);
			
			String Months = months.getText().toString();
			int months = Integer.parseInt(Months);
			
			for(int n=1; n<=months; n++)
				amount = (amount + 800);
			
			result.setText("" + amount);
		} 
			else if(event .getSource() == quit)
				dispose();
	}
			public GUI() {
				
				savingsLabel = new JLabel();
				savingsLabel.setSize(200, 20);
				savingsLabel.setLocation(100, 10);
				savingsLabel.setText("Amount of money");
				
				savings = new JTextField();
				savings.setSize(100, 20);
				savings.setLocation(300, 10);
				
				monthsLabel = new JLabel();
				monthsLabel.setSize(200, 20);
				monthsLabel.setLocation(100, 50);
				monthsLabel.setText("Number of Months");
				
				months = new JTextField();
				months.setSize(100, 20);
				months.setLocation(300, 50);
				
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
                resultLablel.setText("Amount Increase:");
                
                // label for result 
                result = new JLabel("");
                result.setSize(100, 40);
                result.setLocation(300, 140);
                
                // define the container for the form elements and
                // add the elements
                container = getContentPane();
                container.setLayout(null);
                container.add(savingsLabel);
                container.add(savings);
                container.add(monthsLabel);
                container.add(months);
                container.add(compute);
                container.add(quit);
                container.add(resultLablel);
                container.add(result);
                
                // set jframe properties
                setTitle("Dem Digits");
                setBounds(100, 100, 500, 220);
                setVisible(true);
        }
        
        // fields
        private JLabel savingsLabel;
        private JTextField savings;
        private JLabel result;
        private JLabel resultLablel;
        private JLabel monthsLabel;
        private JTextField months;
        private JButton compute;
        private JButton quit;
        private Container container;
        
        
        public static void main(String[] args) throws Exception{
                // start the converter
                GUI moneysaved = new GUI();
        }
        
}

	

				