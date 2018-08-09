
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Schimb_valutar extends JFrame {
	private JButton button = new JButton("Press"); 
	private JTextField input = new JTextField("", 11);
	private JLabel label1 = new JLabel("Euro:                                    " + System.lineSeparator());
	private JLabel label2 = new JLabel("Dollari:                                   " + System.lineSeparator());
	private JLabel label3 = new JLabel("Ruminskie lei:            " + System.lineSeparator());
	private JLabel label4 = new JLabel("Ruble:                                    "+ System.lineSeparator());
	private JLabel label5 = new JLabel(System.lineSeparator());
	
	public Schimb_valutar() {
	    super("Aplicatie");
	    this.setBounds(200,200,240,250);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    
	    container.add(input);
	  
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(label5);
	    container.add(label1);	    
	    container.add(label2);
	    container.add(label3);
	    container.add(label4);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			
			label1.setText(System.lineSeparator()+System.lineSeparator()+"Euro: " + df.format(a*0.0494)+"                   "); 
			label2.setText("Dollari: " + df.format(a*0.061)+"                   "); 
			label3.setText("Ruminskie lei: " + df.format(a*0.2306)+"                   "); 
			label4.setText("Ruble: " + df.format(a*3.7594)); 
			
			
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Ошибка",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }

	}
	}
	public static void main(String[] args) {
		Schimb_valutar app = new Schimb_valutar();
		app.setVisible(true);
	}
}
