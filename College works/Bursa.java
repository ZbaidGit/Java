

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Bursa extends JFrame {
	private JButton button = new JButton("Najmi"); 
	private JTextField input = new JTextField("", 14); 
	private JTextField input1 = new JTextField("", 12);
	private JTextField input2 = new JTextField("", 14);
	private JTextField input3 = new JTextField("", 10);
	private JLabel label1 = new JLabel("FIO: ");
	private JLabel label2 = new JLabel("Gruppa: ");
	private JLabel label3 = new JLabel("God: ");
	private JLabel label4 = new JLabel("Nota medie: ");
	private JLabel answ = new JLabel("");
	
	public Bursa() {
	    super("Aplicatie");
	    this.setBounds(200,200,230,250);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);	    
	    container.add(label2);
	    container.add(input1);
	    container.add(label3);
	    container.add(input2);
	    container.add(label4);
	    container.add(input3);
	  
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			

			double d = Double.parseDouble(input3.getText());
			double x = 0;
			if (d> 7.5) x = 75*d;
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			String str = "Bursa: "+ df.format(x);
			
			answ.setText(str); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Error",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }

	}
	}
	public static void main(String[] args) {
		Bursa app = new Bursa();
		app.setVisible(true);
	}
}
